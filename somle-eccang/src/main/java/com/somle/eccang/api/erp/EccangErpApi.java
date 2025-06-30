package com.somle.eccang.api.erp;


import cn.iocoder.yudao.framework.common.util.general.CoreUtils;
import cn.iocoder.yudao.framework.common.util.general.Limiter;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.EccangToken;
import com.somle.eccang.model.exception.EccangResponseException;
import com.somle.eccang.repository.EccangTokenRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Component
@Slf4j
public class EccangErpApi {


    private EccangToken token;
    private final int pageSize = 100;
    private final Limiter limiter = new Limiter(20);

    @Resource
    EccangTokenRepository tokenRepo;

    @PostConstruct
    public void init() {
        token = tokenRepo.findAll().get(0);
    }


    protected Stream<EccangResponse.EccangPage> getAllPage(JSONObject payload, String endpoint) {
        if (payload.get("page") == null) {
            payload.put("page", 1);
        }
        if (payload.get("page_size") == null) {
            payload.put("page_size", pageSize);
        }
        return Stream.iterate(
            getPage(payload, endpoint), Objects::nonNull,
            bizContent -> {
                if (bizContent.hasNext()) {
                    log.debug("have next,endpoint:{}当前进度：{}/{}", endpoint, (bizContent.getPage() - 1) * pageSize + bizContent.getData().size(), bizContent.getTotal());
                    payload.put("page", bizContent.getPage() + 1);
                    return getPage(payload, endpoint);
                } else {
                    log.debug("no next page");
                    return null;
                }
            }
        );
    }

    private EccangResponse.EccangPage getPage(Object payload, String endpoint) {
        EccangResponse response = getResponse(payload, endpoint);
        return response.getBizContent(EccangResponse.EccangPage.class);
    }

    @SneakyThrows
    protected EccangResponse getResponse(Object payload, String endpoint) {

        String url = "http://openapi-web.eccang.com/openApi/api/unity";


        EccangResponse responseFinal = CoreUtils.retry(ctx -> {
            var requestBody = requestBody(payload, endpoint);
            var request = RequestX.builder()
                .requestMethod(RequestX.Method.POST)
                .url(url)
                .payload(requestBody)
                .build();
            // 获取当前重试次数
            int retryCount = ctx.getRetryCount();
            // 记录每次重试的日志
            if (ctx.getRetryCount() != 0) {
                log.debug("正在请求url= {},第 {} 次重试。endpoint = {}", request.getUrl(), retryCount, endpoint);
                log.debug("重试原因：{}", ctx.getLastThrowable().toString());
            }
            try (var response = WebUtils.sendRequest(request)) {
                switch (response.code()) {
                    case 200:
                        var responseBody = response.body().string();
                        var responseOriginal = JsonUtilsX.parseObject(responseBody, EccangResponse.class);
                        validateResponse(responseOriginal);
                        return responseOriginal;
                    case 429:
                        throw new HttpClientErrorException(HttpStatus.TOO_MANY_REQUESTS, "Too many requests, please try again later.");
                    default:
                        throw new RuntimeException("Unknown response code " + response);
                }
            }
        });
        return responseFinal;
    }

    private void validateResponse(EccangResponse response) {
        //判断resp的code是否为null，为null则返回message直接作为异常信息
        String code = response.getCode();
        if (code == null) {
            throw new RuntimeException(response.getMessage());
        }
        switch (code) {
            // 请检查requestBody生成时间和实际请求发送时间是否相隔太久
            case "200":
                return;
            case "300":
                List<EccangResponse.EccangError> errors = response.getBizContentList(EccangResponse.EccangError.class);
                if (errors.isEmpty()) {
                    throw new RuntimeException("response code is 300 but errors is empty,Error message from response: " + response);
                } else {
                    throw new EccangResponseException(errors);
                }
            case "429":
                throw new HttpClientErrorException(HttpStatus.TOO_MANY_REQUESTS, "Too many requests, please try again later.");
//            case "500", "saas.api.error.code.0082":
            case "saas.api.error.code.0049":
                throw new RuntimeException("签名过期：时间戳必须在一分钟以内，超出1分钟则过期失效，且只能用一次。 时间戳重新生成后，需要重新生成签名");
            case "saas.api.error.code.0061": //达到限流时-继续重试
                throw new HttpClientErrorException(HttpStatus.TOO_MANY_REQUESTS, "(同一客户每秒请求接口次数不能超过10次)请求受限，继续重试");
            case "common.error.code.9999":
                throw new RuntimeException("Eccang return invalid response: " + response);
            default:
                throw new RuntimeException("Unknown eccang-specific full response:" + response);
        }
    }

    protected JSONObject requestBody(Object reqParams, String ecMethod) {
        long timestamp = System.currentTimeMillis();

        var postData = JsonUtilsX.newObject();
        postData.put("app_key", token.getUserName());
//        postData.put("biz_content", JSON.toJSONString(reqParams.isEmpty() ? Map.of("page_size", pageSize) : reqParams));
        postData.put("biz_content", JsonUtilsX.toJsonString(reqParams));
        postData.put("charset", "UTF-8");
        postData.put("interface_method", ecMethod);
        postData.put("nonce_str", "113456");
        postData.put("service_id", "E7HPYV");
        postData.put("sign_type", "MD5");
        postData.put("timestamp", timestamp);
        postData.put("version", "V1.0.0");

        postData.put("sign", md5(concatenateParams(postData)));
        return postData;
    }

    private String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not available", e);
        }
    }

    public String concatenateParams(JSONObject postData) {
        String postDataStr = postData.entrySet().stream()
            .map(e -> e.getKey() + "=" + e.getValue().asText())
            .reduce((e1, e2) -> e1 + "&" + e2)
            .orElse("") + token.getUserToken();
        return postDataStr;
    }
}

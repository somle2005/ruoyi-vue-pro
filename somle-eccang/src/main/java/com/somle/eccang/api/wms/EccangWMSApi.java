package com.somle.eccang.api.wms;

import cn.hutool.core.util.XmlUtil;
import cn.iocoder.yudao.framework.common.util.general.CoreUtils;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.somle.eccang.model.EccangResponse;
import com.somle.eccang.model.EccangWMSResponse;
import com.somle.eccang.model.EccangWMSToken;
import com.somle.eccang.repository.EccangWMSTokenRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@Component
@Slf4j
public class EccangWMSApi {

    private OkHttpClient client;

    private final String url = "http://somle.yunwms.com/default/svc/web-service";

    private EccangWMSToken eccangWMSToken;

    @Resource
    private EccangWMSTokenRepository eccangWMSTokenRepository;

    @PostConstruct
    public void init() {
        client = new OkHttpClient();
        eccangWMSToken = eccangWMSTokenRepository.findAll().get(0);
    }


    protected EccangResponse.EccangPage getPage(JSONObject payload, String endpoint) {
        EccangWMSResponse response = getResponse(payload, endpoint);
        //当没有数据时,直接返回空页,否则下边会转换报错
        if (response.getData() == null) {
            return EccangResponse.EccangPage.builder().total(0).totalCount(0).data(null).build();
        }
        EccangResponse.EccangPage page = response.getEccangPage();
        return page;
    }


    @SneakyThrows
    protected EccangWMSResponse getResponse(JSONObject payload, String endpoint) {
        EccangWMSResponse responseFinal = CoreUtils.retry(ctx -> {
            var requestBody = requestBody(payload, endpoint);
            // 请求体
            RequestBody body = RequestBody.create(requestBody, MediaType.get("text/xml; charset=utf-8"));

            // 创建请求
            Request request = new Request.Builder()
                .url(url) // 替换为实际的服务URL
                .post(body)
                .addHeader("Content-Type", "text/xml; charset=utf-8")
                .build();

            int retryCount = ctx.getRetryCount();
            if (retryCount != 0) {
                // 记录每次重试的日志
                log.debug("遇到错误: {}", ctx.getLastThrowable().getStackTrace().toString());
                log.debug("正在请求url= {},第 {} 次重试。endpoint = {}", request.url(), retryCount, endpoint);
            }
            // 记录每次重试的日志
            try (var response = client.newCall(request).execute()) {
                switch (response.code()) {
                    case 200:
                        var responseBody = response.body().string();
                        String jsonObject = parseObjectByXmlUtil(responseBody).toString();
                        var responseOriginal = JsonUtilsX.parseObject(jsonObject, EccangWMSResponse.class);
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



    protected String requestBody(JSONObject reqParams, String ecMethod) {

        String requestBody =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">\n" +
                "    <SOAP-ENV:Body>\n" +
                "        <ns1:callService>\n" +
                "            <paramsJson>" + reqParams.toString() + "</paramsJson>\n" +
                "            <appToken>" + eccangWMSToken.getAppToken() + "</appToken>\n" +
                "            <appKey>" + eccangWMSToken.getAppKey() + "</appKey>\n" +
                "            <service>" + ecMethod + "</service>\n" +
                "        </ns1:callService>\n" +
                "    </SOAP-ENV:Body>\n" +
                "</SOAP-ENV:Envelope>";
        return requestBody;
    }

    @SneakyThrows
    protected JSONObject parseObjectByXmlUtil(String responseBody) {
        Document document = XmlUtil.parseXml(responseBody);
        //1.获取根节点
        Element root = document.getDocumentElement();
        //2.逐级获取<response>标签中的响应内容
        String responseText = root.getChildNodes().item(0).getChildNodes().item(0).getChildNodes().item(0).getTextContent();
        JSONObject result = JsonUtilsX.parseObject(responseText, JSONObject.class);
        return result;
    }
}

package com.doudian.open.core.material;

import com.doudian.open.api.materialgw.address.BinaryMaterialUploadAddressResponse;
import com.doudian.open.api.materialgw.auth.BinaryMaterialUploadAddressAuthParam;
import com.doudian.open.api.materialgw.auth.BinaryMaterialUploadAddressAuthRequest;
import com.doudian.open.api.materialgw.auth.BinaryMaterialUploadAddressAuthResponse;
import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadParam;
import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadResponse;
import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadResponseWrapper;
import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadResponseWrapperData;
import com.doudian.open.core.AccessToken;
import com.doudian.open.core.DoudianOpConfig;
import com.doudian.open.core.DoudianOpResponseWrapper;
import com.doudian.open.core.http.DefaultHttpClient;
import com.doudian.open.core.http.HttpClient;
import com.doudian.open.core.http.HttpRequest;
import com.doudian.open.core.http.HttpResponse;
import com.doudian.open.core.threadpool.DoudianOpThreadPool;
import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.utils.Logger;
import com.doudian.open.utils.StringUtil;

import java.util.concurrent.*;
import java.util.zip.CRC32;

public class BinaryMaterialUpload implements BinaryMaterialUploadExecutor {

    public DoudianOpConfig getConfig() {
        return config;
    }

    public void setConfig(DoudianOpConfig config) {
        this.config = config;
    }

    private DoudianOpConfig config;

    private static final Logger LOG = Logger.getLogger(BinaryMaterialUpload.class);

    private static HttpClient httpClient = DefaultHttpClient.getDefaultClient();

    public static BinaryMaterialUpload getDefaultUpload() {
        return defaultUpload;
    }

    private static final BinaryMaterialUpload defaultUpload = new BinaryMaterialUpload();


    public BinaryMaterialUploadResponseWrapper execute(BinaryMaterialUploadParam t, AccessToken accessToken) {
        return doRequest(t, accessToken);
    }

    @SuppressWarnings({"unchecked"})
    public Future<BinaryMaterialUploadResponseWrapper> asyncExecute(final BinaryMaterialUploadParam t, final AccessToken accessToken) {
        return DoudianOpThreadPool.getInstance(this.getConfig()).submit(new Callable<BinaryMaterialUploadResponseWrapper>() {
            @Override
            public BinaryMaterialUploadResponseWrapper call() throws Exception {
                return getDefaultUpload().doRequest(t, accessToken);
            }
        });
    }

    private BinaryMaterialUploadResponseWrapper doRequest(BinaryMaterialUploadParam t, AccessToken accessToken) {
        BinaryMaterialUploadResponseWrapper r = new BinaryMaterialUploadResponseWrapper();

        //1.调用抖店开放平台api open/materialToken，获取上传地址下载query链接

        BinaryMaterialUploadAddressAuthRequest request = new BinaryMaterialUploadAddressAuthRequest();
        BinaryMaterialUploadAddressAuthParam param = request.getParam();
        param.setUploadNum(1);
        param.setFileExtension(t.getExtension());
        param.setBizType(t.getBizType());
        param.setStoreKeys(t.getStoreKeys());
        BinaryMaterialUploadAddressAuthResponse response;

        if (StringUtil.isNotEmpty(System.getProperty("cloud.open.url")) || StringUtil.isNotEmpty(System.getenv("cloud.open.url"))) {
            response = request.execute();
        } else {
            response = request.execute(accessToken);
        }


        if (!response.isSuccess()) {
            r.setCode(response.getCode());
            r.setMsg(response.getMsg());
            r.setSubCode(response.getSubCode());
            r.setSubMsg(response.getSubMsg());
            r.setLogId(response.getLogId());
            return r;
        }

        if (StringUtil.isNotEmpty(System.getProperty("cloud.open.url")) || StringUtil.isNotEmpty(System.getenv("cloud.open.url"))) {
            response.getData().setAuthQuery(response.getData().getAuthQuery().replaceFirst("imagex.bytedanceapi.com", "imagex.doudian.ivolces.com"));
            response.getData().setAuthQuery(response.getData().getAuthQuery().replaceFirst("https:", "http:"));
        }


        //2.调用素材上传地址下载接口f
        HttpRequest httpRequest = HttpRequest.build(response.getData().getAuthQuery());
        LOG.info("material gateway uploadAddress http request url: %s", response.getData().getAuthQuery());

        if (request.getConfig().getMaterialGatewayHttpConnectTimeout() != null) {
            httpRequest.setConnectTimeout(request.getConfig().getMaterialGatewayHttpConnectTimeout());
        }
        if (request.getConfig().getMaterialGatewayHttpReadTimeout() != null) {
            httpRequest.setReadTimeout(request.getConfig().getMaterialGatewayHttpReadTimeout());
        }

        HttpResponse httpResponse = httpClient.get(httpRequest);
        if (httpResponse.getStatusCode() != 200) {
            String errHttpBody = httpResponse.getBody();
            LOG.warning("get binaryUpload Auth failed, httpCode=%d body=%s", httpResponse.getStatusCode(), errHttpBody);
            throw new DoudianOpException(DoudianOpException.Code.HTTP_RESPONSE_STATUS_CODE_NOT_2XX);
        }

        String httpBody = httpResponse.getBody();
        LOG.info("material gateway binaryUpload http response: %s", httpBody);
        if (httpBody == null || "".equals(httpBody)) {
            //确保反序列化出来的对象不为null
            httpBody = "{}";
        }
        String logId = httpResponse.getSingleHeader("X-Tt-Logid");

        BinaryMaterialUploadAddressResponse bmr = JsonUtil.fromJson(httpBody, BinaryMaterialUploadAddressResponse.class);
        if (bmr.getResponseMetadata() == null) {
            r.setCode("20000");
            r.setLogId(logId);
            return r;
        } else if (bmr.getResponseMetadata().getError() != null) {
            r.setCode("20000");
            r.setLogId(logId);
            r.setMsg(String.format("code:%d msg:%s-%s", bmr.getResponseMetadata().getError().getCodeN(), bmr.getResponseMetadata().getError().getCodeN(), bmr.getResponseMetadata().getError().getMessage()));
            return r;
        }

        String uri = bmr.getResult().getUploadAddress().getStoreInfos().get(0).getStoreUri();

        BinaryMaterialUploadResponseWrapperData uriData = new BinaryMaterialUploadResponseWrapperData();
        uriData.setUri(uri);

        String auth = bmr.getResult().getUploadAddress().getStoreInfos().get(0).getAuth();

        String host = bmr.getResult().getUploadAddress().getUploadHosts().get(0);

        String crc32Result = BinaryMaterialUpload.crc32(t.getBinaryBytes());

        if (StringUtil.isNotEmpty(System.getProperty("cloud.open.url")) || StringUtil.isNotEmpty(System.getenv("cloud.open.url"))) {
            host = host.replaceFirst("snssdk.com", "snssdk.doudian.ivolces.com");
        }


        httpRequest = HttpRequest.build(String.format("http://%s/%s", host, uri), t.getBinaryBytes());
        httpRequest.addHeader("Host", host);
        httpRequest.addHeader("Authorization", auth);
        httpRequest.addHeader("Content-CRC32", crc32Result);

        if (request.getConfig().getMaterialGatewayHttpConnectTimeout() != null) {
            httpRequest.setConnectTimeout(request.getConfig().getMaterialGatewayHttpConnectTimeout());
        }
        if (request.getConfig().getMaterialGatewayHttpReadTimeout() != null) {
            httpRequest.setReadTimeout(request.getConfig().getMaterialGatewayHttpReadTimeout());
        }
        LOG.info("material gateway upload http request url: %s Authorization: %s Content-CRC32: %s", String.format("%s/%s", host, uri), auth, crc32Result);
        httpResponse = httpClient.put(httpRequest);
        if (httpResponse.getStatusCode() != 200) {
            httpBody = httpResponse.getBody();
            LOG.warning("upload binary to material gateway failed,, httpCode=%d body=%s", httpResponse.getStatusCode(), httpBody);
            throw new DoudianOpException(DoudianOpException.Code.HTTP_RESPONSE_STATUS_CODE_NOT_2XX);
        }
        logId = httpResponse.getSingleHeader("X-Tt-Logid");
        httpBody = httpResponse.getBody();
        LOG.info("material gateway upload http response: %s", httpBody);

        if (httpBody == null || "".equals(httpBody)) {
            //确保反序列化出来的对象不为null
            httpBody = "{}";
        }

        try {
            //将http返回的json字符串序列化成java模型
            BinaryMaterialUploadResponse uploadResponse = JsonUtil.fromJson(httpBody, BinaryMaterialUploadResponse.class);
            r.setLogId(logId);
            if (uploadResponse.getSuccess() != 0) {
                r.setCode("20000");
                r.setMsg(uploadResponse.getError().getError());
            } else {
                r.setCode("10000");
            }
            r.setData(uriData);
            return r;
        } catch (Exception e) {
            throw new DoudianOpException(DoudianOpException.Code.JSON_ERROR, e);
        }

    }

    private static String crc32(byte[] data) {
        CRC32 crc32 = new CRC32();
        crc32.update(data);
        long r = crc32.getValue();
        return Long.toHexString(r);
    }

    static class FutureAdapter<T> implements Future<T> {

        FutureAdapter(Future<DoudianOpResponseWrapper<T>> future) {
            this.future = future;
        }

        private Future<DoudianOpResponseWrapper<T>> future;

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return future.cancel(mayInterruptIfRunning);
        }

        @Override
        public boolean isCancelled() {
            return future.isCancelled();
        }

        @Override
        public boolean isDone() {
            return future.isDone();
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            return future.get().getResponse();
        }

        @Override
        public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return future.get(timeout, unit).getResponse();
        }
    }
}

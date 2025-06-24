package com.doudian.open.core;

import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.utils.Logger;
import com.doudian.open.utils.StringUtil;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class DoudianOpRequest<R> implements DoudianOpRequestExecutor {

    private static final Logger LOG = Logger.getLogger(DoudianOpRequest.class);

    private DoudianOpClient client;

    private DoudianOpConfig config;

    private boolean isPerfReq = false;

    private R param;

    public void turnOnPerf() {
        isPerfReq = true;
    }

    public boolean isPerf() {
        return isPerfReq;
    }

    public abstract String getUrlPath();

    @SuppressWarnings("unchecked")
    public DoudianOpRequest() {
        client = DoudianOpClientHolder.getClient();
        config = GlobalConfig.getGlobalConfig();

        Class<?> paramClass = getSuperClassParameterClass(this.getClass());
        try {
            param = (R) paramClass.newInstance();
        } catch (Exception e) {
            throw new DoudianOpException(DoudianOpException.Code.INIT_REQUEST_PARAM_ERROR, e);
        }
    }

    public abstract Class<? extends DoudianOpResponse<?>> getResponseClass();

    @Override
    public <T> T execute(AccessToken accessToken) {
        resetOpenUrl();
        long now = System.currentTimeMillis();

        DoudianOpResponseWrapper<T> ret = client.request(this, accessToken);
        //LOG.info("request total cost: %d", (System.currentTimeMillis() - now));
        return ret.getResponse();
    }

    @Override
    public <T> T execute() {
        // btm 回放用例，不走真实调用
        final String url = this.getConfig().getOpenRequestUrl() + "/" + this.getUrlPath();
        final String header = JsonUtil.toJson(this.getConfig().getHttpRequestHeader());
        final String requestBody = JsonUtil.toJson(this.getParam());
        if (DoudianBtmMockClientHolder.INSTANCE.isReplay()) {
            final String responseBody = DoudianBtmMockClientHolder.INSTANCE.replay(url, header, requestBody);
            if (responseBody == null || responseBody.length() == 0) {
                return null;
            }
            return (T) JsonUtil.fromJson(responseBody, this.getResponseClass());
        }

        // 调用 open api
        String accessToken = DoudianBaseTokenClientHolder.INSTANCE.getToken();
        T result = execute(AccessToken.wrap(accessToken, null));
        if (result instanceof DoudianOpResponse) {
            if ("isv.access-token-expired".equals(((DoudianOpResponse<?>) result).getSubCode())
                    || "isv.access-token-no-existed".equals(((DoudianOpResponse<?>) result).getSubCode())) {
                accessToken = DoudianBaseTokenClientHolder.INSTANCE.refreshToken();
                result = execute(AccessToken.wrap(accessToken, null));
            }
        }

        // btm 上报用例，里面会做幂等
        final String responseBody = JsonUtil.toJson(result);
        DoudianBtmMockClientHolder.INSTANCE.recordMockCase(url, header, requestBody, responseBody);

        return result;
    }

    private void resetOpenUrl() {
        String openUrl = System.getProperty("cloud.open.url");
        if (StringUtil.isNotEmpty(openUrl)) {
            this.getConfig().setOpenRequestUrl(openUrl);
        }
        openUrl = System.getenv("cloud.open.url");
        if (StringUtil.isNotEmpty(openUrl)) {
            this.getConfig().setOpenRequestUrl(openUrl);
        }
    }

    @Override
    @SuppressWarnings({"unchecked"})
    public <T> Future<T> asyncExecute(AccessToken accessToken) {
        Object wrapperFuture = client.asyncRequest(this, accessToken);
        return new FutureAdapter<T>((Future<DoudianOpResponseWrapper<T>>) wrapperFuture);
    }

    private Class<?> getSuperClassParameterClass(Class<?> clazz) {
        try {
            return (Class<?>) (((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0]);
        } catch (Exception e) {
            throw new DoudianOpException(e);
        }
    }

    public DoudianOpClient getClient() {
        return client;
    }

    public void setClient(DoudianOpClient client) {
        this.client = client;
    }

    public DoudianOpConfig getConfig() {
        return config;
    }

    public void setConfig(DoudianOpConfig config) {
        this.config = config;
    }

    public R getParam() {
        return param;
    }

    public void setParam(R param) {
        this.param = param;
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

package com.doudian.open.core;

import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.utils.*;
import jakarta.servlet.http.HttpServletRequest;


import java.io.InputStream;
import java.lang.reflect.ParameterizedType;

import static com.doudian.open.exception.DoudianOpException.Code.PARAMETER_CHECK_ERROR;
import static com.doudian.open.exception.DoudianOpException.Code.UNSUPPORTED_HTTP_METHOD;

@SuppressWarnings("unchecked")
public abstract class DoudianOpSpiRequest<P> {

    private DoudianOpSpiParam spiParam = DoudianOpSpiParam.build();

    private DoudianOpConfig config = GlobalConfig.getGlobalConfig();

    private DoudianOpSpiBizHandler bizHandler;

    public void registerHandler(DoudianOpSpiBizHandler bizHandler) {
        this.bizHandler = bizHandler;
    }

    public <T> T execute() {
        return this.execute(this.bizHandler);
    }

    public String responseJson() {
        return JsonUtil.toJson(execute());
    }

    public DoudianOpSpiRequest() {
        //do nothing
    }

    protected void initWithConfig(Object config) {
        if (config == null) {
            return;
        }
        //根据config初始化spiParam
        if (config instanceof HttpServletRequest) {
            initWithHttpServletRequest((HttpServletRequest) config);
        }
    }

    private void initWithHttpServletRequest(HttpServletRequest httpServletRequest) {
        spiParam.setSign(httpServletRequest.getParameter("sign"));
        spiParam.setSignV2(httpServletRequest.getParameter("sign_v2"));
        spiParam.setAppKey(httpServletRequest.getParameter("app_key"));
        spiParam.setTimestamp(httpServletRequest.getParameter("timestamp"));
        spiParam.setSignMethod(httpServletRequest.getParameter("sign_method"));
        String httpMethod = httpServletRequest.getMethod();
        String paramJson = null;
        if ("GET".equals(httpMethod)) {
            paramJson = httpServletRequest.getParameter("param_json");
        } else if ("POST".equals(httpMethod)) {
            try {
                InputStream inputStream = httpServletRequest.getInputStream();
                if (inputStream != null) {
                    paramJson = CommonUtil.readAllFromInputStream(inputStream);
                }
            } catch (Exception e) {
                throw new DoudianOpException(e);
            }
        } else {
            throw new DoudianOpException(UNSUPPORTED_HTTP_METHOD, httpMethod);
        }

        spiParam.setParamJson(paramJson);
    }

    public <T> T execute(DoudianOpSpiBizHandler spiBizHandler) {
        //参数校验
        if (StringUtil.isEmpty(config.getAppKey()) || StringUtil.isEmpty(config.getAppSecret())) {
            throw new DoudianOpException(PARAMETER_CHECK_ERROR, "未初始化app_key或app_secret, 请仔细检查使用demo");
        }

        if (!config.getAppKey().equals(spiParam.getAppKey())) {
            throw new DoudianOpException(PARAMETER_CHECK_ERROR, "目标app_key和本地app_key不匹配");
        }

        DoudianOpSpiContext context = new DoudianOpSpiContext();
        DoudianOpSpiResponse<Object> response = (DoudianOpSpiResponse<Object>) ReflectUtil.newObject(getResponseClass());
        Class<?> dataClass = getSuperClassParameterClasses(response.getClass());
        Object dataObject = ReflectUtil.newObject(dataClass);
        context.setRequest(this);
        response.setData(dataObject);
        context.setResponse(response);

        String appKey = config.getAppKey();
        String appSecret = config.getAppSecret();
        String timestamp = CommonUtil.getOrDefault(spiParam.getTimestamp(), "");
        String paramJson = CommonUtil.getOrDefault(spiParam.getParamJson(), "");
        Integer signMethod = spiParam.getSignMethod() != null && spiParam.getSignMethod().equals("hmac-sha256") ? 2 : 1;

        //1. 执行验签逻辑
        String calsSign = SignUtil.spiSign(appKey, appSecret, timestamp, paramJson, signMethod);
        if (calsSign == null || (!calsSign.equals(spiParam.getSign()) && !calsSign.equals(spiParam.getSignV2()))) {
            response.setCode(100001L);
            return (T) response;
        }

        //2. 反序列化param模型
        Object paramObject = JsonUtil.fromJson(spiParam.getParamJson(), getSuperClassParameterClasses(this.getClass()));
        context.setParam(paramObject);

        //3. 执行业务处理逻辑
        spiBizHandler.handle(context);

        //返回数据
        return (T) response;
    }

    public abstract Class<? extends DoudianOpSpiResponse<?>> getResponseClass();

    public void setSpiParam(DoudianOpSpiParam spiParam) {
        this.spiParam = spiParam;
    }

    public void setConfig(DoudianOpConfig config) {
        this.config = config;
    }

    public DoudianOpSpiParam getParam() {
        return spiParam;
    }

    private Class<?> getSuperClassParameterClasses(Class<?> clazz) {
        try {
            return (Class<?>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            throw new DoudianOpException(e);
        }
    }
}

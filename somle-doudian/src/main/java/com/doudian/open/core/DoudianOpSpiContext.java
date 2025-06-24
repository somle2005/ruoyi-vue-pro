package com.doudian.open.core;

@SuppressWarnings("unchecked")
public class DoudianOpSpiContext {

    private DoudianOpSpiResponse<?> response;

    private DoudianOpSpiRequest<?> request;

    private Object param;

    public <D, T extends DoudianOpSpiResponse<D>> T getResponse() {
        return (T)response;
    }

    public void setResponse(DoudianOpSpiResponse<?> response) {
        this.response = response;
    }

    public <P, T extends DoudianOpSpiRequest<P>> T getRequest() {
        return (T) request;
    }

    public void setRequest(DoudianOpSpiRequest<?> request) {
        this.request = request;
    }

    public <T> T getParam() {
        return (T) param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public <T> T getData() {
        return (T) response.getData();
    }

    public void wrapError(Long code, String message) {
        response.setCode( code);
        response.setMessage(message);
    }

    public void wrapSuccess(){
        response.setCode(0L);
    }
}

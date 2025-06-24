package com.doudian.open.core;

import com.doudian.open.core.http.HttpRequest;
import com.doudian.open.core.http.HttpResponse;

public class DoudianOpResponseWrapper<T> {
    private T response;

    private HttpRequest httpRequest;

    private HttpResponse httpResponse;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }
}

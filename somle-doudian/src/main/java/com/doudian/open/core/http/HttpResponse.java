package com.doudian.open.core.http;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpResponse {
    private int statusCode;
    private final Map<String, List<String>> headerMap = new HashMap<>();
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void addHeaders(Map<String, List<String>> headers) {
        headerMap.putAll(headers);
    }

    public String getSingleHeader(String key) {
        List<String> hds = headerMap.get(key);
        if (hds != null && hds.size() > 0) {
            return hds.get(0);
        }
        return null;
    }
}

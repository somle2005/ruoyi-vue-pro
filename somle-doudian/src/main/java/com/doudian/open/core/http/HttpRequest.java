package com.doudian.open.core.http;


import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String url;
    private Map<String, String> headerMap;
    private String body;
    private byte[] bodyBytes;

    public byte[] getBodyBytes() {
        return bodyBytes;
    }

    public void setBodyBytes(byte[] bodyBytes) {
        this.bodyBytes = bodyBytes;
    }

    private int connectTimeout = 5000;
    private int readTimeout = 5000;

    public static HttpRequest build(String url){
        return new HttpRequest(url);
    }

    public static HttpRequest build(String url, String body){
        HttpRequest request = new HttpRequest(url);
        request.setBody(body);
        return request;
    }

    public static HttpRequest build(String url, byte[] body){
        HttpRequest request = new HttpRequest(url);
        request.setBodyBytes(body);
        return request;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public HttpRequest(String url) {
        this.url = url;
        this.headerMap = new HashMap<>();
    }

    public void addHeader(String key, String value) {
        this.headerMap.put(key, value);
    }

    public void addHeader(Map<String, String> headerMap) {
        this.headerMap.putAll(headerMap);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public void setHeaderMap(Map<String, String> headerMap) {
        this.headerMap = headerMap;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }
}

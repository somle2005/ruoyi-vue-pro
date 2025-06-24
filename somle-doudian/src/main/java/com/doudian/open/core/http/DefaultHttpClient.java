package com.doudian.open.core.http;

import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.utils.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static com.doudian.open.exception.DoudianOpException.Code.HTTP_REQUEST_ERROR;

// thread safe
public class DefaultHttpClient implements HttpClient {

    private static final Logger LOG = Logger.getLogger(DefaultHttpClient.class);

    private static HttpClient DEFAULT_CLIENT = new DefaultHttpClient();

    public static HttpClient getDefaultClient(){
        return DEFAULT_CLIENT;
    }

    @Override
    public HttpResponse get(HttpRequest httpRequest) {
        HttpResponse resp = new HttpResponse();
        try {
            HttpURLConnection connection = createConnection(httpRequest);
            InputStream inputStream = null;
            try {
                inputStream = connection.getInputStream();
                String body = readBodyFromInputStream(inputStream);
                resp.setBody(body);
                resp.setStatusCode(connection.getResponseCode());

                if (connection.getHeaderFields() != null) {
                    resp.addHeaders(connection.getHeaderFields());
                }

                return resp;
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        // ignore
                    }
                }
            }
        } catch (Exception e) {
            throw new DoudianOpException(HTTP_REQUEST_ERROR, e);
        }
    }

    @Override
    public HttpResponse put(HttpRequest httpRequest) {
        HttpResponse resp = new HttpResponse();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        long now = System.currentTimeMillis();
        try {
            HttpURLConnection connection = createConnection(httpRequest);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod("PUT");
            if (httpRequest.getBodyBytes() != null && httpRequest.getBodyBytes().length > 0) {
                outputStream = connection.getOutputStream();
                outputStream.write(httpRequest.getBodyBytes());
                outputStream.flush();
            }

            int statusCode = connection.getResponseCode();
            resp.setStatusCode(statusCode);
            try {
                inputStream = connection.getInputStream();
                String body = readBodyFromInputStream(inputStream);
                resp.setBody(body);
            } catch (Exception e) {
                try {
                    inputStream = connection.getErrorStream();
                    String body = readBodyFromInputStream(inputStream);
                    resp.setBody(body);
                }catch (Exception ex){
                    //ignore
                }
            }
            //response header
            if (connection.getHeaderFields() != null) {
                resp.addHeaders(connection.getHeaderFields());
            }
            return resp;

        } catch (Exception e) {
            throw new DoudianOpException(HTTP_REQUEST_ERROR, e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) {
                    //ignore
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // ignore
                }
            }
            //LOG.info("http cost: %d", (System.currentTimeMillis() - now));
        }
    }

    @Override
    public HttpResponse post(HttpRequest httpRequest) {
        HttpResponse resp = new HttpResponse();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        long now = System.currentTimeMillis();
        try {
            HttpURLConnection connection = createConnection(httpRequest);
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod("POST");
            if (httpRequest.getBody() != null && httpRequest.getBody().length() > 0) {
                outputStream = connection.getOutputStream();
                outputStream.write(httpRequest.getBody().getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
            }

            int statusCode = connection.getResponseCode();
            resp.setStatusCode(statusCode);
            try {
                inputStream = connection.getInputStream();
                String body = readBodyFromInputStream(inputStream);
                resp.setBody(body);
            } catch (Exception e) {
                try {
                    inputStream = connection.getErrorStream();
                    String body = readBodyFromInputStream(inputStream);
                    resp.setBody(body);
                }catch (Exception ex){
                    //ignore
                }
            }
            //response header
            if (connection.getHeaderFields() != null) {
                resp.addHeaders(connection.getHeaderFields());
            }
            return resp;

        } catch (Exception e) {
            throw new DoudianOpException(HTTP_REQUEST_ERROR, e);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e) {
                    //ignore
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // ignore
                }
            }
            //LOG.info("http cost: %d", (System.currentTimeMillis() - now));
        }
    }

    private HttpURLConnection createConnection(HttpRequest httpRequest) throws Exception {
        URL url = new URL(httpRequest.getUrl());
        URLConnection connection = url.openConnection();
        connection.setConnectTimeout(httpRequest.getConnectTimeout());
        connection.setReadTimeout(httpRequest.getReadTimeout());
        connection.setRequestProperty("accept", "*/*");
        connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        if(httpRequest.getHeaderMap() != null && httpRequest.getHeaderMap().size() > 0) {
            for(Map.Entry<String, String> entry : httpRequest.getHeaderMap().entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return (HttpURLConnection) connection;
    }

    private String readBodyFromInputStream(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        char[] buffer = new char[8192];
        int len = 0;
        while ((len = bufferedReader.read(buffer, 0, buffer.length)) > 0) {
            sb.append(buffer, 0, len);
        }
        return sb.toString();
    }
}

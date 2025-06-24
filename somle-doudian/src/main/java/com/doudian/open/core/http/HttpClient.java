package com.doudian.open.core.http;

public interface HttpClient {

    HttpResponse get(HttpRequest httpRequest);

    HttpResponse post(HttpRequest httpRequest);

    HttpResponse put(HttpRequest httpRequest);


}

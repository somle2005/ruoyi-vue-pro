package com.jd.open.api.sdk;

import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.AbstractResponse;

public interface JdClient {
   <T extends AbstractResponse> T execute(JdRequest<T> var1) throws Exception;

   <T extends AbstractResponse> String executeToString(JdRequest<T> var1) throws Exception;
}

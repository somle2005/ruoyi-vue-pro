package com.jd.open.api.sdk.request;

import com.jd.open.api.sdk.response.AbstractResponse;
import java.io.IOException;
import java.util.Map;

public interface JdRequest<T extends AbstractResponse> {
   String getApiMethod();

   Map<String, String> getSysParams();

   String getAppJsonParams() throws IOException;

   String getOtherParams() throws IOException;

   Class<T> getResponseClass();

   Map<String, String> getReserveParams();

   String getIsvToken();
}

package com.jd.open.api.sdk.request.tools;

import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.tools.TimeGetResponse;
import java.io.IOException;
import java.util.TreeMap;

public class TimeGetRequest extends AbstractRequest implements JdRequest<TimeGetResponse> {
   public String getApiMethod() {
      return "360buy.time.get";
   }

   public String getAppJsonParams() throws IOException {
      new TreeMap();
      return null;
   }

   public Class<TimeGetResponse> getResponseClass() {
      return TimeGetResponse.class;
   }
}

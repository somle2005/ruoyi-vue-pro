package com.jd.open.api.sdk.request.e_invoice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.e_invoice.TestMapTestMapResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class TestMapTestMapRequest extends AbstractRequest implements JdRequest<TestMapTestMapResponse> {
   private String param1;

   public String getApiMethod() {
      return "jingdong.test.map.test.map";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<TestMapTestMapResponse> getResponseClass() {
      return TestMapTestMapResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(String param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public String getParam1() {
      return this.param1;
   }
}

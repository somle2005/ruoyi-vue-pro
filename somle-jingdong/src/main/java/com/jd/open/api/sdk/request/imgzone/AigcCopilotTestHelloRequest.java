package com.jd.open.api.sdk.request.imgzone;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.AigcCopilotTestHelloResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AigcCopilotTestHelloRequest extends AbstractRequest implements JdRequest<AigcCopilotTestHelloResponse> {
   private Integer param1;

   public String getApiMethod() {
      return "jingdong.aigc.copilot.test.hello";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<AigcCopilotTestHelloResponse> getResponseClass() {
      return AigcCopilotTestHelloResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(Integer param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public Integer getParam1() {
      return this.param1;
   }
}

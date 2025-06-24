package com.jd.open.api.sdk.request.ThreePL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.request.submitAICheckBillRealtime.AICheckBillReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ThreePL.AICheckBillServiceSubmitAICheckBillRealtimeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AICheckBillServiceSubmitAICheckBillRealtimeRequest extends AbstractRequest implements JdRequest<AICheckBillServiceSubmitAICheckBillRealtimeResponse> {
   private AICheckBillReq aiCheckBillReq;

   public String getApiMethod() {
      return "jingdong.AICheckBillService.submitAICheckBillRealtime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("aiCheckBillReq", this.aiCheckBillReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<AICheckBillServiceSubmitAICheckBillRealtimeResponse> getResponseClass() {
      return AICheckBillServiceSubmitAICheckBillRealtimeResponse.class;
   }

   @JsonProperty("aiCheckBillReq")
   public void setAiCheckBillReq(AICheckBillReq aiCheckBillReq) {
      this.aiCheckBillReq = aiCheckBillReq;
   }

   @JsonProperty("aiCheckBillReq")
   public AICheckBillReq getAiCheckBillReq() {
      return this.aiCheckBillReq;
   }
}

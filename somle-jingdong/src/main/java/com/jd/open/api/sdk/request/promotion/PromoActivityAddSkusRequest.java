package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.addSkus.ParticipantRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityAddSkusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityAddSkusRequest extends AbstractRequest implements JdRequest<PromoActivityAddSkusResponse> {
   private ParticipantRequest request;

   public String getApiMethod() {
      return "jingdong.promo.activity.addSkus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityAddSkusResponse> getResponseClass() {
      return PromoActivityAddSkusResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(ParticipantRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public ParticipantRequest getRequest() {
      return this.request;
   }
}

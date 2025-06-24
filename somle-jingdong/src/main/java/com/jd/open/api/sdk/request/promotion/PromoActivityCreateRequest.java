package com.jd.open.api.sdk.request.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.promotion.PromoActivityWriteService.request.create.CreateActivityRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityCreateRequest extends AbstractRequest implements JdRequest<PromoActivityCreateResponse> {
   private CreateActivityRequest request;

   public String getApiMethod() {
      return "jingdong.promo.activity.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityCreateResponse> getResponseClass() {
      return PromoActivityCreateResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(CreateActivityRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public CreateActivityRequest getRequest() {
      return this.request;
   }
}

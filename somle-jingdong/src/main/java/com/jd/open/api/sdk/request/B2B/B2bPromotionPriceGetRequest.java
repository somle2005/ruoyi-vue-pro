package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BPromotionProvider.request.get.PromotionReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bPromotionPriceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bPromotionPriceGetRequest extends AbstractRequest implements JdRequest<B2bPromotionPriceGetResponse> {
   private PromotionReq param;

   public String getApiMethod() {
      return "jingdong.b2b.promotion.price.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bPromotionPriceGetResponse> getResponseClass() {
      return B2bPromotionPriceGetResponse.class;
   }

   @JsonProperty("param")
   public void setParam(PromotionReq param) {
      this.param = param;
   }

   @JsonProperty("param")
   public PromotionReq getParam() {
      return this.param;
   }
}

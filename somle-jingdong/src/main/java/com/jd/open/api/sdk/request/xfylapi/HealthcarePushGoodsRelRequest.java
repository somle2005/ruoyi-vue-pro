package com.jd.open.api.sdk.request.xfylapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xfylapi.ThirdDataExportService.request.pushGoodsRel.PushGoodsRelParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.HealthcarePushGoodsRelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HealthcarePushGoodsRelRequest extends AbstractRequest implements JdRequest<HealthcarePushGoodsRelResponse> {
   private PushGoodsRelParam goodsRel;

   public String getApiMethod() {
      return "jingdong.healthcare.pushGoodsRel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsRel", this.goodsRel);
      return JsonUtil.toJson(pmap);
   }

   public Class<HealthcarePushGoodsRelResponse> getResponseClass() {
      return HealthcarePushGoodsRelResponse.class;
   }

   @JsonProperty("goodsRel")
   public void setGoodsRel(PushGoodsRelParam goodsRel) {
      this.goodsRel = goodsRel;
   }

   @JsonProperty("goodsRel")
   public PushGoodsRelParam getGoodsRel() {
      return this.goodsRel;
   }
}

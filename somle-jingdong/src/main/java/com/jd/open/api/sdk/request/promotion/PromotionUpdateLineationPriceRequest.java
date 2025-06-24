package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromotionUpdateLineationPriceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PromotionUpdateLineationPriceRequest extends AbstractRequest implements JdRequest<PromotionUpdateLineationPriceResponse> {
   private long skuId;
   private BigDecimal lineationPrice;
   private String applicant;

   public void setSkuId(long skuId) {
      this.skuId = skuId;
   }

   public long getSkuId() {
      return this.skuId;
   }

   public void setLineationPrice(BigDecimal lineationPrice) {
      this.lineationPrice = lineationPrice;
   }

   public BigDecimal getLineationPrice() {
      return this.lineationPrice;
   }

   public void setApplicant(String applicant) {
      this.applicant = applicant;
   }

   public String getApplicant() {
      return this.applicant;
   }

   public String getApiMethod() {
      return "jingdong.promotion.updateLineationPrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("lineationPrice", this.lineationPrice);
      pmap.put("applicant", this.applicant);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromotionUpdateLineationPriceResponse> getResponseClass() {
      return PromotionUpdateLineationPriceResponse.class;
   }
}

package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromotionDirectUpdateSkuPriceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PromotionDirectUpdateSkuPriceRequest extends AbstractRequest implements JdRequest<PromotionDirectUpdateSkuPriceResponse> {
   private Integer site;
   private Integer lpType;
   private BigDecimal lineationPrice;
   private String lpUrl;
   private Long skuId;
   private String applicant;

   public void setSite(Integer site) {
      this.site = site;
   }

   public Integer getSite() {
      return this.site;
   }

   public void setLpType(Integer lpType) {
      this.lpType = lpType;
   }

   public Integer getLpType() {
      return this.lpType;
   }

   public void setLineationPrice(BigDecimal lineationPrice) {
      this.lineationPrice = lineationPrice;
   }

   public BigDecimal getLineationPrice() {
      return this.lineationPrice;
   }

   public void setLpUrl(String lpUrl) {
      this.lpUrl = lpUrl;
   }

   public String getLpUrl() {
      return this.lpUrl;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setApplicant(String applicant) {
      this.applicant = applicant;
   }

   public String getApplicant() {
      return this.applicant;
   }

   public String getApiMethod() {
      return "jingdong.promotion.directUpdateSkuPrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("site", this.site);
      pmap.put("lpType", this.lpType);
      pmap.put("lineationPrice", this.lineationPrice);
      pmap.put("lpUrl", this.lpUrl);
      pmap.put("skuId", this.skuId);
      pmap.put("applicant", this.applicant);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromotionDirectUpdateSkuPriceResponse> getResponseClass() {
      return PromotionDirectUpdateSkuPriceResponse.class;
   }
}

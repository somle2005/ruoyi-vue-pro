package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionOrdermodeAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionOrdermodeAddRequest extends AbstractRequest implements JdRequest<SellerPromotionOrdermodeAddResponse> {
   private Long promoId;
   private Integer favorMode;
   private String quota;
   private String rate;
   private String plus;
   private String minus;
   private String link;
   private String freePostage;

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   public Integer getFavorMode() {
      return this.favorMode;
   }

   public void setQuota(String quota) {
      this.quota = quota;
   }

   public String getQuota() {
      return this.quota;
   }

   public void setRate(String rate) {
      this.rate = rate;
   }

   public String getRate() {
      return this.rate;
   }

   public void setPlus(String plus) {
      this.plus = plus;
   }

   public String getPlus() {
      return this.plus;
   }

   public void setMinus(String minus) {
      this.minus = minus;
   }

   public String getMinus() {
      return this.minus;
   }

   public void setLink(String link) {
      this.link = link;
   }

   public String getLink() {
      return this.link;
   }

   public void setFreePostage(String freePostage) {
      this.freePostage = freePostage;
   }

   public String getFreePostage() {
      return this.freePostage;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.ordermode.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("promo_id", this.promoId);
      pmap.put("favor_mode", this.favorMode);
      pmap.put("quota", this.quota);
      pmap.put("rate", this.rate);
      pmap.put("plus", this.plus);
      pmap.put("minus", this.minus);
      pmap.put("link", this.link);
      pmap.put("free_postage", this.freePostage);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionOrdermodeAddResponse> getResponseClass() {
      return SellerPromotionOrdermodeAddResponse.class;
   }
}

package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionActivitymodeAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionActivitymodeAddRequest extends AbstractRequest implements JdRequest<SellerPromotionActivitymodeAddResponse> {
   private Long promoId;
   private Integer numBound;
   private Integer freqBound;
   private Integer perMaxNum;
   private Integer perMinNum;

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public void setNumBound(Integer numBound) {
      this.numBound = numBound;
   }

   public Integer getNumBound() {
      return this.numBound;
   }

   public void setFreqBound(Integer freqBound) {
      this.freqBound = freqBound;
   }

   public Integer getFreqBound() {
      return this.freqBound;
   }

   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   public Integer getPerMinNum() {
      return this.perMinNum;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.activitymode.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("promo_id", this.promoId);
      pmap.put("num_bound", this.numBound);
      pmap.put("freq_bound", this.freqBound);
      pmap.put("per_max_num", this.perMaxNum);
      pmap.put("per_min_num", this.perMinNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionActivitymodeAddResponse> getResponseClass() {
      return SellerPromotionActivitymodeAddResponse.class;
   }
}

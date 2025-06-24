package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ActivityModeVO implements Serializable {
   private Long id;
   private Long promoId;
   private Integer numBound;
   private Integer freqBound;
   private Integer perMaxNum;
   private Integer perMinNum;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("num_bound")
   public void setNumBound(Integer numBound) {
      this.numBound = numBound;
   }

   @JsonProperty("num_bound")
   public Integer getNumBound() {
      return this.numBound;
   }

   @JsonProperty("freq_bound")
   public void setFreqBound(Integer freqBound) {
      this.freqBound = freqBound;
   }

   @JsonProperty("freq_bound")
   public Integer getFreqBound() {
      return this.freqBound;
   }

   @JsonProperty("per_max_num")
   public void setPerMaxNum(Integer perMaxNum) {
      this.perMaxNum = perMaxNum;
   }

   @JsonProperty("per_max_num")
   public Integer getPerMaxNum() {
      return this.perMaxNum;
   }

   @JsonProperty("per_min_num")
   public void setPerMinNum(Integer perMinNum) {
      this.perMinNum = perMinNum;
   }

   @JsonProperty("per_min_num")
   public Integer getPerMinNum() {
      return this.perMinNum;
   }
}

package com.jd.open.api.sdk.response.promotion;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderModeVO implements Serializable {
   private Long promoId;
   private Integer favorMode;
   private BigDecimal quota;
   private BigDecimal rate;
   private BigDecimal plus;
   private BigDecimal minus;
   private String link;

   @JsonProperty("promo_id")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promo_id")
   public Long getPromoId() {
      return this.promoId;
   }

   @JsonProperty("favor_mode")
   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   @JsonProperty("favor_mode")
   public Integer getFavorMode() {
      return this.favorMode;
   }

   @JsonProperty("quota")
   public void setQuota(BigDecimal quota) {
      this.quota = quota;
   }

   @JsonProperty("quota")
   public BigDecimal getQuota() {
      return this.quota;
   }

   @JsonProperty("rate")
   public void setRate(BigDecimal rate) {
      this.rate = rate;
   }

   @JsonProperty("rate")
   public BigDecimal getRate() {
      return this.rate;
   }

   @JsonProperty("plus")
   public void setPlus(BigDecimal plus) {
      this.plus = plus;
   }

   @JsonProperty("plus")
   public BigDecimal getPlus() {
      return this.plus;
   }

   @JsonProperty("minus")
   public void setMinus(BigDecimal minus) {
      this.minus = minus;
   }

   @JsonProperty("minus")
   public BigDecimal getMinus() {
      return this.minus;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }
}

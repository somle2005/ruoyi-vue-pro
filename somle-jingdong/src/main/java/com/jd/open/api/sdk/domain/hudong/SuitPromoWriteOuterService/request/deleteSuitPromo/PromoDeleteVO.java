package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.deleteSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PromoDeleteVO implements Serializable {
   private String venderCode;
   private Integer promoType;
   private Long promoId;

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("promoType")
   public void setPromoType(Integer promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public Integer getPromoType() {
      return this.promoType;
   }

   @JsonProperty("promoId")
   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   @JsonProperty("promoId")
   public Long getPromoId() {
      return this.promoId;
   }
}

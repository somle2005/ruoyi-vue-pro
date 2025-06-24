package com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.deleteSuitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SuitPromoDeleteVO implements Serializable {
   private List<PromoDeleteVO> promoDeleteVOList;

   @JsonProperty("promoDeleteVOList")
   public void setPromoDeleteVOList(List<PromoDeleteVO> promoDeleteVOList) {
      this.promoDeleteVOList = promoDeleteVOList;
   }

   @JsonProperty("promoDeleteVOList")
   public List<PromoDeleteVO> getPromoDeleteVOList() {
      return this.promoDeleteVOList;
   }
}

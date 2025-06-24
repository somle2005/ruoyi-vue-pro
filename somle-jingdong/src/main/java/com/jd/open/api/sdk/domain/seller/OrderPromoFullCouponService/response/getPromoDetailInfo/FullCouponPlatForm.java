package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.response.getPromoDetailInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FullCouponPlatForm implements Serializable {
   private String platName;
   private Integer selectType;

   @JsonProperty("platName")
   public void setPlatName(String platName) {
      this.platName = platName;
   }

   @JsonProperty("platName")
   public String getPlatName() {
      return this.platName;
   }

   @JsonProperty("selectType")
   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   @JsonProperty("selectType")
   public Integer getSelectType() {
      return this.selectType;
   }
}

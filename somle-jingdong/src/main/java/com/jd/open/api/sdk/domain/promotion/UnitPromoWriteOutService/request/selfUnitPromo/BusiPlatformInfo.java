package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusiPlatformInfo implements Serializable {
   private Integer selectType;

   @JsonProperty("selectType")
   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   @JsonProperty("selectType")
   public Integer getSelectType() {
      return this.selectType;
   }
}

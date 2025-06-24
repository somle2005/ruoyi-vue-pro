package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusiPlatformCreateModel implements Serializable {
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

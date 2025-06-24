package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.request.activity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UnitDeletePromInfo implements Serializable {
   private List<PromDeleteInfo> promDeleteInfoList;

   @JsonProperty("promDeleteInfoList")
   public void setPromDeleteInfoList(List<PromDeleteInfo> promDeleteInfoList) {
      this.promDeleteInfoList = promDeleteInfoList;
   }

   @JsonProperty("promDeleteInfoList")
   public List<PromDeleteInfo> getPromDeleteInfoList() {
      return this.promDeleteInfoList;
   }
}

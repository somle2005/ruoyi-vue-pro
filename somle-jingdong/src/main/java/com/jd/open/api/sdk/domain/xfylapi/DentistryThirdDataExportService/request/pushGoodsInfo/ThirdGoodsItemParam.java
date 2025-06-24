package com.jd.open.api.sdk.domain.xfylapi.DentistryThirdDataExportService.request.pushGoodsInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ThirdGoodsItemParam implements Serializable {
   private String itemName;
   private String itemDesc;

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("itemDesc")
   public void setItemDesc(String itemDesc) {
      this.itemDesc = itemDesc;
   }

   @JsonProperty("itemDesc")
   public String getItemDesc() {
      return this.itemDesc;
   }
}

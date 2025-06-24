package com.jd.open.api.sdk.response.market;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VasSubscribeGetByCodeResponse extends AbstractResponse {
   private String itemCode;
   private String endDate;

   @JsonProperty("item_code")
   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   @JsonProperty("item_code")
   public String getItemCode() {
      return this.itemCode;
   }

   @JsonProperty("end_date")
   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("end_date")
   public String getEndDate() {
      return this.endDate;
   }
}

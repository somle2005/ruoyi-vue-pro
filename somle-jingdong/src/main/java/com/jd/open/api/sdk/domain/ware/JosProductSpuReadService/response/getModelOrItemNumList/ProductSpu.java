package com.jd.open.api.sdk.domain.ware.JosProductSpuReadService.response.getModelOrItemNumList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ProductSpu implements Serializable {
   private String uniqueCode;

   @JsonProperty("uniqueCode")
   public void setUniqueCode(String uniqueCode) {
      this.uniqueCode = uniqueCode;
   }

   @JsonProperty("uniqueCode")
   public String getUniqueCode() {
      return this.uniqueCode;
   }
}

package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class DangerGoodsDto implements Serializable {
   private String key;
   private Integer val;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("val")
   public void setVal(Integer val) {
      this.val = val;
   }

   @JsonProperty("val")
   public Integer getVal() {
      return this.val;
   }
}

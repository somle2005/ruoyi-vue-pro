package com.jd.open.api.sdk.domain.ware.GrayScaleService.request.getgrayvalue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class GrayscaleParam implements Serializable {
   private Long lastCategoryId;
   private List<String> keys;

   @JsonProperty("lastCategoryId")
   public void setLastCategoryId(Long lastCategoryId) {
      this.lastCategoryId = lastCategoryId;
   }

   @JsonProperty("lastCategoryId")
   public Long getLastCategoryId() {
      return this.lastCategoryId;
   }

   @JsonProperty("keys")
   public void setKeys(List<String> keys) {
      this.keys = keys;
   }

   @JsonProperty("keys")
   public List<String> getKeys() {
      return this.keys;
   }
}

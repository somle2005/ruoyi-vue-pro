package com.jd.open.api.sdk.domain.ware.GrayScaleService.response.getgrayvalue;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GrayScaleResult implements Serializable {
   private Integer hitGrayValue;
   private String key;

   @JsonProperty("hitGrayValue")
   public void setHitGrayValue(Integer hitGrayValue) {
      this.hitGrayValue = hitGrayValue;
   }

   @JsonProperty("hitGrayValue")
   public Integer getHitGrayValue() {
      return this.hitGrayValue;
   }

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }
}

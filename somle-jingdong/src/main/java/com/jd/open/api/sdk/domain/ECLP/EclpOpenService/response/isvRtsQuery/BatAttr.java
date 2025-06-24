package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.isvRtsQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BatAttr implements Serializable {
   private String batchKey;
   private String batchValue;

   @JsonProperty("batchKey")
   public void setBatchKey(String batchKey) {
      this.batchKey = batchKey;
   }

   @JsonProperty("batchKey")
   public String getBatchKey() {
      return this.batchKey;
   }

   @JsonProperty("batchValue")
   public void setBatchValue(String batchValue) {
      this.batchValue = batchValue;
   }

   @JsonProperty("batchValue")
   public String getBatchValue() {
      return this.batchValue;
   }
}

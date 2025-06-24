package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.queryUlOrderByCondition;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UlItemBatchRefResult implements Serializable {
   private String batchAttrKey;
   private String batchAttrVal;

   @JsonProperty("batchAttrKey")
   public void setBatchAttrKey(String batchAttrKey) {
      this.batchAttrKey = batchAttrKey;
   }

   @JsonProperty("batchAttrKey")
   public String getBatchAttrKey() {
      return this.batchAttrKey;
   }

   @JsonProperty("batchAttrVal")
   public void setBatchAttrVal(String batchAttrVal) {
      this.batchAttrVal = batchAttrVal;
   }

   @JsonProperty("batchAttrVal")
   public String getBatchAttrVal() {
      return this.batchAttrVal;
   }
}

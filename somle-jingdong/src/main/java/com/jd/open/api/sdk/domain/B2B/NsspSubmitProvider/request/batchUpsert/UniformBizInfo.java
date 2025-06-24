package com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class UniformBizInfo implements Serializable {
   private Map<String, Object> data;

   @JsonProperty("data")
   public void setData(Map<String, Object> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Map<String, Object> getData() {
      return this.data;
   }
}

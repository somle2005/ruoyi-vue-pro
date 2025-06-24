package com.jd.open.api.sdk.domain.mall.http.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Summary implements Serializable {
   private String ResultCount;

   @JsonProperty("ResultCount")
   public void setResultCount(String ResultCount) {
      this.ResultCount = ResultCount;
   }

   @JsonProperty("ResultCount")
   public String getResultCount() {
      return this.ResultCount;
   }
}

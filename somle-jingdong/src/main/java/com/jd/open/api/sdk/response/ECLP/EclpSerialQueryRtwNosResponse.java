package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EclpSerialQueryRtwNosResponse extends AbstractResponse {
   private List<String[]> queryrtwnosResult;

   @JsonProperty("queryrtwnos_result")
   public void setQueryrtwnosResult(List<String[]> queryrtwnosResult) {
      this.queryrtwnosResult = queryrtwnosResult;
   }

   @JsonProperty("queryrtwnos_result")
   public List<String[]> getQueryrtwnosResult() {
      return this.queryrtwnosResult;
   }
}

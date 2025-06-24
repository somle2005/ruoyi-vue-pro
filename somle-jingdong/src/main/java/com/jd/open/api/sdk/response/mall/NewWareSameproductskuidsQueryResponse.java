package com.jd.open.api.sdk.response.mall;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class NewWareSameproductskuidsQueryResponse extends AbstractResponse {
   private List<String> result;

   @JsonProperty("result")
   public void setResult(List<String> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<String> getResult() {
      return this.result;
   }
}

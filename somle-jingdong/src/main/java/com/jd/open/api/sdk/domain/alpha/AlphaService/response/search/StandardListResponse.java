package com.jd.open.api.sdk.domain.alpha.AlphaService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StandardListResponse implements Serializable {
   private Integer resultCode;
   private String resultMsg;
   private List<Carrier> results;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }

   @JsonProperty("results")
   public void setResults(List<Carrier> results) {
      this.results = results;
   }

   @JsonProperty("results")
   public List<Carrier> getResults() {
      return this.results;
   }
}

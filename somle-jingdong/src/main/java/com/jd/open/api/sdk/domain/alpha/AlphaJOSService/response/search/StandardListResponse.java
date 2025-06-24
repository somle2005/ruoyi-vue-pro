package com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StandardListResponse implements Serializable {
   private Integer resultCode;
   private List<Carrier> results;
   private String resultMsg;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("results")
   public void setResults(List<Carrier> results) {
      this.results = results;
   }

   @JsonProperty("results")
   public List<Carrier> getResults() {
      return this.results;
   }

   @JsonProperty("resultMsg")
   public void setResultMsg(String resultMsg) {
      this.resultMsg = resultMsg;
   }

   @JsonProperty("resultMsg")
   public String getResultMsg() {
      return this.resultMsg;
   }
}

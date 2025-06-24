package com.jd.open.api.sdk.domain.refundapply.RefundapplySaf.response.querybyid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RefundapplyResponse implements Serializable {
   private List<QueryMap> results;
   private Boolean resultState;
   private String resultInfo;

   @JsonProperty("results")
   public void setResults(List<QueryMap> results) {
      this.results = results;
   }

   @JsonProperty("results")
   public List<QueryMap> getResults() {
      return this.results;
   }

   @JsonProperty("result_state")
   public void setResultState(Boolean resultState) {
      this.resultState = resultState;
   }

   @JsonProperty("result_state")
   public Boolean getResultState() {
      return this.resultState;
   }

   @JsonProperty("result_info")
   public void setResultInfo(String resultInfo) {
      this.resultInfo = resultInfo;
   }

   @JsonProperty("result_info")
   public String getResultInfo() {
      return this.resultInfo;
   }
}

package com.jd.open.api.sdk.domain.refundapply.RefundapplySaf.response.querylist;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class RefundapplyResponse implements Serializable {
   private Long count;
   private List<QueryMap> results;
   private Boolean resultState;
   private String resultInfo;

   @JsonProperty("count")
   public void setCount(Long count) {
      this.count = count;
   }

   @JsonProperty("count")
   public Long getCount() {
      return this.count;
   }

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

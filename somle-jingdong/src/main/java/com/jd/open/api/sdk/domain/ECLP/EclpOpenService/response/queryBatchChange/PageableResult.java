package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryBatchChange;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageableResult implements Serializable {
   private List<BatchChangeResponse> resultList;
   private Long recordCount;

   @JsonProperty("resultList")
   public void setResultList(List<BatchChangeResponse> resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public List<BatchChangeResponse> getResultList() {
      return this.resultList;
   }

   @JsonProperty("recordCount")
   public void setRecordCount(Long recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public Long getRecordCount() {
      return this.recordCount;
   }
}

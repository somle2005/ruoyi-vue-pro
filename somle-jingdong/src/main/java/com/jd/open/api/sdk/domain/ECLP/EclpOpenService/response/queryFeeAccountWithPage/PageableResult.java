package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryFeeAccountWithPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageableResult implements Serializable {
   private long[] recordCount;
   private List<FeeAccountResult> resultList;

   @JsonProperty("recordCount")
   public void setRecordCount(long[] recordCount) {
      this.recordCount = recordCount;
   }

   @JsonProperty("recordCount")
   public long[] getRecordCount() {
      return this.recordCount;
   }

   @JsonProperty("resultList")
   public void setResultList(List<FeeAccountResult> resultList) {
      this.resultList = resultList;
   }

   @JsonProperty("resultList")
   public List<FeeAccountResult> getResultList() {
      return this.resultList;
   }
}

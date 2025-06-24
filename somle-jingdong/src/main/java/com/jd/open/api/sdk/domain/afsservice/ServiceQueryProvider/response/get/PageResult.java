package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {
   private int totalCount;
   private List<Long> result;

   @JsonProperty("totalCount")
   public void setTotalCount(int totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public int getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("result")
   public void setResult(List<Long> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<Long> getResult() {
      return this.result;
   }
}

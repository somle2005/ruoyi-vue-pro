package com.jd.open.api.sdk.domain.Account.AccountFacade.response.findAccountsOnPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private int totalItems;
   private int pageNo;
   private Long nextOffsetId;
   private int pageSize;
   private List<String> results;

   @JsonProperty("totalItems")
   public void setTotalItems(int totalItems) {
      this.totalItems = totalItems;
   }

   @JsonProperty("totalItems")
   public int getTotalItems() {
      return this.totalItems;
   }

   @JsonProperty("pageNo")
   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public int getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("nextOffsetId")
   public void setNextOffsetId(Long nextOffsetId) {
      this.nextOffsetId = nextOffsetId;
   }

   @JsonProperty("nextOffsetId")
   public Long getNextOffsetId() {
      return this.nextOffsetId;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("results")
   public void setResults(List<String> results) {
      this.results = results;
   }

   @JsonProperty("results")
   public List<String> getResults() {
      return this.results;
   }
}

package com.jd.open.api.sdk.domain.order.ExternalWarningEventService.response.ExternalWarningEventService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageModel implements Serializable {
   private Integer pageIndex;
   private int pageSize;
   private long totalCount;
   private List<ExternalWarningDetail> items;

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("items")
   public void setItems(List<ExternalWarningDetail> items) {
      this.items = items;
   }

   @JsonProperty("items")
   public List<ExternalWarningDetail> getItems() {
      return this.items;
   }
}

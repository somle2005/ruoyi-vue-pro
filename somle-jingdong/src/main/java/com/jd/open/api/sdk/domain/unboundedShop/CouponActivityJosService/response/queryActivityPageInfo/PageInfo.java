package com.jd.open.api.sdk.domain.unboundedShop.CouponActivityJosService.response.queryActivityPageInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PageInfo implements Serializable {
   private int pageSize;
   private int currentPage;
   private long totalCount;
   private List<JpassActivityDTO> items;

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("currentPage")
   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   @JsonProperty("currentPage")
   public int getCurrentPage() {
      return this.currentPage;
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
   public void setItems(List<JpassActivityDTO> items) {
      this.items = items;
   }

   @JsonProperty("items")
   public List<JpassActivityDTO> getItems() {
      return this.items;
   }
}

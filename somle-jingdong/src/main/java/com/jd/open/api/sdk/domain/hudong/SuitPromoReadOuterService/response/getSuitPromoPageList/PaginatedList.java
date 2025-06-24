package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaginatedList implements Serializable {
   private Long total;
   private Integer pageIndex;
   private Integer pageSize;
   private Integer totalPageCount;
   private PromoListInfoVO dataList;

   @JsonProperty("total")
   public void setTotal(Long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Long getTotal() {
      return this.total;
   }

   @JsonProperty("pageIndex")
   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public Integer getPageIndex() {
      return this.pageIndex;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalPageCount")
   public void setTotalPageCount(Integer totalPageCount) {
      this.totalPageCount = totalPageCount;
   }

   @JsonProperty("totalPageCount")
   public Integer getTotalPageCount() {
      return this.totalPageCount;
   }

   @JsonProperty("dataList")
   public void setDataList(PromoListInfoVO dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public PromoListInfoVO getDataList() {
      return this.dataList;
   }
}

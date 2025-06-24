package com.jd.open.api.sdk.domain.hudong.AppointmentReadOuterService.response.queryAppointmentPage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PaginatedList implements Serializable {
   private Long total;
   private Integer pageIndex;
   private List<AppointmentListInfo> dataList;
   private Integer pageSize;
   private Integer totalPageCount;

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

   @JsonProperty("dataList")
   public void setDataList(List<AppointmentListInfo> dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public List<AppointmentListInfo> getDataList() {
      return this.dataList;
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
}

package com.jd.open.api.sdk.domain.promotion.UnitPromoReadOutService.response.flowLog;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PaginatedList implements Serializable {
   private Long total;
   private Integer pageIndex;
   private List<PromotionFlowVO> dataList;
   private Integer pageSize;

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
   public void setDataList(List<PromotionFlowVO> dataList) {
      this.dataList = dataList;
   }

   @JsonProperty("dataList")
   public List<PromotionFlowVO> getDataList() {
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
}

package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.getIncrementOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Pagination implements Serializable {
   private Integer pageNo;
   private Integer pageSize;
   private Integer totalCount;
   private Integer totalPage;
   private List<OrderDTO> data;

   @JsonProperty("pageNo")
   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public Integer getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("totalCount")
   public void setTotalCount(Integer totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Integer getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public Integer getTotalPage() {
      return this.totalPage;
   }

   @JsonProperty("data")
   public void setData(List<OrderDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<OrderDTO> getData() {
      return this.data;
   }
}

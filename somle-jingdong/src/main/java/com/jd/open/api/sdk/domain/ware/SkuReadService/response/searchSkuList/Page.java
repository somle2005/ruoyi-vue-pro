package com.jd.open.api.sdk.domain.ware.SkuReadService.response.searchSkuList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private List<Sku> data;
   private Integer pageNo;
   private Integer pageSize;
   private Long totalItem;

   @JsonProperty("data")
   public void setData(List<Sku> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<Sku> getData() {
      return this.data;
   }

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

   @JsonProperty("totalItem")
   public void setTotalItem(Long totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public Long getTotalItem() {
      return this.totalItem;
   }
}

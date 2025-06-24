package com.jd.open.api.sdk.domain.ware.JosProductSpuReadService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {
   private long total;
   private List<ProductSpu> data;
   private int pageNo;
   private int pageSize;

   @JsonProperty("total")
   public void setTotal(long total) {
      this.total = total;
   }

   @JsonProperty("total")
   public long getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<ProductSpu> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ProductSpu> getData() {
      return this.data;
   }

   @JsonProperty("pageNo")
   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   @JsonProperty("pageNo")
   public int getPageNo() {
      return this.pageNo;
   }

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }
}

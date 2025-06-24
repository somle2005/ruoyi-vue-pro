package com.jd.open.api.sdk.domain.B2B.PoMidProvider.response.queryPurOrders;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PaginationResp implements Serializable {
   private int pageIndex;
   private int pageSize;
   private int total;
   private List<PoResp> data;

   @JsonProperty("pageIndex")
   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   @JsonProperty("pageIndex")
   public int getPageIndex() {
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

   @JsonProperty("total")
   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("total")
   public int getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(List<PoResp> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<PoResp> getData() {
      return this.data;
   }
}

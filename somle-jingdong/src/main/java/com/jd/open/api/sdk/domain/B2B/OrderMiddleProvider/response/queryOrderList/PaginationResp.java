package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PaginationResp implements Serializable {
   private int total;
   private ArrayList data;
   private int pageIndex;
   private int pageSize;

   @JsonProperty("total")
   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("total")
   public int getTotal() {
      return this.total;
   }

   @JsonProperty("data")
   public void setData(ArrayList data) {
      this.data = data;
   }

   @JsonProperty("data")
   public ArrayList getData() {
      return this.data;
   }

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
}

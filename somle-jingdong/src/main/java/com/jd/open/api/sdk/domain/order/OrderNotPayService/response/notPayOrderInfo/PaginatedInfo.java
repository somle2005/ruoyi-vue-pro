package com.jd.open.api.sdk.domain.order.OrderNotPayService.response.notPayOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PaginatedInfo implements Serializable {
   private int pageSize;
   private int index;
   private int totalItem;
   private List<OrderDataNotPayInfo> pageList;
   private int totalPage;

   @JsonProperty("pageSize")
   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public int getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("index")
   public void setIndex(int index) {
      this.index = index;
   }

   @JsonProperty("index")
   public int getIndex() {
      return this.index;
   }

   @JsonProperty("totalItem")
   public void setTotalItem(int totalItem) {
      this.totalItem = totalItem;
   }

   @JsonProperty("totalItem")
   public int getTotalItem() {
      return this.totalItem;
   }

   @JsonProperty("pageList")
   public void setPageList(List<OrderDataNotPayInfo> pageList) {
      this.pageList = pageList;
   }

   @JsonProperty("pageList")
   public List<OrderDataNotPayInfo> getPageList() {
      return this.pageList;
   }

   @JsonProperty("totalPage")
   public void setTotalPage(int totalPage) {
      this.totalPage = totalPage;
   }

   @JsonProperty("totalPage")
   public int getTotalPage() {
      return this.totalPage;
   }
}

package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.ArrayList;
import java.util.List;

public class GetOrderListResponse {
   public int total;
   public int pageNo;
   public int pageSize;
   public int maxPageNo;
   public List<OrderSimpleDetail> orderList = new ArrayList();

   public int getTotal() {
      return this.total;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public int getMaxPageNo() {
      return this.maxPageNo;
   }

   public List<OrderSimpleDetail> getOrderList() {
      return this.orderList;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setMaxPageNo(int maxPageNo) {
      this.maxPageNo = maxPageNo;
   }

   public void setOrderList(List<OrderSimpleDetail> orderList) {
      this.orderList = orderList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetOrderListResponse)) {
         return false;
      } else {
         GetOrderListResponse other = (GetOrderListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getMaxPageNo() != other.getMaxPageNo()) {
            return false;
         } else {
            Object this$orderList = this.getOrderList();
            Object other$orderList = other.getOrderList();
            if (this$orderList == null) {
               if (other$orderList != null) {
                  return false;
               }
            } else if (!this$orderList.equals(other$orderList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetOrderListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTotal();
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getMaxPageNo();
      Object $orderList = this.getOrderList();
      result = result * 59 + ($orderList == null ? 43 : $orderList.hashCode());
      return result;
   }

   public String toString() {
      return "GetOrderListResponse(total=" + this.getTotal() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", maxPageNo=" + this.getMaxPageNo() + ", orderList=" + this.getOrderList() + ")";
   }
}

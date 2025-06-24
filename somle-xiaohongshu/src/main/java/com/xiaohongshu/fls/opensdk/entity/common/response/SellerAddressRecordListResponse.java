package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class SellerAddressRecordListResponse {
   public List<SellerAddressRecord> sellerAddressRecordList = new ArrayList();
   public Long total;

   public List<SellerAddressRecord> getSellerAddressRecordList() {
      return this.sellerAddressRecordList;
   }

   public Long getTotal() {
      return this.total;
   }

   public void setSellerAddressRecordList(List<SellerAddressRecord> sellerAddressRecordList) {
      this.sellerAddressRecordList = sellerAddressRecordList;
   }

   public void setTotal(Long total) {
      this.total = total;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SellerAddressRecordListResponse)) {
         return false;
      } else {
         SellerAddressRecordListResponse other = (SellerAddressRecordListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$total = this.getTotal();
            Object other$total = other.getTotal();
            if (this$total == null) {
               if (other$total != null) {
                  return false;
               }
            } else if (!this$total.equals(other$total)) {
               return false;
            }

            Object this$sellerAddressRecordList = this.getSellerAddressRecordList();
            Object other$sellerAddressRecordList = other.getSellerAddressRecordList();
            if (this$sellerAddressRecordList == null) {
               if (other$sellerAddressRecordList != null) {
                  return false;
               }
            } else if (!this$sellerAddressRecordList.equals(other$sellerAddressRecordList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SellerAddressRecordListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $total = this.getTotal();
      result = result * 59 + ($total == null ? 43 : $total.hashCode());
      Object $sellerAddressRecordList = this.getSellerAddressRecordList();
      result = result * 59 + ($sellerAddressRecordList == null ? 43 : $sellerAddressRecordList.hashCode());
      return result;
   }

   public String toString() {
      return "SellerAddressRecordListResponse(sellerAddressRecordList=" + this.getSellerAddressRecordList() + ", total=" + this.getTotal() + ")";
   }
}

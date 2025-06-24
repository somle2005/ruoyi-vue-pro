package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class SearchItemListResponse {
   public int currentPage;
   public int pageSize;
   public long total;
   public List<ItemDetail> itemDetailV3s;

   public int getCurrentPage() {
      return this.currentPage;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public long getTotal() {
      return this.total;
   }

   public List<ItemDetail> getItemDetailV3s() {
      return this.itemDetailV3s;
   }

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setTotal(long total) {
      this.total = total;
   }

   public void setItemDetailV3s(List<ItemDetail> itemDetailV3s) {
      this.itemDetailV3s = itemDetailV3s;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SearchItemListResponse)) {
         return false;
      } else {
         SearchItemListResponse other = (SearchItemListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCurrentPage() != other.getCurrentPage()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else {
            Object this$itemDetailV3s = this.getItemDetailV3s();
            Object other$itemDetailV3s = other.getItemDetailV3s();
            if (this$itemDetailV3s == null) {
               if (other$itemDetailV3s != null) {
                  return false;
               }
            } else if (!this$itemDetailV3s.equals(other$itemDetailV3s)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SearchItemListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getCurrentPage();
      result = result * 59 + this.getPageSize();
      long $total = this.getTotal();
      result = result * 59 + (int)($total >>> 32 ^ $total);
      Object $itemDetailV3s = this.getItemDetailV3s();
      result = result * 59 + ($itemDetailV3s == null ? 43 : $itemDetailV3s.hashCode());
      return result;
   }

   public String toString() {
      return "SearchItemListResponse(currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", itemDetailV3s=" + this.getItemDetailV3s() + ")";
   }
}

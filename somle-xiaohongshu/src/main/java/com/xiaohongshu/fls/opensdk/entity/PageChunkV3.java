package com.xiaohongshu.fls.opensdk.entity;

public class PageChunkV3 {
   private int currentPage;
   private int pageSize;
   private int total;

   public int getCurrentPage() {
      return this.currentPage;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public int getTotal() {
      return this.total;
   }

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof PageChunkV3)) {
         return false;
      } else {
         PageChunkV3 other = (PageChunkV3)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCurrentPage() != other.getCurrentPage()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else {
            return this.getTotal() == other.getTotal();
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof PageChunkV3;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getCurrentPage();
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getTotal();
      return result;
   }

   public String toString() {
      return "PageChunkV3(currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ")";
   }
}

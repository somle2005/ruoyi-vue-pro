package com.xiaohongshu.fls.opensdk.entity.inventory.response;

public class ItemStockResponse {
   private String itemId;
   private ItemStock itemStock = new ItemStock();

   public String getItemId() {
      return this.itemId;
   }

   public ItemStock getItemStock() {
      return this.itemStock;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setItemStock(ItemStock itemStock) {
      this.itemStock = itemStock;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ItemStockResponse)) {
         return false;
      } else {
         ItemStockResponse other = (ItemStockResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            Object this$itemStock = this.getItemStock();
            Object other$itemStock = other.getItemStock();
            if (this$itemStock == null) {
               if (other$itemStock != null) {
                  return false;
               }
            } else if (!this$itemStock.equals(other$itemStock)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ItemStockResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $itemStock = this.getItemStock();
      result = result * 59 + ($itemStock == null ? 43 : $itemStock.hashCode());
      return result;
   }

   public String toString() {
      return "ItemStockResponse(itemId=" + this.getItemId() + ", itemStock=" + this.getItemStock() + ")";
   }

   public static class ItemStock {
      private long available;
      private long standalone;
      private long reserved;
      private long total;

      public long getAvailable() {
         return this.available;
      }

      public long getStandalone() {
         return this.standalone;
      }

      public long getReserved() {
         return this.reserved;
      }

      public long getTotal() {
         return this.total;
      }

      public void setAvailable(long available) {
         this.available = available;
      }

      public void setStandalone(long standalone) {
         this.standalone = standalone;
      }

      public void setReserved(long reserved) {
         this.reserved = reserved;
      }

      public void setTotal(long total) {
         this.total = total;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ItemStock)) {
            return false;
         } else {
            ItemStock other = (ItemStock)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getAvailable() != other.getAvailable()) {
               return false;
            } else if (this.getStandalone() != other.getStandalone()) {
               return false;
            } else if (this.getReserved() != other.getReserved()) {
               return false;
            } else {
               return this.getTotal() == other.getTotal();
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ItemStock;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $available = this.getAvailable();
         result = result * 59 + (int)($available >>> 32 ^ $available);
         long $standalone = this.getStandalone();
         result = result * 59 + (int)($standalone >>> 32 ^ $standalone);
         long $reserved = this.getReserved();
         result = result * 59 + (int)($reserved >>> 32 ^ $reserved);
         long $total = this.getTotal();
         result = result * 59 + (int)($total >>> 32 ^ $total);
         return result;
      }

      public String toString() {
         return "ItemStockResponse.ItemStock(available=" + this.getAvailable() + ", standalone=" + this.getStandalone() + ", reserved=" + this.getReserved() + ", total=" + this.getTotal() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class GetDetailSkuListResponse {
   public List<Product> data;
   public int pageNO;
   public int pageSize;
   public long total;

   public List<Product> getData() {
      return this.data;
   }

   public int getPageNO() {
      return this.pageNO;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public long getTotal() {
      return this.total;
   }

   public void setData(List<Product> data) {
      this.data = data;
   }

   public void setPageNO(int pageNO) {
      this.pageNO = pageNO;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setTotal(long total) {
      this.total = total;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetDetailSkuListResponse)) {
         return false;
      } else {
         GetDetailSkuListResponse other = (GetDetailSkuListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getPageNO() != other.getPageNO()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else {
            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetDetailSkuListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getPageNO();
      result = result * 59 + this.getPageSize();
      long $total = this.getTotal();
      result = result * 59 + (int)($total >>> 32 ^ $total);
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      return result;
   }

   public String toString() {
      return "GetDetailSkuListResponse(data=" + this.getData() + ", pageNO=" + this.getPageNO() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ")";
   }

   public static class Product {
      public ItemDetail item;
      public SkuDetail sku;

      public ItemDetail getItem() {
         return this.item;
      }

      public SkuDetail getSku() {
         return this.sku;
      }

      public void setItem(ItemDetail item) {
         this.item = item;
      }

      public void setSku(SkuDetail sku) {
         this.sku = sku;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Product)) {
            return false;
         } else {
            Product other = (Product)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$item = this.getItem();
               Object other$item = other.getItem();
               if (this$item == null) {
                  if (other$item != null) {
                     return false;
                  }
               } else if (!this$item.equals(other$item)) {
                  return false;
               }

               Object this$sku = this.getSku();
               Object other$sku = other.getSku();
               if (this$sku == null) {
                  if (other$sku != null) {
                     return false;
                  }
               } else if (!this$sku.equals(other$sku)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Product;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $item = this.getItem();
         result = result * 59 + ($item == null ? 43 : $item.hashCode());
         Object $sku = this.getSku();
         result = result * 59 + ($sku == null ? 43 : $sku.hashCode());
         return result;
      }

      public String toString() {
         return "GetDetailSkuListResponse.Product(item=" + this.getItem() + ", sku=" + this.getSku() + ")";
      }
   }
}

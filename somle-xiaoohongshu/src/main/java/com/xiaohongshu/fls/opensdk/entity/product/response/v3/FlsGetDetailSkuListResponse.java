package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class FlsGetDetailSkuListResponse {
   public List<Product> data;

   public List<Product> getData() {
      return this.data;
   }

   public void setData(List<Product> data) {
      this.data = data;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsGetDetailSkuListResponse)) {
         return false;
      } else {
         FlsGetDetailSkuListResponse other = (FlsGetDetailSkuListResponse)o;
         if (!other.canEqual(this)) {
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
      return other instanceof FlsGetDetailSkuListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      return result;
   }

   public String toString() {
      return "FlsGetDetailSkuListResponse(data=" + this.getData() + ")";
   }

   public static class Product {
      public ItemDetail item;
      public FlsSkuDetail sku;

      public ItemDetail getItem() {
         return this.item;
      }

      public FlsSkuDetail getSku() {
         return this.sku;
      }

      public void setItem(ItemDetail item) {
         this.item = item;
      }

      public void setSku(FlsSkuDetail sku) {
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
         return "FlsGetDetailSkuListResponse.Product(item=" + this.getItem() + ", sku=" + this.getSku() + ")";
      }
   }
}

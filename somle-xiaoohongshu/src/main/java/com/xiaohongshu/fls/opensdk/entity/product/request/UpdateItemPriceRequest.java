package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class UpdateItemPriceRequest extends BaseRequest {
   public String itemId;
   public List<PriceDetail> price;
   public Double originalPrice;

   public String getItemId() {
      return this.itemId;
   }

   public List<PriceDetail> getPrice() {
      return this.price;
   }

   public Double getOriginalPrice() {
      return this.originalPrice;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setPrice(List<PriceDetail> price) {
      this.price = price;
   }

   public void setOriginalPrice(Double originalPrice) {
      this.originalPrice = originalPrice;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateItemPriceRequest)) {
         return false;
      } else {
         UpdateItemPriceRequest other = (UpdateItemPriceRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$originalPrice = this.getOriginalPrice();
            Object other$originalPrice = other.getOriginalPrice();
            if (this$originalPrice == null) {
               if (other$originalPrice != null) {
                  return false;
               }
            } else if (!this$originalPrice.equals(other$originalPrice)) {
               return false;
            }

            Object this$itemId = this.getItemId();
            Object other$itemId = other.getItemId();
            if (this$itemId == null) {
               if (other$itemId != null) {
                  return false;
               }
            } else if (!this$itemId.equals(other$itemId)) {
               return false;
            }

            Object this$price = this.getPrice();
            Object other$price = other.getPrice();
            if (this$price == null) {
               if (other$price != null) {
                  return false;
               }
            } else if (!this$price.equals(other$price)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateItemPriceRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $originalPrice = this.getOriginalPrice();
      result = result * 59 + ($originalPrice == null ? 43 : $originalPrice.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $price = this.getPrice();
      result = result * 59 + ($price == null ? 43 : $price.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateItemPriceRequest(itemId=" + this.getItemId() + ", price=" + this.getPrice() + ", originalPrice=" + this.getOriginalPrice() + ")";
   }

   public static class PriceDetail {
      public String itemId;
      public Double price;

      public String getItemId() {
         return this.itemId;
      }

      public Double getPrice() {
         return this.price;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setPrice(Double price) {
         this.price = price;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PriceDetail)) {
            return false;
         } else {
            PriceDetail other = (PriceDetail)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$price = this.getPrice();
               Object other$price = other.getPrice();
               if (this$price == null) {
                  if (other$price != null) {
                     return false;
                  }
               } else if (!this$price.equals(other$price)) {
                  return false;
               }

               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PriceDetail;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $price = this.getPrice();
         result = result * 59 + ($price == null ? 43 : $price.hashCode());
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateItemPriceRequest.PriceDetail(itemId=" + this.getItemId() + ", price=" + this.getPrice() + ")";
      }
   }
}

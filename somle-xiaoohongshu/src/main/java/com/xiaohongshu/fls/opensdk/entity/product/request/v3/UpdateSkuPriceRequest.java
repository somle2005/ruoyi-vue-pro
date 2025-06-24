package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class UpdateSkuPriceRequest extends BaseRequest {
   public String skuId;
   public List<PriceDetail> price;
   public Long originalPrice;

   public String getSkuId() {
      return this.skuId;
   }

   public List<PriceDetail> getPrice() {
      return this.price;
   }

   public Long getOriginalPrice() {
      return this.originalPrice;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setPrice(List<PriceDetail> price) {
      this.price = price;
   }

   public void setOriginalPrice(Long originalPrice) {
      this.originalPrice = originalPrice;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateSkuPriceRequest)) {
         return false;
      } else {
         UpdateSkuPriceRequest other = (UpdateSkuPriceRequest)o;
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

            Object this$skuId = this.getSkuId();
            Object other$skuId = other.getSkuId();
            if (this$skuId == null) {
               if (other$skuId != null) {
                  return false;
               }
            } else if (!this$skuId.equals(other$skuId)) {
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
      return other instanceof UpdateSkuPriceRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $originalPrice = this.getOriginalPrice();
      result = result * 59 + ($originalPrice == null ? 43 : $originalPrice.hashCode());
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $price = this.getPrice();
      result = result * 59 + ($price == null ? 43 : $price.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateSkuPriceRequest(skuId=" + this.getSkuId() + ", price=" + this.getPrice() + ", originalPrice=" + this.getOriginalPrice() + ")";
   }

   public static class PriceDetail {
      public String skuId;
      public Long price;

      public String getSkuId() {
         return this.skuId;
      }

      public Long getPrice() {
         return this.price;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setPrice(Long price) {
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

               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
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
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateSkuPriceRequest.PriceDetail(skuId=" + this.getSkuId() + ", price=" + this.getPrice() + ")";
      }
   }
}

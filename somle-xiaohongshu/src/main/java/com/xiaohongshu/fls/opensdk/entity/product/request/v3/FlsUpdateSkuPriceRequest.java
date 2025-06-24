package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class FlsUpdateSkuPriceRequest extends BaseRequest {
   public String skuId;
   public PriceTax priceTax;
   public Boolean isMembershipPrice;
   public String userName;
   public String userId;
   public Integer taxType;
   public Integer priceType;

   public String getSkuId() {
      return this.skuId;
   }

   public PriceTax getPriceTax() {
      return this.priceTax;
   }

   public Boolean getIsMembershipPrice() {
      return this.isMembershipPrice;
   }

   public String getUserName() {
      return this.userName;
   }

   public String getUserId() {
      return this.userId;
   }

   public Integer getTaxType() {
      return this.taxType;
   }

   public Integer getPriceType() {
      return this.priceType;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setPriceTax(PriceTax priceTax) {
      this.priceTax = priceTax;
   }

   public void setIsMembershipPrice(Boolean isMembershipPrice) {
      this.isMembershipPrice = isMembershipPrice;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public void setTaxType(Integer taxType) {
      this.taxType = taxType;
   }

   public void setPriceType(Integer priceType) {
      this.priceType = priceType;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsUpdateSkuPriceRequest)) {
         return false;
      } else {
         FlsUpdateSkuPriceRequest other = (FlsUpdateSkuPriceRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$isMembershipPrice = this.getIsMembershipPrice();
            Object other$isMembershipPrice = other.getIsMembershipPrice();
            if (this$isMembershipPrice == null) {
               if (other$isMembershipPrice != null) {
                  return false;
               }
            } else if (!this$isMembershipPrice.equals(other$isMembershipPrice)) {
               return false;
            }

            Object this$taxType = this.getTaxType();
            Object other$taxType = other.getTaxType();
            if (this$taxType == null) {
               if (other$taxType != null) {
                  return false;
               }
            } else if (!this$taxType.equals(other$taxType)) {
               return false;
            }

            Object this$priceType = this.getPriceType();
            Object other$priceType = other.getPriceType();
            if (this$priceType == null) {
               if (other$priceType != null) {
                  return false;
               }
            } else if (!this$priceType.equals(other$priceType)) {
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

            Object this$priceTax = this.getPriceTax();
            Object other$priceTax = other.getPriceTax();
            if (this$priceTax == null) {
               if (other$priceTax != null) {
                  return false;
               }
            } else if (!this$priceTax.equals(other$priceTax)) {
               return false;
            }

            Object this$userName = this.getUserName();
            Object other$userName = other.getUserName();
            if (this$userName == null) {
               if (other$userName != null) {
                  return false;
               }
            } else if (!this$userName.equals(other$userName)) {
               return false;
            }

            Object this$userId = this.getUserId();
            Object other$userId = other.getUserId();
            if (this$userId == null) {
               if (other$userId != null) {
                  return false;
               }
            } else if (!this$userId.equals(other$userId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsUpdateSkuPriceRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $isMembershipPrice = this.getIsMembershipPrice();
      result = result * 59 + ($isMembershipPrice == null ? 43 : $isMembershipPrice.hashCode());
      Object $taxType = this.getTaxType();
      result = result * 59 + ($taxType == null ? 43 : $taxType.hashCode());
      Object $priceType = this.getPriceType();
      result = result * 59 + ($priceType == null ? 43 : $priceType.hashCode());
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $priceTax = this.getPriceTax();
      result = result * 59 + ($priceTax == null ? 43 : $priceTax.hashCode());
      Object $userName = this.getUserName();
      result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      return result;
   }

   public String toString() {
      return "FlsUpdateSkuPriceRequest(skuId=" + this.getSkuId() + ", priceTax=" + this.getPriceTax() + ", isMembershipPrice=" + this.getIsMembershipPrice() + ", userName=" + this.getUserName() + ", userId=" + this.getUserId() + ", taxType=" + this.getTaxType() + ", priceType=" + this.getPriceType() + ")";
   }

   public static class PriceTax {
      public double preTax;
      public double postTax;
      public double taxRate;
      public double tax;

      public double getPreTax() {
         return this.preTax;
      }

      public double getPostTax() {
         return this.postTax;
      }

      public double getTaxRate() {
         return this.taxRate;
      }

      public double getTax() {
         return this.tax;
      }

      public void setPreTax(double preTax) {
         this.preTax = preTax;
      }

      public void setPostTax(double postTax) {
         this.postTax = postTax;
      }

      public void setTaxRate(double taxRate) {
         this.taxRate = taxRate;
      }

      public void setTax(double tax) {
         this.tax = tax;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PriceTax)) {
            return false;
         } else {
            PriceTax other = (PriceTax)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getPreTax(), other.getPreTax()) != 0) {
               return false;
            } else if (Double.compare(this.getPostTax(), other.getPostTax()) != 0) {
               return false;
            } else if (Double.compare(this.getTaxRate(), other.getTaxRate()) != 0) {
               return false;
            } else {
               return Double.compare(this.getTax(), other.getTax()) == 0;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PriceTax;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $preTax = Double.doubleToLongBits(this.getPreTax());
         result = result * 59 + (int)($preTax >>> 32 ^ $preTax);
         long $postTax = Double.doubleToLongBits(this.getPostTax());
         result = result * 59 + (int)($postTax >>> 32 ^ $postTax);
         long $taxRate = Double.doubleToLongBits(this.getTaxRate());
         result = result * 59 + (int)($taxRate >>> 32 ^ $taxRate);
         long $tax = Double.doubleToLongBits(this.getTax());
         result = result * 59 + (int)($tax >>> 32 ^ $tax);
         return result;
      }

      public String toString() {
         return "FlsUpdateSkuPriceRequest.PriceTax(preTax=" + this.getPreTax() + ", postTax=" + this.getPostTax() + ", taxRate=" + this.getTaxRate() + ", tax=" + this.getTax() + ")";
      }
   }
}

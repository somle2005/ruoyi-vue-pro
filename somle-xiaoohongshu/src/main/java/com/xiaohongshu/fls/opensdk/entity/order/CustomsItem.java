package com.xiaohongshu.fls.opensdk.entity.order;

public class CustomsItem {
   public String skuId;
   public String barcode;
   public String originCountry;

   public String getSkuId() {
      return this.skuId;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public String getOriginCountry() {
      return this.originCountry;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setOriginCountry(String originCountry) {
      this.originCountry = originCountry;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CustomsItem)) {
         return false;
      } else {
         CustomsItem other = (CustomsItem)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$skuId = this.getSkuId();
            Object other$skuId = other.getSkuId();
            if (this$skuId == null) {
               if (other$skuId != null) {
                  return false;
               }
            } else if (!this$skuId.equals(other$skuId)) {
               return false;
            }

            Object this$barcode = this.getBarcode();
            Object other$barcode = other.getBarcode();
            if (this$barcode == null) {
               if (other$barcode != null) {
                  return false;
               }
            } else if (!this$barcode.equals(other$barcode)) {
               return false;
            }

            Object this$originCountry = this.getOriginCountry();
            Object other$originCountry = other.getOriginCountry();
            if (this$originCountry == null) {
               if (other$originCountry != null) {
                  return false;
               }
            } else if (!this$originCountry.equals(other$originCountry)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CustomsItem;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $skuId = this.getSkuId();
      result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $originCountry = this.getOriginCountry();
      result = result * 59 + ($originCountry == null ? 43 : $originCountry.hashCode());
      return result;
   }

   public String toString() {
      return "CustomsItem(skuId=" + this.getSkuId() + ", barcode=" + this.getBarcode() + ", originCountry=" + this.getOriginCountry() + ")";
   }

   public CustomsItem() {
   }

   public CustomsItem(String skuId, String barcode, String originCountry) {
      this.skuId = skuId;
      this.barcode = barcode;
      this.originCountry = originCountry;
   }
}

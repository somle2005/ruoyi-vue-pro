package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetItemCustomInfoRequest extends BaseRequest {
   public String barcode;

   public String getBarcode() {
      return this.barcode;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetItemCustomInfoRequest)) {
         return false;
      } else {
         GetItemCustomInfoRequest other = (GetItemCustomInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$barcode = this.getBarcode();
            Object other$barcode = other.getBarcode();
            if (this$barcode == null) {
               if (other$barcode != null) {
                  return false;
               }
            } else if (!this$barcode.equals(other$barcode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetItemCustomInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      return result;
   }

   public String toString() {
      return "GetItemCustomInfoRequest(barcode=" + this.getBarcode() + ")";
   }
}

package com.xiaohongshu.fls.opensdk.entity.common.response;

public class GetSellerKeyInfoResponse {
   public String sellerId;
   public String appKey;

   public String getSellerId() {
      return this.sellerId;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setSellerId(String sellerId) {
      this.sellerId = sellerId;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSellerKeyInfoResponse)) {
         return false;
      } else {
         GetSellerKeyInfoResponse other = (GetSellerKeyInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$sellerId = this.getSellerId();
            Object other$sellerId = other.getSellerId();
            if (this$sellerId == null) {
               if (other$sellerId != null) {
                  return false;
               }
            } else if (!this$sellerId.equals(other$sellerId)) {
               return false;
            }

            Object this$appKey = this.getAppKey();
            Object other$appKey = other.getAppKey();
            if (this$appKey == null) {
               if (other$appKey != null) {
                  return false;
               }
            } else if (!this$appKey.equals(other$appKey)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSellerKeyInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $sellerId = this.getSellerId();
      result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
      Object $appKey = this.getAppKey();
      result = result * 59 + ($appKey == null ? 43 : $appKey.hashCode());
      return result;
   }

   public String toString() {
      return "GetSellerKeyInfoResponse(sellerId=" + this.getSellerId() + ", appKey=" + this.getAppKey() + ")";
   }
}

package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.ArrayList;
import java.util.List;

public class GetSupportedPortListResponse {
   List<BondedCustomsInfo> platSupportCustoms = new ArrayList();
   List<BondedCustomsInfo> sellerSupportCustoms = new ArrayList();

   public List<BondedCustomsInfo> getPlatSupportCustoms() {
      return this.platSupportCustoms;
   }

   public List<BondedCustomsInfo> getSellerSupportCustoms() {
      return this.sellerSupportCustoms;
   }

   public void setPlatSupportCustoms(List<BondedCustomsInfo> platSupportCustoms) {
      this.platSupportCustoms = platSupportCustoms;
   }

   public void setSellerSupportCustoms(List<BondedCustomsInfo> sellerSupportCustoms) {
      this.sellerSupportCustoms = sellerSupportCustoms;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSupportedPortListResponse)) {
         return false;
      } else {
         GetSupportedPortListResponse other = (GetSupportedPortListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$platSupportCustoms = this.getPlatSupportCustoms();
            Object other$platSupportCustoms = other.getPlatSupportCustoms();
            if (this$platSupportCustoms == null) {
               if (other$platSupportCustoms != null) {
                  return false;
               }
            } else if (!this$platSupportCustoms.equals(other$platSupportCustoms)) {
               return false;
            }

            Object this$sellerSupportCustoms = this.getSellerSupportCustoms();
            Object other$sellerSupportCustoms = other.getSellerSupportCustoms();
            if (this$sellerSupportCustoms == null) {
               if (other$sellerSupportCustoms != null) {
                  return false;
               }
            } else if (!this$sellerSupportCustoms.equals(other$sellerSupportCustoms)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSupportedPortListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $platSupportCustoms = this.getPlatSupportCustoms();
      result = result * 59 + ($platSupportCustoms == null ? 43 : $platSupportCustoms.hashCode());
      Object $sellerSupportCustoms = this.getSellerSupportCustoms();
      result = result * 59 + ($sellerSupportCustoms == null ? 43 : $sellerSupportCustoms.hashCode());
      return result;
   }

   public String toString() {
      return "GetSupportedPortListResponse(platSupportCustoms=" + this.getPlatSupportCustoms() + ", sellerSupportCustoms=" + this.getSellerSupportCustoms() + ")";
   }

   public static class BondedCustomsInfo {
      public String customs_name;
      public String customs_code;

      public String getCustoms_name() {
         return this.customs_name;
      }

      public String getCustoms_code() {
         return this.customs_code;
      }

      public void setCustoms_name(String customs_name) {
         this.customs_name = customs_name;
      }

      public void setCustoms_code(String customs_code) {
         this.customs_code = customs_code;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof BondedCustomsInfo)) {
            return false;
         } else {
            BondedCustomsInfo other = (BondedCustomsInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$customs_name = this.getCustoms_name();
               Object other$customs_name = other.getCustoms_name();
               if (this$customs_name == null) {
                  if (other$customs_name != null) {
                     return false;
                  }
               } else if (!this$customs_name.equals(other$customs_name)) {
                  return false;
               }

               Object this$customs_code = this.getCustoms_code();
               Object other$customs_code = other.getCustoms_code();
               if (this$customs_code == null) {
                  if (other$customs_code != null) {
                     return false;
                  }
               } else if (!this$customs_code.equals(other$customs_code)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof BondedCustomsInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $customs_name = this.getCustoms_name();
         result = result * 59 + ($customs_name == null ? 43 : $customs_name.hashCode());
         Object $customs_code = this.getCustoms_code();
         result = result * 59 + ($customs_code == null ? 43 : $customs_code.hashCode());
         return result;
      }

      public String toString() {
         return "GetSupportedPortListResponse.BondedCustomsInfo(customs_name=" + this.getCustoms_name() + ", customs_code=" + this.getCustoms_code() + ")";
      }
   }
}

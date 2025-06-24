package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class GetCustomsInfoResponse {
   public List<CustomsInfo> providerSyncCustomsInfoV3List;

   public List<CustomsInfo> getProviderSyncCustomsInfoV3List() {
      return this.providerSyncCustomsInfoV3List;
   }

   public void setProviderSyncCustomsInfoV3List(List<CustomsInfo> providerSyncCustomsInfoV3List) {
      this.providerSyncCustomsInfoV3List = providerSyncCustomsInfoV3List;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCustomsInfoResponse)) {
         return false;
      } else {
         GetCustomsInfoResponse other = (GetCustomsInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$providerSyncCustomsInfoV3List = this.getProviderSyncCustomsInfoV3List();
            Object other$providerSyncCustomsInfoV3List = other.getProviderSyncCustomsInfoV3List();
            if (this$providerSyncCustomsInfoV3List == null) {
               if (other$providerSyncCustomsInfoV3List != null) {
                  return false;
               }
            } else if (!this$providerSyncCustomsInfoV3List.equals(other$providerSyncCustomsInfoV3List)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCustomsInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $providerSyncCustomsInfoV3List = this.getProviderSyncCustomsInfoV3List();
      result = result * 59 + ($providerSyncCustomsInfoV3List == null ? 43 : $providerSyncCustomsInfoV3List.hashCode());
      return result;
   }

   public String toString() {
      return "GetCustomsInfoResponse(providerSyncCustomsInfoV3List=" + this.getProviderSyncCustomsInfoV3List() + ")";
   }
}

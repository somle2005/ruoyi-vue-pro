package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class GetReceiverInfoRequest extends BaseRequest {
   List<ReceiverQuery> receiverQueries;
   Boolean isReturn;

   public List<ReceiverQuery> getReceiverQueries() {
      return this.receiverQueries;
   }

   public Boolean getIsReturn() {
      return this.isReturn;
   }

   public void setReceiverQueries(List<ReceiverQuery> receiverQueries) {
      this.receiverQueries = receiverQueries;
   }

   public void setIsReturn(Boolean isReturn) {
      this.isReturn = isReturn;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetReceiverInfoRequest)) {
         return false;
      } else {
         GetReceiverInfoRequest other = (GetReceiverInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$isReturn = this.getIsReturn();
            Object other$isReturn = other.getIsReturn();
            if (this$isReturn == null) {
               if (other$isReturn != null) {
                  return false;
               }
            } else if (!this$isReturn.equals(other$isReturn)) {
               return false;
            }

            Object this$receiverQueries = this.getReceiverQueries();
            Object other$receiverQueries = other.getReceiverQueries();
            if (this$receiverQueries == null) {
               if (other$receiverQueries != null) {
                  return false;
               }
            } else if (!this$receiverQueries.equals(other$receiverQueries)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetReceiverInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $isReturn = this.getIsReturn();
      result = result * 59 + ($isReturn == null ? 43 : $isReturn.hashCode());
      Object $receiverQueries = this.getReceiverQueries();
      result = result * 59 + ($receiverQueries == null ? 43 : $receiverQueries.hashCode());
      return result;
   }

   public String toString() {
      return "GetReceiverInfoRequest(receiverQueries=" + this.getReceiverQueries() + ", isReturn=" + this.getIsReturn() + ")";
   }

   public static class ReceiverQuery {
      public String packageId;
      public String openAddressId;

      public String getPackageId() {
         return this.packageId;
      }

      public String getOpenAddressId() {
         return this.openAddressId;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setOpenAddressId(String openAddressId) {
         this.openAddressId = openAddressId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ReceiverQuery)) {
            return false;
         } else {
            ReceiverQuery other = (ReceiverQuery)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$packageId = this.getPackageId();
               Object other$packageId = other.getPackageId();
               if (this$packageId == null) {
                  if (other$packageId != null) {
                     return false;
                  }
               } else if (!this$packageId.equals(other$packageId)) {
                  return false;
               }

               Object this$openAddressId = this.getOpenAddressId();
               Object other$openAddressId = other.getOpenAddressId();
               if (this$openAddressId == null) {
                  if (other$openAddressId != null) {
                     return false;
                  }
               } else if (!this$openAddressId.equals(other$openAddressId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ReceiverQuery;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $openAddressId = this.getOpenAddressId();
         result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
         return result;
      }

      public String toString() {
         return "GetReceiverInfoRequest.ReceiverQuery(packageId=" + this.getPackageId() + ", openAddressId=" + this.getOpenAddressId() + ")";
      }
   }
}

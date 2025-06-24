package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class CreateTransferBatchRequest extends BaseRequest {
   public List<TransferPackageDTO> packages;
   public String planInfoId;

   public List<TransferPackageDTO> getPackages() {
      return this.packages;
   }

   public String getPlanInfoId() {
      return this.planInfoId;
   }

   public void setPackages(List<TransferPackageDTO> packages) {
      this.packages = packages;
   }

   public void setPlanInfoId(String planInfoId) {
      this.planInfoId = planInfoId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateTransferBatchRequest)) {
         return false;
      } else {
         CreateTransferBatchRequest other = (CreateTransferBatchRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$packages = this.getPackages();
            Object other$packages = other.getPackages();
            if (this$packages == null) {
               if (other$packages != null) {
                  return false;
               }
            } else if (!this$packages.equals(other$packages)) {
               return false;
            }

            Object this$planInfoId = this.getPlanInfoId();
            Object other$planInfoId = other.getPlanInfoId();
            if (this$planInfoId == null) {
               if (other$planInfoId != null) {
                  return false;
               }
            } else if (!this$planInfoId.equals(other$planInfoId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateTransferBatchRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $packages = this.getPackages();
      result = result * 59 + ($packages == null ? 43 : $packages.hashCode());
      Object $planInfoId = this.getPlanInfoId();
      result = result * 59 + ($planInfoId == null ? 43 : $planInfoId.hashCode());
      return result;
   }

   public String toString() {
      return "CreateTransferBatchRequest(packages=" + this.getPackages() + ", planInfoId=" + this.getPlanInfoId() + ")";
   }

   public static class TransferPackageDTO {
      public String packageId;
      public long weight;

      public String getPackageId() {
         return this.packageId;
      }

      public long getWeight() {
         return this.weight;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setWeight(long weight) {
         this.weight = weight;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof TransferPackageDTO)) {
            return false;
         } else {
            TransferPackageDTO other = (TransferPackageDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getWeight() != other.getWeight()) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof TransferPackageDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $weight = this.getWeight();
         result = result * 59 + (int)($weight >>> 32 ^ $weight);
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         return result;
      }

      public String toString() {
         return "CreateTransferBatchRequest.TransferPackageDTO(packageId=" + this.getPackageId() + ", weight=" + this.getWeight() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class UpdateProxyPackageWeightRequest extends BaseRequest {
   public String packageId;
   public Double weight;

   public String getPackageId() {
      return this.packageId;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateProxyPackageWeightRequest)) {
         return false;
      } else {
         UpdateProxyPackageWeightRequest other = (UpdateProxyPackageWeightRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$weight = this.getWeight();
            Object other$weight = other.getWeight();
            if (this$weight == null) {
               if (other$weight != null) {
                  return false;
               }
            } else if (!this$weight.equals(other$weight)) {
               return false;
            }

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
      return other instanceof UpdateProxyPackageWeightRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $weight = this.getWeight();
      result = result * 59 + ($weight == null ? 43 : $weight.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateProxyPackageWeightRequest(packageId=" + this.getPackageId() + ", weight=" + this.getWeight() + ")";
   }
}

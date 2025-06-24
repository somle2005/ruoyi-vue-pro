package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ModifySellerMarkRequest extends BaseRequest {
   public String packageId;
   public String sellerMarkNote;
   public String operator;
   public Integer sellerMarkPriority;

   public String getPackageId() {
      return this.packageId;
   }

   public String getSellerMarkNote() {
      return this.sellerMarkNote;
   }

   public String getOperator() {
      return this.operator;
   }

   public Integer getSellerMarkPriority() {
      return this.sellerMarkPriority;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setSellerMarkNote(String sellerMarkNote) {
      this.sellerMarkNote = sellerMarkNote;
   }

   public void setOperator(String operator) {
      this.operator = operator;
   }

   public void setSellerMarkPriority(Integer sellerMarkPriority) {
      this.sellerMarkPriority = sellerMarkPriority;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ModifySellerMarkRequest)) {
         return false;
      } else {
         ModifySellerMarkRequest other = (ModifySellerMarkRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$sellerMarkPriority = this.getSellerMarkPriority();
            Object other$sellerMarkPriority = other.getSellerMarkPriority();
            if (this$sellerMarkPriority == null) {
               if (other$sellerMarkPriority != null) {
                  return false;
               }
            } else if (!this$sellerMarkPriority.equals(other$sellerMarkPriority)) {
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

            Object this$sellerMarkNote = this.getSellerMarkNote();
            Object other$sellerMarkNote = other.getSellerMarkNote();
            if (this$sellerMarkNote == null) {
               if (other$sellerMarkNote != null) {
                  return false;
               }
            } else if (!this$sellerMarkNote.equals(other$sellerMarkNote)) {
               return false;
            }

            Object this$operator = this.getOperator();
            Object other$operator = other.getOperator();
            if (this$operator == null) {
               if (other$operator != null) {
                  return false;
               }
            } else if (!this$operator.equals(other$operator)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ModifySellerMarkRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $sellerMarkPriority = this.getSellerMarkPriority();
      result = result * 59 + ($sellerMarkPriority == null ? 43 : $sellerMarkPriority.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $sellerMarkNote = this.getSellerMarkNote();
      result = result * 59 + ($sellerMarkNote == null ? 43 : $sellerMarkNote.hashCode());
      Object $operator = this.getOperator();
      result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
      return result;
   }

   public String toString() {
      return "ModifySellerMarkRequest(packageId=" + this.getPackageId() + ", sellerMarkNote=" + this.getSellerMarkNote() + ", operator=" + this.getOperator() + ", sellerMarkPriority=" + this.getSellerMarkPriority() + ")";
   }
}

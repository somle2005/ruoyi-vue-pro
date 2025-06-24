package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.order.SkuIdentifyCodeInfo;
import java.util.List;

public class BatchBindOrderSkuIdentifyCodeInfoRequest extends BaseRequest {
   private List<OrderSkuIdentifyCodeInfo> orderSkuIdentifyCodeInfoList;

   public List<OrderSkuIdentifyCodeInfo> getOrderSkuIdentifyCodeInfoList() {
      return this.orderSkuIdentifyCodeInfoList;
   }

   public void setOrderSkuIdentifyCodeInfoList(List<OrderSkuIdentifyCodeInfo> orderSkuIdentifyCodeInfoList) {
      this.orderSkuIdentifyCodeInfoList = orderSkuIdentifyCodeInfoList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchBindOrderSkuIdentifyCodeInfoRequest)) {
         return false;
      } else {
         BatchBindOrderSkuIdentifyCodeInfoRequest other = (BatchBindOrderSkuIdentifyCodeInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$orderSkuIdentifyCodeInfoList = this.getOrderSkuIdentifyCodeInfoList();
            Object other$orderSkuIdentifyCodeInfoList = other.getOrderSkuIdentifyCodeInfoList();
            if (this$orderSkuIdentifyCodeInfoList == null) {
               if (other$orderSkuIdentifyCodeInfoList != null) {
                  return false;
               }
            } else if (!this$orderSkuIdentifyCodeInfoList.equals(other$orderSkuIdentifyCodeInfoList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchBindOrderSkuIdentifyCodeInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $orderSkuIdentifyCodeInfoList = this.getOrderSkuIdentifyCodeInfoList();
      result = result * 59 + ($orderSkuIdentifyCodeInfoList == null ? 43 : $orderSkuIdentifyCodeInfoList.hashCode());
      return result;
   }

   public String toString() {
      return "BatchBindOrderSkuIdentifyCodeInfoRequest(orderSkuIdentifyCodeInfoList=" + this.getOrderSkuIdentifyCodeInfoList() + ")";
   }

   public static class OrderSkuIdentifyCodeInfo {
      private String packageId;
      private SkuIdentifyCodeInfo skuIdentifyCodeInfo;

      public String getPackageId() {
         return this.packageId;
      }

      public SkuIdentifyCodeInfo getSkuIdentifyCodeInfo() {
         return this.skuIdentifyCodeInfo;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setSkuIdentifyCodeInfo(SkuIdentifyCodeInfo skuIdentifyCodeInfo) {
         this.skuIdentifyCodeInfo = skuIdentifyCodeInfo;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OrderSkuIdentifyCodeInfo)) {
            return false;
         } else {
            OrderSkuIdentifyCodeInfo other = (OrderSkuIdentifyCodeInfo)o;
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

               Object this$skuIdentifyCodeInfo = this.getSkuIdentifyCodeInfo();
               Object other$skuIdentifyCodeInfo = other.getSkuIdentifyCodeInfo();
               if (this$skuIdentifyCodeInfo == null) {
                  if (other$skuIdentifyCodeInfo != null) {
                     return false;
                  }
               } else if (!this$skuIdentifyCodeInfo.equals(other$skuIdentifyCodeInfo)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderSkuIdentifyCodeInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $skuIdentifyCodeInfo = this.getSkuIdentifyCodeInfo();
         result = result * 59 + ($skuIdentifyCodeInfo == null ? 43 : $skuIdentifyCodeInfo.hashCode());
         return result;
      }

      public String toString() {
         return "BatchBindOrderSkuIdentifyCodeInfoRequest.OrderSkuIdentifyCodeInfo(packageId=" + this.getPackageId() + ", skuIdentifyCodeInfo=" + this.getSkuIdentifyCodeInfo() + ")";
      }
   }
}

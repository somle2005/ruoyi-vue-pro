package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.order.SkuIdentifyCodeInfo;
import java.util.List;

public class OrderDeliverRequest extends BaseRequest {
   public String orderId;
   public String expressNo;
   public String expressCompanyCode;
   public String expressCompanyName;
   public Long deliveringTime;
   public Boolean unpack;
   public List<String> skuIdList;
   public String returnAddressId;
   public SkuIdentifyCodeInfo skuIdentifyCodeInfo;

   public String getOrderId() {
      return this.orderId;
   }

   public String getExpressNo() {
      return this.expressNo;
   }

   public String getExpressCompanyCode() {
      return this.expressCompanyCode;
   }

   public String getExpressCompanyName() {
      return this.expressCompanyName;
   }

   public Long getDeliveringTime() {
      return this.deliveringTime;
   }

   public Boolean getUnpack() {
      return this.unpack;
   }

   public List<String> getSkuIdList() {
      return this.skuIdList;
   }

   public String getReturnAddressId() {
      return this.returnAddressId;
   }

   public SkuIdentifyCodeInfo getSkuIdentifyCodeInfo() {
      return this.skuIdentifyCodeInfo;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setExpressNo(String expressNo) {
      this.expressNo = expressNo;
   }

   public void setExpressCompanyCode(String expressCompanyCode) {
      this.expressCompanyCode = expressCompanyCode;
   }

   public void setExpressCompanyName(String expressCompanyName) {
      this.expressCompanyName = expressCompanyName;
   }

   public void setDeliveringTime(Long deliveringTime) {
      this.deliveringTime = deliveringTime;
   }

   public void setUnpack(Boolean unpack) {
      this.unpack = unpack;
   }

   public void setSkuIdList(List<String> skuIdList) {
      this.skuIdList = skuIdList;
   }

   public void setReturnAddressId(String returnAddressId) {
      this.returnAddressId = returnAddressId;
   }

   public void setSkuIdentifyCodeInfo(SkuIdentifyCodeInfo skuIdentifyCodeInfo) {
      this.skuIdentifyCodeInfo = skuIdentifyCodeInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof OrderDeliverRequest)) {
         return false;
      } else {
         OrderDeliverRequest other = (OrderDeliverRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$deliveringTime = this.getDeliveringTime();
            Object other$deliveringTime = other.getDeliveringTime();
            if (this$deliveringTime == null) {
               if (other$deliveringTime != null) {
                  return false;
               }
            } else if (!this$deliveringTime.equals(other$deliveringTime)) {
               return false;
            }

            Object this$unpack = this.getUnpack();
            Object other$unpack = other.getUnpack();
            if (this$unpack == null) {
               if (other$unpack != null) {
                  return false;
               }
            } else if (!this$unpack.equals(other$unpack)) {
               return false;
            }

            Object this$orderId = this.getOrderId();
            Object other$orderId = other.getOrderId();
            if (this$orderId == null) {
               if (other$orderId != null) {
                  return false;
               }
            } else if (!this$orderId.equals(other$orderId)) {
               return false;
            }

            Object this$expressNo = this.getExpressNo();
            Object other$expressNo = other.getExpressNo();
            if (this$expressNo == null) {
               if (other$expressNo != null) {
                  return false;
               }
            } else if (!this$expressNo.equals(other$expressNo)) {
               return false;
            }

            Object this$expressCompanyCode = this.getExpressCompanyCode();
            Object other$expressCompanyCode = other.getExpressCompanyCode();
            if (this$expressCompanyCode == null) {
               if (other$expressCompanyCode != null) {
                  return false;
               }
            } else if (!this$expressCompanyCode.equals(other$expressCompanyCode)) {
               return false;
            }

            Object this$expressCompanyName = this.getExpressCompanyName();
            Object other$expressCompanyName = other.getExpressCompanyName();
            if (this$expressCompanyName == null) {
               if (other$expressCompanyName != null) {
                  return false;
               }
            } else if (!this$expressCompanyName.equals(other$expressCompanyName)) {
               return false;
            }

            Object this$skuIdList = this.getSkuIdList();
            Object other$skuIdList = other.getSkuIdList();
            if (this$skuIdList == null) {
               if (other$skuIdList != null) {
                  return false;
               }
            } else if (!this$skuIdList.equals(other$skuIdList)) {
               return false;
            }

            Object this$returnAddressId = this.getReturnAddressId();
            Object other$returnAddressId = other.getReturnAddressId();
            if (this$returnAddressId == null) {
               if (other$returnAddressId != null) {
                  return false;
               }
            } else if (!this$returnAddressId.equals(other$returnAddressId)) {
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
      return other instanceof OrderDeliverRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $deliveringTime = this.getDeliveringTime();
      result = result * 59 + ($deliveringTime == null ? 43 : $deliveringTime.hashCode());
      Object $unpack = this.getUnpack();
      result = result * 59 + ($unpack == null ? 43 : $unpack.hashCode());
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $expressNo = this.getExpressNo();
      result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
      Object $expressCompanyCode = this.getExpressCompanyCode();
      result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
      Object $expressCompanyName = this.getExpressCompanyName();
      result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
      Object $skuIdList = this.getSkuIdList();
      result = result * 59 + ($skuIdList == null ? 43 : $skuIdList.hashCode());
      Object $returnAddressId = this.getReturnAddressId();
      result = result * 59 + ($returnAddressId == null ? 43 : $returnAddressId.hashCode());
      Object $skuIdentifyCodeInfo = this.getSkuIdentifyCodeInfo();
      result = result * 59 + ($skuIdentifyCodeInfo == null ? 43 : $skuIdentifyCodeInfo.hashCode());
      return result;
   }

   public String toString() {
      return "OrderDeliverRequest(orderId=" + this.getOrderId() + ", expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", deliveringTime=" + this.getDeliveringTime() + ", unpack=" + this.getUnpack() + ", skuIdList=" + this.getSkuIdList() + ", returnAddressId=" + this.getReturnAddressId() + ", skuIdentifyCodeInfo=" + this.getSkuIdentifyCodeInfo() + ")";
   }
}

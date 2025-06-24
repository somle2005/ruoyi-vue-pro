package com.xiaohongshu.fls.opensdk.entity.order.Requset;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class BatchApproveSubscribeOrdersRequest extends BaseRequest {
   public String productCode;
   public String serviceProviderCode;
   public String sellerId;
   public List<ApproveSubscribeOrdersDetail> approveResult;

   public String getProductCode() {
      return this.productCode;
   }

   public String getServiceProviderCode() {
      return this.serviceProviderCode;
   }

   public String getSellerId() {
      return this.sellerId;
   }

   public List<ApproveSubscribeOrdersDetail> getApproveResult() {
      return this.approveResult;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public void setServiceProviderCode(String serviceProviderCode) {
      this.serviceProviderCode = serviceProviderCode;
   }

   public void setSellerId(String sellerId) {
      this.sellerId = sellerId;
   }

   public void setApproveResult(List<ApproveSubscribeOrdersDetail> approveResult) {
      this.approveResult = approveResult;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchApproveSubscribeOrdersRequest)) {
         return false;
      } else {
         BatchApproveSubscribeOrdersRequest other = (BatchApproveSubscribeOrdersRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$productCode = this.getProductCode();
            Object other$productCode = other.getProductCode();
            if (this$productCode == null) {
               if (other$productCode != null) {
                  return false;
               }
            } else if (!this$productCode.equals(other$productCode)) {
               return false;
            }

            Object this$serviceProviderCode = this.getServiceProviderCode();
            Object other$serviceProviderCode = other.getServiceProviderCode();
            if (this$serviceProviderCode == null) {
               if (other$serviceProviderCode != null) {
                  return false;
               }
            } else if (!this$serviceProviderCode.equals(other$serviceProviderCode)) {
               return false;
            }

            Object this$sellerId = this.getSellerId();
            Object other$sellerId = other.getSellerId();
            if (this$sellerId == null) {
               if (other$sellerId != null) {
                  return false;
               }
            } else if (!this$sellerId.equals(other$sellerId)) {
               return false;
            }

            Object this$approveResult = this.getApproveResult();
            Object other$approveResult = other.getApproveResult();
            if (this$approveResult == null) {
               if (other$approveResult != null) {
                  return false;
               }
            } else if (!this$approveResult.equals(other$approveResult)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchApproveSubscribeOrdersRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $productCode = this.getProductCode();
      result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
      Object $serviceProviderCode = this.getServiceProviderCode();
      result = result * 59 + ($serviceProviderCode == null ? 43 : $serviceProviderCode.hashCode());
      Object $sellerId = this.getSellerId();
      result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
      Object $approveResult = this.getApproveResult();
      result = result * 59 + ($approveResult == null ? 43 : $approveResult.hashCode());
      return result;
   }

   public String toString() {
      return "BatchApproveSubscribeOrdersRequest(productCode=" + this.getProductCode() + ", serviceProviderCode=" + this.getServiceProviderCode() + ", sellerId=" + this.getSellerId() + ", approveResult=" + this.getApproveResult() + ")";
   }

   public static class ApproveSubscribeOrdersDetail {
      public String subscribeId;
      public boolean approvePass;
      public String reason;

      public String getSubscribeId() {
         return this.subscribeId;
      }

      public boolean isApprovePass() {
         return this.approvePass;
      }

      public String getReason() {
         return this.reason;
      }

      public void setSubscribeId(String subscribeId) {
         this.subscribeId = subscribeId;
      }

      public void setApprovePass(boolean approvePass) {
         this.approvePass = approvePass;
      }

      public void setReason(String reason) {
         this.reason = reason;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ApproveSubscribeOrdersDetail)) {
            return false;
         } else {
            ApproveSubscribeOrdersDetail other = (ApproveSubscribeOrdersDetail)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.isApprovePass() != other.isApprovePass()) {
               return false;
            } else {
               Object this$subscribeId = this.getSubscribeId();
               Object other$subscribeId = other.getSubscribeId();
               if (this$subscribeId == null) {
                  if (other$subscribeId != null) {
                     return false;
                  }
               } else if (!this$subscribeId.equals(other$subscribeId)) {
                  return false;
               }

               Object this$reason = this.getReason();
               Object other$reason = other.getReason();
               if (this$reason == null) {
                  if (other$reason != null) {
                     return false;
                  }
               } else if (!this$reason.equals(other$reason)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ApproveSubscribeOrdersDetail;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + (this.isApprovePass() ? 79 : 97);
         Object $subscribeId = this.getSubscribeId();
         result = result * 59 + ($subscribeId == null ? 43 : $subscribeId.hashCode());
         Object $reason = this.getReason();
         result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
         return result;
      }

      public String toString() {
         return "BatchApproveSubscribeOrdersRequest.ApproveSubscribeOrdersDetail(subscribeId=" + this.getSubscribeId() + ", approvePass=" + this.isApprovePass() + ", reason=" + this.getReason() + ")";
      }
   }
}

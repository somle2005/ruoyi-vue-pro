package com.xiaohongshu.fls.opensdk.entity.afterSale.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class GetAfterSaleListResponse {
   public int total;
   public int pageNo;
   public int pageSize;
   public boolean haxNext;
   public List<SimpleAfterSaleDTO> simpleAfterSaleList = new ArrayList();
   public int maxPageNo;

   public int getTotal() {
      return this.total;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public boolean isHaxNext() {
      return this.haxNext;
   }

   public List<SimpleAfterSaleDTO> getSimpleAfterSaleList() {
      return this.simpleAfterSaleList;
   }

   public int getMaxPageNo() {
      return this.maxPageNo;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setHaxNext(boolean haxNext) {
      this.haxNext = haxNext;
   }

   public void setSimpleAfterSaleList(List<SimpleAfterSaleDTO> simpleAfterSaleList) {
      this.simpleAfterSaleList = simpleAfterSaleList;
   }

   public void setMaxPageNo(int maxPageNo) {
      this.maxPageNo = maxPageNo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAfterSaleListResponse)) {
         return false;
      } else {
         GetAfterSaleListResponse other = (GetAfterSaleListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.isHaxNext() != other.isHaxNext()) {
            return false;
         } else if (this.getMaxPageNo() != other.getMaxPageNo()) {
            return false;
         } else {
            Object this$simpleAfterSaleList = this.getSimpleAfterSaleList();
            Object other$simpleAfterSaleList = other.getSimpleAfterSaleList();
            if (this$simpleAfterSaleList == null) {
               if (other$simpleAfterSaleList != null) {
                  return false;
               }
            } else if (!this$simpleAfterSaleList.equals(other$simpleAfterSaleList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAfterSaleListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTotal();
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      result = result * 59 + (this.isHaxNext() ? 79 : 97);
      result = result * 59 + this.getMaxPageNo();
      Object $simpleAfterSaleList = this.getSimpleAfterSaleList();
      result = result * 59 + ($simpleAfterSaleList == null ? 43 : $simpleAfterSaleList.hashCode());
      return result;
   }

   public String toString() {
      return "GetAfterSaleListResponse(total=" + this.getTotal() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ", haxNext=" + this.isHaxNext() + ", simpleAfterSaleList=" + this.getSimpleAfterSaleList() + ", maxPageNo=" + this.getMaxPageNo() + ")";
   }

   public static class SimpleAfterSaleDTO {
      public String returnsId;
      public int returnType;
      public int reasonId;
      public String reason;
      public int status;
      public int subStatus;
      public short receiveAbnormalType;
      public String exchangeOrderId;
      public String orderId;
      public String userId;
      public long createdTime;
      public String returnExpressNo;
      public String returnExpressCompany;
      public String returnAddress;
      public int shipNeeded;
      public boolean refunded;
      public int refundStatus;
      public long autoReceiveDeadline;
      public boolean useFastRefund;
      public long updateTime;
      public String returnExpressCompanyCode;
      public Double expectedRefundAmount;

      public String getReturnsId() {
         return this.returnsId;
      }

      public int getReturnType() {
         return this.returnType;
      }

      public int getReasonId() {
         return this.reasonId;
      }

      public String getReason() {
         return this.reason;
      }

      public int getStatus() {
         return this.status;
      }

      public int getSubStatus() {
         return this.subStatus;
      }

      public short getReceiveAbnormalType() {
         return this.receiveAbnormalType;
      }

      public String getExchangeOrderId() {
         return this.exchangeOrderId;
      }

      public String getOrderId() {
         return this.orderId;
      }

      public String getUserId() {
         return this.userId;
      }

      public long getCreatedTime() {
         return this.createdTime;
      }

      public String getReturnExpressNo() {
         return this.returnExpressNo;
      }

      public String getReturnExpressCompany() {
         return this.returnExpressCompany;
      }

      public String getReturnAddress() {
         return this.returnAddress;
      }

      public int getShipNeeded() {
         return this.shipNeeded;
      }

      public boolean isRefunded() {
         return this.refunded;
      }

      public int getRefundStatus() {
         return this.refundStatus;
      }

      public long getAutoReceiveDeadline() {
         return this.autoReceiveDeadline;
      }

      public boolean isUseFastRefund() {
         return this.useFastRefund;
      }

      public long getUpdateTime() {
         return this.updateTime;
      }

      public String getReturnExpressCompanyCode() {
         return this.returnExpressCompanyCode;
      }

      public Double getExpectedRefundAmount() {
         return this.expectedRefundAmount;
      }

      public void setReturnsId(String returnsId) {
         this.returnsId = returnsId;
      }

      public void setReturnType(int returnType) {
         this.returnType = returnType;
      }

      public void setReasonId(int reasonId) {
         this.reasonId = reasonId;
      }

      public void setReason(String reason) {
         this.reason = reason;
      }

      public void setStatus(int status) {
         this.status = status;
      }

      public void setSubStatus(int subStatus) {
         this.subStatus = subStatus;
      }

      public void setReceiveAbnormalType(short receiveAbnormalType) {
         this.receiveAbnormalType = receiveAbnormalType;
      }

      public void setExchangeOrderId(String exchangeOrderId) {
         this.exchangeOrderId = exchangeOrderId;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setUserId(String userId) {
         this.userId = userId;
      }

      public void setCreatedTime(long createdTime) {
         this.createdTime = createdTime;
      }

      public void setReturnExpressNo(String returnExpressNo) {
         this.returnExpressNo = returnExpressNo;
      }

      public void setReturnExpressCompany(String returnExpressCompany) {
         this.returnExpressCompany = returnExpressCompany;
      }

      public void setReturnAddress(String returnAddress) {
         this.returnAddress = returnAddress;
      }

      public void setShipNeeded(int shipNeeded) {
         this.shipNeeded = shipNeeded;
      }

      public void setRefunded(boolean refunded) {
         this.refunded = refunded;
      }

      public void setRefundStatus(int refundStatus) {
         this.refundStatus = refundStatus;
      }

      public void setAutoReceiveDeadline(long autoReceiveDeadline) {
         this.autoReceiveDeadline = autoReceiveDeadline;
      }

      public void setUseFastRefund(boolean useFastRefund) {
         this.useFastRefund = useFastRefund;
      }

      public void setUpdateTime(long updateTime) {
         this.updateTime = updateTime;
      }

      public void setReturnExpressCompanyCode(String returnExpressCompanyCode) {
         this.returnExpressCompanyCode = returnExpressCompanyCode;
      }

      public void setExpectedRefundAmount(Double expectedRefundAmount) {
         this.expectedRefundAmount = expectedRefundAmount;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SimpleAfterSaleDTO)) {
            return false;
         } else {
            SimpleAfterSaleDTO other = (SimpleAfterSaleDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getReturnType() != other.getReturnType()) {
               return false;
            } else if (this.getReasonId() != other.getReasonId()) {
               return false;
            } else if (this.getStatus() != other.getStatus()) {
               return false;
            } else if (this.getSubStatus() != other.getSubStatus()) {
               return false;
            } else if (this.getReceiveAbnormalType() != other.getReceiveAbnormalType()) {
               return false;
            } else if (this.getCreatedTime() != other.getCreatedTime()) {
               return false;
            } else if (this.getShipNeeded() != other.getShipNeeded()) {
               return false;
            } else if (this.isRefunded() != other.isRefunded()) {
               return false;
            } else if (this.getRefundStatus() != other.getRefundStatus()) {
               return false;
            } else if (this.getAutoReceiveDeadline() != other.getAutoReceiveDeadline()) {
               return false;
            } else if (this.isUseFastRefund() != other.isUseFastRefund()) {
               return false;
            } else if (this.getUpdateTime() != other.getUpdateTime()) {
               return false;
            } else {
               Object this$expectedRefundAmount = this.getExpectedRefundAmount();
               Object other$expectedRefundAmount = other.getExpectedRefundAmount();
               if (this$expectedRefundAmount == null) {
                  if (other$expectedRefundAmount != null) {
                     return false;
                  }
               } else if (!this$expectedRefundAmount.equals(other$expectedRefundAmount)) {
                  return false;
               }

               Object this$returnsId = this.getReturnsId();
               Object other$returnsId = other.getReturnsId();
               if (this$returnsId == null) {
                  if (other$returnsId != null) {
                     return false;
                  }
               } else if (!this$returnsId.equals(other$returnsId)) {
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

               Object this$exchangeOrderId = this.getExchangeOrderId();
               Object other$exchangeOrderId = other.getExchangeOrderId();
               if (this$exchangeOrderId == null) {
                  if (other$exchangeOrderId != null) {
                     return false;
                  }
               } else if (!this$exchangeOrderId.equals(other$exchangeOrderId)) {
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

               Object this$userId = this.getUserId();
               Object other$userId = other.getUserId();
               if (this$userId == null) {
                  if (other$userId != null) {
                     return false;
                  }
               } else if (!this$userId.equals(other$userId)) {
                  return false;
               }

               Object this$returnExpressNo = this.getReturnExpressNo();
               Object other$returnExpressNo = other.getReturnExpressNo();
               if (this$returnExpressNo == null) {
                  if (other$returnExpressNo != null) {
                     return false;
                  }
               } else if (!this$returnExpressNo.equals(other$returnExpressNo)) {
                  return false;
               }

               Object this$returnExpressCompany = this.getReturnExpressCompany();
               Object other$returnExpressCompany = other.getReturnExpressCompany();
               if (this$returnExpressCompany == null) {
                  if (other$returnExpressCompany != null) {
                     return false;
                  }
               } else if (!this$returnExpressCompany.equals(other$returnExpressCompany)) {
                  return false;
               }

               Object this$returnAddress = this.getReturnAddress();
               Object other$returnAddress = other.getReturnAddress();
               if (this$returnAddress == null) {
                  if (other$returnAddress != null) {
                     return false;
                  }
               } else if (!this$returnAddress.equals(other$returnAddress)) {
                  return false;
               }

               Object this$returnExpressCompanyCode = this.getReturnExpressCompanyCode();
               Object other$returnExpressCompanyCode = other.getReturnExpressCompanyCode();
               if (this$returnExpressCompanyCode == null) {
                  if (other$returnExpressCompanyCode != null) {
                     return false;
                  }
               } else if (!this$returnExpressCompanyCode.equals(other$returnExpressCompanyCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SimpleAfterSaleDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getReturnType();
         result = result * 59 + this.getReasonId();
         result = result * 59 + this.getStatus();
         result = result * 59 + this.getSubStatus();
         result = result * 59 + this.getReceiveAbnormalType();
         long $createdTime = this.getCreatedTime();
         result = result * 59 + (int)($createdTime >>> 32 ^ $createdTime);
         result = result * 59 + this.getShipNeeded();
         result = result * 59 + (this.isRefunded() ? 79 : 97);
         result = result * 59 + this.getRefundStatus();
         long $autoReceiveDeadline = this.getAutoReceiveDeadline();
         result = result * 59 + (int)($autoReceiveDeadline >>> 32 ^ $autoReceiveDeadline);
         result = result * 59 + (this.isUseFastRefund() ? 79 : 97);
         long $updateTime = this.getUpdateTime();
         result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
         Object $expectedRefundAmount = this.getExpectedRefundAmount();
         result = result * 59 + ($expectedRefundAmount == null ? 43 : $expectedRefundAmount.hashCode());
         Object $returnsId = this.getReturnsId();
         result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
         Object $reason = this.getReason();
         result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
         Object $exchangeOrderId = this.getExchangeOrderId();
         result = result * 59 + ($exchangeOrderId == null ? 43 : $exchangeOrderId.hashCode());
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $userId = this.getUserId();
         result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
         Object $returnExpressNo = this.getReturnExpressNo();
         result = result * 59 + ($returnExpressNo == null ? 43 : $returnExpressNo.hashCode());
         Object $returnExpressCompany = this.getReturnExpressCompany();
         result = result * 59 + ($returnExpressCompany == null ? 43 : $returnExpressCompany.hashCode());
         Object $returnAddress = this.getReturnAddress();
         result = result * 59 + ($returnAddress == null ? 43 : $returnAddress.hashCode());
         Object $returnExpressCompanyCode = this.getReturnExpressCompanyCode();
         result = result * 59 + ($returnExpressCompanyCode == null ? 43 : $returnExpressCompanyCode.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleListResponse.SimpleAfterSaleDTO(returnsId=" + this.getReturnsId() + ", returnType=" + this.getReturnType() + ", reasonId=" + this.getReasonId() + ", reason=" + this.getReason() + ", status=" + this.getStatus() + ", subStatus=" + this.getSubStatus() + ", receiveAbnormalType=" + this.getReceiveAbnormalType() + ", exchangeOrderId=" + this.getExchangeOrderId() + ", orderId=" + this.getOrderId() + ", userId=" + this.getUserId() + ", createdTime=" + this.getCreatedTime() + ", returnExpressNo=" + this.getReturnExpressNo() + ", returnExpressCompany=" + this.getReturnExpressCompany() + ", returnAddress=" + this.getReturnAddress() + ", shipNeeded=" + this.getShipNeeded() + ", refunded=" + this.isRefunded() + ", refundStatus=" + this.getRefundStatus() + ", autoReceiveDeadline=" + this.getAutoReceiveDeadline() + ", useFastRefund=" + this.isUseFastRefund() + ", updateTime=" + this.getUpdateTime() + ", returnExpressCompanyCode=" + this.getReturnExpressCompanyCode() + ", expectedRefundAmount=" + this.getExpectedRefundAmount() + ")";
      }
   }
}

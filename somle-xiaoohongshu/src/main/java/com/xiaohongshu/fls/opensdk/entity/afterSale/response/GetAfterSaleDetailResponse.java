package com.xiaohongshu.fls.opensdk.entity.afterSale.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class GetAfterSaleDetailResponse {
   public String returnsId;
   public Integer returnType;
   public Integer reasonId;
   public String reason;
   public Integer status;
   public Integer subStatus;
   public short receiveAbnormalType;
   public String orderId;
   public String exchangeOrderId;
   public String userId;
   public Long createdAt;
   public String returnExpressNo;
   public String returnExpressCompany;
   public String returnAddress;
   public Integer shipNeeded;
   public Boolean refunded;
   public Integer refundStatus;
   public Long autoReceiveDeadline;
   public Boolean useFastRefund;
   public List<String> proofPhotos;
   public String desc;
   public String note;
   public Long refundTime;
   public Long fillExpressTime;
   public Long expressSignTime;
   public List<AfterSaleSKu> skus;
   public Double refundFee;
   public Boolean returnExpressRefundable;
   public Boolean returnExpressRefunded;
   public Double expectRefundFee;
   public Long updatedAt;
   public String returnExpressCompanyCode;
   public String openAddressId;
   public Double expectedRefundAmount;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Integer getReturnType() {
      return this.returnType;
   }

   public Integer getReasonId() {
      return this.reasonId;
   }

   public String getReason() {
      return this.reason;
   }

   public Integer getStatus() {
      return this.status;
   }

   public Integer getSubStatus() {
      return this.subStatus;
   }

   public short getReceiveAbnormalType() {
      return this.receiveAbnormalType;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getExchangeOrderId() {
      return this.exchangeOrderId;
   }

   public String getUserId() {
      return this.userId;
   }

   public Long getCreatedAt() {
      return this.createdAt;
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

   public Integer getShipNeeded() {
      return this.shipNeeded;
   }

   public Boolean getRefunded() {
      return this.refunded;
   }

   public Integer getRefundStatus() {
      return this.refundStatus;
   }

   public Long getAutoReceiveDeadline() {
      return this.autoReceiveDeadline;
   }

   public Boolean getUseFastRefund() {
      return this.useFastRefund;
   }

   public List<String> getProofPhotos() {
      return this.proofPhotos;
   }

   public String getDesc() {
      return this.desc;
   }

   public String getNote() {
      return this.note;
   }

   public Long getRefundTime() {
      return this.refundTime;
   }

   public Long getFillExpressTime() {
      return this.fillExpressTime;
   }

   public Long getExpressSignTime() {
      return this.expressSignTime;
   }

   public List<AfterSaleSKu> getSkus() {
      return this.skus;
   }

   public Double getRefundFee() {
      return this.refundFee;
   }

   public Boolean getReturnExpressRefundable() {
      return this.returnExpressRefundable;
   }

   public Boolean getReturnExpressRefunded() {
      return this.returnExpressRefunded;
   }

   public Double getExpectRefundFee() {
      return this.expectRefundFee;
   }

   public Long getUpdatedAt() {
      return this.updatedAt;
   }

   public String getReturnExpressCompanyCode() {
      return this.returnExpressCompanyCode;
   }

   public String getOpenAddressId() {
      return this.openAddressId;
   }

   public Double getExpectedRefundAmount() {
      return this.expectedRefundAmount;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setReturnType(Integer returnType) {
      this.returnType = returnType;
   }

   public void setReasonId(Integer reasonId) {
      this.reasonId = reasonId;
   }

   public void setReason(String reason) {
      this.reason = reason;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public void setSubStatus(Integer subStatus) {
      this.subStatus = subStatus;
   }

   public void setReceiveAbnormalType(short receiveAbnormalType) {
      this.receiveAbnormalType = receiveAbnormalType;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public void setExchangeOrderId(String exchangeOrderId) {
      this.exchangeOrderId = exchangeOrderId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public void setCreatedAt(Long createdAt) {
      this.createdAt = createdAt;
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

   public void setShipNeeded(Integer shipNeeded) {
      this.shipNeeded = shipNeeded;
   }

   public void setRefunded(Boolean refunded) {
      this.refunded = refunded;
   }

   public void setRefundStatus(Integer refundStatus) {
      this.refundStatus = refundStatus;
   }

   public void setAutoReceiveDeadline(Long autoReceiveDeadline) {
      this.autoReceiveDeadline = autoReceiveDeadline;
   }

   public void setUseFastRefund(Boolean useFastRefund) {
      this.useFastRefund = useFastRefund;
   }

   public void setProofPhotos(List<String> proofPhotos) {
      this.proofPhotos = proofPhotos;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public void setNote(String note) {
      this.note = note;
   }

   public void setRefundTime(Long refundTime) {
      this.refundTime = refundTime;
   }

   public void setFillExpressTime(Long fillExpressTime) {
      this.fillExpressTime = fillExpressTime;
   }

   public void setExpressSignTime(Long expressSignTime) {
      this.expressSignTime = expressSignTime;
   }

   public void setSkus(List<AfterSaleSKu> skus) {
      this.skus = skus;
   }

   public void setRefundFee(Double refundFee) {
      this.refundFee = refundFee;
   }

   public void setReturnExpressRefundable(Boolean returnExpressRefundable) {
      this.returnExpressRefundable = returnExpressRefundable;
   }

   public void setReturnExpressRefunded(Boolean returnExpressRefunded) {
      this.returnExpressRefunded = returnExpressRefunded;
   }

   public void setExpectRefundFee(Double expectRefundFee) {
      this.expectRefundFee = expectRefundFee;
   }

   public void setUpdatedAt(Long updatedAt) {
      this.updatedAt = updatedAt;
   }

   public void setReturnExpressCompanyCode(String returnExpressCompanyCode) {
      this.returnExpressCompanyCode = returnExpressCompanyCode;
   }

   public void setOpenAddressId(String openAddressId) {
      this.openAddressId = openAddressId;
   }

   public void setExpectedRefundAmount(Double expectedRefundAmount) {
      this.expectedRefundAmount = expectedRefundAmount;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAfterSaleDetailResponse)) {
         return false;
      } else {
         GetAfterSaleDetailResponse other = (GetAfterSaleDetailResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getReceiveAbnormalType() != other.getReceiveAbnormalType()) {
            return false;
         } else {
            Object this$returnType = this.getReturnType();
            Object other$returnType = other.getReturnType();
            if (this$returnType == null) {
               if (other$returnType != null) {
                  return false;
               }
            } else if (!this$returnType.equals(other$returnType)) {
               return false;
            }

            Object this$reasonId = this.getReasonId();
            Object other$reasonId = other.getReasonId();
            if (this$reasonId == null) {
               if (other$reasonId != null) {
                  return false;
               }
            } else if (!this$reasonId.equals(other$reasonId)) {
               return false;
            }

            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
               return false;
            }

            Object this$subStatus = this.getSubStatus();
            Object other$subStatus = other.getSubStatus();
            if (this$subStatus == null) {
               if (other$subStatus != null) {
                  return false;
               }
            } else if (!this$subStatus.equals(other$subStatus)) {
               return false;
            }

            Object this$createdAt = this.getCreatedAt();
            Object other$createdAt = other.getCreatedAt();
            if (this$createdAt == null) {
               if (other$createdAt != null) {
                  return false;
               }
            } else if (!this$createdAt.equals(other$createdAt)) {
               return false;
            }

            Object this$shipNeeded = this.getShipNeeded();
            Object other$shipNeeded = other.getShipNeeded();
            if (this$shipNeeded == null) {
               if (other$shipNeeded != null) {
                  return false;
               }
            } else if (!this$shipNeeded.equals(other$shipNeeded)) {
               return false;
            }

            Object this$refunded = this.getRefunded();
            Object other$refunded = other.getRefunded();
            if (this$refunded == null) {
               if (other$refunded != null) {
                  return false;
               }
            } else if (!this$refunded.equals(other$refunded)) {
               return false;
            }

            Object this$refundStatus = this.getRefundStatus();
            Object other$refundStatus = other.getRefundStatus();
            if (this$refundStatus == null) {
               if (other$refundStatus != null) {
                  return false;
               }
            } else if (!this$refundStatus.equals(other$refundStatus)) {
               return false;
            }

            Object this$autoReceiveDeadline = this.getAutoReceiveDeadline();
            Object other$autoReceiveDeadline = other.getAutoReceiveDeadline();
            if (this$autoReceiveDeadline == null) {
               if (other$autoReceiveDeadline != null) {
                  return false;
               }
            } else if (!this$autoReceiveDeadline.equals(other$autoReceiveDeadline)) {
               return false;
            }

            Object this$useFastRefund = this.getUseFastRefund();
            Object other$useFastRefund = other.getUseFastRefund();
            if (this$useFastRefund == null) {
               if (other$useFastRefund != null) {
                  return false;
               }
            } else if (!this$useFastRefund.equals(other$useFastRefund)) {
               return false;
            }

            Object this$refundTime = this.getRefundTime();
            Object other$refundTime = other.getRefundTime();
            if (this$refundTime == null) {
               if (other$refundTime != null) {
                  return false;
               }
            } else if (!this$refundTime.equals(other$refundTime)) {
               return false;
            }

            Object this$fillExpressTime = this.getFillExpressTime();
            Object other$fillExpressTime = other.getFillExpressTime();
            if (this$fillExpressTime == null) {
               if (other$fillExpressTime != null) {
                  return false;
               }
            } else if (!this$fillExpressTime.equals(other$fillExpressTime)) {
               return false;
            }

            Object this$expressSignTime = this.getExpressSignTime();
            Object other$expressSignTime = other.getExpressSignTime();
            if (this$expressSignTime == null) {
               if (other$expressSignTime != null) {
                  return false;
               }
            } else if (!this$expressSignTime.equals(other$expressSignTime)) {
               return false;
            }

            Object this$refundFee = this.getRefundFee();
            Object other$refundFee = other.getRefundFee();
            if (this$refundFee == null) {
               if (other$refundFee != null) {
                  return false;
               }
            } else if (!this$refundFee.equals(other$refundFee)) {
               return false;
            }

            Object this$returnExpressRefundable = this.getReturnExpressRefundable();
            Object other$returnExpressRefundable = other.getReturnExpressRefundable();
            if (this$returnExpressRefundable == null) {
               if (other$returnExpressRefundable != null) {
                  return false;
               }
            } else if (!this$returnExpressRefundable.equals(other$returnExpressRefundable)) {
               return false;
            }

            Object this$returnExpressRefunded = this.getReturnExpressRefunded();
            Object other$returnExpressRefunded = other.getReturnExpressRefunded();
            if (this$returnExpressRefunded == null) {
               if (other$returnExpressRefunded != null) {
                  return false;
               }
            } else if (!this$returnExpressRefunded.equals(other$returnExpressRefunded)) {
               return false;
            }

            Object this$expectRefundFee = this.getExpectRefundFee();
            Object other$expectRefundFee = other.getExpectRefundFee();
            if (this$expectRefundFee == null) {
               if (other$expectRefundFee != null) {
                  return false;
               }
            } else if (!this$expectRefundFee.equals(other$expectRefundFee)) {
               return false;
            }

            Object this$updatedAt = this.getUpdatedAt();
            Object other$updatedAt = other.getUpdatedAt();
            if (this$updatedAt == null) {
               if (other$updatedAt != null) {
                  return false;
               }
            } else if (!this$updatedAt.equals(other$updatedAt)) {
               return false;
            }

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

            Object this$orderId = this.getOrderId();
            Object other$orderId = other.getOrderId();
            if (this$orderId == null) {
               if (other$orderId != null) {
                  return false;
               }
            } else if (!this$orderId.equals(other$orderId)) {
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

            Object this$proofPhotos = this.getProofPhotos();
            Object other$proofPhotos = other.getProofPhotos();
            if (this$proofPhotos == null) {
               if (other$proofPhotos != null) {
                  return false;
               }
            } else if (!this$proofPhotos.equals(other$proofPhotos)) {
               return false;
            }

            Object this$desc = this.getDesc();
            Object other$desc = other.getDesc();
            if (this$desc == null) {
               if (other$desc != null) {
                  return false;
               }
            } else if (!this$desc.equals(other$desc)) {
               return false;
            }

            Object this$note = this.getNote();
            Object other$note = other.getNote();
            if (this$note == null) {
               if (other$note != null) {
                  return false;
               }
            } else if (!this$note.equals(other$note)) {
               return false;
            }

            Object this$skus = this.getSkus();
            Object other$skus = other.getSkus();
            if (this$skus == null) {
               if (other$skus != null) {
                  return false;
               }
            } else if (!this$skus.equals(other$skus)) {
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
      return other instanceof GetAfterSaleDetailResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getReceiveAbnormalType();
      Object $returnType = this.getReturnType();
      result = result * 59 + ($returnType == null ? 43 : $returnType.hashCode());
      Object $reasonId = this.getReasonId();
      result = result * 59 + ($reasonId == null ? 43 : $reasonId.hashCode());
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $subStatus = this.getSubStatus();
      result = result * 59 + ($subStatus == null ? 43 : $subStatus.hashCode());
      Object $createdAt = this.getCreatedAt();
      result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
      Object $shipNeeded = this.getShipNeeded();
      result = result * 59 + ($shipNeeded == null ? 43 : $shipNeeded.hashCode());
      Object $refunded = this.getRefunded();
      result = result * 59 + ($refunded == null ? 43 : $refunded.hashCode());
      Object $refundStatus = this.getRefundStatus();
      result = result * 59 + ($refundStatus == null ? 43 : $refundStatus.hashCode());
      Object $autoReceiveDeadline = this.getAutoReceiveDeadline();
      result = result * 59 + ($autoReceiveDeadline == null ? 43 : $autoReceiveDeadline.hashCode());
      Object $useFastRefund = this.getUseFastRefund();
      result = result * 59 + ($useFastRefund == null ? 43 : $useFastRefund.hashCode());
      Object $refundTime = this.getRefundTime();
      result = result * 59 + ($refundTime == null ? 43 : $refundTime.hashCode());
      Object $fillExpressTime = this.getFillExpressTime();
      result = result * 59 + ($fillExpressTime == null ? 43 : $fillExpressTime.hashCode());
      Object $expressSignTime = this.getExpressSignTime();
      result = result * 59 + ($expressSignTime == null ? 43 : $expressSignTime.hashCode());
      Object $refundFee = this.getRefundFee();
      result = result * 59 + ($refundFee == null ? 43 : $refundFee.hashCode());
      Object $returnExpressRefundable = this.getReturnExpressRefundable();
      result = result * 59 + ($returnExpressRefundable == null ? 43 : $returnExpressRefundable.hashCode());
      Object $returnExpressRefunded = this.getReturnExpressRefunded();
      result = result * 59 + ($returnExpressRefunded == null ? 43 : $returnExpressRefunded.hashCode());
      Object $expectRefundFee = this.getExpectRefundFee();
      result = result * 59 + ($expectRefundFee == null ? 43 : $expectRefundFee.hashCode());
      Object $updatedAt = this.getUpdatedAt();
      result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
      Object $expectedRefundAmount = this.getExpectedRefundAmount();
      result = result * 59 + ($expectedRefundAmount == null ? 43 : $expectedRefundAmount.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      Object $reason = this.getReason();
      result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
      Object $orderId = this.getOrderId();
      result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
      Object $exchangeOrderId = this.getExchangeOrderId();
      result = result * 59 + ($exchangeOrderId == null ? 43 : $exchangeOrderId.hashCode());
      Object $userId = this.getUserId();
      result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
      Object $returnExpressNo = this.getReturnExpressNo();
      result = result * 59 + ($returnExpressNo == null ? 43 : $returnExpressNo.hashCode());
      Object $returnExpressCompany = this.getReturnExpressCompany();
      result = result * 59 + ($returnExpressCompany == null ? 43 : $returnExpressCompany.hashCode());
      Object $returnAddress = this.getReturnAddress();
      result = result * 59 + ($returnAddress == null ? 43 : $returnAddress.hashCode());
      Object $proofPhotos = this.getProofPhotos();
      result = result * 59 + ($proofPhotos == null ? 43 : $proofPhotos.hashCode());
      Object $desc = this.getDesc();
      result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
      Object $note = this.getNote();
      result = result * 59 + ($note == null ? 43 : $note.hashCode());
      Object $skus = this.getSkus();
      result = result * 59 + ($skus == null ? 43 : $skus.hashCode());
      Object $returnExpressCompanyCode = this.getReturnExpressCompanyCode();
      result = result * 59 + ($returnExpressCompanyCode == null ? 43 : $returnExpressCompanyCode.hashCode());
      Object $openAddressId = this.getOpenAddressId();
      result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
      return result;
   }

   public String toString() {
      return "GetAfterSaleDetailResponse(returnsId=" + this.getReturnsId() + ", returnType=" + this.getReturnType() + ", reasonId=" + this.getReasonId() + ", reason=" + this.getReason() + ", status=" + this.getStatus() + ", subStatus=" + this.getSubStatus() + ", receiveAbnormalType=" + this.getReceiveAbnormalType() + ", orderId=" + this.getOrderId() + ", exchangeOrderId=" + this.getExchangeOrderId() + ", userId=" + this.getUserId() + ", createdAt=" + this.getCreatedAt() + ", returnExpressNo=" + this.getReturnExpressNo() + ", returnExpressCompany=" + this.getReturnExpressCompany() + ", returnAddress=" + this.getReturnAddress() + ", shipNeeded=" + this.getShipNeeded() + ", refunded=" + this.getRefunded() + ", refundStatus=" + this.getRefundStatus() + ", autoReceiveDeadline=" + this.getAutoReceiveDeadline() + ", useFastRefund=" + this.getUseFastRefund() + ", proofPhotos=" + this.getProofPhotos() + ", desc=" + this.getDesc() + ", note=" + this.getNote() + ", refundTime=" + this.getRefundTime() + ", fillExpressTime=" + this.getFillExpressTime() + ", expressSignTime=" + this.getExpressSignTime() + ", skus=" + this.getSkus() + ", refundFee=" + this.getRefundFee() + ", returnExpressRefundable=" + this.getReturnExpressRefundable() + ", returnExpressRefunded=" + this.getReturnExpressRefunded() + ", expectRefundFee=" + this.getExpectRefundFee() + ", updatedAt=" + this.getUpdatedAt() + ", returnExpressCompanyCode=" + this.getReturnExpressCompanyCode() + ", openAddressId=" + this.getOpenAddressId() + ", expectedRefundAmount=" + this.getExpectedRefundAmount() + ")";
   }

   public static class AfterSaleItem {
      public String itemId;
      public String itemName;
      public String image;
      public Double price;
      public Integer boughtCount;
      public Integer appliedCount;
      public Integer returnedCount;
      public Integer refundedCount;
      public Double returnPrice;
      public String exchangeItemId;
      public String exchangeItemName;
      public String exchangeItemImage;
      public String skucode;
      public String barcode;
      public String exchangeSkucode;
      public String exchangeBarcode;

      public String getItemId() {
         return this.itemId;
      }

      public String getItemName() {
         return this.itemName;
      }

      public String getImage() {
         return this.image;
      }

      public Double getPrice() {
         return this.price;
      }

      public Integer getBoughtCount() {
         return this.boughtCount;
      }

      public Integer getAppliedCount() {
         return this.appliedCount;
      }

      public Integer getReturnedCount() {
         return this.returnedCount;
      }

      public Integer getRefundedCount() {
         return this.refundedCount;
      }

      public Double getReturnPrice() {
         return this.returnPrice;
      }

      public String getExchangeItemId() {
         return this.exchangeItemId;
      }

      public String getExchangeItemName() {
         return this.exchangeItemName;
      }

      public String getExchangeItemImage() {
         return this.exchangeItemImage;
      }

      public String getSkucode() {
         return this.skucode;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public String getExchangeSkucode() {
         return this.exchangeSkucode;
      }

      public String getExchangeBarcode() {
         return this.exchangeBarcode;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setItemName(String itemName) {
         this.itemName = itemName;
      }

      public void setImage(String image) {
         this.image = image;
      }

      public void setPrice(Double price) {
         this.price = price;
      }

      public void setBoughtCount(Integer boughtCount) {
         this.boughtCount = boughtCount;
      }

      public void setAppliedCount(Integer appliedCount) {
         this.appliedCount = appliedCount;
      }

      public void setReturnedCount(Integer returnedCount) {
         this.returnedCount = returnedCount;
      }

      public void setRefundedCount(Integer refundedCount) {
         this.refundedCount = refundedCount;
      }

      public void setReturnPrice(Double returnPrice) {
         this.returnPrice = returnPrice;
      }

      public void setExchangeItemId(String exchangeItemId) {
         this.exchangeItemId = exchangeItemId;
      }

      public void setExchangeItemName(String exchangeItemName) {
         this.exchangeItemName = exchangeItemName;
      }

      public void setExchangeItemImage(String exchangeItemImage) {
         this.exchangeItemImage = exchangeItemImage;
      }

      public void setSkucode(String skucode) {
         this.skucode = skucode;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setExchangeSkucode(String exchangeSkucode) {
         this.exchangeSkucode = exchangeSkucode;
      }

      public void setExchangeBarcode(String exchangeBarcode) {
         this.exchangeBarcode = exchangeBarcode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AfterSaleItem)) {
            return false;
         } else {
            AfterSaleItem other = (AfterSaleItem)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$price = this.getPrice();
               Object other$price = other.getPrice();
               if (this$price == null) {
                  if (other$price != null) {
                     return false;
                  }
               } else if (!this$price.equals(other$price)) {
                  return false;
               }

               Object this$boughtCount = this.getBoughtCount();
               Object other$boughtCount = other.getBoughtCount();
               if (this$boughtCount == null) {
                  if (other$boughtCount != null) {
                     return false;
                  }
               } else if (!this$boughtCount.equals(other$boughtCount)) {
                  return false;
               }

               Object this$appliedCount = this.getAppliedCount();
               Object other$appliedCount = other.getAppliedCount();
               if (this$appliedCount == null) {
                  if (other$appliedCount != null) {
                     return false;
                  }
               } else if (!this$appliedCount.equals(other$appliedCount)) {
                  return false;
               }

               Object this$returnedCount = this.getReturnedCount();
               Object other$returnedCount = other.getReturnedCount();
               if (this$returnedCount == null) {
                  if (other$returnedCount != null) {
                     return false;
                  }
               } else if (!this$returnedCount.equals(other$returnedCount)) {
                  return false;
               }

               Object this$refundedCount = this.getRefundedCount();
               Object other$refundedCount = other.getRefundedCount();
               if (this$refundedCount == null) {
                  if (other$refundedCount != null) {
                     return false;
                  }
               } else if (!this$refundedCount.equals(other$refundedCount)) {
                  return false;
               }

               Object this$returnPrice = this.getReturnPrice();
               Object other$returnPrice = other.getReturnPrice();
               if (this$returnPrice == null) {
                  if (other$returnPrice != null) {
                     return false;
                  }
               } else if (!this$returnPrice.equals(other$returnPrice)) {
                  return false;
               }

               Object this$itemId = this.getItemId();
               Object other$itemId = other.getItemId();
               if (this$itemId == null) {
                  if (other$itemId != null) {
                     return false;
                  }
               } else if (!this$itemId.equals(other$itemId)) {
                  return false;
               }

               Object this$itemName = this.getItemName();
               Object other$itemName = other.getItemName();
               if (this$itemName == null) {
                  if (other$itemName != null) {
                     return false;
                  }
               } else if (!this$itemName.equals(other$itemName)) {
                  return false;
               }

               Object this$image = this.getImage();
               Object other$image = other.getImage();
               if (this$image == null) {
                  if (other$image != null) {
                     return false;
                  }
               } else if (!this$image.equals(other$image)) {
                  return false;
               }

               Object this$exchangeItemId = this.getExchangeItemId();
               Object other$exchangeItemId = other.getExchangeItemId();
               if (this$exchangeItemId == null) {
                  if (other$exchangeItemId != null) {
                     return false;
                  }
               } else if (!this$exchangeItemId.equals(other$exchangeItemId)) {
                  return false;
               }

               Object this$exchangeItemName = this.getExchangeItemName();
               Object other$exchangeItemName = other.getExchangeItemName();
               if (this$exchangeItemName == null) {
                  if (other$exchangeItemName != null) {
                     return false;
                  }
               } else if (!this$exchangeItemName.equals(other$exchangeItemName)) {
                  return false;
               }

               Object this$exchangeItemImage = this.getExchangeItemImage();
               Object other$exchangeItemImage = other.getExchangeItemImage();
               if (this$exchangeItemImage == null) {
                  if (other$exchangeItemImage != null) {
                     return false;
                  }
               } else if (!this$exchangeItemImage.equals(other$exchangeItemImage)) {
                  return false;
               }

               Object this$skucode = this.getSkucode();
               Object other$skucode = other.getSkucode();
               if (this$skucode == null) {
                  if (other$skucode != null) {
                     return false;
                  }
               } else if (!this$skucode.equals(other$skucode)) {
                  return false;
               }

               Object this$barcode = this.getBarcode();
               Object other$barcode = other.getBarcode();
               if (this$barcode == null) {
                  if (other$barcode != null) {
                     return false;
                  }
               } else if (!this$barcode.equals(other$barcode)) {
                  return false;
               }

               Object this$exchangeSkucode = this.getExchangeSkucode();
               Object other$exchangeSkucode = other.getExchangeSkucode();
               if (this$exchangeSkucode == null) {
                  if (other$exchangeSkucode != null) {
                     return false;
                  }
               } else if (!this$exchangeSkucode.equals(other$exchangeSkucode)) {
                  return false;
               }

               Object this$exchangeBarcode = this.getExchangeBarcode();
               Object other$exchangeBarcode = other.getExchangeBarcode();
               if (this$exchangeBarcode == null) {
                  if (other$exchangeBarcode != null) {
                     return false;
                  }
               } else if (!this$exchangeBarcode.equals(other$exchangeBarcode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AfterSaleItem;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $price = this.getPrice();
         result = result * 59 + ($price == null ? 43 : $price.hashCode());
         Object $boughtCount = this.getBoughtCount();
         result = result * 59 + ($boughtCount == null ? 43 : $boughtCount.hashCode());
         Object $appliedCount = this.getAppliedCount();
         result = result * 59 + ($appliedCount == null ? 43 : $appliedCount.hashCode());
         Object $returnedCount = this.getReturnedCount();
         result = result * 59 + ($returnedCount == null ? 43 : $returnedCount.hashCode());
         Object $refundedCount = this.getRefundedCount();
         result = result * 59 + ($refundedCount == null ? 43 : $refundedCount.hashCode());
         Object $returnPrice = this.getReturnPrice();
         result = result * 59 + ($returnPrice == null ? 43 : $returnPrice.hashCode());
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $itemName = this.getItemName();
         result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
         Object $image = this.getImage();
         result = result * 59 + ($image == null ? 43 : $image.hashCode());
         Object $exchangeItemId = this.getExchangeItemId();
         result = result * 59 + ($exchangeItemId == null ? 43 : $exchangeItemId.hashCode());
         Object $exchangeItemName = this.getExchangeItemName();
         result = result * 59 + ($exchangeItemName == null ? 43 : $exchangeItemName.hashCode());
         Object $exchangeItemImage = this.getExchangeItemImage();
         result = result * 59 + ($exchangeItemImage == null ? 43 : $exchangeItemImage.hashCode());
         Object $skucode = this.getSkucode();
         result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         Object $exchangeSkucode = this.getExchangeSkucode();
         result = result * 59 + ($exchangeSkucode == null ? 43 : $exchangeSkucode.hashCode());
         Object $exchangeBarcode = this.getExchangeBarcode();
         result = result * 59 + ($exchangeBarcode == null ? 43 : $exchangeBarcode.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleDetailResponse.AfterSaleItem(itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", image=" + this.getImage() + ", price=" + this.getPrice() + ", boughtCount=" + this.getBoughtCount() + ", appliedCount=" + this.getAppliedCount() + ", returnedCount=" + this.getReturnedCount() + ", refundedCount=" + this.getRefundedCount() + ", returnPrice=" + this.getReturnPrice() + ", exchangeItemId=" + this.getExchangeItemId() + ", exchangeItemName=" + this.getExchangeItemName() + ", exchangeItemImage=" + this.getExchangeItemImage() + ", skucode=" + this.getSkucode() + ", barcode=" + this.getBarcode() + ", exchangeSkucode=" + this.getExchangeSkucode() + ", exchangeBarcode=" + this.getExchangeBarcode() + ")";
      }
   }

   public static class AfterSaleSKu {
      public String skuId;
      public String skuName;
      public String image;
      public Double price;
      public Integer boughtCount;
      public Integer appliedCount;
      public Integer returnedCount;
      public Integer refundedCount;
      public Double returnPrice;
      public String exchangeSkuId;
      public String exchangeSkuName;
      public String exchangeSkuImage;
      public String scSkucode;
      public String barcode;
      public String exchangeScskuCode;
      public String exchangeBarcode;

      public String getSkuId() {
         return this.skuId;
      }

      public String getSkuName() {
         return this.skuName;
      }

      public String getImage() {
         return this.image;
      }

      public Double getPrice() {
         return this.price;
      }

      public Integer getBoughtCount() {
         return this.boughtCount;
      }

      public Integer getAppliedCount() {
         return this.appliedCount;
      }

      public Integer getReturnedCount() {
         return this.returnedCount;
      }

      public Integer getRefundedCount() {
         return this.refundedCount;
      }

      public Double getReturnPrice() {
         return this.returnPrice;
      }

      public String getExchangeSkuId() {
         return this.exchangeSkuId;
      }

      public String getExchangeSkuName() {
         return this.exchangeSkuName;
      }

      public String getExchangeSkuImage() {
         return this.exchangeSkuImage;
      }

      public String getScSkucode() {
         return this.scSkucode;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public String getExchangeScskuCode() {
         return this.exchangeScskuCode;
      }

      public String getExchangeBarcode() {
         return this.exchangeBarcode;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setSkuName(String skuName) {
         this.skuName = skuName;
      }

      public void setImage(String image) {
         this.image = image;
      }

      public void setPrice(Double price) {
         this.price = price;
      }

      public void setBoughtCount(Integer boughtCount) {
         this.boughtCount = boughtCount;
      }

      public void setAppliedCount(Integer appliedCount) {
         this.appliedCount = appliedCount;
      }

      public void setReturnedCount(Integer returnedCount) {
         this.returnedCount = returnedCount;
      }

      public void setRefundedCount(Integer refundedCount) {
         this.refundedCount = refundedCount;
      }

      public void setReturnPrice(Double returnPrice) {
         this.returnPrice = returnPrice;
      }

      public void setExchangeSkuId(String exchangeSkuId) {
         this.exchangeSkuId = exchangeSkuId;
      }

      public void setExchangeSkuName(String exchangeSkuName) {
         this.exchangeSkuName = exchangeSkuName;
      }

      public void setExchangeSkuImage(String exchangeSkuImage) {
         this.exchangeSkuImage = exchangeSkuImage;
      }

      public void setScSkucode(String scSkucode) {
         this.scSkucode = scSkucode;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setExchangeScskuCode(String exchangeScskuCode) {
         this.exchangeScskuCode = exchangeScskuCode;
      }

      public void setExchangeBarcode(String exchangeBarcode) {
         this.exchangeBarcode = exchangeBarcode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AfterSaleSKu)) {
            return false;
         } else {
            AfterSaleSKu other = (AfterSaleSKu)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$price = this.getPrice();
               Object other$price = other.getPrice();
               if (this$price == null) {
                  if (other$price != null) {
                     return false;
                  }
               } else if (!this$price.equals(other$price)) {
                  return false;
               }

               Object this$boughtCount = this.getBoughtCount();
               Object other$boughtCount = other.getBoughtCount();
               if (this$boughtCount == null) {
                  if (other$boughtCount != null) {
                     return false;
                  }
               } else if (!this$boughtCount.equals(other$boughtCount)) {
                  return false;
               }

               Object this$appliedCount = this.getAppliedCount();
               Object other$appliedCount = other.getAppliedCount();
               if (this$appliedCount == null) {
                  if (other$appliedCount != null) {
                     return false;
                  }
               } else if (!this$appliedCount.equals(other$appliedCount)) {
                  return false;
               }

               Object this$returnedCount = this.getReturnedCount();
               Object other$returnedCount = other.getReturnedCount();
               if (this$returnedCount == null) {
                  if (other$returnedCount != null) {
                     return false;
                  }
               } else if (!this$returnedCount.equals(other$returnedCount)) {
                  return false;
               }

               Object this$refundedCount = this.getRefundedCount();
               Object other$refundedCount = other.getRefundedCount();
               if (this$refundedCount == null) {
                  if (other$refundedCount != null) {
                     return false;
                  }
               } else if (!this$refundedCount.equals(other$refundedCount)) {
                  return false;
               }

               Object this$returnPrice = this.getReturnPrice();
               Object other$returnPrice = other.getReturnPrice();
               if (this$returnPrice == null) {
                  if (other$returnPrice != null) {
                     return false;
                  }
               } else if (!this$returnPrice.equals(other$returnPrice)) {
                  return false;
               }

               Object this$skuId = this.getSkuId();
               Object other$skuId = other.getSkuId();
               if (this$skuId == null) {
                  if (other$skuId != null) {
                     return false;
                  }
               } else if (!this$skuId.equals(other$skuId)) {
                  return false;
               }

               Object this$skuName = this.getSkuName();
               Object other$skuName = other.getSkuName();
               if (this$skuName == null) {
                  if (other$skuName != null) {
                     return false;
                  }
               } else if (!this$skuName.equals(other$skuName)) {
                  return false;
               }

               Object this$image = this.getImage();
               Object other$image = other.getImage();
               if (this$image == null) {
                  if (other$image != null) {
                     return false;
                  }
               } else if (!this$image.equals(other$image)) {
                  return false;
               }

               Object this$exchangeSkuId = this.getExchangeSkuId();
               Object other$exchangeSkuId = other.getExchangeSkuId();
               if (this$exchangeSkuId == null) {
                  if (other$exchangeSkuId != null) {
                     return false;
                  }
               } else if (!this$exchangeSkuId.equals(other$exchangeSkuId)) {
                  return false;
               }

               Object this$exchangeSkuName = this.getExchangeSkuName();
               Object other$exchangeSkuName = other.getExchangeSkuName();
               if (this$exchangeSkuName == null) {
                  if (other$exchangeSkuName != null) {
                     return false;
                  }
               } else if (!this$exchangeSkuName.equals(other$exchangeSkuName)) {
                  return false;
               }

               Object this$exchangeSkuImage = this.getExchangeSkuImage();
               Object other$exchangeSkuImage = other.getExchangeSkuImage();
               if (this$exchangeSkuImage == null) {
                  if (other$exchangeSkuImage != null) {
                     return false;
                  }
               } else if (!this$exchangeSkuImage.equals(other$exchangeSkuImage)) {
                  return false;
               }

               Object this$scSkucode = this.getScSkucode();
               Object other$scSkucode = other.getScSkucode();
               if (this$scSkucode == null) {
                  if (other$scSkucode != null) {
                     return false;
                  }
               } else if (!this$scSkucode.equals(other$scSkucode)) {
                  return false;
               }

               Object this$barcode = this.getBarcode();
               Object other$barcode = other.getBarcode();
               if (this$barcode == null) {
                  if (other$barcode != null) {
                     return false;
                  }
               } else if (!this$barcode.equals(other$barcode)) {
                  return false;
               }

               Object this$exchangeScskuCode = this.getExchangeScskuCode();
               Object other$exchangeScskuCode = other.getExchangeScskuCode();
               if (this$exchangeScskuCode == null) {
                  if (other$exchangeScskuCode != null) {
                     return false;
                  }
               } else if (!this$exchangeScskuCode.equals(other$exchangeScskuCode)) {
                  return false;
               }

               Object this$exchangeBarcode = this.getExchangeBarcode();
               Object other$exchangeBarcode = other.getExchangeBarcode();
               if (this$exchangeBarcode == null) {
                  if (other$exchangeBarcode != null) {
                     return false;
                  }
               } else if (!this$exchangeBarcode.equals(other$exchangeBarcode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AfterSaleSKu;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $price = this.getPrice();
         result = result * 59 + ($price == null ? 43 : $price.hashCode());
         Object $boughtCount = this.getBoughtCount();
         result = result * 59 + ($boughtCount == null ? 43 : $boughtCount.hashCode());
         Object $appliedCount = this.getAppliedCount();
         result = result * 59 + ($appliedCount == null ? 43 : $appliedCount.hashCode());
         Object $returnedCount = this.getReturnedCount();
         result = result * 59 + ($returnedCount == null ? 43 : $returnedCount.hashCode());
         Object $refundedCount = this.getRefundedCount();
         result = result * 59 + ($refundedCount == null ? 43 : $refundedCount.hashCode());
         Object $returnPrice = this.getReturnPrice();
         result = result * 59 + ($returnPrice == null ? 43 : $returnPrice.hashCode());
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $skuName = this.getSkuName();
         result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
         Object $image = this.getImage();
         result = result * 59 + ($image == null ? 43 : $image.hashCode());
         Object $exchangeSkuId = this.getExchangeSkuId();
         result = result * 59 + ($exchangeSkuId == null ? 43 : $exchangeSkuId.hashCode());
         Object $exchangeSkuName = this.getExchangeSkuName();
         result = result * 59 + ($exchangeSkuName == null ? 43 : $exchangeSkuName.hashCode());
         Object $exchangeSkuImage = this.getExchangeSkuImage();
         result = result * 59 + ($exchangeSkuImage == null ? 43 : $exchangeSkuImage.hashCode());
         Object $scSkucode = this.getScSkucode();
         result = result * 59 + ($scSkucode == null ? 43 : $scSkucode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         Object $exchangeScskuCode = this.getExchangeScskuCode();
         result = result * 59 + ($exchangeScskuCode == null ? 43 : $exchangeScskuCode.hashCode());
         Object $exchangeBarcode = this.getExchangeBarcode();
         result = result * 59 + ($exchangeBarcode == null ? 43 : $exchangeBarcode.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleDetailResponse.AfterSaleSKu(skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", image=" + this.getImage() + ", price=" + this.getPrice() + ", boughtCount=" + this.getBoughtCount() + ", appliedCount=" + this.getAppliedCount() + ", returnedCount=" + this.getReturnedCount() + ", refundedCount=" + this.getRefundedCount() + ", returnPrice=" + this.getReturnPrice() + ", exchangeSkuId=" + this.getExchangeSkuId() + ", exchangeSkuName=" + this.getExchangeSkuName() + ", exchangeSkuImage=" + this.getExchangeSkuImage() + ", scSkucode=" + this.getScSkucode() + ", barcode=" + this.getBarcode() + ", exchangeScskuCode=" + this.getExchangeScskuCode() + ", exchangeBarcode=" + this.getExchangeBarcode() + ")";
      }
   }
}

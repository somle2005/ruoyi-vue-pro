package com.xiaohongshu.fls.opensdk.entity.afterSale.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class GetAfterSaleInfoResponse {
   public OpenAPIAfterSaleInfo afterSaleInfo;
   public LogisticsInfo logisticsInfo;
   public List<OpenAPINegotiateNode> negotiateRecords;

   public OpenAPIAfterSaleInfo getAfterSaleInfo() {
      return this.afterSaleInfo;
   }

   public LogisticsInfo getLogisticsInfo() {
      return this.logisticsInfo;
   }

   public List<OpenAPINegotiateNode> getNegotiateRecords() {
      return this.negotiateRecords;
   }

   public void setAfterSaleInfo(OpenAPIAfterSaleInfo afterSaleInfo) {
      this.afterSaleInfo = afterSaleInfo;
   }

   public void setLogisticsInfo(LogisticsInfo logisticsInfo) {
      this.logisticsInfo = logisticsInfo;
   }

   public void setNegotiateRecords(List<OpenAPINegotiateNode> negotiateRecords) {
      this.negotiateRecords = negotiateRecords;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAfterSaleInfoResponse)) {
         return false;
      } else {
         GetAfterSaleInfoResponse other = (GetAfterSaleInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$afterSaleInfo = this.getAfterSaleInfo();
            Object other$afterSaleInfo = other.getAfterSaleInfo();
            if (this$afterSaleInfo == null) {
               if (other$afterSaleInfo != null) {
                  return false;
               }
            } else if (!this$afterSaleInfo.equals(other$afterSaleInfo)) {
               return false;
            }

            Object this$logisticsInfo = this.getLogisticsInfo();
            Object other$logisticsInfo = other.getLogisticsInfo();
            if (this$logisticsInfo == null) {
               if (other$logisticsInfo != null) {
                  return false;
               }
            } else if (!this$logisticsInfo.equals(other$logisticsInfo)) {
               return false;
            }

            Object this$negotiateRecords = this.getNegotiateRecords();
            Object other$negotiateRecords = other.getNegotiateRecords();
            if (this$negotiateRecords == null) {
               if (other$negotiateRecords != null) {
                  return false;
               }
            } else if (!this$negotiateRecords.equals(other$negotiateRecords)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAfterSaleInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $afterSaleInfo = this.getAfterSaleInfo();
      result = result * 59 + ($afterSaleInfo == null ? 43 : $afterSaleInfo.hashCode());
      Object $logisticsInfo = this.getLogisticsInfo();
      result = result * 59 + ($logisticsInfo == null ? 43 : $logisticsInfo.hashCode());
      Object $negotiateRecords = this.getNegotiateRecords();
      result = result * 59 + ($negotiateRecords == null ? 43 : $negotiateRecords.hashCode());
      return result;
   }

   public String toString() {
      return "GetAfterSaleInfoResponse(afterSaleInfo=" + this.getAfterSaleInfo() + ", logisticsInfo=" + this.getLogisticsInfo() + ", negotiateRecords=" + this.getNegotiateRecords() + ")";
   }

   public static class OpenAPIAfterSaleInfo {
      public String returnsId;
      public Integer returnType;
      public Integer reasonId;
      public String reasonNameZh;
      public Integer status;
      public String userId;
      public String orderId;
      public Long applyTime;
      public Long updatedAt;
      public Long expireTime;
      public AddressInfo returnAddress;
      public List<String> proofPhotos;
      public String desc;
      public Boolean supportCarriageInsurance;
      public String openAddressId;
      public List<OpenAPIAfterSaleSKU> skus;
      public List<OpenAPIAfterSaleSKU> exchangeSKUs;
      public String closeReasonZh;
      public Integer returnsTag;
      public Double appliedShipFeeAmountYuan;
      public Double appliedSkusAmountYuan;
      public Double expectedRefundAmountYuan;
      public Double refundAmountYuan;
      public Integer refundStatus;
      public Integer cargoStatus;
      public Long refundTime;

      public String getReturnsId() {
         return this.returnsId;
      }

      public Integer getReturnType() {
         return this.returnType;
      }

      public Integer getReasonId() {
         return this.reasonId;
      }

      public String getReasonNameZh() {
         return this.reasonNameZh;
      }

      public Integer getStatus() {
         return this.status;
      }

      public String getUserId() {
         return this.userId;
      }

      public String getOrderId() {
         return this.orderId;
      }

      public Long getApplyTime() {
         return this.applyTime;
      }

      public Long getUpdatedAt() {
         return this.updatedAt;
      }

      public Long getExpireTime() {
         return this.expireTime;
      }

      public AddressInfo getReturnAddress() {
         return this.returnAddress;
      }

      public List<String> getProofPhotos() {
         return this.proofPhotos;
      }

      public String getDesc() {
         return this.desc;
      }

      public Boolean getSupportCarriageInsurance() {
         return this.supportCarriageInsurance;
      }

      public String getOpenAddressId() {
         return this.openAddressId;
      }

      public List<OpenAPIAfterSaleSKU> getSkus() {
         return this.skus;
      }

      public List<OpenAPIAfterSaleSKU> getExchangeSKUs() {
         return this.exchangeSKUs;
      }

      public String getCloseReasonZh() {
         return this.closeReasonZh;
      }

      public Integer getReturnsTag() {
         return this.returnsTag;
      }

      public Double getAppliedShipFeeAmountYuan() {
         return this.appliedShipFeeAmountYuan;
      }

      public Double getAppliedSkusAmountYuan() {
         return this.appliedSkusAmountYuan;
      }

      public Double getExpectedRefundAmountYuan() {
         return this.expectedRefundAmountYuan;
      }

      public Double getRefundAmountYuan() {
         return this.refundAmountYuan;
      }

      public Integer getRefundStatus() {
         return this.refundStatus;
      }

      public Integer getCargoStatus() {
         return this.cargoStatus;
      }

      public Long getRefundTime() {
         return this.refundTime;
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

      public void setReasonNameZh(String reasonNameZh) {
         this.reasonNameZh = reasonNameZh;
      }

      public void setStatus(Integer status) {
         this.status = status;
      }

      public void setUserId(String userId) {
         this.userId = userId;
      }

      public void setOrderId(String orderId) {
         this.orderId = orderId;
      }

      public void setApplyTime(Long applyTime) {
         this.applyTime = applyTime;
      }

      public void setUpdatedAt(Long updatedAt) {
         this.updatedAt = updatedAt;
      }

      public void setExpireTime(Long expireTime) {
         this.expireTime = expireTime;
      }

      public void setReturnAddress(AddressInfo returnAddress) {
         this.returnAddress = returnAddress;
      }

      public void setProofPhotos(List<String> proofPhotos) {
         this.proofPhotos = proofPhotos;
      }

      public void setDesc(String desc) {
         this.desc = desc;
      }

      public void setSupportCarriageInsurance(Boolean supportCarriageInsurance) {
         this.supportCarriageInsurance = supportCarriageInsurance;
      }

      public void setOpenAddressId(String openAddressId) {
         this.openAddressId = openAddressId;
      }

      public void setSkus(List<OpenAPIAfterSaleSKU> skus) {
         this.skus = skus;
      }

      public void setExchangeSKUs(List<OpenAPIAfterSaleSKU> exchangeSKUs) {
         this.exchangeSKUs = exchangeSKUs;
      }

      public void setCloseReasonZh(String closeReasonZh) {
         this.closeReasonZh = closeReasonZh;
      }

      public void setReturnsTag(Integer returnsTag) {
         this.returnsTag = returnsTag;
      }

      public void setAppliedShipFeeAmountYuan(Double appliedShipFeeAmountYuan) {
         this.appliedShipFeeAmountYuan = appliedShipFeeAmountYuan;
      }

      public void setAppliedSkusAmountYuan(Double appliedSkusAmountYuan) {
         this.appliedSkusAmountYuan = appliedSkusAmountYuan;
      }

      public void setExpectedRefundAmountYuan(Double expectedRefundAmountYuan) {
         this.expectedRefundAmountYuan = expectedRefundAmountYuan;
      }

      public void setRefundAmountYuan(Double refundAmountYuan) {
         this.refundAmountYuan = refundAmountYuan;
      }

      public void setRefundStatus(Integer refundStatus) {
         this.refundStatus = refundStatus;
      }

      public void setCargoStatus(Integer cargoStatus) {
         this.cargoStatus = cargoStatus;
      }

      public void setRefundTime(Long refundTime) {
         this.refundTime = refundTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPIAfterSaleInfo)) {
            return false;
         } else {
            OpenAPIAfterSaleInfo other = (OpenAPIAfterSaleInfo)o;
            if (!other.canEqual(this)) {
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

               Object this$applyTime = this.getApplyTime();
               Object other$applyTime = other.getApplyTime();
               if (this$applyTime == null) {
                  if (other$applyTime != null) {
                     return false;
                  }
               } else if (!this$applyTime.equals(other$applyTime)) {
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

               Object this$expireTime = this.getExpireTime();
               Object other$expireTime = other.getExpireTime();
               if (this$expireTime == null) {
                  if (other$expireTime != null) {
                     return false;
                  }
               } else if (!this$expireTime.equals(other$expireTime)) {
                  return false;
               }

               Object this$supportCarriageInsurance = this.getSupportCarriageInsurance();
               Object other$supportCarriageInsurance = other.getSupportCarriageInsurance();
               if (this$supportCarriageInsurance == null) {
                  if (other$supportCarriageInsurance != null) {
                     return false;
                  }
               } else if (!this$supportCarriageInsurance.equals(other$supportCarriageInsurance)) {
                  return false;
               }

               Object this$returnsTag = this.getReturnsTag();
               Object other$returnsTag = other.getReturnsTag();
               if (this$returnsTag == null) {
                  if (other$returnsTag != null) {
                     return false;
                  }
               } else if (!this$returnsTag.equals(other$returnsTag)) {
                  return false;
               }

               Object this$appliedShipFeeAmountYuan = this.getAppliedShipFeeAmountYuan();
               Object other$appliedShipFeeAmountYuan = other.getAppliedShipFeeAmountYuan();
               if (this$appliedShipFeeAmountYuan == null) {
                  if (other$appliedShipFeeAmountYuan != null) {
                     return false;
                  }
               } else if (!this$appliedShipFeeAmountYuan.equals(other$appliedShipFeeAmountYuan)) {
                  return false;
               }

               Object this$appliedSkusAmountYuan = this.getAppliedSkusAmountYuan();
               Object other$appliedSkusAmountYuan = other.getAppliedSkusAmountYuan();
               if (this$appliedSkusAmountYuan == null) {
                  if (other$appliedSkusAmountYuan != null) {
                     return false;
                  }
               } else if (!this$appliedSkusAmountYuan.equals(other$appliedSkusAmountYuan)) {
                  return false;
               }

               Object this$expectedRefundAmountYuan = this.getExpectedRefundAmountYuan();
               Object other$expectedRefundAmountYuan = other.getExpectedRefundAmountYuan();
               if (this$expectedRefundAmountYuan == null) {
                  if (other$expectedRefundAmountYuan != null) {
                     return false;
                  }
               } else if (!this$expectedRefundAmountYuan.equals(other$expectedRefundAmountYuan)) {
                  return false;
               }

               Object this$refundAmountYuan = this.getRefundAmountYuan();
               Object other$refundAmountYuan = other.getRefundAmountYuan();
               if (this$refundAmountYuan == null) {
                  if (other$refundAmountYuan != null) {
                     return false;
                  }
               } else if (!this$refundAmountYuan.equals(other$refundAmountYuan)) {
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

               Object this$cargoStatus = this.getCargoStatus();
               Object other$cargoStatus = other.getCargoStatus();
               if (this$cargoStatus == null) {
                  if (other$cargoStatus != null) {
                     return false;
                  }
               } else if (!this$cargoStatus.equals(other$cargoStatus)) {
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

               Object this$returnsId = this.getReturnsId();
               Object other$returnsId = other.getReturnsId();
               if (this$returnsId == null) {
                  if (other$returnsId != null) {
                     return false;
                  }
               } else if (!this$returnsId.equals(other$returnsId)) {
                  return false;
               }

               Object this$reasonNameZh = this.getReasonNameZh();
               Object other$reasonNameZh = other.getReasonNameZh();
               if (this$reasonNameZh == null) {
                  if (other$reasonNameZh != null) {
                     return false;
                  }
               } else if (!this$reasonNameZh.equals(other$reasonNameZh)) {
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

               Object this$orderId = this.getOrderId();
               Object other$orderId = other.getOrderId();
               if (this$orderId == null) {
                  if (other$orderId != null) {
                     return false;
                  }
               } else if (!this$orderId.equals(other$orderId)) {
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

               Object this$openAddressId = this.getOpenAddressId();
               Object other$openAddressId = other.getOpenAddressId();
               if (this$openAddressId == null) {
                  if (other$openAddressId != null) {
                     return false;
                  }
               } else if (!this$openAddressId.equals(other$openAddressId)) {
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

               Object this$exchangeSKUs = this.getExchangeSKUs();
               Object other$exchangeSKUs = other.getExchangeSKUs();
               if (this$exchangeSKUs == null) {
                  if (other$exchangeSKUs != null) {
                     return false;
                  }
               } else if (!this$exchangeSKUs.equals(other$exchangeSKUs)) {
                  return false;
               }

               Object this$closeReasonZh = this.getCloseReasonZh();
               Object other$closeReasonZh = other.getCloseReasonZh();
               if (this$closeReasonZh == null) {
                  if (other$closeReasonZh != null) {
                     return false;
                  }
               } else if (!this$closeReasonZh.equals(other$closeReasonZh)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPIAfterSaleInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $returnType = this.getReturnType();
         result = result * 59 + ($returnType == null ? 43 : $returnType.hashCode());
         Object $reasonId = this.getReasonId();
         result = result * 59 + ($reasonId == null ? 43 : $reasonId.hashCode());
         Object $status = this.getStatus();
         result = result * 59 + ($status == null ? 43 : $status.hashCode());
         Object $applyTime = this.getApplyTime();
         result = result * 59 + ($applyTime == null ? 43 : $applyTime.hashCode());
         Object $updatedAt = this.getUpdatedAt();
         result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
         Object $expireTime = this.getExpireTime();
         result = result * 59 + ($expireTime == null ? 43 : $expireTime.hashCode());
         Object $supportCarriageInsurance = this.getSupportCarriageInsurance();
         result = result * 59 + ($supportCarriageInsurance == null ? 43 : $supportCarriageInsurance.hashCode());
         Object $returnsTag = this.getReturnsTag();
         result = result * 59 + ($returnsTag == null ? 43 : $returnsTag.hashCode());
         Object $appliedShipFeeAmountYuan = this.getAppliedShipFeeAmountYuan();
         result = result * 59 + ($appliedShipFeeAmountYuan == null ? 43 : $appliedShipFeeAmountYuan.hashCode());
         Object $appliedSkusAmountYuan = this.getAppliedSkusAmountYuan();
         result = result * 59 + ($appliedSkusAmountYuan == null ? 43 : $appliedSkusAmountYuan.hashCode());
         Object $expectedRefundAmountYuan = this.getExpectedRefundAmountYuan();
         result = result * 59 + ($expectedRefundAmountYuan == null ? 43 : $expectedRefundAmountYuan.hashCode());
         Object $refundAmountYuan = this.getRefundAmountYuan();
         result = result * 59 + ($refundAmountYuan == null ? 43 : $refundAmountYuan.hashCode());
         Object $refundStatus = this.getRefundStatus();
         result = result * 59 + ($refundStatus == null ? 43 : $refundStatus.hashCode());
         Object $cargoStatus = this.getCargoStatus();
         result = result * 59 + ($cargoStatus == null ? 43 : $cargoStatus.hashCode());
         Object $refundTime = this.getRefundTime();
         result = result * 59 + ($refundTime == null ? 43 : $refundTime.hashCode());
         Object $returnsId = this.getReturnsId();
         result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
         Object $reasonNameZh = this.getReasonNameZh();
         result = result * 59 + ($reasonNameZh == null ? 43 : $reasonNameZh.hashCode());
         Object $userId = this.getUserId();
         result = result * 59 + ($userId == null ? 43 : $userId.hashCode());
         Object $orderId = this.getOrderId();
         result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
         Object $returnAddress = this.getReturnAddress();
         result = result * 59 + ($returnAddress == null ? 43 : $returnAddress.hashCode());
         Object $proofPhotos = this.getProofPhotos();
         result = result * 59 + ($proofPhotos == null ? 43 : $proofPhotos.hashCode());
         Object $desc = this.getDesc();
         result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
         Object $openAddressId = this.getOpenAddressId();
         result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
         Object $skus = this.getSkus();
         result = result * 59 + ($skus == null ? 43 : $skus.hashCode());
         Object $exchangeSKUs = this.getExchangeSKUs();
         result = result * 59 + ($exchangeSKUs == null ? 43 : $exchangeSKUs.hashCode());
         Object $closeReasonZh = this.getCloseReasonZh();
         result = result * 59 + ($closeReasonZh == null ? 43 : $closeReasonZh.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.OpenAPIAfterSaleInfo(returnsId=" + this.getReturnsId() + ", returnType=" + this.getReturnType() + ", reasonId=" + this.getReasonId() + ", reasonNameZh=" + this.getReasonNameZh() + ", status=" + this.getStatus() + ", userId=" + this.getUserId() + ", orderId=" + this.getOrderId() + ", applyTime=" + this.getApplyTime() + ", updatedAt=" + this.getUpdatedAt() + ", expireTime=" + this.getExpireTime() + ", returnAddress=" + this.getReturnAddress() + ", proofPhotos=" + this.getProofPhotos() + ", desc=" + this.getDesc() + ", supportCarriageInsurance=" + this.getSupportCarriageInsurance() + ", openAddressId=" + this.getOpenAddressId() + ", skus=" + this.getSkus() + ", exchangeSKUs=" + this.getExchangeSKUs() + ", closeReasonZh=" + this.getCloseReasonZh() + ", returnsTag=" + this.getReturnsTag() + ", appliedShipFeeAmountYuan=" + this.getAppliedShipFeeAmountYuan() + ", appliedSkusAmountYuan=" + this.getAppliedSkusAmountYuan() + ", expectedRefundAmountYuan=" + this.getExpectedRefundAmountYuan() + ", refundAmountYuan=" + this.getRefundAmountYuan() + ", refundStatus=" + this.getRefundStatus() + ", cargoStatus=" + this.getCargoStatus() + ", refundTime=" + this.getRefundTime() + ")";
      }
   }

   public static class AddressInfo {
      public String province;
      public String city;
      public String county;
      public String town;
      public String street;
      public String phone;
      public String name;
      public String fullAddress;

      public String getProvince() {
         return this.province;
      }

      public String getCity() {
         return this.city;
      }

      public String getCounty() {
         return this.county;
      }

      public String getTown() {
         return this.town;
      }

      public String getStreet() {
         return this.street;
      }

      public String getPhone() {
         return this.phone;
      }

      public String getName() {
         return this.name;
      }

      public String getFullAddress() {
         return this.fullAddress;
      }

      public void setProvince(String province) {
         this.province = province;
      }

      public void setCity(String city) {
         this.city = city;
      }

      public void setCounty(String county) {
         this.county = county;
      }

      public void setTown(String town) {
         this.town = town;
      }

      public void setStreet(String street) {
         this.street = street;
      }

      public void setPhone(String phone) {
         this.phone = phone;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setFullAddress(String fullAddress) {
         this.fullAddress = fullAddress;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AddressInfo)) {
            return false;
         } else {
            AddressInfo other = (AddressInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$province = this.getProvince();
               Object other$province = other.getProvince();
               if (this$province == null) {
                  if (other$province != null) {
                     return false;
                  }
               } else if (!this$province.equals(other$province)) {
                  return false;
               }

               Object this$city = this.getCity();
               Object other$city = other.getCity();
               if (this$city == null) {
                  if (other$city != null) {
                     return false;
                  }
               } else if (!this$city.equals(other$city)) {
                  return false;
               }

               Object this$county = this.getCounty();
               Object other$county = other.getCounty();
               if (this$county == null) {
                  if (other$county != null) {
                     return false;
                  }
               } else if (!this$county.equals(other$county)) {
                  return false;
               }

               Object this$town = this.getTown();
               Object other$town = other.getTown();
               if (this$town == null) {
                  if (other$town != null) {
                     return false;
                  }
               } else if (!this$town.equals(other$town)) {
                  return false;
               }

               Object this$street = this.getStreet();
               Object other$street = other.getStreet();
               if (this$street == null) {
                  if (other$street != null) {
                     return false;
                  }
               } else if (!this$street.equals(other$street)) {
                  return false;
               }

               Object this$phone = this.getPhone();
               Object other$phone = other.getPhone();
               if (this$phone == null) {
                  if (other$phone != null) {
                     return false;
                  }
               } else if (!this$phone.equals(other$phone)) {
                  return false;
               }

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$fullAddress = this.getFullAddress();
               Object other$fullAddress = other.getFullAddress();
               if (this$fullAddress == null) {
                  if (other$fullAddress != null) {
                     return false;
                  }
               } else if (!this$fullAddress.equals(other$fullAddress)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AddressInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $province = this.getProvince();
         result = result * 59 + ($province == null ? 43 : $province.hashCode());
         Object $city = this.getCity();
         result = result * 59 + ($city == null ? 43 : $city.hashCode());
         Object $county = this.getCounty();
         result = result * 59 + ($county == null ? 43 : $county.hashCode());
         Object $town = this.getTown();
         result = result * 59 + ($town == null ? 43 : $town.hashCode());
         Object $street = this.getStreet();
         result = result * 59 + ($street == null ? 43 : $street.hashCode());
         Object $phone = this.getPhone();
         result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $fullAddress = this.getFullAddress();
         result = result * 59 + ($fullAddress == null ? 43 : $fullAddress.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.AddressInfo(province=" + this.getProvince() + ", city=" + this.getCity() + ", county=" + this.getCounty() + ", town=" + this.getTown() + ", street=" + this.getStreet() + ", phone=" + this.getPhone() + ", name=" + this.getName() + ", fullAddress=" + this.getFullAddress() + ")";
      }
   }

   public static class OpenAPIAfterSaleSKU {
      public String skuId;
      public String skuName;
      public String image;
      public Double price;
      public Integer boughtCount;
      public Integer appliedCount;
      public Double appliedTotalAmountYuan;
      public String scskucode;
      public String barcode;
      public List<SKUVariant> variants;
      public String skuERPCode;

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

      public Double getAppliedTotalAmountYuan() {
         return this.appliedTotalAmountYuan;
      }

      public String getScskucode() {
         return this.scskucode;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public List<SKUVariant> getVariants() {
         return this.variants;
      }

      public String getSkuERPCode() {
         return this.skuERPCode;
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

      public void setAppliedTotalAmountYuan(Double appliedTotalAmountYuan) {
         this.appliedTotalAmountYuan = appliedTotalAmountYuan;
      }

      public void setScskucode(String scskucode) {
         this.scskucode = scskucode;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setVariants(List<SKUVariant> variants) {
         this.variants = variants;
      }

      public void setSkuERPCode(String skuERPCode) {
         this.skuERPCode = skuERPCode;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPIAfterSaleSKU)) {
            return false;
         } else {
            OpenAPIAfterSaleSKU other = (OpenAPIAfterSaleSKU)o;
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

               Object this$appliedTotalAmountYuan = this.getAppliedTotalAmountYuan();
               Object other$appliedTotalAmountYuan = other.getAppliedTotalAmountYuan();
               if (this$appliedTotalAmountYuan == null) {
                  if (other$appliedTotalAmountYuan != null) {
                     return false;
                  }
               } else if (!this$appliedTotalAmountYuan.equals(other$appliedTotalAmountYuan)) {
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

               Object this$scskucode = this.getScskucode();
               Object other$scskucode = other.getScskucode();
               if (this$scskucode == null) {
                  if (other$scskucode != null) {
                     return false;
                  }
               } else if (!this$scskucode.equals(other$scskucode)) {
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

               Object this$variants = this.getVariants();
               Object other$variants = other.getVariants();
               if (this$variants == null) {
                  if (other$variants != null) {
                     return false;
                  }
               } else if (!this$variants.equals(other$variants)) {
                  return false;
               }

               Object this$skuERPCode = this.getSkuERPCode();
               Object other$skuERPCode = other.getSkuERPCode();
               if (this$skuERPCode == null) {
                  if (other$skuERPCode != null) {
                     return false;
                  }
               } else if (!this$skuERPCode.equals(other$skuERPCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPIAfterSaleSKU;
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
         Object $appliedTotalAmountYuan = this.getAppliedTotalAmountYuan();
         result = result * 59 + ($appliedTotalAmountYuan == null ? 43 : $appliedTotalAmountYuan.hashCode());
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $skuName = this.getSkuName();
         result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
         Object $image = this.getImage();
         result = result * 59 + ($image == null ? 43 : $image.hashCode());
         Object $scskucode = this.getScskucode();
         result = result * 59 + ($scskucode == null ? 43 : $scskucode.hashCode());
         Object $barcode = this.getBarcode();
         result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
         Object $variants = this.getVariants();
         result = result * 59 + ($variants == null ? 43 : $variants.hashCode());
         Object $skuERPCode = this.getSkuERPCode();
         result = result * 59 + ($skuERPCode == null ? 43 : $skuERPCode.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.OpenAPIAfterSaleSKU(skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", image=" + this.getImage() + ", price=" + this.getPrice() + ", boughtCount=" + this.getBoughtCount() + ", appliedCount=" + this.getAppliedCount() + ", appliedTotalAmountYuan=" + this.getAppliedTotalAmountYuan() + ", scskucode=" + this.getScskucode() + ", barcode=" + this.getBarcode() + ", variants=" + this.getVariants() + ", skuERPCode=" + this.getSkuERPCode() + ")";
      }
   }

   public static class SKUVariant {
      public String name;
      public String value;

      public String getName() {
         return this.name;
      }

      public String getValue() {
         return this.value;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SKUVariant)) {
            return false;
         } else {
            SKUVariant other = (SKUVariant)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$value = this.getValue();
               Object other$value = other.getValue();
               if (this$value == null) {
                  if (other$value != null) {
                     return false;
                  }
               } else if (!this$value.equals(other$value)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SKUVariant;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.SKUVariant(name=" + this.getName() + ", value=" + this.getValue() + ")";
      }
   }

   public static class LogisticsInfo {
      public ReturnLogisticsInfo afterSale;
      public ExchangeLogisticsInfo exchange;
      public OrderLogisticsInfo order;

      public ReturnLogisticsInfo getAfterSale() {
         return this.afterSale;
      }

      public ExchangeLogisticsInfo getExchange() {
         return this.exchange;
      }

      public OrderLogisticsInfo getOrder() {
         return this.order;
      }

      public void setAfterSale(ReturnLogisticsInfo afterSale) {
         this.afterSale = afterSale;
      }

      public void setExchange(ExchangeLogisticsInfo exchange) {
         this.exchange = exchange;
      }

      public void setOrder(OrderLogisticsInfo order) {
         this.order = order;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof LogisticsInfo)) {
            return false;
         } else {
            LogisticsInfo other = (LogisticsInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$afterSale = this.getAfterSale();
               Object other$afterSale = other.getAfterSale();
               if (this$afterSale == null) {
                  if (other$afterSale != null) {
                     return false;
                  }
               } else if (!this$afterSale.equals(other$afterSale)) {
                  return false;
               }

               Object this$exchange = this.getExchange();
               Object other$exchange = other.getExchange();
               if (this$exchange == null) {
                  if (other$exchange != null) {
                     return false;
                  }
               } else if (!this$exchange.equals(other$exchange)) {
                  return false;
               }

               Object this$order = this.getOrder();
               Object other$order = other.getOrder();
               if (this$order == null) {
                  if (other$order != null) {
                     return false;
                  }
               } else if (!this$order.equals(other$order)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof LogisticsInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $afterSale = this.getAfterSale();
         result = result * 59 + ($afterSale == null ? 43 : $afterSale.hashCode());
         Object $exchange = this.getExchange();
         result = result * 59 + ($exchange == null ? 43 : $exchange.hashCode());
         Object $order = this.getOrder();
         result = result * 59 + ($order == null ? 43 : $order.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.LogisticsInfo(afterSale=" + this.getAfterSale() + ", exchange=" + this.getExchange() + ", order=" + this.getOrder() + ")";
      }
   }

   public static class ReturnLogisticsInfo {
      public String expressNo;
      public String expressCompanyCode;
      public String expressCompanyName;
      public Long fillExpressNoTime;
      public Long expressSignTime;

      public String getExpressNo() {
         return this.expressNo;
      }

      public String getExpressCompanyCode() {
         return this.expressCompanyCode;
      }

      public String getExpressCompanyName() {
         return this.expressCompanyName;
      }

      public Long getFillExpressNoTime() {
         return this.fillExpressNoTime;
      }

      public Long getExpressSignTime() {
         return this.expressSignTime;
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

      public void setFillExpressNoTime(Long fillExpressNoTime) {
         this.fillExpressNoTime = fillExpressNoTime;
      }

      public void setExpressSignTime(Long expressSignTime) {
         this.expressSignTime = expressSignTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ReturnLogisticsInfo)) {
            return false;
         } else {
            ReturnLogisticsInfo other = (ReturnLogisticsInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$fillExpressNoTime = this.getFillExpressNoTime();
               Object other$fillExpressNoTime = other.getFillExpressNoTime();
               if (this$fillExpressNoTime == null) {
                  if (other$fillExpressNoTime != null) {
                     return false;
                  }
               } else if (!this$fillExpressNoTime.equals(other$fillExpressNoTime)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ReturnLogisticsInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $fillExpressNoTime = this.getFillExpressNoTime();
         result = result * 59 + ($fillExpressNoTime == null ? 43 : $fillExpressNoTime.hashCode());
         Object $expressSignTime = this.getExpressSignTime();
         result = result * 59 + ($expressSignTime == null ? 43 : $expressSignTime.hashCode());
         Object $expressNo = this.getExpressNo();
         result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $expressCompanyName = this.getExpressCompanyName();
         result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.ReturnLogisticsInfo(expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", fillExpressNoTime=" + this.getFillExpressNoTime() + ", expressSignTime=" + this.getExpressSignTime() + ")";
      }
   }

   public static class ExchangeLogisticsInfo {
      public String expressNo;
      public String expressCompanyCode;
      public String expressCompanyName;
      public Long fillExpressNoTime;

      public String getExpressNo() {
         return this.expressNo;
      }

      public String getExpressCompanyCode() {
         return this.expressCompanyCode;
      }

      public String getExpressCompanyName() {
         return this.expressCompanyName;
      }

      public Long getFillExpressNoTime() {
         return this.fillExpressNoTime;
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

      public void setFillExpressNoTime(Long fillExpressNoTime) {
         this.fillExpressNoTime = fillExpressNoTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ExchangeLogisticsInfo)) {
            return false;
         } else {
            ExchangeLogisticsInfo other = (ExchangeLogisticsInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$fillExpressNoTime = this.getFillExpressNoTime();
               Object other$fillExpressNoTime = other.getFillExpressNoTime();
               if (this$fillExpressNoTime == null) {
                  if (other$fillExpressNoTime != null) {
                     return false;
                  }
               } else if (!this$fillExpressNoTime.equals(other$fillExpressNoTime)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ExchangeLogisticsInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $fillExpressNoTime = this.getFillExpressNoTime();
         result = result * 59 + ($fillExpressNoTime == null ? 43 : $fillExpressNoTime.hashCode());
         Object $expressNo = this.getExpressNo();
         result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $expressCompanyName = this.getExpressCompanyName();
         result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.ExchangeLogisticsInfo(expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ", fillExpressNoTime=" + this.getFillExpressNoTime() + ")";
      }
   }

   public static class OrderLogisticsInfo {
      public String expressNo;
      public String expressCompanyCode;
      public String expressCompanyName;

      public String getExpressNo() {
         return this.expressNo;
      }

      public String getExpressCompanyCode() {
         return this.expressCompanyCode;
      }

      public String getExpressCompanyName() {
         return this.expressCompanyName;
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

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OrderLogisticsInfo)) {
            return false;
         } else {
            OrderLogisticsInfo other = (OrderLogisticsInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OrderLogisticsInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $expressNo = this.getExpressNo();
         result = result * 59 + ($expressNo == null ? 43 : $expressNo.hashCode());
         Object $expressCompanyCode = this.getExpressCompanyCode();
         result = result * 59 + ($expressCompanyCode == null ? 43 : $expressCompanyCode.hashCode());
         Object $expressCompanyName = this.getExpressCompanyName();
         result = result * 59 + ($expressCompanyName == null ? 43 : $expressCompanyName.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.OrderLogisticsInfo(expressNo=" + this.getExpressNo() + ", expressCompanyCode=" + this.getExpressCompanyCode() + ", expressCompanyName=" + this.getExpressCompanyName() + ")";
      }
   }

   public static class OpenAPINegotiateNode {
      public String title;
      public String operatorRoleName;
      public Integer operatorRole;
      public List<OpenAPINegotiateNodeAttribute> attributes;
      public String time;

      public String getTitle() {
         return this.title;
      }

      public String getOperatorRoleName() {
         return this.operatorRoleName;
      }

      public Integer getOperatorRole() {
         return this.operatorRole;
      }

      public List<OpenAPINegotiateNodeAttribute> getAttributes() {
         return this.attributes;
      }

      public String getTime() {
         return this.time;
      }

      public void setTitle(String title) {
         this.title = title;
      }

      public void setOperatorRoleName(String operatorRoleName) {
         this.operatorRoleName = operatorRoleName;
      }

      public void setOperatorRole(Integer operatorRole) {
         this.operatorRole = operatorRole;
      }

      public void setAttributes(List<OpenAPINegotiateNodeAttribute> attributes) {
         this.attributes = attributes;
      }

      public void setTime(String time) {
         this.time = time;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPINegotiateNode)) {
            return false;
         } else {
            OpenAPINegotiateNode other = (OpenAPINegotiateNode)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$operatorRole = this.getOperatorRole();
               Object other$operatorRole = other.getOperatorRole();
               if (this$operatorRole == null) {
                  if (other$operatorRole != null) {
                     return false;
                  }
               } else if (!this$operatorRole.equals(other$operatorRole)) {
                  return false;
               }

               Object this$title = this.getTitle();
               Object other$title = other.getTitle();
               if (this$title == null) {
                  if (other$title != null) {
                     return false;
                  }
               } else if (!this$title.equals(other$title)) {
                  return false;
               }

               Object this$operatorRoleName = this.getOperatorRoleName();
               Object other$operatorRoleName = other.getOperatorRoleName();
               if (this$operatorRoleName == null) {
                  if (other$operatorRoleName != null) {
                     return false;
                  }
               } else if (!this$operatorRoleName.equals(other$operatorRoleName)) {
                  return false;
               }

               Object this$attributes = this.getAttributes();
               Object other$attributes = other.getAttributes();
               if (this$attributes == null) {
                  if (other$attributes != null) {
                     return false;
                  }
               } else if (!this$attributes.equals(other$attributes)) {
                  return false;
               }

               Object this$time = this.getTime();
               Object other$time = other.getTime();
               if (this$time == null) {
                  if (other$time != null) {
                     return false;
                  }
               } else if (!this$time.equals(other$time)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPINegotiateNode;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $operatorRole = this.getOperatorRole();
         result = result * 59 + ($operatorRole == null ? 43 : $operatorRole.hashCode());
         Object $title = this.getTitle();
         result = result * 59 + ($title == null ? 43 : $title.hashCode());
         Object $operatorRoleName = this.getOperatorRoleName();
         result = result * 59 + ($operatorRoleName == null ? 43 : $operatorRoleName.hashCode());
         Object $attributes = this.getAttributes();
         result = result * 59 + ($attributes == null ? 43 : $attributes.hashCode());
         Object $time = this.getTime();
         result = result * 59 + ($time == null ? 43 : $time.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.OpenAPINegotiateNode(title=" + this.getTitle() + ", operatorRoleName=" + this.getOperatorRoleName() + ", operatorRole=" + this.getOperatorRole() + ", attributes=" + this.getAttributes() + ", time=" + this.getTime() + ")";
      }
   }

   public static class OpenAPINegotiateNodeAttribute {
      public Integer type;
      public String key;
      public String desc;
      public List<String> photos;

      public Integer getType() {
         return this.type;
      }

      public String getKey() {
         return this.key;
      }

      public String getDesc() {
         return this.desc;
      }

      public List<String> getPhotos() {
         return this.photos;
      }

      public void setType(Integer type) {
         this.type = type;
      }

      public void setKey(String key) {
         this.key = key;
      }

      public void setDesc(String desc) {
         this.desc = desc;
      }

      public void setPhotos(List<String> photos) {
         this.photos = photos;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof OpenAPINegotiateNodeAttribute)) {
            return false;
         } else {
            OpenAPINegotiateNodeAttribute other = (OpenAPINegotiateNodeAttribute)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type != null) {
                     return false;
                  }
               } else if (!this$type.equals(other$type)) {
                  return false;
               }

               Object this$key = this.getKey();
               Object other$key = other.getKey();
               if (this$key == null) {
                  if (other$key != null) {
                     return false;
                  }
               } else if (!this$key.equals(other$key)) {
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

               Object this$photos = this.getPhotos();
               Object other$photos = other.getPhotos();
               if (this$photos == null) {
                  if (other$photos != null) {
                     return false;
                  }
               } else if (!this$photos.equals(other$photos)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof OpenAPINegotiateNodeAttribute;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         Object $key = this.getKey();
         result = result * 59 + ($key == null ? 43 : $key.hashCode());
         Object $desc = this.getDesc();
         result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
         Object $photos = this.getPhotos();
         result = result * 59 + ($photos == null ? 43 : $photos.hashCode());
         return result;
      }

      public String toString() {
         return "GetAfterSaleInfoResponse.OpenAPINegotiateNodeAttribute(type=" + this.getType() + ", key=" + this.getKey() + ", desc=" + this.getDesc() + ", photos=" + this.getPhotos() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.express.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.express.ElectronicBillItem;
import com.xiaohongshu.fls.opensdk.entity.express.ElectronicBillUserInfo;
import java.util.List;

public class ElectronicBillOrdersCreateRequest extends BaseRequest {
   private Integer billVersion;
   private String cpCode;
   private ElectronicBillUserInfo sender;
   private List<ElectronicBillTradeOrderInfo> tradeOrderInfoList;
   private String extraInfo;
   private String customerCode;
   private String brandCode;
   private String productCode;
   private Boolean callDoorPickUp;
   private String doorPickUpTime;
   private String doorPickUpEndTime;
   private String sellerName;
   private String branchCode;
   private Integer payMethod;

   public Integer getBillVersion() {
      return this.billVersion;
   }

   public String getCpCode() {
      return this.cpCode;
   }

   public ElectronicBillUserInfo getSender() {
      return this.sender;
   }

   public List<ElectronicBillTradeOrderInfo> getTradeOrderInfoList() {
      return this.tradeOrderInfoList;
   }

   public String getExtraInfo() {
      return this.extraInfo;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getBrandCode() {
      return this.brandCode;
   }

   public String getProductCode() {
      return this.productCode;
   }

   public Boolean getCallDoorPickUp() {
      return this.callDoorPickUp;
   }

   public String getDoorPickUpTime() {
      return this.doorPickUpTime;
   }

   public String getDoorPickUpEndTime() {
      return this.doorPickUpEndTime;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public Integer getPayMethod() {
      return this.payMethod;
   }

   public void setBillVersion(Integer billVersion) {
      this.billVersion = billVersion;
   }

   public void setCpCode(String cpCode) {
      this.cpCode = cpCode;
   }

   public void setSender(ElectronicBillUserInfo sender) {
      this.sender = sender;
   }

   public void setTradeOrderInfoList(List<ElectronicBillTradeOrderInfo> tradeOrderInfoList) {
      this.tradeOrderInfoList = tradeOrderInfoList;
   }

   public void setExtraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public void setBrandCode(String brandCode) {
      this.brandCode = brandCode;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public void setCallDoorPickUp(Boolean callDoorPickUp) {
      this.callDoorPickUp = callDoorPickUp;
   }

   public void setDoorPickUpTime(String doorPickUpTime) {
      this.doorPickUpTime = doorPickUpTime;
   }

   public void setDoorPickUpEndTime(String doorPickUpEndTime) {
      this.doorPickUpEndTime = doorPickUpEndTime;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public void setPayMethod(Integer payMethod) {
      this.payMethod = payMethod;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillOrdersCreateRequest)) {
         return false;
      } else {
         ElectronicBillOrdersCreateRequest other = (ElectronicBillOrdersCreateRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$billVersion = this.getBillVersion();
            Object other$billVersion = other.getBillVersion();
            if (this$billVersion == null) {
               if (other$billVersion != null) {
                  return false;
               }
            } else if (!this$billVersion.equals(other$billVersion)) {
               return false;
            }

            Object this$callDoorPickUp = this.getCallDoorPickUp();
            Object other$callDoorPickUp = other.getCallDoorPickUp();
            if (this$callDoorPickUp == null) {
               if (other$callDoorPickUp != null) {
                  return false;
               }
            } else if (!this$callDoorPickUp.equals(other$callDoorPickUp)) {
               return false;
            }

            Object this$payMethod = this.getPayMethod();
            Object other$payMethod = other.getPayMethod();
            if (this$payMethod == null) {
               if (other$payMethod != null) {
                  return false;
               }
            } else if (!this$payMethod.equals(other$payMethod)) {
               return false;
            }

            Object this$cpCode = this.getCpCode();
            Object other$cpCode = other.getCpCode();
            if (this$cpCode == null) {
               if (other$cpCode != null) {
                  return false;
               }
            } else if (!this$cpCode.equals(other$cpCode)) {
               return false;
            }

            Object this$sender = this.getSender();
            Object other$sender = other.getSender();
            if (this$sender == null) {
               if (other$sender != null) {
                  return false;
               }
            } else if (!this$sender.equals(other$sender)) {
               return false;
            }

            Object this$tradeOrderInfoList = this.getTradeOrderInfoList();
            Object other$tradeOrderInfoList = other.getTradeOrderInfoList();
            if (this$tradeOrderInfoList == null) {
               if (other$tradeOrderInfoList != null) {
                  return false;
               }
            } else if (!this$tradeOrderInfoList.equals(other$tradeOrderInfoList)) {
               return false;
            }

            Object this$extraInfo = this.getExtraInfo();
            Object other$extraInfo = other.getExtraInfo();
            if (this$extraInfo == null) {
               if (other$extraInfo != null) {
                  return false;
               }
            } else if (!this$extraInfo.equals(other$extraInfo)) {
               return false;
            }

            Object this$customerCode = this.getCustomerCode();
            Object other$customerCode = other.getCustomerCode();
            if (this$customerCode == null) {
               if (other$customerCode != null) {
                  return false;
               }
            } else if (!this$customerCode.equals(other$customerCode)) {
               return false;
            }

            Object this$brandCode = this.getBrandCode();
            Object other$brandCode = other.getBrandCode();
            if (this$brandCode == null) {
               if (other$brandCode != null) {
                  return false;
               }
            } else if (!this$brandCode.equals(other$brandCode)) {
               return false;
            }

            Object this$productCode = this.getProductCode();
            Object other$productCode = other.getProductCode();
            if (this$productCode == null) {
               if (other$productCode != null) {
                  return false;
               }
            } else if (!this$productCode.equals(other$productCode)) {
               return false;
            }

            Object this$doorPickUpTime = this.getDoorPickUpTime();
            Object other$doorPickUpTime = other.getDoorPickUpTime();
            if (this$doorPickUpTime == null) {
               if (other$doorPickUpTime != null) {
                  return false;
               }
            } else if (!this$doorPickUpTime.equals(other$doorPickUpTime)) {
               return false;
            }

            Object this$doorPickUpEndTime = this.getDoorPickUpEndTime();
            Object other$doorPickUpEndTime = other.getDoorPickUpEndTime();
            if (this$doorPickUpEndTime == null) {
               if (other$doorPickUpEndTime != null) {
                  return false;
               }
            } else if (!this$doorPickUpEndTime.equals(other$doorPickUpEndTime)) {
               return false;
            }

            Object this$sellerName = this.getSellerName();
            Object other$sellerName = other.getSellerName();
            if (this$sellerName == null) {
               if (other$sellerName != null) {
                  return false;
               }
            } else if (!this$sellerName.equals(other$sellerName)) {
               return false;
            }

            Object this$branchCode = this.getBranchCode();
            Object other$branchCode = other.getBranchCode();
            if (this$branchCode == null) {
               if (other$branchCode != null) {
                  return false;
               }
            } else if (!this$branchCode.equals(other$branchCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillOrdersCreateRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $billVersion = this.getBillVersion();
      result = result * 59 + ($billVersion == null ? 43 : $billVersion.hashCode());
      Object $callDoorPickUp = this.getCallDoorPickUp();
      result = result * 59 + ($callDoorPickUp == null ? 43 : $callDoorPickUp.hashCode());
      Object $payMethod = this.getPayMethod();
      result = result * 59 + ($payMethod == null ? 43 : $payMethod.hashCode());
      Object $cpCode = this.getCpCode();
      result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
      Object $sender = this.getSender();
      result = result * 59 + ($sender == null ? 43 : $sender.hashCode());
      Object $tradeOrderInfoList = this.getTradeOrderInfoList();
      result = result * 59 + ($tradeOrderInfoList == null ? 43 : $tradeOrderInfoList.hashCode());
      Object $extraInfo = this.getExtraInfo();
      result = result * 59 + ($extraInfo == null ? 43 : $extraInfo.hashCode());
      Object $customerCode = this.getCustomerCode();
      result = result * 59 + ($customerCode == null ? 43 : $customerCode.hashCode());
      Object $brandCode = this.getBrandCode();
      result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
      Object $productCode = this.getProductCode();
      result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
      Object $doorPickUpTime = this.getDoorPickUpTime();
      result = result * 59 + ($doorPickUpTime == null ? 43 : $doorPickUpTime.hashCode());
      Object $doorPickUpEndTime = this.getDoorPickUpEndTime();
      result = result * 59 + ($doorPickUpEndTime == null ? 43 : $doorPickUpEndTime.hashCode());
      Object $sellerName = this.getSellerName();
      result = result * 59 + ($sellerName == null ? 43 : $sellerName.hashCode());
      Object $branchCode = this.getBranchCode();
      result = result * 59 + ($branchCode == null ? 43 : $branchCode.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillOrdersCreateRequest(billVersion=" + this.getBillVersion() + ", cpCode=" + this.getCpCode() + ", sender=" + this.getSender() + ", tradeOrderInfoList=" + this.getTradeOrderInfoList() + ", extraInfo=" + this.getExtraInfo() + ", customerCode=" + this.getCustomerCode() + ", brandCode=" + this.getBrandCode() + ", productCode=" + this.getProductCode() + ", callDoorPickUp=" + this.getCallDoorPickUp() + ", doorPickUpTime=" + this.getDoorPickUpTime() + ", doorPickUpEndTime=" + this.getDoorPickUpEndTime() + ", sellerName=" + this.getSellerName() + ", branchCode=" + this.getBranchCode() + ", payMethod=" + this.getPayMethod() + ")";
   }

   public static class ElectronicBillTradeOrderInfo {
      private String logisticsServices;
      private String objectId;
      private ElectronicBillOrderInfo orderInfo;
      private ElectronicBillPackageInfo packageInfo;
      private ElectronicBillUserInfo recipient;
      private ElectronicBillUserInfo returnsRecipient;
      private Long templateId;
      private String deliverExtendInfo;

      public String getLogisticsServices() {
         return this.logisticsServices;
      }

      public String getObjectId() {
         return this.objectId;
      }

      public ElectronicBillOrderInfo getOrderInfo() {
         return this.orderInfo;
      }

      public ElectronicBillPackageInfo getPackageInfo() {
         return this.packageInfo;
      }

      public ElectronicBillUserInfo getRecipient() {
         return this.recipient;
      }

      public ElectronicBillUserInfo getReturnsRecipient() {
         return this.returnsRecipient;
      }

      public Long getTemplateId() {
         return this.templateId;
      }

      public String getDeliverExtendInfo() {
         return this.deliverExtendInfo;
      }

      public void setLogisticsServices(String logisticsServices) {
         this.logisticsServices = logisticsServices;
      }

      public void setObjectId(String objectId) {
         this.objectId = objectId;
      }

      public void setOrderInfo(ElectronicBillOrderInfo orderInfo) {
         this.orderInfo = orderInfo;
      }

      public void setPackageInfo(ElectronicBillPackageInfo packageInfo) {
         this.packageInfo = packageInfo;
      }

      public void setRecipient(ElectronicBillUserInfo recipient) {
         this.recipient = recipient;
      }

      public void setReturnsRecipient(ElectronicBillUserInfo returnsRecipient) {
         this.returnsRecipient = returnsRecipient;
      }

      public void setTemplateId(Long templateId) {
         this.templateId = templateId;
      }

      public void setDeliverExtendInfo(String deliverExtendInfo) {
         this.deliverExtendInfo = deliverExtendInfo;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ElectronicBillTradeOrderInfo)) {
            return false;
         } else {
            ElectronicBillTradeOrderInfo other = (ElectronicBillTradeOrderInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$templateId = this.getTemplateId();
               Object other$templateId = other.getTemplateId();
               if (this$templateId == null) {
                  if (other$templateId != null) {
                     return false;
                  }
               } else if (!this$templateId.equals(other$templateId)) {
                  return false;
               }

               Object this$logisticsServices = this.getLogisticsServices();
               Object other$logisticsServices = other.getLogisticsServices();
               if (this$logisticsServices == null) {
                  if (other$logisticsServices != null) {
                     return false;
                  }
               } else if (!this$logisticsServices.equals(other$logisticsServices)) {
                  return false;
               }

               Object this$objectId = this.getObjectId();
               Object other$objectId = other.getObjectId();
               if (this$objectId == null) {
                  if (other$objectId != null) {
                     return false;
                  }
               } else if (!this$objectId.equals(other$objectId)) {
                  return false;
               }

               Object this$orderInfo = this.getOrderInfo();
               Object other$orderInfo = other.getOrderInfo();
               if (this$orderInfo == null) {
                  if (other$orderInfo != null) {
                     return false;
                  }
               } else if (!this$orderInfo.equals(other$orderInfo)) {
                  return false;
               }

               Object this$packageInfo = this.getPackageInfo();
               Object other$packageInfo = other.getPackageInfo();
               if (this$packageInfo == null) {
                  if (other$packageInfo != null) {
                     return false;
                  }
               } else if (!this$packageInfo.equals(other$packageInfo)) {
                  return false;
               }

               Object this$recipient = this.getRecipient();
               Object other$recipient = other.getRecipient();
               if (this$recipient == null) {
                  if (other$recipient != null) {
                     return false;
                  }
               } else if (!this$recipient.equals(other$recipient)) {
                  return false;
               }

               Object this$returnsRecipient = this.getReturnsRecipient();
               Object other$returnsRecipient = other.getReturnsRecipient();
               if (this$returnsRecipient == null) {
                  if (other$returnsRecipient != null) {
                     return false;
                  }
               } else if (!this$returnsRecipient.equals(other$returnsRecipient)) {
                  return false;
               }

               Object this$deliverExtendInfo = this.getDeliverExtendInfo();
               Object other$deliverExtendInfo = other.getDeliverExtendInfo();
               if (this$deliverExtendInfo == null) {
                  if (other$deliverExtendInfo != null) {
                     return false;
                  }
               } else if (!this$deliverExtendInfo.equals(other$deliverExtendInfo)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ElectronicBillTradeOrderInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $templateId = this.getTemplateId();
         result = result * 59 + ($templateId == null ? 43 : $templateId.hashCode());
         Object $logisticsServices = this.getLogisticsServices();
         result = result * 59 + ($logisticsServices == null ? 43 : $logisticsServices.hashCode());
         Object $objectId = this.getObjectId();
         result = result * 59 + ($objectId == null ? 43 : $objectId.hashCode());
         Object $orderInfo = this.getOrderInfo();
         result = result * 59 + ($orderInfo == null ? 43 : $orderInfo.hashCode());
         Object $packageInfo = this.getPackageInfo();
         result = result * 59 + ($packageInfo == null ? 43 : $packageInfo.hashCode());
         Object $recipient = this.getRecipient();
         result = result * 59 + ($recipient == null ? 43 : $recipient.hashCode());
         Object $returnsRecipient = this.getReturnsRecipient();
         result = result * 59 + ($returnsRecipient == null ? 43 : $returnsRecipient.hashCode());
         Object $deliverExtendInfo = this.getDeliverExtendInfo();
         result = result * 59 + ($deliverExtendInfo == null ? 43 : $deliverExtendInfo.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrdersCreateRequest.ElectronicBillTradeOrderInfo(logisticsServices=" + this.getLogisticsServices() + ", objectId=" + this.getObjectId() + ", orderInfo=" + this.getOrderInfo() + ", packageInfo=" + this.getPackageInfo() + ", recipient=" + this.getRecipient() + ", returnsRecipient=" + this.getReturnsRecipient() + ", templateId=" + this.getTemplateId() + ", deliverExtendInfo=" + this.getDeliverExtendInfo() + ")";
      }
   }

   public static class ElectronicBillOrderInfo {
      private String orderChannelsType;
      private List<String> tradeOrderList;
      private List<String> buyerMemo;
      private List<String> sellerMemo;
      private String xhsOrderId;
      private List<String> xhsOrderList;

      public String getOrderChannelsType() {
         return this.orderChannelsType;
      }

      public List<String> getTradeOrderList() {
         return this.tradeOrderList;
      }

      public List<String> getBuyerMemo() {
         return this.buyerMemo;
      }

      public List<String> getSellerMemo() {
         return this.sellerMemo;
      }

      public String getXhsOrderId() {
         return this.xhsOrderId;
      }

      public List<String> getXhsOrderList() {
         return this.xhsOrderList;
      }

      public void setOrderChannelsType(String orderChannelsType) {
         this.orderChannelsType = orderChannelsType;
      }

      public void setTradeOrderList(List<String> tradeOrderList) {
         this.tradeOrderList = tradeOrderList;
      }

      public void setBuyerMemo(List<String> buyerMemo) {
         this.buyerMemo = buyerMemo;
      }

      public void setSellerMemo(List<String> sellerMemo) {
         this.sellerMemo = sellerMemo;
      }

      public void setXhsOrderId(String xhsOrderId) {
         this.xhsOrderId = xhsOrderId;
      }

      public void setXhsOrderList(List<String> xhsOrderList) {
         this.xhsOrderList = xhsOrderList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ElectronicBillOrderInfo)) {
            return false;
         } else {
            ElectronicBillOrderInfo other = (ElectronicBillOrderInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$orderChannelsType = this.getOrderChannelsType();
               Object other$orderChannelsType = other.getOrderChannelsType();
               if (this$orderChannelsType == null) {
                  if (other$orderChannelsType != null) {
                     return false;
                  }
               } else if (!this$orderChannelsType.equals(other$orderChannelsType)) {
                  return false;
               }

               Object this$tradeOrderList = this.getTradeOrderList();
               Object other$tradeOrderList = other.getTradeOrderList();
               if (this$tradeOrderList == null) {
                  if (other$tradeOrderList != null) {
                     return false;
                  }
               } else if (!this$tradeOrderList.equals(other$tradeOrderList)) {
                  return false;
               }

               Object this$buyerMemo = this.getBuyerMemo();
               Object other$buyerMemo = other.getBuyerMemo();
               if (this$buyerMemo == null) {
                  if (other$buyerMemo != null) {
                     return false;
                  }
               } else if (!this$buyerMemo.equals(other$buyerMemo)) {
                  return false;
               }

               Object this$sellerMemo = this.getSellerMemo();
               Object other$sellerMemo = other.getSellerMemo();
               if (this$sellerMemo == null) {
                  if (other$sellerMemo != null) {
                     return false;
                  }
               } else if (!this$sellerMemo.equals(other$sellerMemo)) {
                  return false;
               }

               Object this$xhsOrderId = this.getXhsOrderId();
               Object other$xhsOrderId = other.getXhsOrderId();
               if (this$xhsOrderId == null) {
                  if (other$xhsOrderId != null) {
                     return false;
                  }
               } else if (!this$xhsOrderId.equals(other$xhsOrderId)) {
                  return false;
               }

               Object this$xhsOrderList = this.getXhsOrderList();
               Object other$xhsOrderList = other.getXhsOrderList();
               if (this$xhsOrderList == null) {
                  if (other$xhsOrderList != null) {
                     return false;
                  }
               } else if (!this$xhsOrderList.equals(other$xhsOrderList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ElectronicBillOrderInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $orderChannelsType = this.getOrderChannelsType();
         result = result * 59 + ($orderChannelsType == null ? 43 : $orderChannelsType.hashCode());
         Object $tradeOrderList = this.getTradeOrderList();
         result = result * 59 + ($tradeOrderList == null ? 43 : $tradeOrderList.hashCode());
         Object $buyerMemo = this.getBuyerMemo();
         result = result * 59 + ($buyerMemo == null ? 43 : $buyerMemo.hashCode());
         Object $sellerMemo = this.getSellerMemo();
         result = result * 59 + ($sellerMemo == null ? 43 : $sellerMemo.hashCode());
         Object $xhsOrderId = this.getXhsOrderId();
         result = result * 59 + ($xhsOrderId == null ? 43 : $xhsOrderId.hashCode());
         Object $xhsOrderList = this.getXhsOrderList();
         result = result * 59 + ($xhsOrderList == null ? 43 : $xhsOrderList.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrdersCreateRequest.ElectronicBillOrderInfo(orderChannelsType=" + this.getOrderChannelsType() + ", tradeOrderList=" + this.getTradeOrderList() + ", buyerMemo=" + this.getBuyerMemo() + ", sellerMemo=" + this.getSellerMemo() + ", xhsOrderId=" + this.getXhsOrderId() + ", xhsOrderList=" + this.getXhsOrderList() + ")";
      }
   }

   public static class ElectronicBillPackageInfo {
      private String id;
      private List<ElectronicBillItem> items;
      private Long volume;
      private Long weight;
      private Long length;
      private Long width;
      private Long height;
      private Long totalPackagesCount;
      private String packagingDescription;
      private String goodsDescription;
      private Double goodValue;

      public String getId() {
         return this.id;
      }

      public List<ElectronicBillItem> getItems() {
         return this.items;
      }

      public Long getVolume() {
         return this.volume;
      }

      public Long getWeight() {
         return this.weight;
      }

      public Long getLength() {
         return this.length;
      }

      public Long getWidth() {
         return this.width;
      }

      public Long getHeight() {
         return this.height;
      }

      public Long getTotalPackagesCount() {
         return this.totalPackagesCount;
      }

      public String getPackagingDescription() {
         return this.packagingDescription;
      }

      public String getGoodsDescription() {
         return this.goodsDescription;
      }

      public Double getGoodValue() {
         return this.goodValue;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setItems(List<ElectronicBillItem> items) {
         this.items = items;
      }

      public void setVolume(Long volume) {
         this.volume = volume;
      }

      public void setWeight(Long weight) {
         this.weight = weight;
      }

      public void setLength(Long length) {
         this.length = length;
      }

      public void setWidth(Long width) {
         this.width = width;
      }

      public void setHeight(Long height) {
         this.height = height;
      }

      public void setTotalPackagesCount(Long totalPackagesCount) {
         this.totalPackagesCount = totalPackagesCount;
      }

      public void setPackagingDescription(String packagingDescription) {
         this.packagingDescription = packagingDescription;
      }

      public void setGoodsDescription(String goodsDescription) {
         this.goodsDescription = goodsDescription;
      }

      public void setGoodValue(Double goodValue) {
         this.goodValue = goodValue;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ElectronicBillPackageInfo)) {
            return false;
         } else {
            ElectronicBillPackageInfo other = (ElectronicBillPackageInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$volume = this.getVolume();
               Object other$volume = other.getVolume();
               if (this$volume == null) {
                  if (other$volume != null) {
                     return false;
                  }
               } else if (!this$volume.equals(other$volume)) {
                  return false;
               }

               Object this$weight = this.getWeight();
               Object other$weight = other.getWeight();
               if (this$weight == null) {
                  if (other$weight != null) {
                     return false;
                  }
               } else if (!this$weight.equals(other$weight)) {
                  return false;
               }

               Object this$length = this.getLength();
               Object other$length = other.getLength();
               if (this$length == null) {
                  if (other$length != null) {
                     return false;
                  }
               } else if (!this$length.equals(other$length)) {
                  return false;
               }

               Object this$width = this.getWidth();
               Object other$width = other.getWidth();
               if (this$width == null) {
                  if (other$width != null) {
                     return false;
                  }
               } else if (!this$width.equals(other$width)) {
                  return false;
               }

               Object this$height = this.getHeight();
               Object other$height = other.getHeight();
               if (this$height == null) {
                  if (other$height != null) {
                     return false;
                  }
               } else if (!this$height.equals(other$height)) {
                  return false;
               }

               Object this$totalPackagesCount = this.getTotalPackagesCount();
               Object other$totalPackagesCount = other.getTotalPackagesCount();
               if (this$totalPackagesCount == null) {
                  if (other$totalPackagesCount != null) {
                     return false;
                  }
               } else if (!this$totalPackagesCount.equals(other$totalPackagesCount)) {
                  return false;
               }

               Object this$goodValue = this.getGoodValue();
               Object other$goodValue = other.getGoodValue();
               if (this$goodValue == null) {
                  if (other$goodValue != null) {
                     return false;
                  }
               } else if (!this$goodValue.equals(other$goodValue)) {
                  return false;
               }

               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
                  return false;
               }

               Object this$items = this.getItems();
               Object other$items = other.getItems();
               if (this$items == null) {
                  if (other$items != null) {
                     return false;
                  }
               } else if (!this$items.equals(other$items)) {
                  return false;
               }

               Object this$packagingDescription = this.getPackagingDescription();
               Object other$packagingDescription = other.getPackagingDescription();
               if (this$packagingDescription == null) {
                  if (other$packagingDescription != null) {
                     return false;
                  }
               } else if (!this$packagingDescription.equals(other$packagingDescription)) {
                  return false;
               }

               Object this$goodsDescription = this.getGoodsDescription();
               Object other$goodsDescription = other.getGoodsDescription();
               if (this$goodsDescription == null) {
                  if (other$goodsDescription != null) {
                     return false;
                  }
               } else if (!this$goodsDescription.equals(other$goodsDescription)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ElectronicBillPackageInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $volume = this.getVolume();
         result = result * 59 + ($volume == null ? 43 : $volume.hashCode());
         Object $weight = this.getWeight();
         result = result * 59 + ($weight == null ? 43 : $weight.hashCode());
         Object $length = this.getLength();
         result = result * 59 + ($length == null ? 43 : $length.hashCode());
         Object $width = this.getWidth();
         result = result * 59 + ($width == null ? 43 : $width.hashCode());
         Object $height = this.getHeight();
         result = result * 59 + ($height == null ? 43 : $height.hashCode());
         Object $totalPackagesCount = this.getTotalPackagesCount();
         result = result * 59 + ($totalPackagesCount == null ? 43 : $totalPackagesCount.hashCode());
         Object $goodValue = this.getGoodValue();
         result = result * 59 + ($goodValue == null ? 43 : $goodValue.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $items = this.getItems();
         result = result * 59 + ($items == null ? 43 : $items.hashCode());
         Object $packagingDescription = this.getPackagingDescription();
         result = result * 59 + ($packagingDescription == null ? 43 : $packagingDescription.hashCode());
         Object $goodsDescription = this.getGoodsDescription();
         result = result * 59 + ($goodsDescription == null ? 43 : $goodsDescription.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillOrdersCreateRequest.ElectronicBillPackageInfo(id=" + this.getId() + ", items=" + this.getItems() + ", volume=" + this.getVolume() + ", weight=" + this.getWeight() + ", length=" + this.getLength() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", totalPackagesCount=" + this.getTotalPackagesCount() + ", packagingDescription=" + this.getPackagingDescription() + ", goodsDescription=" + this.getGoodsDescription() + ", goodValue=" + this.getGoodValue() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.order.Response;

import java.util.List;

public class GetKosDataResponse {
   public long count;
   public List<KosData> data;

   public long getCount() {
      return this.count;
   }

   public List<KosData> getData() {
      return this.data;
   }

   public void setCount(long count) {
      this.count = count;
   }

   public void setData(List<KosData> data) {
      this.data = data;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetKosDataResponse)) {
         return false;
      } else {
         GetKosDataResponse other = (GetKosDataResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCount() != other.getCount()) {
            return false;
         } else {
            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetKosDataResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $count = this.getCount();
      result = result * 59 + (int)($count >>> 32 ^ $count);
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      return result;
   }

   public String toString() {
      return "GetKosDataResponse(count=" + this.getCount() + ", data=" + this.getData() + ")";
   }

   public static class KosData {
      public String packageId;
      public String skuId;
      public String skuName;
      public String itemId;
      public String itemName;
      public String payDate;
      public String accountUserId;
      public String accountUserName;
      public String accountType;
      public String newCarrierNameGroup;
      public String entranceChannel;
      public String carrierId;
      public String carrierName;
      public String carrierCreateTime;
      public int goodsTotal;
      public double payGmv;

      public String getPackageId() {
         return this.packageId;
      }

      public String getSkuId() {
         return this.skuId;
      }

      public String getSkuName() {
         return this.skuName;
      }

      public String getItemId() {
         return this.itemId;
      }

      public String getItemName() {
         return this.itemName;
      }

      public String getPayDate() {
         return this.payDate;
      }

      public String getAccountUserId() {
         return this.accountUserId;
      }

      public String getAccountUserName() {
         return this.accountUserName;
      }

      public String getAccountType() {
         return this.accountType;
      }

      public String getNewCarrierNameGroup() {
         return this.newCarrierNameGroup;
      }

      public String getEntranceChannel() {
         return this.entranceChannel;
      }

      public String getCarrierId() {
         return this.carrierId;
      }

      public String getCarrierName() {
         return this.carrierName;
      }

      public String getCarrierCreateTime() {
         return this.carrierCreateTime;
      }

      public int getGoodsTotal() {
         return this.goodsTotal;
      }

      public double getPayGmv() {
         return this.payGmv;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
      }

      public void setSkuName(String skuName) {
         this.skuName = skuName;
      }

      public void setItemId(String itemId) {
         this.itemId = itemId;
      }

      public void setItemName(String itemName) {
         this.itemName = itemName;
      }

      public void setPayDate(String payDate) {
         this.payDate = payDate;
      }

      public void setAccountUserId(String accountUserId) {
         this.accountUserId = accountUserId;
      }

      public void setAccountUserName(String accountUserName) {
         this.accountUserName = accountUserName;
      }

      public void setAccountType(String accountType) {
         this.accountType = accountType;
      }

      public void setNewCarrierNameGroup(String newCarrierNameGroup) {
         this.newCarrierNameGroup = newCarrierNameGroup;
      }

      public void setEntranceChannel(String entranceChannel) {
         this.entranceChannel = entranceChannel;
      }

      public void setCarrierId(String carrierId) {
         this.carrierId = carrierId;
      }

      public void setCarrierName(String carrierName) {
         this.carrierName = carrierName;
      }

      public void setCarrierCreateTime(String carrierCreateTime) {
         this.carrierCreateTime = carrierCreateTime;
      }

      public void setGoodsTotal(int goodsTotal) {
         this.goodsTotal = goodsTotal;
      }

      public void setPayGmv(double payGmv) {
         this.payGmv = payGmv;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof KosData)) {
            return false;
         } else {
            KosData other = (KosData)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getGoodsTotal() != other.getGoodsTotal()) {
               return false;
            } else if (Double.compare(this.getPayGmv(), other.getPayGmv()) != 0) {
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

               Object this$payDate = this.getPayDate();
               Object other$payDate = other.getPayDate();
               if (this$payDate == null) {
                  if (other$payDate != null) {
                     return false;
                  }
               } else if (!this$payDate.equals(other$payDate)) {
                  return false;
               }

               Object this$accountUserId = this.getAccountUserId();
               Object other$accountUserId = other.getAccountUserId();
               if (this$accountUserId == null) {
                  if (other$accountUserId != null) {
                     return false;
                  }
               } else if (!this$accountUserId.equals(other$accountUserId)) {
                  return false;
               }

               Object this$accountUserName = this.getAccountUserName();
               Object other$accountUserName = other.getAccountUserName();
               if (this$accountUserName == null) {
                  if (other$accountUserName != null) {
                     return false;
                  }
               } else if (!this$accountUserName.equals(other$accountUserName)) {
                  return false;
               }

               Object this$accountType = this.getAccountType();
               Object other$accountType = other.getAccountType();
               if (this$accountType == null) {
                  if (other$accountType != null) {
                     return false;
                  }
               } else if (!this$accountType.equals(other$accountType)) {
                  return false;
               }

               Object this$newCarrierNameGroup = this.getNewCarrierNameGroup();
               Object other$newCarrierNameGroup = other.getNewCarrierNameGroup();
               if (this$newCarrierNameGroup == null) {
                  if (other$newCarrierNameGroup != null) {
                     return false;
                  }
               } else if (!this$newCarrierNameGroup.equals(other$newCarrierNameGroup)) {
                  return false;
               }

               Object this$entranceChannel = this.getEntranceChannel();
               Object other$entranceChannel = other.getEntranceChannel();
               if (this$entranceChannel == null) {
                  if (other$entranceChannel != null) {
                     return false;
                  }
               } else if (!this$entranceChannel.equals(other$entranceChannel)) {
                  return false;
               }

               Object this$carrierId = this.getCarrierId();
               Object other$carrierId = other.getCarrierId();
               if (this$carrierId == null) {
                  if (other$carrierId != null) {
                     return false;
                  }
               } else if (!this$carrierId.equals(other$carrierId)) {
                  return false;
               }

               Object this$carrierName = this.getCarrierName();
               Object other$carrierName = other.getCarrierName();
               if (this$carrierName == null) {
                  if (other$carrierName != null) {
                     return false;
                  }
               } else if (!this$carrierName.equals(other$carrierName)) {
                  return false;
               }

               Object this$carrierCreateTime = this.getCarrierCreateTime();
               Object other$carrierCreateTime = other.getCarrierCreateTime();
               if (this$carrierCreateTime == null) {
                  if (other$carrierCreateTime != null) {
                     return false;
                  }
               } else if (!this$carrierCreateTime.equals(other$carrierCreateTime)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof KosData;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getGoodsTotal();
         long $payGmv = Double.doubleToLongBits(this.getPayGmv());
         result = result * 59 + (int)($payGmv >>> 32 ^ $payGmv);
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $skuName = this.getSkuName();
         result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
         Object $itemId = this.getItemId();
         result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
         Object $itemName = this.getItemName();
         result = result * 59 + ($itemName == null ? 43 : $itemName.hashCode());
         Object $payDate = this.getPayDate();
         result = result * 59 + ($payDate == null ? 43 : $payDate.hashCode());
         Object $accountUserId = this.getAccountUserId();
         result = result * 59 + ($accountUserId == null ? 43 : $accountUserId.hashCode());
         Object $accountUserName = this.getAccountUserName();
         result = result * 59 + ($accountUserName == null ? 43 : $accountUserName.hashCode());
         Object $accountType = this.getAccountType();
         result = result * 59 + ($accountType == null ? 43 : $accountType.hashCode());
         Object $newCarrierNameGroup = this.getNewCarrierNameGroup();
         result = result * 59 + ($newCarrierNameGroup == null ? 43 : $newCarrierNameGroup.hashCode());
         Object $entranceChannel = this.getEntranceChannel();
         result = result * 59 + ($entranceChannel == null ? 43 : $entranceChannel.hashCode());
         Object $carrierId = this.getCarrierId();
         result = result * 59 + ($carrierId == null ? 43 : $carrierId.hashCode());
         Object $carrierName = this.getCarrierName();
         result = result * 59 + ($carrierName == null ? 43 : $carrierName.hashCode());
         Object $carrierCreateTime = this.getCarrierCreateTime();
         result = result * 59 + ($carrierCreateTime == null ? 43 : $carrierCreateTime.hashCode());
         return result;
      }

      public String toString() {
         return "GetKosDataResponse.KosData(packageId=" + this.getPackageId() + ", skuId=" + this.getSkuId() + ", skuName=" + this.getSkuName() + ", itemId=" + this.getItemId() + ", itemName=" + this.getItemName() + ", payDate=" + this.getPayDate() + ", accountUserId=" + this.getAccountUserId() + ", accountUserName=" + this.getAccountUserName() + ", accountType=" + this.getAccountType() + ", newCarrierNameGroup=" + this.getNewCarrierNameGroup() + ", entranceChannel=" + this.getEntranceChannel() + ", carrierId=" + this.getCarrierId() + ", carrierName=" + this.getCarrierName() + ", carrierCreateTime=" + this.getCarrierCreateTime() + ", goodsTotal=" + this.getGoodsTotal() + ", payGmv=" + this.getPayGmv() + ")";
      }
   }
}

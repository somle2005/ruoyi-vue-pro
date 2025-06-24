package com.xiaohongshu.fls.opensdk.entity.finance.response;

import com.xiaohongshu.fls.opensdk.entity.finance.SettleStatus;
import java.util.ArrayList;
import java.util.List;

public class QueryCpsSettleResponse {
   public List<CpsUserSettleDetail> cpsUserSettleDetails = new ArrayList();

   public List<CpsUserSettleDetail> getCpsUserSettleDetails() {
      return this.cpsUserSettleDetails;
   }

   public void setCpsUserSettleDetails(List<CpsUserSettleDetail> cpsUserSettleDetails) {
      this.cpsUserSettleDetails = cpsUserSettleDetails;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QueryCpsSettleResponse)) {
         return false;
      } else {
         QueryCpsSettleResponse other = (QueryCpsSettleResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$cpsUserSettleDetails = this.getCpsUserSettleDetails();
            Object other$cpsUserSettleDetails = other.getCpsUserSettleDetails();
            if (this$cpsUserSettleDetails == null) {
               if (other$cpsUserSettleDetails != null) {
                  return false;
               }
            } else if (!this$cpsUserSettleDetails.equals(other$cpsUserSettleDetails)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QueryCpsSettleResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $cpsUserSettleDetails = this.getCpsUserSettleDetails();
      result = result * 59 + ($cpsUserSettleDetails == null ? 43 : $cpsUserSettleDetails.hashCode());
      return result;
   }

   public String toString() {
      return "QueryCpsSettleResponse(cpsUserSettleDetails=" + this.getCpsUserSettleDetails() + ")";
   }

   public static class CpsUserSettleDetail {
      public String packageId;
      public List<String> returnIds;
      public String goodsId;
      public String goodsName;
      public int goodsTotal;
      public String sellerId;
      public String kolUserId;
      public String kolUserName;
      public long dealTotalAmount;
      public long returnTotalAmount;
      public long taxTotalAmount;
      public long carryingTotalAmount;
      public long sellerRate;
      public long kolUserShareRatio;
      public long kolUserRate;
      public long kolUserCommissionAmount;
      public SettleStatus settleStatus;
      public long orderTime;
      public long finishTime;
      public long canSettleTime;
      public long settleTime;

      public String getPackageId() {
         return this.packageId;
      }

      public List<String> getReturnIds() {
         return this.returnIds;
      }

      public String getGoodsId() {
         return this.goodsId;
      }

      public String getGoodsName() {
         return this.goodsName;
      }

      public int getGoodsTotal() {
         return this.goodsTotal;
      }

      public String getSellerId() {
         return this.sellerId;
      }

      public String getKolUserId() {
         return this.kolUserId;
      }

      public String getKolUserName() {
         return this.kolUserName;
      }

      public long getDealTotalAmount() {
         return this.dealTotalAmount;
      }

      public long getReturnTotalAmount() {
         return this.returnTotalAmount;
      }

      public long getTaxTotalAmount() {
         return this.taxTotalAmount;
      }

      public long getCarryingTotalAmount() {
         return this.carryingTotalAmount;
      }

      public long getSellerRate() {
         return this.sellerRate;
      }

      public long getKolUserShareRatio() {
         return this.kolUserShareRatio;
      }

      public long getKolUserRate() {
         return this.kolUserRate;
      }

      public long getKolUserCommissionAmount() {
         return this.kolUserCommissionAmount;
      }

      public SettleStatus getSettleStatus() {
         return this.settleStatus;
      }

      public long getOrderTime() {
         return this.orderTime;
      }

      public long getFinishTime() {
         return this.finishTime;
      }

      public long getCanSettleTime() {
         return this.canSettleTime;
      }

      public long getSettleTime() {
         return this.settleTime;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setReturnIds(List<String> returnIds) {
         this.returnIds = returnIds;
      }

      public void setGoodsId(String goodsId) {
         this.goodsId = goodsId;
      }

      public void setGoodsName(String goodsName) {
         this.goodsName = goodsName;
      }

      public void setGoodsTotal(int goodsTotal) {
         this.goodsTotal = goodsTotal;
      }

      public void setSellerId(String sellerId) {
         this.sellerId = sellerId;
      }

      public void setKolUserId(String kolUserId) {
         this.kolUserId = kolUserId;
      }

      public void setKolUserName(String kolUserName) {
         this.kolUserName = kolUserName;
      }

      public void setDealTotalAmount(long dealTotalAmount) {
         this.dealTotalAmount = dealTotalAmount;
      }

      public void setReturnTotalAmount(long returnTotalAmount) {
         this.returnTotalAmount = returnTotalAmount;
      }

      public void setTaxTotalAmount(long taxTotalAmount) {
         this.taxTotalAmount = taxTotalAmount;
      }

      public void setCarryingTotalAmount(long carryingTotalAmount) {
         this.carryingTotalAmount = carryingTotalAmount;
      }

      public void setSellerRate(long sellerRate) {
         this.sellerRate = sellerRate;
      }

      public void setKolUserShareRatio(long kolUserShareRatio) {
         this.kolUserShareRatio = kolUserShareRatio;
      }

      public void setKolUserRate(long kolUserRate) {
         this.kolUserRate = kolUserRate;
      }

      public void setKolUserCommissionAmount(long kolUserCommissionAmount) {
         this.kolUserCommissionAmount = kolUserCommissionAmount;
      }

      public void setSettleStatus(SettleStatus settleStatus) {
         this.settleStatus = settleStatus;
      }

      public void setOrderTime(long orderTime) {
         this.orderTime = orderTime;
      }

      public void setFinishTime(long finishTime) {
         this.finishTime = finishTime;
      }

      public void setCanSettleTime(long canSettleTime) {
         this.canSettleTime = canSettleTime;
      }

      public void setSettleTime(long settleTime) {
         this.settleTime = settleTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof CpsUserSettleDetail)) {
            return false;
         } else {
            CpsUserSettleDetail other = (CpsUserSettleDetail)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getGoodsTotal() != other.getGoodsTotal()) {
               return false;
            } else if (this.getDealTotalAmount() != other.getDealTotalAmount()) {
               return false;
            } else if (this.getReturnTotalAmount() != other.getReturnTotalAmount()) {
               return false;
            } else if (this.getTaxTotalAmount() != other.getTaxTotalAmount()) {
               return false;
            } else if (this.getCarryingTotalAmount() != other.getCarryingTotalAmount()) {
               return false;
            } else if (this.getSellerRate() != other.getSellerRate()) {
               return false;
            } else if (this.getKolUserShareRatio() != other.getKolUserShareRatio()) {
               return false;
            } else if (this.getKolUserRate() != other.getKolUserRate()) {
               return false;
            } else if (this.getKolUserCommissionAmount() != other.getKolUserCommissionAmount()) {
               return false;
            } else if (this.getOrderTime() != other.getOrderTime()) {
               return false;
            } else if (this.getFinishTime() != other.getFinishTime()) {
               return false;
            } else if (this.getCanSettleTime() != other.getCanSettleTime()) {
               return false;
            } else if (this.getSettleTime() != other.getSettleTime()) {
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

               Object this$returnIds = this.getReturnIds();
               Object other$returnIds = other.getReturnIds();
               if (this$returnIds == null) {
                  if (other$returnIds != null) {
                     return false;
                  }
               } else if (!this$returnIds.equals(other$returnIds)) {
                  return false;
               }

               Object this$goodsId = this.getGoodsId();
               Object other$goodsId = other.getGoodsId();
               if (this$goodsId == null) {
                  if (other$goodsId != null) {
                     return false;
                  }
               } else if (!this$goodsId.equals(other$goodsId)) {
                  return false;
               }

               Object this$goodsName = this.getGoodsName();
               Object other$goodsName = other.getGoodsName();
               if (this$goodsName == null) {
                  if (other$goodsName != null) {
                     return false;
                  }
               } else if (!this$goodsName.equals(other$goodsName)) {
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

               Object this$kolUserId = this.getKolUserId();
               Object other$kolUserId = other.getKolUserId();
               if (this$kolUserId == null) {
                  if (other$kolUserId != null) {
                     return false;
                  }
               } else if (!this$kolUserId.equals(other$kolUserId)) {
                  return false;
               }

               Object this$kolUserName = this.getKolUserName();
               Object other$kolUserName = other.getKolUserName();
               if (this$kolUserName == null) {
                  if (other$kolUserName != null) {
                     return false;
                  }
               } else if (!this$kolUserName.equals(other$kolUserName)) {
                  return false;
               }

               Object this$settleStatus = this.getSettleStatus();
               Object other$settleStatus = other.getSettleStatus();
               if (this$settleStatus == null) {
                  if (other$settleStatus != null) {
                     return false;
                  }
               } else if (!this$settleStatus.equals(other$settleStatus)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof CpsUserSettleDetail;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getGoodsTotal();
         long $dealTotalAmount = this.getDealTotalAmount();
         result = result * 59 + (int)($dealTotalAmount >>> 32 ^ $dealTotalAmount);
         long $returnTotalAmount = this.getReturnTotalAmount();
         result = result * 59 + (int)($returnTotalAmount >>> 32 ^ $returnTotalAmount);
         long $taxTotalAmount = this.getTaxTotalAmount();
         result = result * 59 + (int)($taxTotalAmount >>> 32 ^ $taxTotalAmount);
         long $carryingTotalAmount = this.getCarryingTotalAmount();
         result = result * 59 + (int)($carryingTotalAmount >>> 32 ^ $carryingTotalAmount);
         long $sellerRate = this.getSellerRate();
         result = result * 59 + (int)($sellerRate >>> 32 ^ $sellerRate);
         long $kolUserShareRatio = this.getKolUserShareRatio();
         result = result * 59 + (int)($kolUserShareRatio >>> 32 ^ $kolUserShareRatio);
         long $kolUserRate = this.getKolUserRate();
         result = result * 59 + (int)($kolUserRate >>> 32 ^ $kolUserRate);
         long $kolUserCommissionAmount = this.getKolUserCommissionAmount();
         result = result * 59 + (int)($kolUserCommissionAmount >>> 32 ^ $kolUserCommissionAmount);
         long $orderTime = this.getOrderTime();
         result = result * 59 + (int)($orderTime >>> 32 ^ $orderTime);
         long $finishTime = this.getFinishTime();
         result = result * 59 + (int)($finishTime >>> 32 ^ $finishTime);
         long $canSettleTime = this.getCanSettleTime();
         result = result * 59 + (int)($canSettleTime >>> 32 ^ $canSettleTime);
         long $settleTime = this.getSettleTime();
         result = result * 59 + (int)($settleTime >>> 32 ^ $settleTime);
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $returnIds = this.getReturnIds();
         result = result * 59 + ($returnIds == null ? 43 : $returnIds.hashCode());
         Object $goodsId = this.getGoodsId();
         result = result * 59 + ($goodsId == null ? 43 : $goodsId.hashCode());
         Object $goodsName = this.getGoodsName();
         result = result * 59 + ($goodsName == null ? 43 : $goodsName.hashCode());
         Object $sellerId = this.getSellerId();
         result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
         Object $kolUserId = this.getKolUserId();
         result = result * 59 + ($kolUserId == null ? 43 : $kolUserId.hashCode());
         Object $kolUserName = this.getKolUserName();
         result = result * 59 + ($kolUserName == null ? 43 : $kolUserName.hashCode());
         Object $settleStatus = this.getSettleStatus();
         result = result * 59 + ($settleStatus == null ? 43 : $settleStatus.hashCode());
         return result;
      }

      public String toString() {
         return "QueryCpsSettleResponse.CpsUserSettleDetail(packageId=" + this.getPackageId() + ", returnIds=" + this.getReturnIds() + ", goodsId=" + this.getGoodsId() + ", goodsName=" + this.getGoodsName() + ", goodsTotal=" + this.getGoodsTotal() + ", sellerId=" + this.getSellerId() + ", kolUserId=" + this.getKolUserId() + ", kolUserName=" + this.getKolUserName() + ", dealTotalAmount=" + this.getDealTotalAmount() + ", returnTotalAmount=" + this.getReturnTotalAmount() + ", taxTotalAmount=" + this.getTaxTotalAmount() + ", carryingTotalAmount=" + this.getCarryingTotalAmount() + ", sellerRate=" + this.getSellerRate() + ", kolUserShareRatio=" + this.getKolUserShareRatio() + ", kolUserRate=" + this.getKolUserRate() + ", kolUserCommissionAmount=" + this.getKolUserCommissionAmount() + ", settleStatus=" + this.getSettleStatus() + ", orderTime=" + this.getOrderTime() + ", finishTime=" + this.getFinishTime() + ", canSettleTime=" + this.getCanSettleTime() + ", settleTime=" + this.getSettleTime() + ")";
      }
   }
}

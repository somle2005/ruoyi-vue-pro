package com.xiaohongshu.fls.opensdk.entity.boutique.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.CompensationType;
import com.xiaohongshu.fls.opensdk.entity.boutique.VendorType;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateItemRequest;
import java.util.List;

public class UpdateBoutiqueItemRequest extends BaseRequest {
   public String itemId;
   public BoutiqueItemBatchInfo boutiqueItemBatchInfo;
   public String boutiqueBatchId;
   public String identityId;
   public boolean withItemDetail;
   public Integer freeReturn;
   public String skucode;
   public String whcode;
   public long qty;
   public StockOperateInfo operateInfo;

   public String getItemId() {
      return this.itemId;
   }

   public BoutiqueItemBatchInfo getBoutiqueItemBatchInfo() {
      return this.boutiqueItemBatchInfo;
   }

   public String getBoutiqueBatchId() {
      return this.boutiqueBatchId;
   }

   public String getIdentityId() {
      return this.identityId;
   }

   public boolean isWithItemDetail() {
      return this.withItemDetail;
   }

   public Integer getFreeReturn() {
      return this.freeReturn;
   }

   public String getSkucode() {
      return this.skucode;
   }

   public String getWhcode() {
      return this.whcode;
   }

   public long getQty() {
      return this.qty;
   }

   public StockOperateInfo getOperateInfo() {
      return this.operateInfo;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setBoutiqueItemBatchInfo(BoutiqueItemBatchInfo boutiqueItemBatchInfo) {
      this.boutiqueItemBatchInfo = boutiqueItemBatchInfo;
   }

   public void setBoutiqueBatchId(String boutiqueBatchId) {
      this.boutiqueBatchId = boutiqueBatchId;
   }

   public void setIdentityId(String identityId) {
      this.identityId = identityId;
   }

   public void setWithItemDetail(boolean withItemDetail) {
      this.withItemDetail = withItemDetail;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public void setSkucode(String skucode) {
      this.skucode = skucode;
   }

   public void setWhcode(String whcode) {
      this.whcode = whcode;
   }

   public void setQty(long qty) {
      this.qty = qty;
   }

   public void setOperateInfo(StockOperateInfo operateInfo) {
      this.operateInfo = operateInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateBoutiqueItemRequest)) {
         return false;
      } else {
         UpdateBoutiqueItemRequest other = (UpdateBoutiqueItemRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isWithItemDetail() != other.isWithItemDetail()) {
            return false;
         } else if (this.getQty() != other.getQty()) {
            return false;
         } else {
            Object this$freeReturn = this.getFreeReturn();
            Object other$freeReturn = other.getFreeReturn();
            if (this$freeReturn == null) {
               if (other$freeReturn != null) {
                  return false;
               }
            } else if (!this$freeReturn.equals(other$freeReturn)) {
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

            Object this$boutiqueItemBatchInfo = this.getBoutiqueItemBatchInfo();
            Object other$boutiqueItemBatchInfo = other.getBoutiqueItemBatchInfo();
            if (this$boutiqueItemBatchInfo == null) {
               if (other$boutiqueItemBatchInfo != null) {
                  return false;
               }
            } else if (!this$boutiqueItemBatchInfo.equals(other$boutiqueItemBatchInfo)) {
               return false;
            }

            Object this$boutiqueBatchId = this.getBoutiqueBatchId();
            Object other$boutiqueBatchId = other.getBoutiqueBatchId();
            if (this$boutiqueBatchId == null) {
               if (other$boutiqueBatchId != null) {
                  return false;
               }
            } else if (!this$boutiqueBatchId.equals(other$boutiqueBatchId)) {
               return false;
            }

            Object this$identityId = this.getIdentityId();
            Object other$identityId = other.getIdentityId();
            if (this$identityId == null) {
               if (other$identityId != null) {
                  return false;
               }
            } else if (!this$identityId.equals(other$identityId)) {
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

            Object this$whcode = this.getWhcode();
            Object other$whcode = other.getWhcode();
            if (this$whcode == null) {
               if (other$whcode != null) {
                  return false;
               }
            } else if (!this$whcode.equals(other$whcode)) {
               return false;
            }

            Object this$operateInfo = this.getOperateInfo();
            Object other$operateInfo = other.getOperateInfo();
            if (this$operateInfo == null) {
               if (other$operateInfo != null) {
                  return false;
               }
            } else if (!this$operateInfo.equals(other$operateInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateBoutiqueItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isWithItemDetail() ? 79 : 97);
      long $qty = this.getQty();
      result = result * 59 + (int)($qty >>> 32 ^ $qty);
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
      Object $boutiqueItemBatchInfo = this.getBoutiqueItemBatchInfo();
      result = result * 59 + ($boutiqueItemBatchInfo == null ? 43 : $boutiqueItemBatchInfo.hashCode());
      Object $boutiqueBatchId = this.getBoutiqueBatchId();
      result = result * 59 + ($boutiqueBatchId == null ? 43 : $boutiqueBatchId.hashCode());
      Object $identityId = this.getIdentityId();
      result = result * 59 + ($identityId == null ? 43 : $identityId.hashCode());
      Object $skucode = this.getSkucode();
      result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
      Object $whcode = this.getWhcode();
      result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
      Object $operateInfo = this.getOperateInfo();
      result = result * 59 + ($operateInfo == null ? 43 : $operateInfo.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateBoutiqueItemRequest(itemId=" + this.getItemId() + ", boutiqueItemBatchInfo=" + this.getBoutiqueItemBatchInfo() + ", boutiqueBatchId=" + this.getBoutiqueBatchId() + ", identityId=" + this.getIdentityId() + ", withItemDetail=" + this.isWithItemDetail() + ", freeReturn=" + this.getFreeReturn() + ", skucode=" + this.getSkucode() + ", whcode=" + this.getWhcode() + ", qty=" + this.getQty() + ", operateInfo=" + this.getOperateInfo() + ")";
   }

   public static class BoutiqueItemBatchInfo {
      public VendorInfo vendorInfo;
      public PriceTax priceTax;

      public VendorInfo getVendorInfo() {
         return this.vendorInfo;
      }

      public PriceTax getPriceTax() {
         return this.priceTax;
      }

      public void setVendorInfo(VendorInfo vendorInfo) {
         this.vendorInfo = vendorInfo;
      }

      public void setPriceTax(PriceTax priceTax) {
         this.priceTax = priceTax;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof BoutiqueItemBatchInfo)) {
            return false;
         } else {
            BoutiqueItemBatchInfo other = (BoutiqueItemBatchInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$vendorInfo = this.getVendorInfo();
               Object other$vendorInfo = other.getVendorInfo();
               if (this$vendorInfo == null) {
                  if (other$vendorInfo != null) {
                     return false;
                  }
               } else if (!this$vendorInfo.equals(other$vendorInfo)) {
                  return false;
               }

               Object this$priceTax = this.getPriceTax();
               Object other$priceTax = other.getPriceTax();
               if (this$priceTax == null) {
                  if (other$priceTax != null) {
                     return false;
                  }
               } else if (!this$priceTax.equals(other$priceTax)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof BoutiqueItemBatchInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $vendorInfo = this.getVendorInfo();
         result = result * 59 + ($vendorInfo == null ? 43 : $vendorInfo.hashCode());
         Object $priceTax = this.getPriceTax();
         result = result * 59 + ($priceTax == null ? 43 : $priceTax.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.BoutiqueItemBatchInfo(vendorInfo=" + this.getVendorInfo() + ", priceTax=" + this.getPriceTax() + ")";
      }
   }

   public static class VendorInfo {
      public String vendorCode;
      public VendorType vendorType;
      public String placeOfSupply;
      public TimeOfDelivery timeOfDelivery;
      public List<Compensation> compensation;
      public boolean separate;
      public CreateItemRequest.DeliveryTimeV3 deliveryTime;

      public String getVendorCode() {
         return this.vendorCode;
      }

      public VendorType getVendorType() {
         return this.vendorType;
      }

      public String getPlaceOfSupply() {
         return this.placeOfSupply;
      }

      public TimeOfDelivery getTimeOfDelivery() {
         return this.timeOfDelivery;
      }

      public List<Compensation> getCompensation() {
         return this.compensation;
      }

      public boolean isSeparate() {
         return this.separate;
      }

      public CreateItemRequest.DeliveryTimeV3 getDeliveryTime() {
         return this.deliveryTime;
      }

      public void setVendorCode(String vendorCode) {
         this.vendorCode = vendorCode;
      }

      public void setVendorType(VendorType vendorType) {
         this.vendorType = vendorType;
      }

      public void setPlaceOfSupply(String placeOfSupply) {
         this.placeOfSupply = placeOfSupply;
      }

      public void setTimeOfDelivery(TimeOfDelivery timeOfDelivery) {
         this.timeOfDelivery = timeOfDelivery;
      }

      public void setCompensation(List<Compensation> compensation) {
         this.compensation = compensation;
      }

      public void setSeparate(boolean separate) {
         this.separate = separate;
      }

      public void setDeliveryTime(CreateItemRequest.DeliveryTimeV3 deliveryTime) {
         this.deliveryTime = deliveryTime;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof VendorInfo)) {
            return false;
         } else {
            VendorInfo other = (VendorInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.isSeparate() != other.isSeparate()) {
               return false;
            } else {
               Object this$vendorCode = this.getVendorCode();
               Object other$vendorCode = other.getVendorCode();
               if (this$vendorCode == null) {
                  if (other$vendorCode != null) {
                     return false;
                  }
               } else if (!this$vendorCode.equals(other$vendorCode)) {
                  return false;
               }

               Object this$vendorType = this.getVendorType();
               Object other$vendorType = other.getVendorType();
               if (this$vendorType == null) {
                  if (other$vendorType != null) {
                     return false;
                  }
               } else if (!this$vendorType.equals(other$vendorType)) {
                  return false;
               }

               Object this$placeOfSupply = this.getPlaceOfSupply();
               Object other$placeOfSupply = other.getPlaceOfSupply();
               if (this$placeOfSupply == null) {
                  if (other$placeOfSupply != null) {
                     return false;
                  }
               } else if (!this$placeOfSupply.equals(other$placeOfSupply)) {
                  return false;
               }

               Object this$timeOfDelivery = this.getTimeOfDelivery();
               Object other$timeOfDelivery = other.getTimeOfDelivery();
               if (this$timeOfDelivery == null) {
                  if (other$timeOfDelivery != null) {
                     return false;
                  }
               } else if (!this$timeOfDelivery.equals(other$timeOfDelivery)) {
                  return false;
               }

               Object this$compensation = this.getCompensation();
               Object other$compensation = other.getCompensation();
               if (this$compensation == null) {
                  if (other$compensation != null) {
                     return false;
                  }
               } else if (!this$compensation.equals(other$compensation)) {
                  return false;
               }

               Object this$deliveryTime = this.getDeliveryTime();
               Object other$deliveryTime = other.getDeliveryTime();
               if (this$deliveryTime == null) {
                  if (other$deliveryTime != null) {
                     return false;
                  }
               } else if (!this$deliveryTime.equals(other$deliveryTime)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof VendorInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + (this.isSeparate() ? 79 : 97);
         Object $vendorCode = this.getVendorCode();
         result = result * 59 + ($vendorCode == null ? 43 : $vendorCode.hashCode());
         Object $vendorType = this.getVendorType();
         result = result * 59 + ($vendorType == null ? 43 : $vendorType.hashCode());
         Object $placeOfSupply = this.getPlaceOfSupply();
         result = result * 59 + ($placeOfSupply == null ? 43 : $placeOfSupply.hashCode());
         Object $timeOfDelivery = this.getTimeOfDelivery();
         result = result * 59 + ($timeOfDelivery == null ? 43 : $timeOfDelivery.hashCode());
         Object $compensation = this.getCompensation();
         result = result * 59 + ($compensation == null ? 43 : $compensation.hashCode());
         Object $deliveryTime = this.getDeliveryTime();
         result = result * 59 + ($deliveryTime == null ? 43 : $deliveryTime.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.VendorInfo(vendorCode=" + this.getVendorCode() + ", vendorType=" + this.getVendorType() + ", placeOfSupply=" + this.getPlaceOfSupply() + ", timeOfDelivery=" + this.getTimeOfDelivery() + ", compensation=" + this.getCompensation() + ", separate=" + this.isSeparate() + ", deliveryTime=" + this.getDeliveryTime() + ")";
      }
   }

   public static class PriceTax {
      public double preTax;
      public double postTax;
      public double taxRate;
      public double tax;

      public double getPreTax() {
         return this.preTax;
      }

      public double getPostTax() {
         return this.postTax;
      }

      public double getTaxRate() {
         return this.taxRate;
      }

      public double getTax() {
         return this.tax;
      }

      public void setPreTax(double preTax) {
         this.preTax = preTax;
      }

      public void setPostTax(double postTax) {
         this.postTax = postTax;
      }

      public void setTaxRate(double taxRate) {
         this.taxRate = taxRate;
      }

      public void setTax(double tax) {
         this.tax = tax;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PriceTax)) {
            return false;
         } else {
            PriceTax other = (PriceTax)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getPreTax(), other.getPreTax()) != 0) {
               return false;
            } else if (Double.compare(this.getPostTax(), other.getPostTax()) != 0) {
               return false;
            } else if (Double.compare(this.getTaxRate(), other.getTaxRate()) != 0) {
               return false;
            } else {
               return Double.compare(this.getTax(), other.getTax()) == 0;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PriceTax;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $preTax = Double.doubleToLongBits(this.getPreTax());
         result = result * 59 + (int)($preTax >>> 32 ^ $preTax);
         long $postTax = Double.doubleToLongBits(this.getPostTax());
         result = result * 59 + (int)($postTax >>> 32 ^ $postTax);
         long $taxRate = Double.doubleToLongBits(this.getTaxRate());
         result = result * 59 + (int)($taxRate >>> 32 ^ $taxRate);
         long $tax = Double.doubleToLongBits(this.getTax());
         result = result * 59 + (int)($tax >>> 32 ^ $tax);
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.PriceTax(preTax=" + this.getPreTax() + ", postTax=" + this.getPostTax() + ", taxRate=" + this.getTaxRate() + ", tax=" + this.getTax() + ")";
      }
   }

   public static class TimeOfDelivery {
      public int min;
      public int max;
      public String unit;

      public int getMin() {
         return this.min;
      }

      public int getMax() {
         return this.max;
      }

      public String getUnit() {
         return this.unit;
      }

      public void setMin(int min) {
         this.min = min;
      }

      public void setMax(int max) {
         this.max = max;
      }

      public void setUnit(String unit) {
         this.unit = unit;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof TimeOfDelivery)) {
            return false;
         } else {
            TimeOfDelivery other = (TimeOfDelivery)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getMin() != other.getMin()) {
               return false;
            } else if (this.getMax() != other.getMax()) {
               return false;
            } else {
               Object this$unit = this.getUnit();
               Object other$unit = other.getUnit();
               if (this$unit == null) {
                  if (other$unit != null) {
                     return false;
                  }
               } else if (!this$unit.equals(other$unit)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof TimeOfDelivery;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getMin();
         result = result * 59 + this.getMax();
         Object $unit = this.getUnit();
         result = result * 59 + ($unit == null ? 43 : $unit.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.TimeOfDelivery(min=" + this.getMin() + ", max=" + this.getMax() + ", unit=" + this.getUnit() + ")";
      }
   }

   public static class Compensation {
      public CompensationType type;
      public int value;

      public CompensationType getType() {
         return this.type;
      }

      public int getValue() {
         return this.value;
      }

      public void setType(CompensationType type) {
         this.type = type;
      }

      public void setValue(int value) {
         this.value = value;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Compensation)) {
            return false;
         } else {
            Compensation other = (Compensation)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getValue() != other.getValue()) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Compensation;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getValue();
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.Compensation(type=" + this.getType() + ", value=" + this.getValue() + ")";
      }
   }

   public static class StockOperateInfo {
      public int operationReason;
      public String subReason;
      public String referenceNo;
      public String operator;
      public String note;
      public String extra;
      public String operationSource;

      public int getOperationReason() {
         return this.operationReason;
      }

      public String getSubReason() {
         return this.subReason;
      }

      public String getReferenceNo() {
         return this.referenceNo;
      }

      public String getOperator() {
         return this.operator;
      }

      public String getNote() {
         return this.note;
      }

      public String getExtra() {
         return this.extra;
      }

      public String getOperationSource() {
         return this.operationSource;
      }

      public void setOperationReason(int operationReason) {
         this.operationReason = operationReason;
      }

      public void setSubReason(String subReason) {
         this.subReason = subReason;
      }

      public void setReferenceNo(String referenceNo) {
         this.referenceNo = referenceNo;
      }

      public void setOperator(String operator) {
         this.operator = operator;
      }

      public void setNote(String note) {
         this.note = note;
      }

      public void setExtra(String extra) {
         this.extra = extra;
      }

      public void setOperationSource(String operationSource) {
         this.operationSource = operationSource;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof StockOperateInfo)) {
            return false;
         } else {
            StockOperateInfo other = (StockOperateInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getOperationReason() != other.getOperationReason()) {
               return false;
            } else {
               Object this$subReason = this.getSubReason();
               Object other$subReason = other.getSubReason();
               if (this$subReason == null) {
                  if (other$subReason != null) {
                     return false;
                  }
               } else if (!this$subReason.equals(other$subReason)) {
                  return false;
               }

               Object this$referenceNo = this.getReferenceNo();
               Object other$referenceNo = other.getReferenceNo();
               if (this$referenceNo == null) {
                  if (other$referenceNo != null) {
                     return false;
                  }
               } else if (!this$referenceNo.equals(other$referenceNo)) {
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

               Object this$note = this.getNote();
               Object other$note = other.getNote();
               if (this$note == null) {
                  if (other$note != null) {
                     return false;
                  }
               } else if (!this$note.equals(other$note)) {
                  return false;
               }

               Object this$extra = this.getExtra();
               Object other$extra = other.getExtra();
               if (this$extra == null) {
                  if (other$extra != null) {
                     return false;
                  }
               } else if (!this$extra.equals(other$extra)) {
                  return false;
               }

               Object this$operationSource = this.getOperationSource();
               Object other$operationSource = other.getOperationSource();
               if (this$operationSource == null) {
                  if (other$operationSource != null) {
                     return false;
                  }
               } else if (!this$operationSource.equals(other$operationSource)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof StockOperateInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getOperationReason();
         Object $subReason = this.getSubReason();
         result = result * 59 + ($subReason == null ? 43 : $subReason.hashCode());
         Object $referenceNo = this.getReferenceNo();
         result = result * 59 + ($referenceNo == null ? 43 : $referenceNo.hashCode());
         Object $operator = this.getOperator();
         result = result * 59 + ($operator == null ? 43 : $operator.hashCode());
         Object $note = this.getNote();
         result = result * 59 + ($note == null ? 43 : $note.hashCode());
         Object $extra = this.getExtra();
         result = result * 59 + ($extra == null ? 43 : $extra.hashCode());
         Object $operationSource = this.getOperationSource();
         result = result * 59 + ($operationSource == null ? 43 : $operationSource.hashCode());
         return result;
      }

      public String toString() {
         return "UpdateBoutiqueItemRequest.StockOperateInfo(operationReason=" + this.getOperationReason() + ", subReason=" + this.getSubReason() + ", referenceNo=" + this.getReferenceNo() + ", operator=" + this.getOperator() + ", note=" + this.getNote() + ", extra=" + this.getExtra() + ", operationSource=" + this.getOperationSource() + ")";
      }
   }
}

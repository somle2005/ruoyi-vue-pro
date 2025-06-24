package com.xiaohongshu.fls.opensdk.entity.product;

import com.xiaohongshu.fls.opensdk.entity.boutique.BoutiqueMode;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateItemRequest;
import java.util.List;

public class ItemInfo {
   private String id;
   private String spuId;
   private Integer ipq;
   private Double originalPrice;
   private Double price;
   private Integer stock;
   private String logisticsPlanId;
   private Integer priceType;
   private String erpCode;
   private List<CreateItemRequest.VariantV3> variants;
   private CreateItemRequest.DeliveryTimeV3 deliveryTime;
   private String specImageUrl;
   private String barcode;
   private String originItemId;
   private BoutiqueMode boutiqueMode;
   public long createTime;
   public long updateTime;
   private String skucode;
   private String logisticsName;
   private String whCode;
   private boolean buyable;
   private List<UnionItemInfo> unionItemDetails;
   public String name;
   public Boolean isGift;
   public Integer freeReturn;

   public String getId() {
      return this.id;
   }

   public String getSpuId() {
      return this.spuId;
   }

   public Integer getIpq() {
      return this.ipq;
   }

   public Double getOriginalPrice() {
      return this.originalPrice;
   }

   public Double getPrice() {
      return this.price;
   }

   public Integer getStock() {
      return this.stock;
   }

   public String getLogisticsPlanId() {
      return this.logisticsPlanId;
   }

   public Integer getPriceType() {
      return this.priceType;
   }

   public String getErpCode() {
      return this.erpCode;
   }

   public List<CreateItemRequest.VariantV3> getVariants() {
      return this.variants;
   }

   public CreateItemRequest.DeliveryTimeV3 getDeliveryTime() {
      return this.deliveryTime;
   }

   public String getSpecImageUrl() {
      return this.specImageUrl;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public String getOriginItemId() {
      return this.originItemId;
   }

   public BoutiqueMode getBoutiqueMode() {
      return this.boutiqueMode;
   }

   public long getCreateTime() {
      return this.createTime;
   }

   public long getUpdateTime() {
      return this.updateTime;
   }

   public String getSkucode() {
      return this.skucode;
   }

   public String getLogisticsName() {
      return this.logisticsName;
   }

   public String getWhCode() {
      return this.whCode;
   }

   public boolean isBuyable() {
      return this.buyable;
   }

   public List<UnionItemInfo> getUnionItemDetails() {
      return this.unionItemDetails;
   }

   public String getName() {
      return this.name;
   }

   public Boolean getIsGift() {
      return this.isGift;
   }

   public Integer getFreeReturn() {
      return this.freeReturn;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setSpuId(String spuId) {
      this.spuId = spuId;
   }

   public void setIpq(Integer ipq) {
      this.ipq = ipq;
   }

   public void setOriginalPrice(Double originalPrice) {
      this.originalPrice = originalPrice;
   }

   public void setPrice(Double price) {
      this.price = price;
   }

   public void setStock(Integer stock) {
      this.stock = stock;
   }

   public void setLogisticsPlanId(String logisticsPlanId) {
      this.logisticsPlanId = logisticsPlanId;
   }

   public void setPriceType(Integer priceType) {
      this.priceType = priceType;
   }

   public void setErpCode(String erpCode) {
      this.erpCode = erpCode;
   }

   public void setVariants(List<CreateItemRequest.VariantV3> variants) {
      this.variants = variants;
   }

   public void setDeliveryTime(CreateItemRequest.DeliveryTimeV3 deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   public void setSpecImageUrl(String specImageUrl) {
      this.specImageUrl = specImageUrl;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setOriginItemId(String originItemId) {
      this.originItemId = originItemId;
   }

   public void setBoutiqueMode(BoutiqueMode boutiqueMode) {
      this.boutiqueMode = boutiqueMode;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(long updateTime) {
      this.updateTime = updateTime;
   }

   public void setSkucode(String skucode) {
      this.skucode = skucode;
   }

   public void setLogisticsName(String logisticsName) {
      this.logisticsName = logisticsName;
   }

   public void setWhCode(String whCode) {
      this.whCode = whCode;
   }

   public void setBuyable(boolean buyable) {
      this.buyable = buyable;
   }

   public void setUnionItemDetails(List<UnionItemInfo> unionItemDetails) {
      this.unionItemDetails = unionItemDetails;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setIsGift(Boolean isGift) {
      this.isGift = isGift;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ItemInfo)) {
         return false;
      } else {
         ItemInfo other = (ItemInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCreateTime() != other.getCreateTime()) {
            return false;
         } else if (this.getUpdateTime() != other.getUpdateTime()) {
            return false;
         } else if (this.isBuyable() != other.isBuyable()) {
            return false;
         } else {
            Object this$ipq = this.getIpq();
            Object other$ipq = other.getIpq();
            if (this$ipq == null) {
               if (other$ipq != null) {
                  return false;
               }
            } else if (!this$ipq.equals(other$ipq)) {
               return false;
            }

            Object this$originalPrice = this.getOriginalPrice();
            Object other$originalPrice = other.getOriginalPrice();
            if (this$originalPrice == null) {
               if (other$originalPrice != null) {
                  return false;
               }
            } else if (!this$originalPrice.equals(other$originalPrice)) {
               return false;
            }

            Object this$price = this.getPrice();
            Object other$price = other.getPrice();
            if (this$price == null) {
               if (other$price != null) {
                  return false;
               }
            } else if (!this$price.equals(other$price)) {
               return false;
            }

            Object this$stock = this.getStock();
            Object other$stock = other.getStock();
            if (this$stock == null) {
               if (other$stock != null) {
                  return false;
               }
            } else if (!this$stock.equals(other$stock)) {
               return false;
            }

            Object this$priceType = this.getPriceType();
            Object other$priceType = other.getPriceType();
            if (this$priceType == null) {
               if (other$priceType != null) {
                  return false;
               }
            } else if (!this$priceType.equals(other$priceType)) {
               return false;
            }

            Object this$isGift = this.getIsGift();
            Object other$isGift = other.getIsGift();
            if (this$isGift == null) {
               if (other$isGift != null) {
                  return false;
               }
            } else if (!this$isGift.equals(other$isGift)) {
               return false;
            }

            Object this$freeReturn = this.getFreeReturn();
            Object other$freeReturn = other.getFreeReturn();
            if (this$freeReturn == null) {
               if (other$freeReturn != null) {
                  return false;
               }
            } else if (!this$freeReturn.equals(other$freeReturn)) {
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

            Object this$spuId = this.getSpuId();
            Object other$spuId = other.getSpuId();
            if (this$spuId == null) {
               if (other$spuId != null) {
                  return false;
               }
            } else if (!this$spuId.equals(other$spuId)) {
               return false;
            }

            Object this$logisticsPlanId = this.getLogisticsPlanId();
            Object other$logisticsPlanId = other.getLogisticsPlanId();
            if (this$logisticsPlanId == null) {
               if (other$logisticsPlanId != null) {
                  return false;
               }
            } else if (!this$logisticsPlanId.equals(other$logisticsPlanId)) {
               return false;
            }

            Object this$erpCode = this.getErpCode();
            Object other$erpCode = other.getErpCode();
            if (this$erpCode == null) {
               if (other$erpCode != null) {
                  return false;
               }
            } else if (!this$erpCode.equals(other$erpCode)) {
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

            Object this$deliveryTime = this.getDeliveryTime();
            Object other$deliveryTime = other.getDeliveryTime();
            if (this$deliveryTime == null) {
               if (other$deliveryTime != null) {
                  return false;
               }
            } else if (!this$deliveryTime.equals(other$deliveryTime)) {
               return false;
            }

            Object this$specImageUrl = this.getSpecImageUrl();
            Object other$specImageUrl = other.getSpecImageUrl();
            if (this$specImageUrl == null) {
               if (other$specImageUrl != null) {
                  return false;
               }
            } else if (!this$specImageUrl.equals(other$specImageUrl)) {
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

            Object this$originItemId = this.getOriginItemId();
            Object other$originItemId = other.getOriginItemId();
            if (this$originItemId == null) {
               if (other$originItemId != null) {
                  return false;
               }
            } else if (!this$originItemId.equals(other$originItemId)) {
               return false;
            }

            Object this$boutiqueMode = this.getBoutiqueMode();
            Object other$boutiqueMode = other.getBoutiqueMode();
            if (this$boutiqueMode == null) {
               if (other$boutiqueMode != null) {
                  return false;
               }
            } else if (!this$boutiqueMode.equals(other$boutiqueMode)) {
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

            Object this$logisticsName = this.getLogisticsName();
            Object other$logisticsName = other.getLogisticsName();
            if (this$logisticsName == null) {
               if (other$logisticsName != null) {
                  return false;
               }
            } else if (!this$logisticsName.equals(other$logisticsName)) {
               return false;
            }

            Object this$whCode = this.getWhCode();
            Object other$whCode = other.getWhCode();
            if (this$whCode == null) {
               if (other$whCode != null) {
                  return false;
               }
            } else if (!this$whCode.equals(other$whCode)) {
               return false;
            }

            Object this$unionItemDetails = this.getUnionItemDetails();
            Object other$unionItemDetails = other.getUnionItemDetails();
            if (this$unionItemDetails == null) {
               if (other$unionItemDetails != null) {
                  return false;
               }
            } else if (!this$unionItemDetails.equals(other$unionItemDetails)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ItemInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $createTime = this.getCreateTime();
      result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
      long $updateTime = this.getUpdateTime();
      result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
      result = result * 59 + (this.isBuyable() ? 79 : 97);
      Object $ipq = this.getIpq();
      result = result * 59 + ($ipq == null ? 43 : $ipq.hashCode());
      Object $originalPrice = this.getOriginalPrice();
      result = result * 59 + ($originalPrice == null ? 43 : $originalPrice.hashCode());
      Object $price = this.getPrice();
      result = result * 59 + ($price == null ? 43 : $price.hashCode());
      Object $stock = this.getStock();
      result = result * 59 + ($stock == null ? 43 : $stock.hashCode());
      Object $priceType = this.getPriceType();
      result = result * 59 + ($priceType == null ? 43 : $priceType.hashCode());
      Object $isGift = this.getIsGift();
      result = result * 59 + ($isGift == null ? 43 : $isGift.hashCode());
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $logisticsPlanId = this.getLogisticsPlanId();
      result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
      Object $erpCode = this.getErpCode();
      result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
      Object $variants = this.getVariants();
      result = result * 59 + ($variants == null ? 43 : $variants.hashCode());
      Object $deliveryTime = this.getDeliveryTime();
      result = result * 59 + ($deliveryTime == null ? 43 : $deliveryTime.hashCode());
      Object $specImageUrl = this.getSpecImageUrl();
      result = result * 59 + ($specImageUrl == null ? 43 : $specImageUrl.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $originItemId = this.getOriginItemId();
      result = result * 59 + ($originItemId == null ? 43 : $originItemId.hashCode());
      Object $boutiqueMode = this.getBoutiqueMode();
      result = result * 59 + ($boutiqueMode == null ? 43 : $boutiqueMode.hashCode());
      Object $skucode = this.getSkucode();
      result = result * 59 + ($skucode == null ? 43 : $skucode.hashCode());
      Object $logisticsName = this.getLogisticsName();
      result = result * 59 + ($logisticsName == null ? 43 : $logisticsName.hashCode());
      Object $whCode = this.getWhCode();
      result = result * 59 + ($whCode == null ? 43 : $whCode.hashCode());
      Object $unionItemDetails = this.getUnionItemDetails();
      result = result * 59 + ($unionItemDetails == null ? 43 : $unionItemDetails.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      return result;
   }

   public String toString() {
      return "ItemInfo(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", ipq=" + this.getIpq() + ", originalPrice=" + this.getOriginalPrice() + ", price=" + this.getPrice() + ", stock=" + this.getStock() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", priceType=" + this.getPriceType() + ", erpCode=" + this.getErpCode() + ", variants=" + this.getVariants() + ", deliveryTime=" + this.getDeliveryTime() + ", specImageUrl=" + this.getSpecImageUrl() + ", barcode=" + this.getBarcode() + ", originItemId=" + this.getOriginItemId() + ", boutiqueMode=" + this.getBoutiqueMode() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", skucode=" + this.getSkucode() + ", logisticsName=" + this.getLogisticsName() + ", whCode=" + this.getWhCode() + ", buyable=" + this.isBuyable() + ", unionItemDetails=" + this.getUnionItemDetails() + ", name=" + this.getName() + ", isGift=" + this.getIsGift() + ", freeReturn=" + this.getFreeReturn() + ")";
   }

   public static class VariantV3 {
      private String id;
      private String name;
      private String value;
      private String valueId;

      public String getId() {
         return this.id;
      }

      public String getName() {
         return this.name;
      }

      public String getValue() {
         return this.value;
      }

      public String getValueId() {
         return this.valueId;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof VariantV3)) {
            return false;
         } else {
            VariantV3 other = (VariantV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
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

               Object this$value = this.getValue();
               Object other$value = other.getValue();
               if (this$value == null) {
                  if (other$value != null) {
                     return false;
                  }
               } else if (!this$value.equals(other$value)) {
                  return false;
               }

               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof VariantV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         return result;
      }

      public String toString() {
         return "ItemInfo.VariantV3(id=" + this.getId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ")";
      }
   }

   public static class DeliveryTimeV3 {
      private String time;
      private DeliveryTimeType type;

      public String getTime() {
         return this.time;
      }

      public DeliveryTimeType getType() {
         return this.type;
      }

      public void setTime(String time) {
         this.time = time;
      }

      public void setType(DeliveryTimeType type) {
         this.type = type;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof DeliveryTimeV3)) {
            return false;
         } else {
            DeliveryTimeV3 other = (DeliveryTimeV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$time = this.getTime();
               Object other$time = other.getTime();
               if (this$time == null) {
                  if (other$time != null) {
                     return false;
                  }
               } else if (!this$time.equals(other$time)) {
                  return false;
               }

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
         return other instanceof DeliveryTimeV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $time = this.getTime();
         result = result * 59 + ($time == null ? 43 : $time.hashCode());
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         return result;
      }

      public String toString() {
         return "ItemInfo.DeliveryTimeV3(time=" + this.getTime() + ", type=" + this.getType() + ")";
      }
   }
}

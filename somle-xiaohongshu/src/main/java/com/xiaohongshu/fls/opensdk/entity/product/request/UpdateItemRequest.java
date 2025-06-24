package com.xiaohongshu.fls.opensdk.entity.product.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.product.DeliveryTimeType;
import java.util.List;

public class UpdateItemRequest extends BaseRequest {
   private String id;
   private String spuId;
   private Integer ipq;
   private Double originalPrice;
   private Double price;
   private Integer stock;
   private String logisticsPlanId;
   private String whcode;
   private Integer priceType;
   private String erpCode;
   private List<CreateItemRequest.VariantV3> variants;
   private CreateItemRequest.DeliveryTimeV3 deliveryTime;
   private String specImageUrl;
   private String barcode;
   private List<String> updatedFields;
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

   public String getWhcode() {
      return this.whcode;
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

   public List<String> getUpdatedFields() {
      return this.updatedFields;
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

   public void setWhcode(String whcode) {
      this.whcode = whcode;
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

   public void setUpdatedFields(List<String> updatedFields) {
      this.updatedFields = updatedFields;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UpdateItemRequest)) {
         return false;
      } else {
         UpdateItemRequest other = (UpdateItemRequest)o;
         if (!other.canEqual(this)) {
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

            Object this$whcode = this.getWhcode();
            Object other$whcode = other.getWhcode();
            if (this$whcode == null) {
               if (other$whcode != null) {
                  return false;
               }
            } else if (!this$whcode.equals(other$whcode)) {
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

            Object this$updatedFields = this.getUpdatedFields();
            Object other$updatedFields = other.getUpdatedFields();
            if (this$updatedFields == null) {
               if (other$updatedFields != null) {
                  return false;
               }
            } else if (!this$updatedFields.equals(other$updatedFields)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UpdateItemRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
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
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $spuId = this.getSpuId();
      result = result * 59 + ($spuId == null ? 43 : $spuId.hashCode());
      Object $logisticsPlanId = this.getLogisticsPlanId();
      result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
      Object $whcode = this.getWhcode();
      result = result * 59 + ($whcode == null ? 43 : $whcode.hashCode());
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
      Object $updatedFields = this.getUpdatedFields();
      result = result * 59 + ($updatedFields == null ? 43 : $updatedFields.hashCode());
      return result;
   }

   public String toString() {
      return "UpdateItemRequest(id=" + this.getId() + ", spuId=" + this.getSpuId() + ", ipq=" + this.getIpq() + ", originalPrice=" + this.getOriginalPrice() + ", price=" + this.getPrice() + ", stock=" + this.getStock() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", whcode=" + this.getWhcode() + ", priceType=" + this.getPriceType() + ", erpCode=" + this.getErpCode() + ", variants=" + this.getVariants() + ", deliveryTime=" + this.getDeliveryTime() + ", specImageUrl=" + this.getSpecImageUrl() + ", barcode=" + this.getBarcode() + ", updatedFields=" + this.getUpdatedFields() + ", freeReturn=" + this.getFreeReturn() + ")";
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
         return "UpdateItemRequest.VariantV3(id=" + this.getId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ")";
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
         return "UpdateItemRequest.DeliveryTimeV3(time=" + this.getTime() + ", type=" + this.getType() + ")";
      }
   }
}

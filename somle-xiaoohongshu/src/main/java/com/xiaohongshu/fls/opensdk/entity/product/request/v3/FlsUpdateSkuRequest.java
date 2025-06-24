package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.boutique.BoutiqueMode;
import com.xiaohongshu.fls.opensdk.entity.product.DeliveryTimeType;
import java.util.List;

public class FlsUpdateSkuRequest extends BaseRequest {
   private String id;
   private List<String> updatedFields;
   private String itemId;
   private Integer ipq;
   private Integer originalPrice;
   private Integer price;
   private Integer stock;
   private String logisticsPlanId;
   private String whcode;
   private Integer priceType;
   private String erpCode;
   private List<VariantV3> variants;
   private DeliveryTimeV3 deliveryTime;
   private String specImage;
   private String barcode;
   private String originSkuId;
   private BoutiqueMode boutiqueMode;
   private List<String> images;
   public List<String> imageDescriptions;
   public String description;
   public List<Faq> faqs;
   public Integer freeReturn;
   public Integer memberPrice;

   public String getId() {
      return this.id;
   }

   public List<String> getUpdatedFields() {
      return this.updatedFields;
   }

   public String getItemId() {
      return this.itemId;
   }

   public Integer getIpq() {
      return this.ipq;
   }

   public Integer getOriginalPrice() {
      return this.originalPrice;
   }

   public Integer getPrice() {
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

   public List<VariantV3> getVariants() {
      return this.variants;
   }

   public DeliveryTimeV3 getDeliveryTime() {
      return this.deliveryTime;
   }

   public String getSpecImage() {
      return this.specImage;
   }

   public String getBarcode() {
      return this.barcode;
   }

   public String getOriginSkuId() {
      return this.originSkuId;
   }

   public BoutiqueMode getBoutiqueMode() {
      return this.boutiqueMode;
   }

   public List<String> getImages() {
      return this.images;
   }

   public List<String> getImageDescriptions() {
      return this.imageDescriptions;
   }

   public String getDescription() {
      return this.description;
   }

   public List<Faq> getFaqs() {
      return this.faqs;
   }

   public Integer getFreeReturn() {
      return this.freeReturn;
   }

   public Integer getMemberPrice() {
      return this.memberPrice;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setUpdatedFields(List<String> updatedFields) {
      this.updatedFields = updatedFields;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public void setIpq(Integer ipq) {
      this.ipq = ipq;
   }

   public void setOriginalPrice(Integer originalPrice) {
      this.originalPrice = originalPrice;
   }

   public void setPrice(Integer price) {
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

   public void setVariants(List<VariantV3> variants) {
      this.variants = variants;
   }

   public void setDeliveryTime(DeliveryTimeV3 deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   public void setSpecImage(String specImage) {
      this.specImage = specImage;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setOriginSkuId(String originSkuId) {
      this.originSkuId = originSkuId;
   }

   public void setBoutiqueMode(BoutiqueMode boutiqueMode) {
      this.boutiqueMode = boutiqueMode;
   }

   public void setImages(List<String> images) {
      this.images = images;
   }

   public void setImageDescriptions(List<String> imageDescriptions) {
      this.imageDescriptions = imageDescriptions;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setFaqs(List<Faq> faqs) {
      this.faqs = faqs;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public void setMemberPrice(Integer memberPrice) {
      this.memberPrice = memberPrice;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsUpdateSkuRequest)) {
         return false;
      } else {
         FlsUpdateSkuRequest other = (FlsUpdateSkuRequest)o;
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

            Object this$memberPrice = this.getMemberPrice();
            Object other$memberPrice = other.getMemberPrice();
            if (this$memberPrice == null) {
               if (other$memberPrice != null) {
                  return false;
               }
            } else if (!this$memberPrice.equals(other$memberPrice)) {
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

            Object this$updatedFields = this.getUpdatedFields();
            Object other$updatedFields = other.getUpdatedFields();
            if (this$updatedFields == null) {
               if (other$updatedFields != null) {
                  return false;
               }
            } else if (!this$updatedFields.equals(other$updatedFields)) {
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

            Object this$specImage = this.getSpecImage();
            Object other$specImage = other.getSpecImage();
            if (this$specImage == null) {
               if (other$specImage != null) {
                  return false;
               }
            } else if (!this$specImage.equals(other$specImage)) {
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

            Object this$originSkuId = this.getOriginSkuId();
            Object other$originSkuId = other.getOriginSkuId();
            if (this$originSkuId == null) {
               if (other$originSkuId != null) {
                  return false;
               }
            } else if (!this$originSkuId.equals(other$originSkuId)) {
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

            Object this$images = this.getImages();
            Object other$images = other.getImages();
            if (this$images == null) {
               if (other$images != null) {
                  return false;
               }
            } else if (!this$images.equals(other$images)) {
               return false;
            }

            Object this$imageDescriptions = this.getImageDescriptions();
            Object other$imageDescriptions = other.getImageDescriptions();
            if (this$imageDescriptions == null) {
               if (other$imageDescriptions != null) {
                  return false;
               }
            } else if (!this$imageDescriptions.equals(other$imageDescriptions)) {
               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            Object this$faqs = this.getFaqs();
            Object other$faqs = other.getFaqs();
            if (this$faqs == null) {
               if (other$faqs != null) {
                  return false;
               }
            } else if (!this$faqs.equals(other$faqs)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsUpdateSkuRequest;
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
      Object $memberPrice = this.getMemberPrice();
      result = result * 59 + ($memberPrice == null ? 43 : $memberPrice.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $updatedFields = this.getUpdatedFields();
      result = result * 59 + ($updatedFields == null ? 43 : $updatedFields.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
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
      Object $specImage = this.getSpecImage();
      result = result * 59 + ($specImage == null ? 43 : $specImage.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $originSkuId = this.getOriginSkuId();
      result = result * 59 + ($originSkuId == null ? 43 : $originSkuId.hashCode());
      Object $boutiqueMode = this.getBoutiqueMode();
      result = result * 59 + ($boutiqueMode == null ? 43 : $boutiqueMode.hashCode());
      Object $images = this.getImages();
      result = result * 59 + ($images == null ? 43 : $images.hashCode());
      Object $imageDescriptions = this.getImageDescriptions();
      result = result * 59 + ($imageDescriptions == null ? 43 : $imageDescriptions.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $faqs = this.getFaqs();
      result = result * 59 + ($faqs == null ? 43 : $faqs.hashCode());
      return result;
   }

   public String toString() {
      return "FlsUpdateSkuRequest(id=" + this.getId() + ", updatedFields=" + this.getUpdatedFields() + ", itemId=" + this.getItemId() + ", ipq=" + this.getIpq() + ", originalPrice=" + this.getOriginalPrice() + ", price=" + this.getPrice() + ", stock=" + this.getStock() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", whcode=" + this.getWhcode() + ", priceType=" + this.getPriceType() + ", erpCode=" + this.getErpCode() + ", variants=" + this.getVariants() + ", deliveryTime=" + this.getDeliveryTime() + ", specImage=" + this.getSpecImage() + ", barcode=" + this.getBarcode() + ", originSkuId=" + this.getOriginSkuId() + ", boutiqueMode=" + this.getBoutiqueMode() + ", images=" + this.getImages() + ", imageDescriptions=" + this.getImageDescriptions() + ", description=" + this.getDescription() + ", faqs=" + this.getFaqs() + ", freeReturn=" + this.getFreeReturn() + ", memberPrice=" + this.getMemberPrice() + ")";
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
         return "FlsUpdateSkuRequest.VariantV3(id=" + this.getId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ")";
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
         return "FlsUpdateSkuRequest.DeliveryTimeV3(time=" + this.getTime() + ", type=" + this.getType() + ")";
      }
   }

   public static class Faq {
      private String question;
      private String answer;

      public String getQuestion() {
         return this.question;
      }

      public String getAnswer() {
         return this.answer;
      }

      public void setQuestion(String question) {
         this.question = question;
      }

      public void setAnswer(String answer) {
         this.answer = answer;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Faq)) {
            return false;
         } else {
            Faq other = (Faq)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$question = this.getQuestion();
               Object other$question = other.getQuestion();
               if (this$question == null) {
                  if (other$question != null) {
                     return false;
                  }
               } else if (!this$question.equals(other$question)) {
                  return false;
               }

               Object this$answer = this.getAnswer();
               Object other$answer = other.getAnswer();
               if (this$answer == null) {
                  if (other$answer != null) {
                     return false;
                  }
               } else if (!this$answer.equals(other$answer)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Faq;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $question = this.getQuestion();
         result = result * 59 + ($question == null ? 43 : $question.hashCode());
         Object $answer = this.getAnswer();
         result = result * 59 + ($answer == null ? 43 : $answer.hashCode());
         return result;
      }

      public String toString() {
         return "FlsUpdateSkuRequest.Faq(question=" + this.getQuestion() + ", answer=" + this.getAnswer() + ")";
      }
   }
}

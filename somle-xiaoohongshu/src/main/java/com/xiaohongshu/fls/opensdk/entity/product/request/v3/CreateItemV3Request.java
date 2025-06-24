package com.xiaohongshu.fls.opensdk.entity.product.request.v3;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.ArrayList;
import java.util.List;

public class CreateItemV3Request extends BaseRequest {
   private String name;
   private String ename;
   private Long brandId;
   private String categoryId;
   private List<ItemAttribute> attributes = new ArrayList();
   private String shippingTemplateId;
   private Integer shippingGrossWeight;
   private List<String> variantIds = new ArrayList();
   private List<String> images;
   private List<String> standardImages;
   private List<String> longImages;
   private String videoUrl;
   private String articleNo;
   public List<String> imageDescriptions;
   public String transparentImage;
   public String description;
   public List<Faq> faq;
   public Boolean isChannel;
   public Integer deliveryMode;
   public Integer freeReturn;
   public Boolean enableMultiWarehouse;
   public String sizeTableImage;
   public String recommendSizeTableImage;
   public String modelTryOnSizeTableImage;
   public Boolean enableMainSpecImage;
   public String itemShortTitle;

   public CreateItemV3Request() {
      this.variantIds = new ArrayList();
      this.images = new ArrayList();
      this.imageDescriptions = new ArrayList();
      this.faq = new ArrayList();
   }

   public String getName() {
      return this.name;
   }

   public String getEname() {
      return this.ename;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public List<ItemAttribute> getAttributes() {
      return this.attributes;
   }

   public String getShippingTemplateId() {
      return this.shippingTemplateId;
   }

   public Integer getShippingGrossWeight() {
      return this.shippingGrossWeight;
   }

   public List<String> getVariantIds() {
      return this.variantIds;
   }

   public List<String> getImages() {
      return this.images;
   }

   public List<String> getStandardImages() {
      return this.standardImages;
   }

   public List<String> getLongImages() {
      return this.longImages;
   }

   public String getVideoUrl() {
      return this.videoUrl;
   }

   public String getArticleNo() {
      return this.articleNo;
   }

   public List<String> getImageDescriptions() {
      return this.imageDescriptions;
   }

   public String getTransparentImage() {
      return this.transparentImage;
   }

   public String getDescription() {
      return this.description;
   }

   public List<Faq> getFaq() {
      return this.faq;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public Integer getDeliveryMode() {
      return this.deliveryMode;
   }

   public Integer getFreeReturn() {
      return this.freeReturn;
   }

   public Boolean getEnableMultiWarehouse() {
      return this.enableMultiWarehouse;
   }

   public String getSizeTableImage() {
      return this.sizeTableImage;
   }

   public String getRecommendSizeTableImage() {
      return this.recommendSizeTableImage;
   }

   public String getModelTryOnSizeTableImage() {
      return this.modelTryOnSizeTableImage;
   }

   public Boolean getEnableMainSpecImage() {
      return this.enableMainSpecImage;
   }

   public String getItemShortTitle() {
      return this.itemShortTitle;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public void setAttributes(List<ItemAttribute> attributes) {
      this.attributes = attributes;
   }

   public void setShippingTemplateId(String shippingTemplateId) {
      this.shippingTemplateId = shippingTemplateId;
   }

   public void setShippingGrossWeight(Integer shippingGrossWeight) {
      this.shippingGrossWeight = shippingGrossWeight;
   }

   public void setVariantIds(List<String> variantIds) {
      this.variantIds = variantIds;
   }

   public void setImages(List<String> images) {
      this.images = images;
   }

   public void setStandardImages(List<String> standardImages) {
      this.standardImages = standardImages;
   }

   public void setLongImages(List<String> longImages) {
      this.longImages = longImages;
   }

   public void setVideoUrl(String videoUrl) {
      this.videoUrl = videoUrl;
   }

   public void setArticleNo(String articleNo) {
      this.articleNo = articleNo;
   }

   public void setImageDescriptions(List<String> imageDescriptions) {
      this.imageDescriptions = imageDescriptions;
   }

   public void setTransparentImage(String transparentImage) {
      this.transparentImage = transparentImage;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setFaq(List<Faq> faq) {
      this.faq = faq;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public void setDeliveryMode(Integer deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public void setEnableMultiWarehouse(Boolean enableMultiWarehouse) {
      this.enableMultiWarehouse = enableMultiWarehouse;
   }

   public void setSizeTableImage(String sizeTableImage) {
      this.sizeTableImage = sizeTableImage;
   }

   public void setRecommendSizeTableImage(String recommendSizeTableImage) {
      this.recommendSizeTableImage = recommendSizeTableImage;
   }

   public void setModelTryOnSizeTableImage(String modelTryOnSizeTableImage) {
      this.modelTryOnSizeTableImage = modelTryOnSizeTableImage;
   }

   public void setEnableMainSpecImage(Boolean enableMainSpecImage) {
      this.enableMainSpecImage = enableMainSpecImage;
   }

   public void setItemShortTitle(String itemShortTitle) {
      this.itemShortTitle = itemShortTitle;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CreateItemV3Request)) {
         return false;
      } else {
         CreateItemV3Request other = (CreateItemV3Request)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$brandId = this.getBrandId();
            Object other$brandId = other.getBrandId();
            if (this$brandId == null) {
               if (other$brandId != null) {
                  return false;
               }
            } else if (!this$brandId.equals(other$brandId)) {
               return false;
            }

            Object this$shippingGrossWeight = this.getShippingGrossWeight();
            Object other$shippingGrossWeight = other.getShippingGrossWeight();
            if (this$shippingGrossWeight == null) {
               if (other$shippingGrossWeight != null) {
                  return false;
               }
            } else if (!this$shippingGrossWeight.equals(other$shippingGrossWeight)) {
               return false;
            }

            Object this$isChannel = this.getIsChannel();
            Object other$isChannel = other.getIsChannel();
            if (this$isChannel == null) {
               if (other$isChannel != null) {
                  return false;
               }
            } else if (!this$isChannel.equals(other$isChannel)) {
               return false;
            }

            Object this$deliveryMode = this.getDeliveryMode();
            Object other$deliveryMode = other.getDeliveryMode();
            if (this$deliveryMode == null) {
               if (other$deliveryMode != null) {
                  return false;
               }
            } else if (!this$deliveryMode.equals(other$deliveryMode)) {
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

            Object this$enableMultiWarehouse = this.getEnableMultiWarehouse();
            Object other$enableMultiWarehouse = other.getEnableMultiWarehouse();
            if (this$enableMultiWarehouse == null) {
               if (other$enableMultiWarehouse != null) {
                  return false;
               }
            } else if (!this$enableMultiWarehouse.equals(other$enableMultiWarehouse)) {
               return false;
            }

            Object this$enableMainSpecImage = this.getEnableMainSpecImage();
            Object other$enableMainSpecImage = other.getEnableMainSpecImage();
            if (this$enableMainSpecImage == null) {
               if (other$enableMainSpecImage != null) {
                  return false;
               }
            } else if (!this$enableMainSpecImage.equals(other$enableMainSpecImage)) {
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

            Object this$ename = this.getEname();
            Object other$ename = other.getEname();
            if (this$ename == null) {
               if (other$ename != null) {
                  return false;
               }
            } else if (!this$ename.equals(other$ename)) {
               return false;
            }

            Object this$categoryId = this.getCategoryId();
            Object other$categoryId = other.getCategoryId();
            if (this$categoryId == null) {
               if (other$categoryId != null) {
                  return false;
               }
            } else if (!this$categoryId.equals(other$categoryId)) {
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

            Object this$shippingTemplateId = this.getShippingTemplateId();
            Object other$shippingTemplateId = other.getShippingTemplateId();
            if (this$shippingTemplateId == null) {
               if (other$shippingTemplateId != null) {
                  return false;
               }
            } else if (!this$shippingTemplateId.equals(other$shippingTemplateId)) {
               return false;
            }

            Object this$variantIds = this.getVariantIds();
            Object other$variantIds = other.getVariantIds();
            if (this$variantIds == null) {
               if (other$variantIds != null) {
                  return false;
               }
            } else if (!this$variantIds.equals(other$variantIds)) {
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

            Object this$standardImages = this.getStandardImages();
            Object other$standardImages = other.getStandardImages();
            if (this$standardImages == null) {
               if (other$standardImages != null) {
                  return false;
               }
            } else if (!this$standardImages.equals(other$standardImages)) {
               return false;
            }

            Object this$longImages = this.getLongImages();
            Object other$longImages = other.getLongImages();
            if (this$longImages == null) {
               if (other$longImages != null) {
                  return false;
               }
            } else if (!this$longImages.equals(other$longImages)) {
               return false;
            }

            Object this$videoUrl = this.getVideoUrl();
            Object other$videoUrl = other.getVideoUrl();
            if (this$videoUrl == null) {
               if (other$videoUrl != null) {
                  return false;
               }
            } else if (!this$videoUrl.equals(other$videoUrl)) {
               return false;
            }

            Object this$articleNo = this.getArticleNo();
            Object other$articleNo = other.getArticleNo();
            if (this$articleNo == null) {
               if (other$articleNo != null) {
                  return false;
               }
            } else if (!this$articleNo.equals(other$articleNo)) {
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

            Object this$transparentImage = this.getTransparentImage();
            Object other$transparentImage = other.getTransparentImage();
            if (this$transparentImage == null) {
               if (other$transparentImage != null) {
                  return false;
               }
            } else if (!this$transparentImage.equals(other$transparentImage)) {
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

            Object this$faq = this.getFaq();
            Object other$faq = other.getFaq();
            if (this$faq == null) {
               if (other$faq != null) {
                  return false;
               }
            } else if (!this$faq.equals(other$faq)) {
               return false;
            }

            Object this$sizeTableImage = this.getSizeTableImage();
            Object other$sizeTableImage = other.getSizeTableImage();
            if (this$sizeTableImage == null) {
               if (other$sizeTableImage != null) {
                  return false;
               }
            } else if (!this$sizeTableImage.equals(other$sizeTableImage)) {
               return false;
            }

            Object this$recommendSizeTableImage = this.getRecommendSizeTableImage();
            Object other$recommendSizeTableImage = other.getRecommendSizeTableImage();
            if (this$recommendSizeTableImage == null) {
               if (other$recommendSizeTableImage != null) {
                  return false;
               }
            } else if (!this$recommendSizeTableImage.equals(other$recommendSizeTableImage)) {
               return false;
            }

            Object this$modelTryOnSizeTableImage = this.getModelTryOnSizeTableImage();
            Object other$modelTryOnSizeTableImage = other.getModelTryOnSizeTableImage();
            if (this$modelTryOnSizeTableImage == null) {
               if (other$modelTryOnSizeTableImage != null) {
                  return false;
               }
            } else if (!this$modelTryOnSizeTableImage.equals(other$modelTryOnSizeTableImage)) {
               return false;
            }

            Object this$itemShortTitle = this.getItemShortTitle();
            Object other$itemShortTitle = other.getItemShortTitle();
            if (this$itemShortTitle == null) {
               if (other$itemShortTitle != null) {
                  return false;
               }
            } else if (!this$itemShortTitle.equals(other$itemShortTitle)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CreateItemV3Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $brandId = this.getBrandId();
      result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
      Object $shippingGrossWeight = this.getShippingGrossWeight();
      result = result * 59 + ($shippingGrossWeight == null ? 43 : $shippingGrossWeight.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $deliveryMode = this.getDeliveryMode();
      result = result * 59 + ($deliveryMode == null ? 43 : $deliveryMode.hashCode());
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $enableMultiWarehouse = this.getEnableMultiWarehouse();
      result = result * 59 + ($enableMultiWarehouse == null ? 43 : $enableMultiWarehouse.hashCode());
      Object $enableMainSpecImage = this.getEnableMainSpecImage();
      result = result * 59 + ($enableMainSpecImage == null ? 43 : $enableMainSpecImage.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $ename = this.getEname();
      result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      Object $attributes = this.getAttributes();
      result = result * 59 + ($attributes == null ? 43 : $attributes.hashCode());
      Object $shippingTemplateId = this.getShippingTemplateId();
      result = result * 59 + ($shippingTemplateId == null ? 43 : $shippingTemplateId.hashCode());
      Object $variantIds = this.getVariantIds();
      result = result * 59 + ($variantIds == null ? 43 : $variantIds.hashCode());
      Object $images = this.getImages();
      result = result * 59 + ($images == null ? 43 : $images.hashCode());
      Object $standardImages = this.getStandardImages();
      result = result * 59 + ($standardImages == null ? 43 : $standardImages.hashCode());
      Object $longImages = this.getLongImages();
      result = result * 59 + ($longImages == null ? 43 : $longImages.hashCode());
      Object $videoUrl = this.getVideoUrl();
      result = result * 59 + ($videoUrl == null ? 43 : $videoUrl.hashCode());
      Object $articleNo = this.getArticleNo();
      result = result * 59 + ($articleNo == null ? 43 : $articleNo.hashCode());
      Object $imageDescriptions = this.getImageDescriptions();
      result = result * 59 + ($imageDescriptions == null ? 43 : $imageDescriptions.hashCode());
      Object $transparentImage = this.getTransparentImage();
      result = result * 59 + ($transparentImage == null ? 43 : $transparentImage.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $faq = this.getFaq();
      result = result * 59 + ($faq == null ? 43 : $faq.hashCode());
      Object $sizeTableImage = this.getSizeTableImage();
      result = result * 59 + ($sizeTableImage == null ? 43 : $sizeTableImage.hashCode());
      Object $recommendSizeTableImage = this.getRecommendSizeTableImage();
      result = result * 59 + ($recommendSizeTableImage == null ? 43 : $recommendSizeTableImage.hashCode());
      Object $modelTryOnSizeTableImage = this.getModelTryOnSizeTableImage();
      result = result * 59 + ($modelTryOnSizeTableImage == null ? 43 : $modelTryOnSizeTableImage.hashCode());
      Object $itemShortTitle = this.getItemShortTitle();
      result = result * 59 + ($itemShortTitle == null ? 43 : $itemShortTitle.hashCode());
      return result;
   }

   public String toString() {
      return "CreateItemV3Request(name=" + this.getName() + ", ename=" + this.getEname() + ", brandId=" + this.getBrandId() + ", categoryId=" + this.getCategoryId() + ", attributes=" + this.getAttributes() + ", shippingTemplateId=" + this.getShippingTemplateId() + ", shippingGrossWeight=" + this.getShippingGrossWeight() + ", variantIds=" + this.getVariantIds() + ", images=" + this.getImages() + ", standardImages=" + this.getStandardImages() + ", longImages=" + this.getLongImages() + ", videoUrl=" + this.getVideoUrl() + ", articleNo=" + this.getArticleNo() + ", imageDescriptions=" + this.getImageDescriptions() + ", transparentImage=" + this.getTransparentImage() + ", description=" + this.getDescription() + ", faq=" + this.getFaq() + ", isChannel=" + this.getIsChannel() + ", deliveryMode=" + this.getDeliveryMode() + ", freeReturn=" + this.getFreeReturn() + ", enableMultiWarehouse=" + this.getEnableMultiWarehouse() + ", sizeTableImage=" + this.getSizeTableImage() + ", recommendSizeTableImage=" + this.getRecommendSizeTableImage() + ", modelTryOnSizeTableImage=" + this.getModelTryOnSizeTableImage() + ", enableMainSpecImage=" + this.getEnableMainSpecImage() + ", itemShortTitle=" + this.getItemShortTitle() + ")";
   }

   public static class ItemAttribute {
      private String propertyId;
      private String name;
      private String value;
      private String valueId;
      private List<AttributeValue> valueList = new ArrayList();

      public String getPropertyId() {
         return this.propertyId;
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

      public List<AttributeValue> getValueList() {
         return this.valueList;
      }

      public void setPropertyId(String propertyId) {
         this.propertyId = propertyId;
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

      public void setValueList(List<AttributeValue> valueList) {
         this.valueList = valueList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ItemAttribute)) {
            return false;
         } else {
            ItemAttribute other = (ItemAttribute)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$propertyId = this.getPropertyId();
               Object other$propertyId = other.getPropertyId();
               if (this$propertyId == null) {
                  if (other$propertyId != null) {
                     return false;
                  }
               } else if (!this$propertyId.equals(other$propertyId)) {
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

               Object this$valueList = this.getValueList();
               Object other$valueList = other.getValueList();
               if (this$valueList == null) {
                  if (other$valueList != null) {
                     return false;
                  }
               } else if (!this$valueList.equals(other$valueList)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ItemAttribute;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $propertyId = this.getPropertyId();
         result = result * 59 + ($propertyId == null ? 43 : $propertyId.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $valueList = this.getValueList();
         result = result * 59 + ($valueList == null ? 43 : $valueList.hashCode());
         return result;
      }

      public String toString() {
         return "CreateItemV3Request.ItemAttribute(propertyId=" + this.getPropertyId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ", valueList=" + this.getValueList() + ")";
      }
   }

   public static class AttributeValue {
      private String valueId;
      private String value;

      public String getValueId() {
         return this.valueId;
      }

      public String getValue() {
         return this.value;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AttributeValue)) {
            return false;
         } else {
            AttributeValue other = (AttributeValue)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
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
         return other instanceof AttributeValue;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         return result;
      }

      public String toString() {
         return "CreateItemV3Request.AttributeValue(valueId=" + this.getValueId() + ", value=" + this.getValue() + ")";
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
         return "CreateItemV3Request.Faq(question=" + this.getQuestion() + ", answer=" + this.getAnswer() + ")";
      }
   }
}

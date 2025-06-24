package com.xiaohongshu.fls.opensdk.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xiaohongshu.fls.opensdk.entity.product.request.CreateSpuRequest;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class SpuInfo {
   private String name;
   private String ename;
   private String aliasName;
   private String shortName;
   private String brandId;
   private String categoryId;
   private List<CreateSpuRequest.SpuAttribute> attributes = new ArrayList();
   private String shippingTemplateId;
   private Integer shippingGrossWeight;
   private List<String> variantIds = new ArrayList();
   private List<String> imageUrls;
   private String videoUrl;
   private String articleNo;
   public List<String> imageDescUrls;
   public List<String> userGuideImageUrls;
   public String transparentImageUrl;
   public String desc;
   public List<CreateSpuRequest.Faq> faqs;
   private String id;
   private Boolean isChannel;
   public long createTime;
   public long updateTime;
   public Integer deliveryMode;
   public Integer freeReturn;

   public SpuInfo() {
      this.variantIds = new ArrayList();
      this.imageUrls = new ArrayList();
      this.imageDescUrls = new ArrayList();
      this.userGuideImageUrls = new ArrayList();
      this.faqs = new ArrayList();
   }

   public String getName() {
      return this.name;
   }

   public String getEname() {
      return this.ename;
   }

   public String getAliasName() {
      return this.aliasName;
   }

   public String getShortName() {
      return this.shortName;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public List<CreateSpuRequest.SpuAttribute> getAttributes() {
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

   public List<String> getImageUrls() {
      return this.imageUrls;
   }

   public String getVideoUrl() {
      return this.videoUrl;
   }

   public String getArticleNo() {
      return this.articleNo;
   }

   public List<String> getImageDescUrls() {
      return this.imageDescUrls;
   }

   public List<String> getUserGuideImageUrls() {
      return this.userGuideImageUrls;
   }

   public String getTransparentImageUrl() {
      return this.transparentImageUrl;
   }

   public String getDesc() {
      return this.desc;
   }

   public List<CreateSpuRequest.Faq> getFaqs() {
      return this.faqs;
   }

   public String getId() {
      return this.id;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public long getCreateTime() {
      return this.createTime;
   }

   public long getUpdateTime() {
      return this.updateTime;
   }

   public Integer getDeliveryMode() {
      return this.deliveryMode;
   }

   public Integer getFreeReturn() {
      return this.freeReturn;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setEname(String ename) {
      this.ename = ename;
   }

   public void setAliasName(String aliasName) {
      this.aliasName = aliasName;
   }

   public void setShortName(String shortName) {
      this.shortName = shortName;
   }

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public void setAttributes(List<CreateSpuRequest.SpuAttribute> attributes) {
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

   public void setImageUrls(List<String> imageUrls) {
      this.imageUrls = imageUrls;
   }

   public void setVideoUrl(String videoUrl) {
      this.videoUrl = videoUrl;
   }

   public void setArticleNo(String articleNo) {
      this.articleNo = articleNo;
   }

   public void setImageDescUrls(List<String> imageDescUrls) {
      this.imageDescUrls = imageDescUrls;
   }

   public void setUserGuideImageUrls(List<String> userGuideImageUrls) {
      this.userGuideImageUrls = userGuideImageUrls;
   }

   public void setTransparentImageUrl(String transparentImageUrl) {
      this.transparentImageUrl = transparentImageUrl;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public void setFaqs(List<CreateSpuRequest.Faq> faqs) {
      this.faqs = faqs;
   }

   public void setId(String id) {
      this.id = id;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(long updateTime) {
      this.updateTime = updateTime;
   }

   public void setDeliveryMode(Integer deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public void setFreeReturn(Integer freeReturn) {
      this.freeReturn = freeReturn;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SpuInfo)) {
         return false;
      } else {
         SpuInfo other = (SpuInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCreateTime() != other.getCreateTime()) {
            return false;
         } else if (this.getUpdateTime() != other.getUpdateTime()) {
            return false;
         } else {
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

            Object this$aliasName = this.getAliasName();
            Object other$aliasName = other.getAliasName();
            if (this$aliasName == null) {
               if (other$aliasName != null) {
                  return false;
               }
            } else if (!this$aliasName.equals(other$aliasName)) {
               return false;
            }

            Object this$shortName = this.getShortName();
            Object other$shortName = other.getShortName();
            if (this$shortName == null) {
               if (other$shortName != null) {
                  return false;
               }
            } else if (!this$shortName.equals(other$shortName)) {
               return false;
            }

            Object this$brandId = this.getBrandId();
            Object other$brandId = other.getBrandId();
            if (this$brandId == null) {
               if (other$brandId != null) {
                  return false;
               }
            } else if (!this$brandId.equals(other$brandId)) {
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

            Object this$imageUrls = this.getImageUrls();
            Object other$imageUrls = other.getImageUrls();
            if (this$imageUrls == null) {
               if (other$imageUrls != null) {
                  return false;
               }
            } else if (!this$imageUrls.equals(other$imageUrls)) {
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

            Object this$imageDescUrls = this.getImageDescUrls();
            Object other$imageDescUrls = other.getImageDescUrls();
            if (this$imageDescUrls == null) {
               if (other$imageDescUrls != null) {
                  return false;
               }
            } else if (!this$imageDescUrls.equals(other$imageDescUrls)) {
               return false;
            }

            Object this$userGuideImageUrls = this.getUserGuideImageUrls();
            Object other$userGuideImageUrls = other.getUserGuideImageUrls();
            if (this$userGuideImageUrls == null) {
               if (other$userGuideImageUrls != null) {
                  return false;
               }
            } else if (!this$userGuideImageUrls.equals(other$userGuideImageUrls)) {
               return false;
            }

            Object this$transparentImageUrl = this.getTransparentImageUrl();
            Object other$transparentImageUrl = other.getTransparentImageUrl();
            if (this$transparentImageUrl == null) {
               if (other$transparentImageUrl != null) {
                  return false;
               }
            } else if (!this$transparentImageUrl.equals(other$transparentImageUrl)) {
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

            Object this$faqs = this.getFaqs();
            Object other$faqs = other.getFaqs();
            if (this$faqs == null) {
               if (other$faqs != null) {
                  return false;
               }
            } else if (!this$faqs.equals(other$faqs)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SpuInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $createTime = this.getCreateTime();
      result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
      long $updateTime = this.getUpdateTime();
      result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
      Object $shippingGrossWeight = this.getShippingGrossWeight();
      result = result * 59 + ($shippingGrossWeight == null ? 43 : $shippingGrossWeight.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $deliveryMode = this.getDeliveryMode();
      result = result * 59 + ($deliveryMode == null ? 43 : $deliveryMode.hashCode());
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $ename = this.getEname();
      result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
      Object $aliasName = this.getAliasName();
      result = result * 59 + ($aliasName == null ? 43 : $aliasName.hashCode());
      Object $shortName = this.getShortName();
      result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
      Object $brandId = this.getBrandId();
      result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      Object $attributes = this.getAttributes();
      result = result * 59 + ($attributes == null ? 43 : $attributes.hashCode());
      Object $shippingTemplateId = this.getShippingTemplateId();
      result = result * 59 + ($shippingTemplateId == null ? 43 : $shippingTemplateId.hashCode());
      Object $variantIds = this.getVariantIds();
      result = result * 59 + ($variantIds == null ? 43 : $variantIds.hashCode());
      Object $imageUrls = this.getImageUrls();
      result = result * 59 + ($imageUrls == null ? 43 : $imageUrls.hashCode());
      Object $videoUrl = this.getVideoUrl();
      result = result * 59 + ($videoUrl == null ? 43 : $videoUrl.hashCode());
      Object $articleNo = this.getArticleNo();
      result = result * 59 + ($articleNo == null ? 43 : $articleNo.hashCode());
      Object $imageDescUrls = this.getImageDescUrls();
      result = result * 59 + ($imageDescUrls == null ? 43 : $imageDescUrls.hashCode());
      Object $userGuideImageUrls = this.getUserGuideImageUrls();
      result = result * 59 + ($userGuideImageUrls == null ? 43 : $userGuideImageUrls.hashCode());
      Object $transparentImageUrl = this.getTransparentImageUrl();
      result = result * 59 + ($transparentImageUrl == null ? 43 : $transparentImageUrl.hashCode());
      Object $desc = this.getDesc();
      result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
      Object $faqs = this.getFaqs();
      result = result * 59 + ($faqs == null ? 43 : $faqs.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      return result;
   }

   public String toString() {
      return "SpuInfo(name=" + this.getName() + ", ename=" + this.getEname() + ", aliasName=" + this.getAliasName() + ", shortName=" + this.getShortName() + ", brandId=" + this.getBrandId() + ", categoryId=" + this.getCategoryId() + ", attributes=" + this.getAttributes() + ", shippingTemplateId=" + this.getShippingTemplateId() + ", shippingGrossWeight=" + this.getShippingGrossWeight() + ", variantIds=" + this.getVariantIds() + ", imageUrls=" + this.getImageUrls() + ", videoUrl=" + this.getVideoUrl() + ", articleNo=" + this.getArticleNo() + ", imageDescUrls=" + this.getImageDescUrls() + ", userGuideImageUrls=" + this.getUserGuideImageUrls() + ", transparentImageUrl=" + this.getTransparentImageUrl() + ", desc=" + this.getDesc() + ", faqs=" + this.getFaqs() + ", id=" + this.getId() + ", isChannel=" + this.getIsChannel() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", deliveryMode=" + this.getDeliveryMode() + ", freeReturn=" + this.getFreeReturn() + ")";
   }

   public static class SpuAttribute {
      private String propertyId;
      private String name;
      private String value;
      private String valueId;
      private List<CreateSpuRequest.AttributeValue> valueList = new ArrayList();

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

      public List<CreateSpuRequest.AttributeValue> getValueList() {
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

      public void setValueList(List<CreateSpuRequest.AttributeValue> valueList) {
         this.valueList = valueList;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SpuAttribute)) {
            return false;
         } else {
            SpuAttribute other = (SpuAttribute)o;
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
         return other instanceof SpuAttribute;
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
         return "SpuInfo.SpuAttribute(propertyId=" + this.getPropertyId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ", valueList=" + this.getValueList() + ")";
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
         return "SpuInfo.AttributeValue(valueId=" + this.getValueId() + ", value=" + this.getValue() + ")";
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
         return "SpuInfo.Faq(question=" + this.getQuestion() + ", answer=" + this.getAnswer() + ")";
      }
   }
}

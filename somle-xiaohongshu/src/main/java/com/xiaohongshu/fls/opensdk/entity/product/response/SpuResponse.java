package com.xiaohongshu.fls.opensdk.entity.product.response;

import com.xiaohongshu.fls.opensdk.entity.product.AttributeType;
import com.xiaohongshu.fls.opensdk.entity.product.SaleMethod;
import com.xiaohongshu.fls.opensdk.entity.product.SpuType;
import com.xiaohongshu.fls.opensdk.entity.product.ValueType;
import java.util.ArrayList;
import java.util.List;

public class SpuResponse {
   private String id;
   private String name;
   private String ename;
   private String aliasName;
   private String shortName;
   private String businessLineId;
   private String brandId;
   private String categoryId;
   private List<SpuAttribute> attributes = new ArrayList();
   private String shippingTemplateId;
   private Integer shippingGrossWeight;
   private SaleMethod saleMethod;
   private List<String> variantIds = new ArrayList();
   private Boolean isAutoOffSale;
   private Long autoOffSaleTime;
   private Integer inventoryType;
   private SpuType spuType;
   private Boolean isChannel;

   public String getId() {
      return this.id;
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

   public String getBusinessLineId() {
      return this.businessLineId;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public String getCategoryId() {
      return this.categoryId;
   }

   public List<SpuAttribute> getAttributes() {
      return this.attributes;
   }

   public String getShippingTemplateId() {
      return this.shippingTemplateId;
   }

   public Integer getShippingGrossWeight() {
      return this.shippingGrossWeight;
   }

   public SaleMethod getSaleMethod() {
      return this.saleMethod;
   }

   public List<String> getVariantIds() {
      return this.variantIds;
   }

   public Boolean getIsAutoOffSale() {
      return this.isAutoOffSale;
   }

   public Long getAutoOffSaleTime() {
      return this.autoOffSaleTime;
   }

   public Integer getInventoryType() {
      return this.inventoryType;
   }

   public SpuType getSpuType() {
      return this.spuType;
   }

   public Boolean getIsChannel() {
      return this.isChannel;
   }

   public void setId(String id) {
      this.id = id;
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

   public void setBusinessLineId(String businessLineId) {
      this.businessLineId = businessLineId;
   }

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public void setCategoryId(String categoryId) {
      this.categoryId = categoryId;
   }

   public void setAttributes(List<SpuAttribute> attributes) {
      this.attributes = attributes;
   }

   public void setShippingTemplateId(String shippingTemplateId) {
      this.shippingTemplateId = shippingTemplateId;
   }

   public void setShippingGrossWeight(Integer shippingGrossWeight) {
      this.shippingGrossWeight = shippingGrossWeight;
   }

   public void setSaleMethod(SaleMethod saleMethod) {
      this.saleMethod = saleMethod;
   }

   public void setVariantIds(List<String> variantIds) {
      this.variantIds = variantIds;
   }

   public void setIsAutoOffSale(Boolean isAutoOffSale) {
      this.isAutoOffSale = isAutoOffSale;
   }

   public void setAutoOffSaleTime(Long autoOffSaleTime) {
      this.autoOffSaleTime = autoOffSaleTime;
   }

   public void setInventoryType(Integer inventoryType) {
      this.inventoryType = inventoryType;
   }

   public void setSpuType(SpuType spuType) {
      this.spuType = spuType;
   }

   public void setIsChannel(Boolean isChannel) {
      this.isChannel = isChannel;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SpuResponse)) {
         return false;
      } else {
         SpuResponse other = (SpuResponse)o;
         if (!other.canEqual(this)) {
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

            Object this$isAutoOffSale = this.getIsAutoOffSale();
            Object other$isAutoOffSale = other.getIsAutoOffSale();
            if (this$isAutoOffSale == null) {
               if (other$isAutoOffSale != null) {
                  return false;
               }
            } else if (!this$isAutoOffSale.equals(other$isAutoOffSale)) {
               return false;
            }

            Object this$autoOffSaleTime = this.getAutoOffSaleTime();
            Object other$autoOffSaleTime = other.getAutoOffSaleTime();
            if (this$autoOffSaleTime == null) {
               if (other$autoOffSaleTime != null) {
                  return false;
               }
            } else if (!this$autoOffSaleTime.equals(other$autoOffSaleTime)) {
               return false;
            }

            Object this$inventoryType = this.getInventoryType();
            Object other$inventoryType = other.getInventoryType();
            if (this$inventoryType == null) {
               if (other$inventoryType != null) {
                  return false;
               }
            } else if (!this$inventoryType.equals(other$inventoryType)) {
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

            Object this$businessLineId = this.getBusinessLineId();
            Object other$businessLineId = other.getBusinessLineId();
            if (this$businessLineId == null) {
               if (other$businessLineId != null) {
                  return false;
               }
            } else if (!this$businessLineId.equals(other$businessLineId)) {
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

            Object this$saleMethod = this.getSaleMethod();
            Object other$saleMethod = other.getSaleMethod();
            if (this$saleMethod == null) {
               if (other$saleMethod != null) {
                  return false;
               }
            } else if (!this$saleMethod.equals(other$saleMethod)) {
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

            Object this$spuType = this.getSpuType();
            Object other$spuType = other.getSpuType();
            if (this$spuType == null) {
               if (other$spuType != null) {
                  return false;
               }
            } else if (!this$spuType.equals(other$spuType)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SpuResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $shippingGrossWeight = this.getShippingGrossWeight();
      result = result * 59 + ($shippingGrossWeight == null ? 43 : $shippingGrossWeight.hashCode());
      Object $isAutoOffSale = this.getIsAutoOffSale();
      result = result * 59 + ($isAutoOffSale == null ? 43 : $isAutoOffSale.hashCode());
      Object $autoOffSaleTime = this.getAutoOffSaleTime();
      result = result * 59 + ($autoOffSaleTime == null ? 43 : $autoOffSaleTime.hashCode());
      Object $inventoryType = this.getInventoryType();
      result = result * 59 + ($inventoryType == null ? 43 : $inventoryType.hashCode());
      Object $isChannel = this.getIsChannel();
      result = result * 59 + ($isChannel == null ? 43 : $isChannel.hashCode());
      Object $id = this.getId();
      result = result * 59 + ($id == null ? 43 : $id.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $ename = this.getEname();
      result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
      Object $aliasName = this.getAliasName();
      result = result * 59 + ($aliasName == null ? 43 : $aliasName.hashCode());
      Object $shortName = this.getShortName();
      result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
      Object $businessLineId = this.getBusinessLineId();
      result = result * 59 + ($businessLineId == null ? 43 : $businessLineId.hashCode());
      Object $brandId = this.getBrandId();
      result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
      Object $categoryId = this.getCategoryId();
      result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
      Object $attributes = this.getAttributes();
      result = result * 59 + ($attributes == null ? 43 : $attributes.hashCode());
      Object $shippingTemplateId = this.getShippingTemplateId();
      result = result * 59 + ($shippingTemplateId == null ? 43 : $shippingTemplateId.hashCode());
      Object $saleMethod = this.getSaleMethod();
      result = result * 59 + ($saleMethod == null ? 43 : $saleMethod.hashCode());
      Object $variantIds = this.getVariantIds();
      result = result * 59 + ($variantIds == null ? 43 : $variantIds.hashCode());
      Object $spuType = this.getSpuType();
      result = result * 59 + ($spuType == null ? 43 : $spuType.hashCode());
      return result;
   }

   public String toString() {
      return "SpuResponse(id=" + this.getId() + ", name=" + this.getName() + ", ename=" + this.getEname() + ", aliasName=" + this.getAliasName() + ", shortName=" + this.getShortName() + ", businessLineId=" + this.getBusinessLineId() + ", brandId=" + this.getBrandId() + ", categoryId=" + this.getCategoryId() + ", attributes=" + this.getAttributes() + ", shippingTemplateId=" + this.getShippingTemplateId() + ", shippingGrossWeight=" + this.getShippingGrossWeight() + ", saleMethod=" + this.getSaleMethod() + ", variantIds=" + this.getVariantIds() + ", isAutoOffSale=" + this.getIsAutoOffSale() + ", autoOffSaleTime=" + this.getAutoOffSaleTime() + ", inventoryType=" + this.getInventoryType() + ", spuType=" + this.getSpuType() + ", isChannel=" + this.getIsChannel() + ")";
   }

   public static class SpuAttribute {
      private String propertyId;
      private String name;
      private String ename;
      private String value;
      private SpuImageResultV3 image = new SpuImageResultV3();
      private String imageUrl;
      private AttributeType type;
      private String valueId;
      private ValueType valueType;
      private List<AttributeValue> valueList = new ArrayList();

      public String getPropertyId() {
         return this.propertyId;
      }

      public String getName() {
         return this.name;
      }

      public String getEname() {
         return this.ename;
      }

      public String getValue() {
         return this.value;
      }

      public SpuImageResultV3 getImage() {
         return this.image;
      }

      public String getImageUrl() {
         return this.imageUrl;
      }

      public AttributeType getType() {
         return this.type;
      }

      public String getValueId() {
         return this.valueId;
      }

      public ValueType getValueType() {
         return this.valueType;
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

      public void setEname(String ename) {
         this.ename = ename;
      }

      public void setValue(String value) {
         this.value = value;
      }

      public void setImage(SpuImageResultV3 image) {
         this.image = image;
      }

      public void setImageUrl(String imageUrl) {
         this.imageUrl = imageUrl;
      }

      public void setType(AttributeType type) {
         this.type = type;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValueType(ValueType valueType) {
         this.valueType = valueType;
      }

      public void setValueList(List<AttributeValue> valueList) {
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

               Object this$ename = this.getEname();
               Object other$ename = other.getEname();
               if (this$ename == null) {
                  if (other$ename != null) {
                     return false;
                  }
               } else if (!this$ename.equals(other$ename)) {
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

               Object this$image = this.getImage();
               Object other$image = other.getImage();
               if (this$image == null) {
                  if (other$image != null) {
                     return false;
                  }
               } else if (!this$image.equals(other$image)) {
                  return false;
               }

               Object this$imageUrl = this.getImageUrl();
               Object other$imageUrl = other.getImageUrl();
               if (this$imageUrl == null) {
                  if (other$imageUrl != null) {
                     return false;
                  }
               } else if (!this$imageUrl.equals(other$imageUrl)) {
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

               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
                  return false;
               }

               Object this$valueType = this.getValueType();
               Object other$valueType = other.getValueType();
               if (this$valueType == null) {
                  if (other$valueType != null) {
                     return false;
                  }
               } else if (!this$valueType.equals(other$valueType)) {
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
         Object $ename = this.getEname();
         result = result * 59 + ($ename == null ? 43 : $ename.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         Object $image = this.getImage();
         result = result * 59 + ($image == null ? 43 : $image.hashCode());
         Object $imageUrl = this.getImageUrl();
         result = result * 59 + ($imageUrl == null ? 43 : $imageUrl.hashCode());
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $valueType = this.getValueType();
         result = result * 59 + ($valueType == null ? 43 : $valueType.hashCode());
         Object $valueList = this.getValueList();
         result = result * 59 + ($valueList == null ? 43 : $valueList.hashCode());
         return result;
      }

      public String toString() {
         return "SpuResponse.SpuAttribute(propertyId=" + this.getPropertyId() + ", name=" + this.getName() + ", ename=" + this.getEname() + ", value=" + this.getValue() + ", image=" + this.getImage() + ", imageUrl=" + this.getImageUrl() + ", type=" + this.getType() + ", valueId=" + this.getValueId() + ", valueType=" + this.getValueType() + ", valueList=" + this.getValueList() + ")";
      }
   }

   public static class AttributeValue {
      private String valueId;
      private Integer valueType;
      private String value;

      public String getValueId() {
         return this.valueId;
      }

      public Integer getValueType() {
         return this.valueType;
      }

      public String getValue() {
         return this.value;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValueType(Integer valueType) {
         this.valueType = valueType;
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
               Object this$valueType = this.getValueType();
               Object other$valueType = other.getValueType();
               if (this$valueType == null) {
                  if (other$valueType != null) {
                     return false;
                  }
               } else if (!this$valueType.equals(other$valueType)) {
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
         Object $valueType = this.getValueType();
         result = result * 59 + ($valueType == null ? 43 : $valueType.hashCode());
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $value = this.getValue();
         result = result * 59 + ($value == null ? 43 : $value.hashCode());
         return result;
      }

      public String toString() {
         return "SpuResponse.AttributeValue(valueId=" + this.getValueId() + ", valueType=" + this.getValueType() + ", value=" + this.getValue() + ")";
      }
   }

   public static class SpuImageResultV3 {
      private String link;
      private String name;
      private String path;
      private String extension;
      private Integer width;
      private Integer height;
      private String fingerprint;

      public String getLink() {
         return this.link;
      }

      public String getName() {
         return this.name;
      }

      public String getPath() {
         return this.path;
      }

      public String getExtension() {
         return this.extension;
      }

      public Integer getWidth() {
         return this.width;
      }

      public Integer getHeight() {
         return this.height;
      }

      public String getFingerprint() {
         return this.fingerprint;
      }

      public void setLink(String link) {
         this.link = link;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setPath(String path) {
         this.path = path;
      }

      public void setExtension(String extension) {
         this.extension = extension;
      }

      public void setWidth(Integer width) {
         this.width = width;
      }

      public void setHeight(Integer height) {
         this.height = height;
      }

      public void setFingerprint(String fingerprint) {
         this.fingerprint = fingerprint;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SpuImageResultV3)) {
            return false;
         } else {
            SpuImageResultV3 other = (SpuImageResultV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
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

               Object this$link = this.getLink();
               Object other$link = other.getLink();
               if (this$link == null) {
                  if (other$link != null) {
                     return false;
                  }
               } else if (!this$link.equals(other$link)) {
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

               Object this$path = this.getPath();
               Object other$path = other.getPath();
               if (this$path == null) {
                  if (other$path != null) {
                     return false;
                  }
               } else if (!this$path.equals(other$path)) {
                  return false;
               }

               Object this$extension = this.getExtension();
               Object other$extension = other.getExtension();
               if (this$extension == null) {
                  if (other$extension != null) {
                     return false;
                  }
               } else if (!this$extension.equals(other$extension)) {
                  return false;
               }

               Object this$fingerprint = this.getFingerprint();
               Object other$fingerprint = other.getFingerprint();
               if (this$fingerprint == null) {
                  if (other$fingerprint != null) {
                     return false;
                  }
               } else if (!this$fingerprint.equals(other$fingerprint)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SpuImageResultV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $width = this.getWidth();
         result = result * 59 + ($width == null ? 43 : $width.hashCode());
         Object $height = this.getHeight();
         result = result * 59 + ($height == null ? 43 : $height.hashCode());
         Object $link = this.getLink();
         result = result * 59 + ($link == null ? 43 : $link.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $path = this.getPath();
         result = result * 59 + ($path == null ? 43 : $path.hashCode());
         Object $extension = this.getExtension();
         result = result * 59 + ($extension == null ? 43 : $extension.hashCode());
         Object $fingerprint = this.getFingerprint();
         result = result * 59 + ($fingerprint == null ? 43 : $fingerprint.hashCode());
         return result;
      }

      public String toString() {
         return "SpuResponse.SpuImageResultV3(link=" + this.getLink() + ", name=" + this.getName() + ", path=" + this.getPath() + ", extension=" + this.getExtension() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", fingerprint=" + this.getFingerprint() + ")";
      }
   }
}

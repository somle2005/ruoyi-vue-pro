package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xiaohongshu.fls.opensdk.entity.product.DeliveryTimeType;
import com.xiaohongshu.fls.opensdk.entity.product.request.v3.UpdateItemV3Request;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(
   ignoreUnknown = true
)
public class ItemAndSkuDetail {
   private String itemId;
   private String name;
   private String ename;
   private Long brandId;
   private String categoryId;
   private List<ItemAttribute> attributes;
   private String shippingTemplateId;
   private Integer shippingGrossWeight;
   private List<String> variantIds;
   private List<Material> images;
   private List<Material> standardImages;
   private List<Material> longImages;
   private List<Material> videos;
   private String articleNo;
   public List<Material> imageDescriptions;
   public String transparentImage;
   public String description;
   public Integer deliveryMode;
   public Integer freeReturn;
   public Boolean enableMultiWarehouse;
   public List<Material> sizeTableImage;
   public List<Material> recommendSizeTableImage;
   public List<Material> modelTryOnSizeTableImage;
   public Boolean enableMainSpecImage;
   public List<Sku> skuList;
   public Boolean enableStepPresale;
   public String itemShortTitle;

   public String getItemId() {
      return this.itemId;
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

   public List<Material> getImages() {
      return this.images;
   }

   public List<Material> getStandardImages() {
      return this.standardImages;
   }

   public List<Material> getLongImages() {
      return this.longImages;
   }

   public List<Material> getVideos() {
      return this.videos;
   }

   public String getArticleNo() {
      return this.articleNo;
   }

   public List<Material> getImageDescriptions() {
      return this.imageDescriptions;
   }

   public String getTransparentImage() {
      return this.transparentImage;
   }

   public String getDescription() {
      return this.description;
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

   public List<Material> getSizeTableImage() {
      return this.sizeTableImage;
   }

   public List<Material> getRecommendSizeTableImage() {
      return this.recommendSizeTableImage;
   }

   public List<Material> getModelTryOnSizeTableImage() {
      return this.modelTryOnSizeTableImage;
   }

   public Boolean getEnableMainSpecImage() {
      return this.enableMainSpecImage;
   }

   public List<Sku> getSkuList() {
      return this.skuList;
   }

   public Boolean getEnableStepPresale() {
      return this.enableStepPresale;
   }

   public String getItemShortTitle() {
      return this.itemShortTitle;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
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

   public void setImages(List<Material> images) {
      this.images = images;
   }

   public void setStandardImages(List<Material> standardImages) {
      this.standardImages = standardImages;
   }

   public void setLongImages(List<Material> longImages) {
      this.longImages = longImages;
   }

   public void setVideos(List<Material> videos) {
      this.videos = videos;
   }

   public void setArticleNo(String articleNo) {
      this.articleNo = articleNo;
   }

   public void setImageDescriptions(List<Material> imageDescriptions) {
      this.imageDescriptions = imageDescriptions;
   }

   public void setTransparentImage(String transparentImage) {
      this.transparentImage = transparentImage;
   }

   public void setDescription(String description) {
      this.description = description;
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

   public void setSizeTableImage(List<Material> sizeTableImage) {
      this.sizeTableImage = sizeTableImage;
   }

   public void setRecommendSizeTableImage(List<Material> recommendSizeTableImage) {
      this.recommendSizeTableImage = recommendSizeTableImage;
   }

   public void setModelTryOnSizeTableImage(List<Material> modelTryOnSizeTableImage) {
      this.modelTryOnSizeTableImage = modelTryOnSizeTableImage;
   }

   public void setEnableMainSpecImage(Boolean enableMainSpecImage) {
      this.enableMainSpecImage = enableMainSpecImage;
   }

   public void setSkuList(List<Sku> skuList) {
      this.skuList = skuList;
   }

   public void setEnableStepPresale(Boolean enableStepPresale) {
      this.enableStepPresale = enableStepPresale;
   }

   public void setItemShortTitle(String itemShortTitle) {
      this.itemShortTitle = itemShortTitle;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ItemAndSkuDetail)) {
         return false;
      } else {
         ItemAndSkuDetail other = (ItemAndSkuDetail)o;
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

            Object this$enableStepPresale = this.getEnableStepPresale();
            Object other$enableStepPresale = other.getEnableStepPresale();
            if (this$enableStepPresale == null) {
               if (other$enableStepPresale != null) {
                  return false;
               }
            } else if (!this$enableStepPresale.equals(other$enableStepPresale)) {
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

            Object this$videos = this.getVideos();
            Object other$videos = other.getVideos();
            if (this$videos == null) {
               if (other$videos != null) {
                  return false;
               }
            } else if (!this$videos.equals(other$videos)) {
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

            Object this$skuList = this.getSkuList();
            Object other$skuList = other.getSkuList();
            if (this$skuList == null) {
               if (other$skuList != null) {
                  return false;
               }
            } else if (!this$skuList.equals(other$skuList)) {
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
      return other instanceof ItemAndSkuDetail;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $brandId = this.getBrandId();
      result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
      Object $shippingGrossWeight = this.getShippingGrossWeight();
      result = result * 59 + ($shippingGrossWeight == null ? 43 : $shippingGrossWeight.hashCode());
      Object $deliveryMode = this.getDeliveryMode();
      result = result * 59 + ($deliveryMode == null ? 43 : $deliveryMode.hashCode());
      Object $freeReturn = this.getFreeReturn();
      result = result * 59 + ($freeReturn == null ? 43 : $freeReturn.hashCode());
      Object $enableMultiWarehouse = this.getEnableMultiWarehouse();
      result = result * 59 + ($enableMultiWarehouse == null ? 43 : $enableMultiWarehouse.hashCode());
      Object $enableMainSpecImage = this.getEnableMainSpecImage();
      result = result * 59 + ($enableMainSpecImage == null ? 43 : $enableMainSpecImage.hashCode());
      Object $enableStepPresale = this.getEnableStepPresale();
      result = result * 59 + ($enableStepPresale == null ? 43 : $enableStepPresale.hashCode());
      Object $itemId = this.getItemId();
      result = result * 59 + ($itemId == null ? 43 : $itemId.hashCode());
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
      Object $videos = this.getVideos();
      result = result * 59 + ($videos == null ? 43 : $videos.hashCode());
      Object $articleNo = this.getArticleNo();
      result = result * 59 + ($articleNo == null ? 43 : $articleNo.hashCode());
      Object $imageDescriptions = this.getImageDescriptions();
      result = result * 59 + ($imageDescriptions == null ? 43 : $imageDescriptions.hashCode());
      Object $transparentImage = this.getTransparentImage();
      result = result * 59 + ($transparentImage == null ? 43 : $transparentImage.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $sizeTableImage = this.getSizeTableImage();
      result = result * 59 + ($sizeTableImage == null ? 43 : $sizeTableImage.hashCode());
      Object $recommendSizeTableImage = this.getRecommendSizeTableImage();
      result = result * 59 + ($recommendSizeTableImage == null ? 43 : $recommendSizeTableImage.hashCode());
      Object $modelTryOnSizeTableImage = this.getModelTryOnSizeTableImage();
      result = result * 59 + ($modelTryOnSizeTableImage == null ? 43 : $modelTryOnSizeTableImage.hashCode());
      Object $skuList = this.getSkuList();
      result = result * 59 + ($skuList == null ? 43 : $skuList.hashCode());
      Object $itemShortTitle = this.getItemShortTitle();
      result = result * 59 + ($itemShortTitle == null ? 43 : $itemShortTitle.hashCode());
      return result;
   }

   public String toString() {
      return "ItemAndSkuDetail(itemId=" + this.getItemId() + ", name=" + this.getName() + ", ename=" + this.getEname() + ", brandId=" + this.getBrandId() + ", categoryId=" + this.getCategoryId() + ", attributes=" + this.getAttributes() + ", shippingTemplateId=" + this.getShippingTemplateId() + ", shippingGrossWeight=" + this.getShippingGrossWeight() + ", variantIds=" + this.getVariantIds() + ", images=" + this.getImages() + ", standardImages=" + this.getStandardImages() + ", longImages=" + this.getLongImages() + ", videos=" + this.getVideos() + ", articleNo=" + this.getArticleNo() + ", imageDescriptions=" + this.getImageDescriptions() + ", transparentImage=" + this.getTransparentImage() + ", description=" + this.getDescription() + ", deliveryMode=" + this.getDeliveryMode() + ", freeReturn=" + this.getFreeReturn() + ", enableMultiWarehouse=" + this.getEnableMultiWarehouse() + ", sizeTableImage=" + this.getSizeTableImage() + ", recommendSizeTableImage=" + this.getRecommendSizeTableImage() + ", modelTryOnSizeTableImage=" + this.getModelTryOnSizeTableImage() + ", enableMainSpecImage=" + this.getEnableMainSpecImage() + ", skuList=" + this.getSkuList() + ", enableStepPresale=" + this.getEnableStepPresale() + ", itemShortTitle=" + this.getItemShortTitle() + ")";
   }

   public static class Sku {
      private String skuId;
      private Integer originalPrice;
      private Integer price;
      private Integer stock;
      private String logisticsPlanId;
      private Boolean includeTax;
      private String erpCode;
      private List<Variant> variants;
      private DeliveryTime deliveryTime;
      private String specImage;
      private String barcode;
      private Integer deliveryFlag;

      public String getSkuId() {
         return this.skuId;
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

      public Boolean getIncludeTax() {
         return this.includeTax;
      }

      public String getErpCode() {
         return this.erpCode;
      }

      public List<Variant> getVariants() {
         return this.variants;
      }

      public DeliveryTime getDeliveryTime() {
         return this.deliveryTime;
      }

      public String getSpecImage() {
         return this.specImage;
      }

      public String getBarcode() {
         return this.barcode;
      }

      public Integer getDeliveryFlag() {
         return this.deliveryFlag;
      }

      public void setSkuId(String skuId) {
         this.skuId = skuId;
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

      public void setIncludeTax(Boolean includeTax) {
         this.includeTax = includeTax;
      }

      public void setErpCode(String erpCode) {
         this.erpCode = erpCode;
      }

      public void setVariants(List<Variant> variants) {
         this.variants = variants;
      }

      public void setDeliveryTime(DeliveryTime deliveryTime) {
         this.deliveryTime = deliveryTime;
      }

      public void setSpecImage(String specImage) {
         this.specImage = specImage;
      }

      public void setBarcode(String barcode) {
         this.barcode = barcode;
      }

      public void setDeliveryFlag(Integer deliveryFlag) {
         this.deliveryFlag = deliveryFlag;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Sku)) {
            return false;
         } else {
            Sku other = (Sku)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
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

               Object this$includeTax = this.getIncludeTax();
               Object other$includeTax = other.getIncludeTax();
               if (this$includeTax == null) {
                  if (other$includeTax != null) {
                     return false;
                  }
               } else if (!this$includeTax.equals(other$includeTax)) {
                  return false;
               }

               Object this$deliveryFlag = this.getDeliveryFlag();
               Object other$deliveryFlag = other.getDeliveryFlag();
               if (this$deliveryFlag == null) {
                  if (other$deliveryFlag != null) {
                     return false;
                  }
               } else if (!this$deliveryFlag.equals(other$deliveryFlag)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Sku;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $originalPrice = this.getOriginalPrice();
         result = result * 59 + ($originalPrice == null ? 43 : $originalPrice.hashCode());
         Object $price = this.getPrice();
         result = result * 59 + ($price == null ? 43 : $price.hashCode());
         Object $stock = this.getStock();
         result = result * 59 + ($stock == null ? 43 : $stock.hashCode());
         Object $includeTax = this.getIncludeTax();
         result = result * 59 + ($includeTax == null ? 43 : $includeTax.hashCode());
         Object $deliveryFlag = this.getDeliveryFlag();
         result = result * 59 + ($deliveryFlag == null ? 43 : $deliveryFlag.hashCode());
         Object $skuId = this.getSkuId();
         result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
         Object $logisticsPlanId = this.getLogisticsPlanId();
         result = result * 59 + ($logisticsPlanId == null ? 43 : $logisticsPlanId.hashCode());
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
         return result;
      }

      public String toString() {
         return "ItemAndSkuDetail.Sku(skuId=" + this.getSkuId() + ", originalPrice=" + this.getOriginalPrice() + ", price=" + this.getPrice() + ", stock=" + this.getStock() + ", logisticsPlanId=" + this.getLogisticsPlanId() + ", includeTax=" + this.getIncludeTax() + ", erpCode=" + this.getErpCode() + ", variants=" + this.getVariants() + ", deliveryTime=" + this.getDeliveryTime() + ", specImage=" + this.getSpecImage() + ", barcode=" + this.getBarcode() + ", deliveryFlag=" + this.getDeliveryFlag() + ")";
      }
   }

   public static class Material {
      private String link;

      public String getLink() {
         return this.link;
      }

      public void setLink(String link) {
         this.link = link;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Material)) {
            return false;
         } else {
            Material other = (Material)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$link = this.getLink();
               Object other$link = other.getLink();
               if (this$link == null) {
                  if (other$link != null) {
                     return false;
                  }
               } else if (!this$link.equals(other$link)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Material;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $link = this.getLink();
         result = result * 59 + ($link == null ? 43 : $link.hashCode());
         return result;
      }

      public String toString() {
         return "ItemAndSkuDetail.Material(link=" + this.getLink() + ")";
      }
   }

   public static class ItemAttribute {
      private String propertyId;
      private String name;
      private String value;
      private String valueId;
      private List<UpdateItemV3Request.AttributeValue> valueList = new ArrayList();

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

      public List<UpdateItemV3Request.AttributeValue> getValueList() {
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

      public void setValueList(List<UpdateItemV3Request.AttributeValue> valueList) {
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
         return "ItemAndSkuDetail.ItemAttribute(propertyId=" + this.getPropertyId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ", valueList=" + this.getValueList() + ")";
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
         return "ItemAndSkuDetail.AttributeValue(valueId=" + this.getValueId() + ", value=" + this.getValue() + ")";
      }
   }

   public static class Variant {
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
         } else if (!(o instanceof Variant)) {
            return false;
         } else {
            Variant other = (Variant)o;
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
         return other instanceof Variant;
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
         return "ItemAndSkuDetail.Variant(id=" + this.getId() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueId=" + this.getValueId() + ")";
      }
   }

   public static class DeliveryTime {
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
         } else if (!(o instanceof DeliveryTime)) {
            return false;
         } else {
            DeliveryTime other = (DeliveryTime)o;
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
         return other instanceof DeliveryTime;
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
         return "ItemAndSkuDetail.DeliveryTime(time=" + this.getTime() + ", type=" + this.getType() + ")";
      }
   }
}

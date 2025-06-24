package com.xiaohongshu.fls.opensdk.entity.product.response;

import java.util.ArrayList;
import java.util.List;

public class GetSpuResponse {
   public int currentPage;
   public int pageSize;
   public int total;
   public List<SpuBasicInfo> spuBasicInfos = new ArrayList();

   public int getCurrentPage() {
      return this.currentPage;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public int getTotal() {
      return this.total;
   }

   public List<SpuBasicInfo> getSpuBasicInfos() {
      return this.spuBasicInfos;
   }

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   public void setSpuBasicInfos(List<SpuBasicInfo> spuBasicInfos) {
      this.spuBasicInfos = spuBasicInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetSpuResponse)) {
         return false;
      } else {
         GetSpuResponse other = (GetSpuResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getCurrentPage() != other.getCurrentPage()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else if (this.getTotal() != other.getTotal()) {
            return false;
         } else {
            Object this$spuBasicInfos = this.getSpuBasicInfos();
            Object other$spuBasicInfos = other.getSpuBasicInfos();
            if (this$spuBasicInfos == null) {
               if (other$spuBasicInfos != null) {
                  return false;
               }
            } else if (!this$spuBasicInfos.equals(other$spuBasicInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetSpuResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getCurrentPage();
      result = result * 59 + this.getPageSize();
      result = result * 59 + this.getTotal();
      Object $spuBasicInfos = this.getSpuBasicInfos();
      result = result * 59 + ($spuBasicInfos == null ? 43 : $spuBasicInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetSpuResponse(currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ", total=" + this.getTotal() + ", spuBasicInfos=" + this.getSpuBasicInfos() + ")";
   }

   public static class SpuBasicInfo {
      public String id;
      public String name;
      public Image topImage;
      public double minPrice;
      public double maxPrice;
      public boolean buyable;
      public long minCreateTime;
      public long maxCreateTime;
      public long stock;
      public String categoryId;

      public String getId() {
         return this.id;
      }

      public String getName() {
         return this.name;
      }

      public Image getTopImage() {
         return this.topImage;
      }

      public double getMinPrice() {
         return this.minPrice;
      }

      public double getMaxPrice() {
         return this.maxPrice;
      }

      public boolean isBuyable() {
         return this.buyable;
      }

      public long getMinCreateTime() {
         return this.minCreateTime;
      }

      public long getMaxCreateTime() {
         return this.maxCreateTime;
      }

      public long getStock() {
         return this.stock;
      }

      public String getCategoryId() {
         return this.categoryId;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setTopImage(Image topImage) {
         this.topImage = topImage;
      }

      public void setMinPrice(double minPrice) {
         this.minPrice = minPrice;
      }

      public void setMaxPrice(double maxPrice) {
         this.maxPrice = maxPrice;
      }

      public void setBuyable(boolean buyable) {
         this.buyable = buyable;
      }

      public void setMinCreateTime(long minCreateTime) {
         this.minCreateTime = minCreateTime;
      }

      public void setMaxCreateTime(long maxCreateTime) {
         this.maxCreateTime = maxCreateTime;
      }

      public void setStock(long stock) {
         this.stock = stock;
      }

      public void setCategoryId(String categoryId) {
         this.categoryId = categoryId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SpuBasicInfo)) {
            return false;
         } else {
            SpuBasicInfo other = (SpuBasicInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (Double.compare(this.getMinPrice(), other.getMinPrice()) != 0) {
               return false;
            } else if (Double.compare(this.getMaxPrice(), other.getMaxPrice()) != 0) {
               return false;
            } else if (this.isBuyable() != other.isBuyable()) {
               return false;
            } else if (this.getMinCreateTime() != other.getMinCreateTime()) {
               return false;
            } else if (this.getMaxCreateTime() != other.getMaxCreateTime()) {
               return false;
            } else if (this.getStock() != other.getStock()) {
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

               Object this$topImage = this.getTopImage();
               Object other$topImage = other.getTopImage();
               if (this$topImage == null) {
                  if (other$topImage != null) {
                     return false;
                  }
               } else if (!this$topImage.equals(other$topImage)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SpuBasicInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         long $minPrice = Double.doubleToLongBits(this.getMinPrice());
         result = result * 59 + (int)($minPrice >>> 32 ^ $minPrice);
         long $maxPrice = Double.doubleToLongBits(this.getMaxPrice());
         result = result * 59 + (int)($maxPrice >>> 32 ^ $maxPrice);
         result = result * 59 + (this.isBuyable() ? 79 : 97);
         long $minCreateTime = this.getMinCreateTime();
         result = result * 59 + (int)($minCreateTime >>> 32 ^ $minCreateTime);
         long $maxCreateTime = this.getMaxCreateTime();
         result = result * 59 + (int)($maxCreateTime >>> 32 ^ $maxCreateTime);
         long $stock = this.getStock();
         result = result * 59 + (int)($stock >>> 32 ^ $stock);
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $topImage = this.getTopImage();
         result = result * 59 + ($topImage == null ? 43 : $topImage.hashCode());
         Object $categoryId = this.getCategoryId();
         result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
         return result;
      }

      public String toString() {
         return "GetSpuResponse.SpuBasicInfo(id=" + this.getId() + ", name=" + this.getName() + ", topImage=" + this.getTopImage() + ", minPrice=" + this.getMinPrice() + ", maxPrice=" + this.getMaxPrice() + ", buyable=" + this.isBuyable() + ", minCreateTime=" + this.getMinCreateTime() + ", maxCreateTime=" + this.getMaxCreateTime() + ", stock=" + this.getStock() + ", categoryId=" + this.getCategoryId() + ")";
      }
   }

   public static class Image {
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
         } else if (!(o instanceof Image)) {
            return false;
         } else {
            Image other = (Image)o;
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
         return other instanceof Image;
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
         return "GetSpuResponse.Image(link=" + this.getLink() + ", name=" + this.getName() + ", path=" + this.getPath() + ", extension=" + this.getExtension() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", fingerprint=" + this.getFingerprint() + ")";
      }
   }
}

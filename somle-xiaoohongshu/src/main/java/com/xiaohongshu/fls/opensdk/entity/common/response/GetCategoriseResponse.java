package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetCategoriseResponse {
   public Boolean sellerInCategoryGray;
   public List<CategoryV3> categoryV3s;

   public Boolean getSellerInCategoryGray() {
      return this.sellerInCategoryGray;
   }

   public List<CategoryV3> getCategoryV3s() {
      return this.categoryV3s;
   }

   public void setSellerInCategoryGray(Boolean sellerInCategoryGray) {
      this.sellerInCategoryGray = sellerInCategoryGray;
   }

   public void setCategoryV3s(List<CategoryV3> categoryV3s) {
      this.categoryV3s = categoryV3s;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCategoriseResponse)) {
         return false;
      } else {
         GetCategoriseResponse other = (GetCategoriseResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$sellerInCategoryGray = this.getSellerInCategoryGray();
            Object other$sellerInCategoryGray = other.getSellerInCategoryGray();
            if (this$sellerInCategoryGray == null) {
               if (other$sellerInCategoryGray != null) {
                  return false;
               }
            } else if (!this$sellerInCategoryGray.equals(other$sellerInCategoryGray)) {
               return false;
            }

            Object this$categoryV3s = this.getCategoryV3s();
            Object other$categoryV3s = other.getCategoryV3s();
            if (this$categoryV3s == null) {
               if (other$categoryV3s != null) {
                  return false;
               }
            } else if (!this$categoryV3s.equals(other$categoryV3s)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCategoriseResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $sellerInCategoryGray = this.getSellerInCategoryGray();
      result = result * 59 + ($sellerInCategoryGray == null ? 43 : $sellerInCategoryGray.hashCode());
      Object $categoryV3s = this.getCategoryV3s();
      result = result * 59 + ($categoryV3s == null ? 43 : $categoryV3s.hashCode());
      return result;
   }

   public String toString() {
      return "GetCategoriseResponse(sellerInCategoryGray=" + this.getSellerInCategoryGray() + ", categoryV3s=" + this.getCategoryV3s() + ")";
   }

   public static class CategoryV3 {
      private String id;
      private String name;
      private String enName;
      private Boolean supportSizeTable;
      private Boolean supportRecommendSizeTable;
      private Boolean supportModelTryOnSizeTable;
      private Boolean supportMainSpecImage;
      private String mainSpecId;
      private Boolean isLeaf;

      public String getId() {
         return this.id;
      }

      public String getName() {
         return this.name;
      }

      public String getEnName() {
         return this.enName;
      }

      public Boolean getSupportSizeTable() {
         return this.supportSizeTable;
      }

      public Boolean getSupportRecommendSizeTable() {
         return this.supportRecommendSizeTable;
      }

      public Boolean getSupportModelTryOnSizeTable() {
         return this.supportModelTryOnSizeTable;
      }

      public Boolean getSupportMainSpecImage() {
         return this.supportMainSpecImage;
      }

      public String getMainSpecId() {
         return this.mainSpecId;
      }

      public Boolean getIsLeaf() {
         return this.isLeaf;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setEnName(String enName) {
         this.enName = enName;
      }

      public void setSupportSizeTable(Boolean supportSizeTable) {
         this.supportSizeTable = supportSizeTable;
      }

      public void setSupportRecommendSizeTable(Boolean supportRecommendSizeTable) {
         this.supportRecommendSizeTable = supportRecommendSizeTable;
      }

      public void setSupportModelTryOnSizeTable(Boolean supportModelTryOnSizeTable) {
         this.supportModelTryOnSizeTable = supportModelTryOnSizeTable;
      }

      public void setSupportMainSpecImage(Boolean supportMainSpecImage) {
         this.supportMainSpecImage = supportMainSpecImage;
      }

      public void setMainSpecId(String mainSpecId) {
         this.mainSpecId = mainSpecId;
      }

      public void setIsLeaf(Boolean isLeaf) {
         this.isLeaf = isLeaf;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof CategoryV3)) {
            return false;
         } else {
            CategoryV3 other = (CategoryV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$supportSizeTable = this.getSupportSizeTable();
               Object other$supportSizeTable = other.getSupportSizeTable();
               if (this$supportSizeTable == null) {
                  if (other$supportSizeTable != null) {
                     return false;
                  }
               } else if (!this$supportSizeTable.equals(other$supportSizeTable)) {
                  return false;
               }

               Object this$supportRecommendSizeTable = this.getSupportRecommendSizeTable();
               Object other$supportRecommendSizeTable = other.getSupportRecommendSizeTable();
               if (this$supportRecommendSizeTable == null) {
                  if (other$supportRecommendSizeTable != null) {
                     return false;
                  }
               } else if (!this$supportRecommendSizeTable.equals(other$supportRecommendSizeTable)) {
                  return false;
               }

               Object this$supportModelTryOnSizeTable = this.getSupportModelTryOnSizeTable();
               Object other$supportModelTryOnSizeTable = other.getSupportModelTryOnSizeTable();
               if (this$supportModelTryOnSizeTable == null) {
                  if (other$supportModelTryOnSizeTable != null) {
                     return false;
                  }
               } else if (!this$supportModelTryOnSizeTable.equals(other$supportModelTryOnSizeTable)) {
                  return false;
               }

               Object this$supportMainSpecImage = this.getSupportMainSpecImage();
               Object other$supportMainSpecImage = other.getSupportMainSpecImage();
               if (this$supportMainSpecImage == null) {
                  if (other$supportMainSpecImage != null) {
                     return false;
                  }
               } else if (!this$supportMainSpecImage.equals(other$supportMainSpecImage)) {
                  return false;
               }

               Object this$isLeaf = this.getIsLeaf();
               Object other$isLeaf = other.getIsLeaf();
               if (this$isLeaf == null) {
                  if (other$isLeaf != null) {
                     return false;
                  }
               } else if (!this$isLeaf.equals(other$isLeaf)) {
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

               Object this$enName = this.getEnName();
               Object other$enName = other.getEnName();
               if (this$enName == null) {
                  if (other$enName != null) {
                     return false;
                  }
               } else if (!this$enName.equals(other$enName)) {
                  return false;
               }

               Object this$mainSpecId = this.getMainSpecId();
               Object other$mainSpecId = other.getMainSpecId();
               if (this$mainSpecId == null) {
                  if (other$mainSpecId != null) {
                     return false;
                  }
               } else if (!this$mainSpecId.equals(other$mainSpecId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof CategoryV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $supportSizeTable = this.getSupportSizeTable();
         result = result * 59 + ($supportSizeTable == null ? 43 : $supportSizeTable.hashCode());
         Object $supportRecommendSizeTable = this.getSupportRecommendSizeTable();
         result = result * 59 + ($supportRecommendSizeTable == null ? 43 : $supportRecommendSizeTable.hashCode());
         Object $supportModelTryOnSizeTable = this.getSupportModelTryOnSizeTable();
         result = result * 59 + ($supportModelTryOnSizeTable == null ? 43 : $supportModelTryOnSizeTable.hashCode());
         Object $supportMainSpecImage = this.getSupportMainSpecImage();
         result = result * 59 + ($supportMainSpecImage == null ? 43 : $supportMainSpecImage.hashCode());
         Object $isLeaf = this.getIsLeaf();
         result = result * 59 + ($isLeaf == null ? 43 : $isLeaf.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $enName = this.getEnName();
         result = result * 59 + ($enName == null ? 43 : $enName.hashCode());
         Object $mainSpecId = this.getMainSpecId();
         result = result * 59 + ($mainSpecId == null ? 43 : $mainSpecId.hashCode());
         return result;
      }

      public String toString() {
         return "GetCategoriseResponse.CategoryV3(id=" + this.getId() + ", name=" + this.getName() + ", enName=" + this.getEnName() + ", supportSizeTable=" + this.getSupportSizeTable() + ", supportRecommendSizeTable=" + this.getSupportRecommendSizeTable() + ", supportModelTryOnSizeTable=" + this.getSupportModelTryOnSizeTable() + ", supportMainSpecImage=" + this.getSupportMainSpecImage() + ", mainSpecId=" + this.getMainSpecId() + ", isLeaf=" + this.getIsLeaf() + ")";
      }
   }
}

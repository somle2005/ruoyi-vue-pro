package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class CategoryMatchV2Response {
   private List<RecommendCategory> recommendCategories;

   public List<RecommendCategory> getRecommendCategories() {
      return this.recommendCategories;
   }

   public void setRecommendCategories(List<RecommendCategory> recommendCategories) {
      this.recommendCategories = recommendCategories;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CategoryMatchV2Response)) {
         return false;
      } else {
         CategoryMatchV2Response other = (CategoryMatchV2Response)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$recommendCategories = this.getRecommendCategories();
            Object other$recommendCategories = other.getRecommendCategories();
            if (this$recommendCategories == null) {
               if (other$recommendCategories != null) {
                  return false;
               }
            } else if (!this$recommendCategories.equals(other$recommendCategories)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CategoryMatchV2Response;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $recommendCategories = this.getRecommendCategories();
      result = result * 59 + ($recommendCategories == null ? 43 : $recommendCategories.hashCode());
      return result;
   }

   public String toString() {
      return "CategoryMatchV2Response(recommendCategories=" + this.getRecommendCategories() + ")";
   }

   public static class RecommendCategory {
      private List<Category> categoryPathList;
      private Boolean marketable;
      private String categoryName;
      private String categoryId;

      public List<Category> getCategoryPathList() {
         return this.categoryPathList;
      }

      public Boolean getMarketable() {
         return this.marketable;
      }

      public String getCategoryName() {
         return this.categoryName;
      }

      public String getCategoryId() {
         return this.categoryId;
      }

      public void setCategoryPathList(List<Category> categoryPathList) {
         this.categoryPathList = categoryPathList;
      }

      public void setMarketable(Boolean marketable) {
         this.marketable = marketable;
      }

      public void setCategoryName(String categoryName) {
         this.categoryName = categoryName;
      }

      public void setCategoryId(String categoryId) {
         this.categoryId = categoryId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof RecommendCategory)) {
            return false;
         } else {
            RecommendCategory other = (RecommendCategory)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$marketable = this.getMarketable();
               Object other$marketable = other.getMarketable();
               if (this$marketable == null) {
                  if (other$marketable != null) {
                     return false;
                  }
               } else if (!this$marketable.equals(other$marketable)) {
                  return false;
               }

               Object this$categoryPathList = this.getCategoryPathList();
               Object other$categoryPathList = other.getCategoryPathList();
               if (this$categoryPathList == null) {
                  if (other$categoryPathList != null) {
                     return false;
                  }
               } else if (!this$categoryPathList.equals(other$categoryPathList)) {
                  return false;
               }

               Object this$categoryName = this.getCategoryName();
               Object other$categoryName = other.getCategoryName();
               if (this$categoryName == null) {
                  if (other$categoryName != null) {
                     return false;
                  }
               } else if (!this$categoryName.equals(other$categoryName)) {
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
         return other instanceof RecommendCategory;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $marketable = this.getMarketable();
         result = result * 59 + ($marketable == null ? 43 : $marketable.hashCode());
         Object $categoryPathList = this.getCategoryPathList();
         result = result * 59 + ($categoryPathList == null ? 43 : $categoryPathList.hashCode());
         Object $categoryName = this.getCategoryName();
         result = result * 59 + ($categoryName == null ? 43 : $categoryName.hashCode());
         Object $categoryId = this.getCategoryId();
         result = result * 59 + ($categoryId == null ? 43 : $categoryId.hashCode());
         return result;
      }

      public String toString() {
         return "CategoryMatchV2Response.RecommendCategory(categoryPathList=" + this.getCategoryPathList() + ", marketable=" + this.getMarketable() + ", categoryName=" + this.getCategoryName() + ", categoryId=" + this.getCategoryId() + ")";
      }
   }

   public static class Category {
      private Integer categoryType;
      private Integer level;
      private String name;
      private String id;
      private Boolean isLeaf;
      private String parentId;

      public Integer getCategoryType() {
         return this.categoryType;
      }

      public Integer getLevel() {
         return this.level;
      }

      public String getName() {
         return this.name;
      }

      public String getId() {
         return this.id;
      }

      public Boolean getIsLeaf() {
         return this.isLeaf;
      }

      public String getParentId() {
         return this.parentId;
      }

      public void setCategoryType(Integer categoryType) {
         this.categoryType = categoryType;
      }

      public void setLevel(Integer level) {
         this.level = level;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setIsLeaf(Boolean isLeaf) {
         this.isLeaf = isLeaf;
      }

      public void setParentId(String parentId) {
         this.parentId = parentId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Category)) {
            return false;
         } else {
            Category other = (Category)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$categoryType = this.getCategoryType();
               Object other$categoryType = other.getCategoryType();
               if (this$categoryType == null) {
                  if (other$categoryType != null) {
                     return false;
                  }
               } else if (!this$categoryType.equals(other$categoryType)) {
                  return false;
               }

               Object this$level = this.getLevel();
               Object other$level = other.getLevel();
               if (this$level == null) {
                  if (other$level != null) {
                     return false;
                  }
               } else if (!this$level.equals(other$level)) {
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

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
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

               Object this$parentId = this.getParentId();
               Object other$parentId = other.getParentId();
               if (this$parentId == null) {
                  if (other$parentId != null) {
                     return false;
                  }
               } else if (!this$parentId.equals(other$parentId)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Category;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $categoryType = this.getCategoryType();
         result = result * 59 + ($categoryType == null ? 43 : $categoryType.hashCode());
         Object $level = this.getLevel();
         result = result * 59 + ($level == null ? 43 : $level.hashCode());
         Object $isLeaf = this.getIsLeaf();
         result = result * 59 + ($isLeaf == null ? 43 : $isLeaf.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $parentId = this.getParentId();
         result = result * 59 + ($parentId == null ? 43 : $parentId.hashCode());
         return result;
      }

      public String toString() {
         return "CategoryMatchV2Response.Category(categoryType=" + this.getCategoryType() + ", level=" + this.getLevel() + ", name=" + this.getName() + ", id=" + this.getId() + ", isLeaf=" + this.getIsLeaf() + ", parentId=" + this.getParentId() + ")";
      }
   }
}

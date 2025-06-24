package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class GetBrandResponse {
   private List<BrandV3> brands = new ArrayList();

   public List<BrandV3> getBrands() {
      return this.brands;
   }

   public void setBrands(List<BrandV3> brands) {
      this.brands = brands;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetBrandResponse)) {
         return false;
      } else {
         GetBrandResponse other = (GetBrandResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$brands = this.getBrands();
            Object other$brands = other.getBrands();
            if (this$brands == null) {
               if (other$brands != null) {
                  return false;
               }
            } else if (!this$brands.equals(other$brands)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetBrandResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $brands = this.getBrands();
      result = result * 59 + ($brands == null ? 43 : $brands.hashCode());
      return result;
   }

   public String toString() {
      return "GetBrandResponse(brands=" + this.getBrands() + ")";
   }

   public static class BrandV3 {
      private String name;
      private String enName;
      private String id;
      private String image;

      public String getName() {
         return this.name;
      }

      public String getEnName() {
         return this.enName;
      }

      public String getId() {
         return this.id;
      }

      public String getImage() {
         return this.image;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setEnName(String enName) {
         this.enName = enName;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setImage(String image) {
         this.image = image;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof BrandV3)) {
            return false;
         } else {
            BrandV3 other = (BrandV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
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

               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof BrandV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $enName = this.getEnName();
         result = result * 59 + ($enName == null ? 43 : $enName.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $image = this.getImage();
         result = result * 59 + ($image == null ? 43 : $image.hashCode());
         return result;
      }

      public String toString() {
         return "GetBrandResponse.BrandV3(name=" + this.getName() + ", enName=" + this.getEnName() + ", id=" + this.getId() + ", image=" + this.getImage() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class GetVariationsResponse {
   List<VariationV3> variations = new ArrayList();

   public List<VariationV3> getVariations() {
      return this.variations;
   }

   public void setVariations(List<VariationV3> variations) {
      this.variations = variations;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetVariationsResponse)) {
         return false;
      } else {
         GetVariationsResponse other = (GetVariationsResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$variations = this.getVariations();
            Object other$variations = other.getVariations();
            if (this$variations == null) {
               if (other$variations != null) {
                  return false;
               }
            } else if (!this$variations.equals(other$variations)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetVariationsResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $variations = this.getVariations();
      result = result * 59 + ($variations == null ? 43 : $variations.hashCode());
      return result;
   }

   public String toString() {
      return "GetVariationsResponse(variations=" + this.getVariations() + ")";
   }

   public static class VariationV3 {
      private String id;
      private String name;
      private String enName;

      public String getId() {
         return this.id;
      }

      public String getName() {
         return this.name;
      }

      public String getEnName() {
         return this.enName;
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

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof VariationV3)) {
            return false;
         } else {
            VariationV3 other = (VariationV3)o;
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

               Object this$enName = this.getEnName();
               Object other$enName = other.getEnName();
               if (this$enName == null) {
                  if (other$enName != null) {
                     return false;
                  }
               } else if (!this$enName.equals(other$enName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof VariationV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $enName = this.getEnName();
         result = result * 59 + ($enName == null ? 43 : $enName.hashCode());
         return result;
      }

      public String toString() {
         return "GetVariationsResponse.VariationV3(id=" + this.getId() + ", name=" + this.getName() + ", enName=" + this.getEnName() + ")";
      }
   }
}

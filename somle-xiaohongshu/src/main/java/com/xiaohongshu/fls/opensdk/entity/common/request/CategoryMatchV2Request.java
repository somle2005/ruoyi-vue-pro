package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class CategoryMatchV2Request extends BaseRequest {
   private String name;
   private String scene;
   private List<String> imageUrls;

   public String getName() {
      return this.name;
   }

   public String getScene() {
      return this.scene;
   }

   public List<String> getImageUrls() {
      return this.imageUrls;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setScene(String scene) {
      this.scene = scene;
   }

   public void setImageUrls(List<String> imageUrls) {
      this.imageUrls = imageUrls;
   }

   public String toString() {
      return "CategoryMatchV2Request(name=" + this.getName() + ", scene=" + this.getScene() + ", imageUrls=" + this.getImageUrls() + ")";
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CategoryMatchV2Request)) {
         return false;
      } else {
         CategoryMatchV2Request other = (CategoryMatchV2Request)o;
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

            Object this$scene = this.getScene();
            Object other$scene = other.getScene();
            if (this$scene == null) {
               if (other$scene != null) {
                  return false;
               }
            } else if (!this$scene.equals(other$scene)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CategoryMatchV2Request;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $scene = this.getScene();
      result = result * 59 + ($scene == null ? 43 : $scene.hashCode());
      Object $imageUrls = this.getImageUrls();
      result = result * 59 + ($imageUrls == null ? 43 : $imageUrls.hashCode());
      return result;
   }
}

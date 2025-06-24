package com.xiaohongshu.fls.opensdk.entity.material.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.material.MaterialType;
import java.util.Arrays;

public class UploadMaterialInfoRequest extends BaseRequest {
   public String name;
   public MaterialType type;
   public byte[] materialContent;

   public String getName() {
      return this.name;
   }

   public MaterialType getType() {
      return this.type;
   }

   public byte[] getMaterialContent() {
      return this.materialContent;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setType(MaterialType type) {
      this.type = type;
   }

   public void setMaterialContent(byte[] materialContent) {
      this.materialContent = materialContent;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof UploadMaterialInfoRequest)) {
         return false;
      } else {
         UploadMaterialInfoRequest other = (UploadMaterialInfoRequest)o;
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

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            if (!Arrays.equals(this.getMaterialContent(), other.getMaterialContent())) {
               return false;
            } else {
               return true;
            }
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof UploadMaterialInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      result = result * 59 + Arrays.hashCode(this.getMaterialContent());
      return result;
   }

   public String toString() {
      return "UploadMaterialInfoRequest(name=" + this.getName() + ", type=" + this.getType() + ", materialContent=" + Arrays.toString(this.getMaterialContent()) + ")";
   }
}

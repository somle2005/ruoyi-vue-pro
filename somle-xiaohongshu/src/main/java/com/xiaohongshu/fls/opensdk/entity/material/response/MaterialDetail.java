package com.xiaohongshu.fls.opensdk.entity.material.response;

import com.xiaohongshu.fls.opensdk.entity.material.MaterialType;

public class MaterialDetail {
   public String materialId;
   public String name;
   public MaterialType type;
   public String url;
   public int width;
   public int height;
   public double duration;
   public int status;
   public long createTime;
   public long updateTime;

   public String getMaterialId() {
      return this.materialId;
   }

   public String getName() {
      return this.name;
   }

   public MaterialType getType() {
      return this.type;
   }

   public String getUrl() {
      return this.url;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public double getDuration() {
      return this.duration;
   }

   public int getStatus() {
      return this.status;
   }

   public long getCreateTime() {
      return this.createTime;
   }

   public long getUpdateTime() {
      return this.updateTime;
   }

   public void setMaterialId(String materialId) {
      this.materialId = materialId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setType(MaterialType type) {
      this.type = type;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public void setWidth(int width) {
      this.width = width;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public void setDuration(double duration) {
      this.duration = duration;
   }

   public void setStatus(int status) {
      this.status = status;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(long updateTime) {
      this.updateTime = updateTime;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof MaterialDetail)) {
         return false;
      } else {
         MaterialDetail other = (MaterialDetail)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getWidth() != other.getWidth()) {
            return false;
         } else if (this.getHeight() != other.getHeight()) {
            return false;
         } else if (Double.compare(this.getDuration(), other.getDuration()) != 0) {
            return false;
         } else if (this.getStatus() != other.getStatus()) {
            return false;
         } else if (this.getCreateTime() != other.getCreateTime()) {
            return false;
         } else if (this.getUpdateTime() != other.getUpdateTime()) {
            return false;
         } else {
            Object this$materialId = this.getMaterialId();
            Object other$materialId = other.getMaterialId();
            if (this$materialId == null) {
               if (other$materialId != null) {
                  return false;
               }
            } else if (!this$materialId.equals(other$materialId)) {
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

            Object this$type = this.getType();
            Object other$type = other.getType();
            if (this$type == null) {
               if (other$type != null) {
                  return false;
               }
            } else if (!this$type.equals(other$type)) {
               return false;
            }

            Object this$url = this.getUrl();
            Object other$url = other.getUrl();
            if (this$url == null) {
               if (other$url != null) {
                  return false;
               }
            } else if (!this$url.equals(other$url)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof MaterialDetail;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getWidth();
      result = result * 59 + this.getHeight();
      long $duration = Double.doubleToLongBits(this.getDuration());
      result = result * 59 + (int)($duration >>> 32 ^ $duration);
      result = result * 59 + this.getStatus();
      long $createTime = this.getCreateTime();
      result = result * 59 + (int)($createTime >>> 32 ^ $createTime);
      long $updateTime = this.getUpdateTime();
      result = result * 59 + (int)($updateTime >>> 32 ^ $updateTime);
      Object $materialId = this.getMaterialId();
      result = result * 59 + ($materialId == null ? 43 : $materialId.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      return result;
   }

   public String toString() {
      return "MaterialDetail(materialId=" + this.getMaterialId() + ", name=" + this.getName() + ", type=" + this.getType() + ", url=" + this.getUrl() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", duration=" + this.getDuration() + ", status=" + this.getStatus() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
   }
}

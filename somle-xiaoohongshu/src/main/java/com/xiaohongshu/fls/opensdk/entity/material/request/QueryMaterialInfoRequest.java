package com.xiaohongshu.fls.opensdk.entity.material.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import com.xiaohongshu.fls.opensdk.entity.material.MaterialType;

public class QueryMaterialInfoRequest extends BaseRequest {
   public String materialId;
   public String name;
   public MaterialType type;
   public Integer status;
   public Long createTimeFrom;
   public Long createTimeTo;
   public boolean ascByCreateTime = true;
   public int pageNo = 1;
   public int pageSize = 20;

   public String getMaterialId() {
      return this.materialId;
   }

   public String getName() {
      return this.name;
   }

   public MaterialType getType() {
      return this.type;
   }

   public Integer getStatus() {
      return this.status;
   }

   public Long getCreateTimeFrom() {
      return this.createTimeFrom;
   }

   public Long getCreateTimeTo() {
      return this.createTimeTo;
   }

   public boolean isAscByCreateTime() {
      return this.ascByCreateTime;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public int getPageSize() {
      return this.pageSize;
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

   public void setStatus(Integer status) {
      this.status = status;
   }

   public void setCreateTimeFrom(Long createTimeFrom) {
      this.createTimeFrom = createTimeFrom;
   }

   public void setCreateTimeTo(Long createTimeTo) {
      this.createTimeTo = createTimeTo;
   }

   public void setAscByCreateTime(boolean ascByCreateTime) {
      this.ascByCreateTime = ascByCreateTime;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof QueryMaterialInfoRequest)) {
         return false;
      } else {
         QueryMaterialInfoRequest other = (QueryMaterialInfoRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isAscByCreateTime() != other.isAscByCreateTime()) {
            return false;
         } else if (this.getPageNo() != other.getPageNo()) {
            return false;
         } else if (this.getPageSize() != other.getPageSize()) {
            return false;
         } else {
            Object this$status = this.getStatus();
            Object other$status = other.getStatus();
            if (this$status == null) {
               if (other$status != null) {
                  return false;
               }
            } else if (!this$status.equals(other$status)) {
               return false;
            }

            Object this$createTimeFrom = this.getCreateTimeFrom();
            Object other$createTimeFrom = other.getCreateTimeFrom();
            if (this$createTimeFrom == null) {
               if (other$createTimeFrom != null) {
                  return false;
               }
            } else if (!this$createTimeFrom.equals(other$createTimeFrom)) {
               return false;
            }

            Object this$createTimeTo = this.getCreateTimeTo();
            Object other$createTimeTo = other.getCreateTimeTo();
            if (this$createTimeTo == null) {
               if (other$createTimeTo != null) {
                  return false;
               }
            } else if (!this$createTimeTo.equals(other$createTimeTo)) {
               return false;
            }

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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof QueryMaterialInfoRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isAscByCreateTime() ? 79 : 97);
      result = result * 59 + this.getPageNo();
      result = result * 59 + this.getPageSize();
      Object $status = this.getStatus();
      result = result * 59 + ($status == null ? 43 : $status.hashCode());
      Object $createTimeFrom = this.getCreateTimeFrom();
      result = result * 59 + ($createTimeFrom == null ? 43 : $createTimeFrom.hashCode());
      Object $createTimeTo = this.getCreateTimeTo();
      result = result * 59 + ($createTimeTo == null ? 43 : $createTimeTo.hashCode());
      Object $materialId = this.getMaterialId();
      result = result * 59 + ($materialId == null ? 43 : $materialId.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $type = this.getType();
      result = result * 59 + ($type == null ? 43 : $type.hashCode());
      return result;
   }

   public String toString() {
      return "QueryMaterialInfoRequest(materialId=" + this.getMaterialId() + ", name=" + this.getName() + ", type=" + this.getType() + ", status=" + this.getStatus() + ", createTimeFrom=" + this.getCreateTimeFrom() + ", createTimeTo=" + this.getCreateTimeTo() + ", ascByCreateTime=" + this.isAscByCreateTime() + ", pageNo=" + this.getPageNo() + ", pageSize=" + this.getPageSize() + ")";
   }
}

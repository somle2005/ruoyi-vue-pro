package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class ReturnsAbnormalRequest extends BaseRequest {
   public String returnsId;
   public Integer abnormalType;
   public String abnormalNote;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Integer getAbnormalType() {
      return this.abnormalType;
   }

   public String getAbnormalNote() {
      return this.abnormalNote;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setAbnormalType(Integer abnormalType) {
      this.abnormalType = abnormalType;
   }

   public void setAbnormalNote(String abnormalNote) {
      this.abnormalNote = abnormalNote;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ReturnsAbnormalRequest)) {
         return false;
      } else {
         ReturnsAbnormalRequest other = (ReturnsAbnormalRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$abnormalType = this.getAbnormalType();
            Object other$abnormalType = other.getAbnormalType();
            if (this$abnormalType == null) {
               if (other$abnormalType != null) {
                  return false;
               }
            } else if (!this$abnormalType.equals(other$abnormalType)) {
               return false;
            }

            Object this$returnsId = this.getReturnsId();
            Object other$returnsId = other.getReturnsId();
            if (this$returnsId == null) {
               if (other$returnsId != null) {
                  return false;
               }
            } else if (!this$returnsId.equals(other$returnsId)) {
               return false;
            }

            Object this$abnormalNote = this.getAbnormalNote();
            Object other$abnormalNote = other.getAbnormalNote();
            if (this$abnormalNote == null) {
               if (other$abnormalNote != null) {
                  return false;
               }
            } else if (!this$abnormalNote.equals(other$abnormalNote)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ReturnsAbnormalRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $abnormalType = this.getAbnormalType();
      result = result * 59 + ($abnormalType == null ? 43 : $abnormalType.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      Object $abnormalNote = this.getAbnormalNote();
      result = result * 59 + ($abnormalNote == null ? 43 : $abnormalNote.hashCode());
      return result;
   }

   public String toString() {
      return "ReturnsAbnormalRequest(returnsId=" + this.getReturnsId() + ", abnormalType=" + this.getAbnormalType() + ", abnormalNote=" + this.getAbnormalNote() + ")";
   }
}

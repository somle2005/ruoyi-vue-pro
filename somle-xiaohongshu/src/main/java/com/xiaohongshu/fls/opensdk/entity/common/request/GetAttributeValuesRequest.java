package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetAttributeValuesRequest extends BaseRequest {
   public String attributeId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAttributeValuesRequest)) {
         return false;
      } else {
         GetAttributeValuesRequest other = (GetAttributeValuesRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$attributeId = this.getAttributeId();
            Object other$attributeId = other.getAttributeId();
            if (this$attributeId == null) {
               if (other$attributeId != null) {
                  return false;
               }
            } else if (!this$attributeId.equals(other$attributeId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAttributeValuesRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $attributeId = this.getAttributeId();
      result = result * 59 + ($attributeId == null ? 43 : $attributeId.hashCode());
      return result;
   }

   public String getAttributeId() {
      return this.attributeId;
   }

   public void setAttributeId(String attributeId) {
      this.attributeId = attributeId;
   }

   public String toString() {
      return "GetAttributeValuesRequest(attributeId=" + this.getAttributeId() + ")";
   }
}

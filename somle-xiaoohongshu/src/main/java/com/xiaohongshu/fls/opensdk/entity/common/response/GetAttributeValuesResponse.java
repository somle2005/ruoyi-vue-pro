package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetAttributeValuesResponse {
   public List<AttributeValueV3> attributeValueV3s;

   public List<AttributeValueV3> getAttributeValueV3s() {
      return this.attributeValueV3s;
   }

   public void setAttributeValueV3s(List<AttributeValueV3> attributeValueV3s) {
      this.attributeValueV3s = attributeValueV3s;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAttributeValuesResponse)) {
         return false;
      } else {
         GetAttributeValuesResponse other = (GetAttributeValuesResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$attributeValueV3s = this.getAttributeValueV3s();
            Object other$attributeValueV3s = other.getAttributeValueV3s();
            if (this$attributeValueV3s == null) {
               if (other$attributeValueV3s != null) {
                  return false;
               }
            } else if (!this$attributeValueV3s.equals(other$attributeValueV3s)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAttributeValuesResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $attributeValueV3s = this.getAttributeValueV3s();
      result = result * 59 + ($attributeValueV3s == null ? 43 : $attributeValueV3s.hashCode());
      return result;
   }

   public String toString() {
      return "GetAttributeValuesResponse(attributeValueV3s=" + this.getAttributeValueV3s() + ")";
   }

   public static class AttributeValueV3 {
      public String valueId;
      public String valueName;

      public String getValueId() {
         return this.valueId;
      }

      public String getValueName() {
         return this.valueName;
      }

      public void setValueId(String valueId) {
         this.valueId = valueId;
      }

      public void setValueName(String valueName) {
         this.valueName = valueName;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AttributeValueV3)) {
            return false;
         } else {
            AttributeValueV3 other = (AttributeValueV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$valueId = this.getValueId();
               Object other$valueId = other.getValueId();
               if (this$valueId == null) {
                  if (other$valueId != null) {
                     return false;
                  }
               } else if (!this$valueId.equals(other$valueId)) {
                  return false;
               }

               Object this$valueName = this.getValueName();
               Object other$valueName = other.getValueName();
               if (this$valueName == null) {
                  if (other$valueName != null) {
                     return false;
                  }
               } else if (!this$valueName.equals(other$valueName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AttributeValueV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $valueId = this.getValueId();
         result = result * 59 + ($valueId == null ? 43 : $valueId.hashCode());
         Object $valueName = this.getValueName();
         result = result * 59 + ($valueName == null ? 43 : $valueName.hashCode());
         return result;
      }

      public String toString() {
         return "GetAttributeValuesResponse.AttributeValueV3(valueId=" + this.getValueId() + ", valueName=" + this.getValueName() + ")";
      }
   }
}

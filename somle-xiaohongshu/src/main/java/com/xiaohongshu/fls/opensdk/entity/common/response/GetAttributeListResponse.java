package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetAttributeListResponse {
   public List<AttributeV3> attributeV3s;

   public List<AttributeV3> getAttributeV3s() {
      return this.attributeV3s;
   }

   public void setAttributeV3s(List<AttributeV3> attributeV3s) {
      this.attributeV3s = attributeV3s;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAttributeListResponse)) {
         return false;
      } else {
         GetAttributeListResponse other = (GetAttributeListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$attributeV3s = this.getAttributeV3s();
            Object other$attributeV3s = other.getAttributeV3s();
            if (this$attributeV3s == null) {
               if (other$attributeV3s != null) {
                  return false;
               }
            } else if (!this$attributeV3s.equals(other$attributeV3s)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAttributeListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $attributeV3s = this.getAttributeV3s();
      result = result * 59 + ($attributeV3s == null ? 43 : $attributeV3s.hashCode());
      return result;
   }

   public String toString() {
      return "GetAttributeListResponse(attributeV3s=" + this.getAttributeV3s() + ")";
   }

   public static class AttributeV3 {
      private String id;
      private Boolean isRequired;
      private String name;
      private String enName;
      private Boolean acceptsImage;
      private Boolean isMulti;
      private Integer inputType;
      private Integer dataType;
      private Boolean customizable;

      public String getId() {
         return this.id;
      }

      public Boolean getIsRequired() {
         return this.isRequired;
      }

      public String getName() {
         return this.name;
      }

      public String getEnName() {
         return this.enName;
      }

      public Boolean getAcceptsImage() {
         return this.acceptsImage;
      }

      public Boolean getIsMulti() {
         return this.isMulti;
      }

      public Integer getInputType() {
         return this.inputType;
      }

      public Integer getDataType() {
         return this.dataType;
      }

      public Boolean getCustomizable() {
         return this.customizable;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setIsRequired(Boolean isRequired) {
         this.isRequired = isRequired;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setEnName(String enName) {
         this.enName = enName;
      }

      public void setAcceptsImage(Boolean acceptsImage) {
         this.acceptsImage = acceptsImage;
      }

      public void setIsMulti(Boolean isMulti) {
         this.isMulti = isMulti;
      }

      public void setInputType(Integer inputType) {
         this.inputType = inputType;
      }

      public void setDataType(Integer dataType) {
         this.dataType = dataType;
      }

      public void setCustomizable(Boolean customizable) {
         this.customizable = customizable;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AttributeV3)) {
            return false;
         } else {
            AttributeV3 other = (AttributeV3)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$isRequired = this.getIsRequired();
               Object other$isRequired = other.getIsRequired();
               if (this$isRequired == null) {
                  if (other$isRequired != null) {
                     return false;
                  }
               } else if (!this$isRequired.equals(other$isRequired)) {
                  return false;
               }

               Object this$acceptsImage = this.getAcceptsImage();
               Object other$acceptsImage = other.getAcceptsImage();
               if (this$acceptsImage == null) {
                  if (other$acceptsImage != null) {
                     return false;
                  }
               } else if (!this$acceptsImage.equals(other$acceptsImage)) {
                  return false;
               }

               Object this$isMulti = this.getIsMulti();
               Object other$isMulti = other.getIsMulti();
               if (this$isMulti == null) {
                  if (other$isMulti != null) {
                     return false;
                  }
               } else if (!this$isMulti.equals(other$isMulti)) {
                  return false;
               }

               Object this$inputType = this.getInputType();
               Object other$inputType = other.getInputType();
               if (this$inputType == null) {
                  if (other$inputType != null) {
                     return false;
                  }
               } else if (!this$inputType.equals(other$inputType)) {
                  return false;
               }

               Object this$dataType = this.getDataType();
               Object other$dataType = other.getDataType();
               if (this$dataType == null) {
                  if (other$dataType != null) {
                     return false;
                  }
               } else if (!this$dataType.equals(other$dataType)) {
                  return false;
               }

               Object this$customizable = this.getCustomizable();
               Object other$customizable = other.getCustomizable();
               if (this$customizable == null) {
                  if (other$customizable != null) {
                     return false;
                  }
               } else if (!this$customizable.equals(other$customizable)) {
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
         return other instanceof AttributeV3;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $isRequired = this.getIsRequired();
         result = result * 59 + ($isRequired == null ? 43 : $isRequired.hashCode());
         Object $acceptsImage = this.getAcceptsImage();
         result = result * 59 + ($acceptsImage == null ? 43 : $acceptsImage.hashCode());
         Object $isMulti = this.getIsMulti();
         result = result * 59 + ($isMulti == null ? 43 : $isMulti.hashCode());
         Object $inputType = this.getInputType();
         result = result * 59 + ($inputType == null ? 43 : $inputType.hashCode());
         Object $dataType = this.getDataType();
         result = result * 59 + ($dataType == null ? 43 : $dataType.hashCode());
         Object $customizable = this.getCustomizable();
         result = result * 59 + ($customizable == null ? 43 : $customizable.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $enName = this.getEnName();
         result = result * 59 + ($enName == null ? 43 : $enName.hashCode());
         return result;
      }

      public String toString() {
         return "GetAttributeListResponse.AttributeV3(id=" + this.getId() + ", isRequired=" + this.getIsRequired() + ", name=" + this.getName() + ", enName=" + this.getEnName() + ", acceptsImage=" + this.getAcceptsImage() + ", isMulti=" + this.getIsMulti() + ", inputType=" + this.getInputType() + ", dataType=" + this.getDataType() + ", customizable=" + this.getCustomizable() + ")";
      }
   }
}

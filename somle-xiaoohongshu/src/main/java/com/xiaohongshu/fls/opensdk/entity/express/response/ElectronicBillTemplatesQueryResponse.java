package com.xiaohongshu.fls.opensdk.entity.express.response;

import java.util.List;

public class ElectronicBillTemplatesQueryResponse {
   private List<Template> templateList;

   public List<Template> getTemplateList() {
      return this.templateList;
   }

   public void setTemplateList(List<Template> templateList) {
      this.templateList = templateList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillTemplatesQueryResponse)) {
         return false;
      } else {
         ElectronicBillTemplatesQueryResponse other = (ElectronicBillTemplatesQueryResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$templateList = this.getTemplateList();
            Object other$templateList = other.getTemplateList();
            if (this$templateList == null) {
               if (other$templateList != null) {
                  return false;
               }
            } else if (!this$templateList.equals(other$templateList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillTemplatesQueryResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $templateList = this.getTemplateList();
      result = result * 59 + ($templateList == null ? 43 : $templateList.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillTemplatesQueryResponse(templateList=" + this.getTemplateList() + ")";
   }

   public static class Template {
      private Long id;
      private String cpCode;
      private String brandCode;
      private String templateType;
      private Integer templateCustomerType;
      private String templateName;
      private String templateDesc;
      private String templatePreviewUrl;
      private String standardTemplateUrl;
      private String customerTemplateUrl;

      public Long getId() {
         return this.id;
      }

      public String getCpCode() {
         return this.cpCode;
      }

      public String getBrandCode() {
         return this.brandCode;
      }

      public String getTemplateType() {
         return this.templateType;
      }

      public Integer getTemplateCustomerType() {
         return this.templateCustomerType;
      }

      public String getTemplateName() {
         return this.templateName;
      }

      public String getTemplateDesc() {
         return this.templateDesc;
      }

      public String getTemplatePreviewUrl() {
         return this.templatePreviewUrl;
      }

      public String getStandardTemplateUrl() {
         return this.standardTemplateUrl;
      }

      public String getCustomerTemplateUrl() {
         return this.customerTemplateUrl;
      }

      public void setId(Long id) {
         this.id = id;
      }

      public void setCpCode(String cpCode) {
         this.cpCode = cpCode;
      }

      public void setBrandCode(String brandCode) {
         this.brandCode = brandCode;
      }

      public void setTemplateType(String templateType) {
         this.templateType = templateType;
      }

      public void setTemplateCustomerType(Integer templateCustomerType) {
         this.templateCustomerType = templateCustomerType;
      }

      public void setTemplateName(String templateName) {
         this.templateName = templateName;
      }

      public void setTemplateDesc(String templateDesc) {
         this.templateDesc = templateDesc;
      }

      public void setTemplatePreviewUrl(String templatePreviewUrl) {
         this.templatePreviewUrl = templatePreviewUrl;
      }

      public void setStandardTemplateUrl(String standardTemplateUrl) {
         this.standardTemplateUrl = standardTemplateUrl;
      }

      public void setCustomerTemplateUrl(String customerTemplateUrl) {
         this.customerTemplateUrl = customerTemplateUrl;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Template)) {
            return false;
         } else {
            Template other = (Template)o;
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

               Object this$templateCustomerType = this.getTemplateCustomerType();
               Object other$templateCustomerType = other.getTemplateCustomerType();
               if (this$templateCustomerType == null) {
                  if (other$templateCustomerType != null) {
                     return false;
                  }
               } else if (!this$templateCustomerType.equals(other$templateCustomerType)) {
                  return false;
               }

               Object this$cpCode = this.getCpCode();
               Object other$cpCode = other.getCpCode();
               if (this$cpCode == null) {
                  if (other$cpCode != null) {
                     return false;
                  }
               } else if (!this$cpCode.equals(other$cpCode)) {
                  return false;
               }

               Object this$brandCode = this.getBrandCode();
               Object other$brandCode = other.getBrandCode();
               if (this$brandCode == null) {
                  if (other$brandCode != null) {
                     return false;
                  }
               } else if (!this$brandCode.equals(other$brandCode)) {
                  return false;
               }

               Object this$templateType = this.getTemplateType();
               Object other$templateType = other.getTemplateType();
               if (this$templateType == null) {
                  if (other$templateType != null) {
                     return false;
                  }
               } else if (!this$templateType.equals(other$templateType)) {
                  return false;
               }

               Object this$templateName = this.getTemplateName();
               Object other$templateName = other.getTemplateName();
               if (this$templateName == null) {
                  if (other$templateName != null) {
                     return false;
                  }
               } else if (!this$templateName.equals(other$templateName)) {
                  return false;
               }

               Object this$templateDesc = this.getTemplateDesc();
               Object other$templateDesc = other.getTemplateDesc();
               if (this$templateDesc == null) {
                  if (other$templateDesc != null) {
                     return false;
                  }
               } else if (!this$templateDesc.equals(other$templateDesc)) {
                  return false;
               }

               Object this$templatePreviewUrl = this.getTemplatePreviewUrl();
               Object other$templatePreviewUrl = other.getTemplatePreviewUrl();
               if (this$templatePreviewUrl == null) {
                  if (other$templatePreviewUrl != null) {
                     return false;
                  }
               } else if (!this$templatePreviewUrl.equals(other$templatePreviewUrl)) {
                  return false;
               }

               Object this$standardTemplateUrl = this.getStandardTemplateUrl();
               Object other$standardTemplateUrl = other.getStandardTemplateUrl();
               if (this$standardTemplateUrl == null) {
                  if (other$standardTemplateUrl != null) {
                     return false;
                  }
               } else if (!this$standardTemplateUrl.equals(other$standardTemplateUrl)) {
                  return false;
               }

               Object this$customerTemplateUrl = this.getCustomerTemplateUrl();
               Object other$customerTemplateUrl = other.getCustomerTemplateUrl();
               if (this$customerTemplateUrl == null) {
                  if (other$customerTemplateUrl != null) {
                     return false;
                  }
               } else if (!this$customerTemplateUrl.equals(other$customerTemplateUrl)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Template;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $templateCustomerType = this.getTemplateCustomerType();
         result = result * 59 + ($templateCustomerType == null ? 43 : $templateCustomerType.hashCode());
         Object $cpCode = this.getCpCode();
         result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
         Object $brandCode = this.getBrandCode();
         result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
         Object $templateType = this.getTemplateType();
         result = result * 59 + ($templateType == null ? 43 : $templateType.hashCode());
         Object $templateName = this.getTemplateName();
         result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
         Object $templateDesc = this.getTemplateDesc();
         result = result * 59 + ($templateDesc == null ? 43 : $templateDesc.hashCode());
         Object $templatePreviewUrl = this.getTemplatePreviewUrl();
         result = result * 59 + ($templatePreviewUrl == null ? 43 : $templatePreviewUrl.hashCode());
         Object $standardTemplateUrl = this.getStandardTemplateUrl();
         result = result * 59 + ($standardTemplateUrl == null ? 43 : $standardTemplateUrl.hashCode());
         Object $customerTemplateUrl = this.getCustomerTemplateUrl();
         result = result * 59 + ($customerTemplateUrl == null ? 43 : $customerTemplateUrl.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillTemplatesQueryResponse.Template(id=" + this.getId() + ", cpCode=" + this.getCpCode() + ", brandCode=" + this.getBrandCode() + ", templateType=" + this.getTemplateType() + ", templateCustomerType=" + this.getTemplateCustomerType() + ", templateName=" + this.getTemplateName() + ", templateDesc=" + this.getTemplateDesc() + ", templatePreviewUrl=" + this.getTemplatePreviewUrl() + ", standardTemplateUrl=" + this.getStandardTemplateUrl() + ", customerTemplateUrl=" + this.getCustomerTemplateUrl() + ")";
      }
   }
}

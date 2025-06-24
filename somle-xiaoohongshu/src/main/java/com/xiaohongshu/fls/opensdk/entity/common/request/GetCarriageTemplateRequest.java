package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetCarriageTemplateRequest extends BaseRequest {
   public String templateId;

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetCarriageTemplateRequest)) {
         return false;
      } else {
         GetCarriageTemplateRequest other = (GetCarriageTemplateRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$templateId = this.getTemplateId();
            Object other$templateId = other.getTemplateId();
            if (this$templateId == null) {
               if (other$templateId != null) {
                  return false;
               }
            } else if (!this$templateId.equals(other$templateId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetCarriageTemplateRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $templateId = this.getTemplateId();
      result = result * 59 + ($templateId == null ? 43 : $templateId.hashCode());
      return result;
   }

   public String getTemplateId() {
      return this.templateId;
   }

   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   public String toString() {
      return "GetCarriageTemplateRequest(templateId=" + this.getTemplateId() + ")";
   }
}

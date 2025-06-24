package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class CheckForbiddenKeywordRequest extends BaseRequest {
   public String text;

   public String getText() {
      return this.text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public String toString() {
      return "CheckForbiddenKeywordRequest(text=" + this.getText() + ")";
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CheckForbiddenKeywordRequest)) {
         return false;
      } else {
         CheckForbiddenKeywordRequest other = (CheckForbiddenKeywordRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$text = this.getText();
            Object other$text = other.getText();
            if (this$text == null) {
               if (other$text != null) {
                  return false;
               }
            } else if (!this$text.equals(other$text)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CheckForbiddenKeywordRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $text = this.getText();
      result = result * 59 + ($text == null ? 43 : $text.hashCode());
      return result;
   }
}

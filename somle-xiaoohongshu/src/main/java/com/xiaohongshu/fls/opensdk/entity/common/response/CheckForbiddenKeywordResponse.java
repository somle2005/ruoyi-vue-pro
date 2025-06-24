package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class CheckForbiddenKeywordResponse {
   private List<String> forbiddenKeywords;

   public List<String> getForbiddenKeywords() {
      return this.forbiddenKeywords;
   }

   public void setForbiddenKeywords(List<String> forbiddenKeywords) {
      this.forbiddenKeywords = forbiddenKeywords;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CheckForbiddenKeywordResponse)) {
         return false;
      } else {
         CheckForbiddenKeywordResponse other = (CheckForbiddenKeywordResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$forbiddenKeywords = this.getForbiddenKeywords();
            Object other$forbiddenKeywords = other.getForbiddenKeywords();
            if (this$forbiddenKeywords == null) {
               if (other$forbiddenKeywords != null) {
                  return false;
               }
            } else if (!this$forbiddenKeywords.equals(other$forbiddenKeywords)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CheckForbiddenKeywordResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $forbiddenKeywords = this.getForbiddenKeywords();
      result = result * 59 + ($forbiddenKeywords == null ? 43 : $forbiddenKeywords.hashCode());
      return result;
   }

   public String toString() {
      return "CheckForbiddenKeywordResponse(forbiddenKeywords=" + this.getForbiddenKeywords() + ")";
   }
}

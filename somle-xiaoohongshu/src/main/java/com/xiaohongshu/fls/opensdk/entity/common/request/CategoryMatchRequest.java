package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class CategoryMatchRequest extends BaseRequest {
   public String spuName;
   public Integer topK;

   public String getSpuName() {
      return this.spuName;
   }

   public Integer getTopK() {
      return this.topK;
   }

   public void setSpuName(String spuName) {
      this.spuName = spuName;
   }

   public void setTopK(Integer topK) {
      this.topK = topK;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CategoryMatchRequest)) {
         return false;
      } else {
         CategoryMatchRequest other = (CategoryMatchRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$topK = this.getTopK();
            Object other$topK = other.getTopK();
            if (this$topK == null) {
               if (other$topK != null) {
                  return false;
               }
            } else if (!this$topK.equals(other$topK)) {
               return false;
            }

            Object this$spuName = this.getSpuName();
            Object other$spuName = other.getSpuName();
            if (this$spuName == null) {
               if (other$spuName != null) {
                  return false;
               }
            } else if (!this$spuName.equals(other$spuName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CategoryMatchRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $topK = this.getTopK();
      result = result * 59 + ($topK == null ? 43 : $topK.hashCode());
      Object $spuName = this.getSpuName();
      result = result * 59 + ($spuName == null ? 43 : $spuName.hashCode());
      return result;
   }

   public String toString() {
      return "CategoryMatchRequest(spuName=" + this.getSpuName() + ", topK=" + this.getTopK() + ")";
   }
}

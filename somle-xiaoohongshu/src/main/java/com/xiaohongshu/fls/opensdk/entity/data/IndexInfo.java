package com.xiaohongshu.fls.opensdk.entity.data;

public class IndexInfo {
   public String plainText;
   public String searchIndex;

   public String getPlainText() {
      return this.plainText;
   }

   public String getSearchIndex() {
      return this.searchIndex;
   }

   public void setPlainText(String plainText) {
      this.plainText = plainText;
   }

   public void setSearchIndex(String searchIndex) {
      this.searchIndex = searchIndex;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof IndexInfo)) {
         return false;
      } else {
         IndexInfo other = (IndexInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$plainText = this.getPlainText();
            Object other$plainText = other.getPlainText();
            if (this$plainText == null) {
               if (other$plainText != null) {
                  return false;
               }
            } else if (!this$plainText.equals(other$plainText)) {
               return false;
            }

            Object this$searchIndex = this.getSearchIndex();
            Object other$searchIndex = other.getSearchIndex();
            if (this$searchIndex == null) {
               if (other$searchIndex != null) {
                  return false;
               }
            } else if (!this$searchIndex.equals(other$searchIndex)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof IndexInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $plainText = this.getPlainText();
      result = result * 59 + ($plainText == null ? 43 : $plainText.hashCode());
      Object $searchIndex = this.getSearchIndex();
      result = result * 59 + ($searchIndex == null ? 43 : $searchIndex.hashCode());
      return result;
   }

   public String toString() {
      return "IndexInfo(plainText=" + this.getPlainText() + ", searchIndex=" + this.getSearchIndex() + ")";
   }
}

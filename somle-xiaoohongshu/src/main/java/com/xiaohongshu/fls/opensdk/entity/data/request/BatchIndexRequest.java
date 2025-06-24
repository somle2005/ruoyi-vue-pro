package com.xiaohongshu.fls.opensdk.entity.data.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class BatchIndexRequest extends BaseRequest {
   public List<IndexBaseInfo> indexBaseInfoList;

   public List<IndexBaseInfo> getIndexBaseInfoList() {
      return this.indexBaseInfoList;
   }

   public void setIndexBaseInfoList(List<IndexBaseInfo> indexBaseInfoList) {
      this.indexBaseInfoList = indexBaseInfoList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchIndexRequest)) {
         return false;
      } else {
         BatchIndexRequest other = (BatchIndexRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$indexBaseInfoList = this.getIndexBaseInfoList();
            Object other$indexBaseInfoList = other.getIndexBaseInfoList();
            if (this$indexBaseInfoList == null) {
               if (other$indexBaseInfoList != null) {
                  return false;
               }
            } else if (!this$indexBaseInfoList.equals(other$indexBaseInfoList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchIndexRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $indexBaseInfoList = this.getIndexBaseInfoList();
      result = result * 59 + ($indexBaseInfoList == null ? 43 : $indexBaseInfoList.hashCode());
      return result;
   }

   public String toString() {
      return "BatchIndexRequest(indexBaseInfoList=" + this.getIndexBaseInfoList() + ")";
   }

   public static class IndexBaseInfo {
      public String plainText;
      public int type;

      public String getPlainText() {
         return this.plainText;
      }

      public int getType() {
         return this.type;
      }

      public void setPlainText(String plainText) {
         this.plainText = plainText;
      }

      public void setType(int type) {
         this.type = type;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof IndexBaseInfo)) {
            return false;
         } else {
            IndexBaseInfo other = (IndexBaseInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else if (this.getType() != other.getType()) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof IndexBaseInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         result = result * 59 + this.getType();
         Object $plainText = this.getPlainText();
         result = result * 59 + ($plainText == null ? 43 : $plainText.hashCode());
         return result;
      }

      public String toString() {
         return "BatchIndexRequest.IndexBaseInfo(plainText=" + this.getPlainText() + ", type=" + this.getType() + ")";
      }
   }
}

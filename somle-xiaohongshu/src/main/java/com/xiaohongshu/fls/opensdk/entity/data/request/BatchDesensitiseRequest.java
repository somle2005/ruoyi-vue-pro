package com.xiaohongshu.fls.opensdk.entity.data.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class BatchDesensitiseRequest extends BaseRequest {
   public List<baseInfo> baseInfos;

   public List<baseInfo> getBaseInfos() {
      return this.baseInfos;
   }

   public void setBaseInfos(List<baseInfo> baseInfos) {
      this.baseInfos = baseInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchDesensitiseRequest)) {
         return false;
      } else {
         BatchDesensitiseRequest other = (BatchDesensitiseRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$baseInfos = this.getBaseInfos();
            Object other$baseInfos = other.getBaseInfos();
            if (this$baseInfos == null) {
               if (other$baseInfos != null) {
                  return false;
               }
            } else if (!this$baseInfos.equals(other$baseInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchDesensitiseRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $baseInfos = this.getBaseInfos();
      result = result * 59 + ($baseInfos == null ? 43 : $baseInfos.hashCode());
      return result;
   }

   public String toString() {
      return "BatchDesensitiseRequest(baseInfos=" + this.getBaseInfos() + ")";
   }

   public static class baseInfo {
      public String dataTag;
      public String encryptedData;

      public String getDataTag() {
         return this.dataTag;
      }

      public String getEncryptedData() {
         return this.encryptedData;
      }

      public void setDataTag(String dataTag) {
         this.dataTag = dataTag;
      }

      public void setEncryptedData(String encryptedData) {
         this.encryptedData = encryptedData;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof baseInfo)) {
            return false;
         } else {
            baseInfo other = (baseInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$dataTag = this.getDataTag();
               Object other$dataTag = other.getDataTag();
               if (this$dataTag == null) {
                  if (other$dataTag != null) {
                     return false;
                  }
               } else if (!this$dataTag.equals(other$dataTag)) {
                  return false;
               }

               Object this$encryptedData = this.getEncryptedData();
               Object other$encryptedData = other.getEncryptedData();
               if (this$encryptedData == null) {
                  if (other$encryptedData != null) {
                     return false;
                  }
               } else if (!this$encryptedData.equals(other$encryptedData)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof baseInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $dataTag = this.getDataTag();
         result = result * 59 + ($dataTag == null ? 43 : $dataTag.hashCode());
         Object $encryptedData = this.getEncryptedData();
         result = result * 59 + ($encryptedData == null ? 43 : $encryptedData.hashCode());
         return result;
      }

      public String toString() {
         return "BatchDesensitiseRequest.baseInfo(dataTag=" + this.getDataTag() + ", encryptedData=" + this.getEncryptedData() + ")";
      }
   }
}

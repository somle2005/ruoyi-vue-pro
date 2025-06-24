package com.xiaohongshu.fls.opensdk.entity.data.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;
import java.util.List;

public class BatchDecryptRequest extends BaseRequest {
   public List<baseInfo> baseInfos;
   public String actionType;
   public String appUserId;

   public List<baseInfo> getBaseInfos() {
      return this.baseInfos;
   }

   public String getActionType() {
      return this.actionType;
   }

   public String getAppUserId() {
      return this.appUserId;
   }

   public void setBaseInfos(List<baseInfo> baseInfos) {
      this.baseInfos = baseInfos;
   }

   public void setActionType(String actionType) {
      this.actionType = actionType;
   }

   public void setAppUserId(String appUserId) {
      this.appUserId = appUserId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BatchDecryptRequest)) {
         return false;
      } else {
         BatchDecryptRequest other = (BatchDecryptRequest)o;
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

            Object this$actionType = this.getActionType();
            Object other$actionType = other.getActionType();
            if (this$actionType == null) {
               if (other$actionType != null) {
                  return false;
               }
            } else if (!this$actionType.equals(other$actionType)) {
               return false;
            }

            Object this$appUserId = this.getAppUserId();
            Object other$appUserId = other.getAppUserId();
            if (this$appUserId == null) {
               if (other$appUserId != null) {
                  return false;
               }
            } else if (!this$appUserId.equals(other$appUserId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BatchDecryptRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $baseInfos = this.getBaseInfos();
      result = result * 59 + ($baseInfos == null ? 43 : $baseInfos.hashCode());
      Object $actionType = this.getActionType();
      result = result * 59 + ($actionType == null ? 43 : $actionType.hashCode());
      Object $appUserId = this.getAppUserId();
      result = result * 59 + ($appUserId == null ? 43 : $appUserId.hashCode());
      return result;
   }

   public String toString() {
      return "BatchDecryptRequest(baseInfos=" + this.getBaseInfos() + ", actionType=" + this.getActionType() + ", appUserId=" + this.getAppUserId() + ")";
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
         return "BatchDecryptRequest.baseInfo(dataTag=" + this.getDataTag() + ", encryptedData=" + this.getEncryptedData() + ")";
      }
   }
}

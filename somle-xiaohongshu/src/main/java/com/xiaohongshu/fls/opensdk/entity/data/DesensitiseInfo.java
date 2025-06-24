package com.xiaohongshu.fls.opensdk.entity.data;

public class DesensitiseInfo {
   public String dataTag;
   public String encryptedData;
   public String desensitisedData;
   public int errorCode;
   public String errorMsg;

   public String getDataTag() {
      return this.dataTag;
   }

   public String getEncryptedData() {
      return this.encryptedData;
   }

   public String getDesensitisedData() {
      return this.desensitisedData;
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public String getErrorMsg() {
      return this.errorMsg;
   }

   public void setDataTag(String dataTag) {
      this.dataTag = dataTag;
   }

   public void setEncryptedData(String encryptedData) {
      this.encryptedData = encryptedData;
   }

   public void setDesensitisedData(String desensitisedData) {
      this.desensitisedData = desensitisedData;
   }

   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DesensitiseInfo)) {
         return false;
      } else {
         DesensitiseInfo other = (DesensitiseInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getErrorCode() != other.getErrorCode()) {
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

            Object this$desensitisedData = this.getDesensitisedData();
            Object other$desensitisedData = other.getDesensitisedData();
            if (this$desensitisedData == null) {
               if (other$desensitisedData != null) {
                  return false;
               }
            } else if (!this$desensitisedData.equals(other$desensitisedData)) {
               return false;
            }

            Object this$errorMsg = this.getErrorMsg();
            Object other$errorMsg = other.getErrorMsg();
            if (this$errorMsg == null) {
               if (other$errorMsg != null) {
                  return false;
               }
            } else if (!this$errorMsg.equals(other$errorMsg)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DesensitiseInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getErrorCode();
      Object $dataTag = this.getDataTag();
      result = result * 59 + ($dataTag == null ? 43 : $dataTag.hashCode());
      Object $encryptedData = this.getEncryptedData();
      result = result * 59 + ($encryptedData == null ? 43 : $encryptedData.hashCode());
      Object $desensitisedData = this.getDesensitisedData();
      result = result * 59 + ($desensitisedData == null ? 43 : $desensitisedData.hashCode());
      Object $errorMsg = this.getErrorMsg();
      result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
      return result;
   }

   public String toString() {
      return "DesensitiseInfo(dataTag=" + this.getDataTag() + ", encryptedData=" + this.getEncryptedData() + ", desensitisedData=" + this.getDesensitisedData() + ", errorCode=" + this.getErrorCode() + ", errorMsg=" + this.getErrorMsg() + ")";
   }
}

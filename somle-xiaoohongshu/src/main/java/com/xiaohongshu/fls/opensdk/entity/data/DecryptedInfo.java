package com.xiaohongshu.fls.opensdk.entity.data;

public class DecryptedInfo {
   public String dataTag;
   public String encryptedData;
   public String decryptedData;
   public int errorCode;
   public String errorMsg;

   public String getDataTag() {
      return this.dataTag;
   }

   public String getEncryptedData() {
      return this.encryptedData;
   }

   public String getDecryptedData() {
      return this.decryptedData;
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

   public void setDecryptedData(String decryptedData) {
      this.decryptedData = decryptedData;
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
      } else if (!(o instanceof DecryptedInfo)) {
         return false;
      } else {
         DecryptedInfo other = (DecryptedInfo)o;
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

            Object this$decryptedData = this.getDecryptedData();
            Object other$decryptedData = other.getDecryptedData();
            if (this$decryptedData == null) {
               if (other$decryptedData != null) {
                  return false;
               }
            } else if (!this$decryptedData.equals(other$decryptedData)) {
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
      return other instanceof DecryptedInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getErrorCode();
      Object $dataTag = this.getDataTag();
      result = result * 59 + ($dataTag == null ? 43 : $dataTag.hashCode());
      Object $encryptedData = this.getEncryptedData();
      result = result * 59 + ($encryptedData == null ? 43 : $encryptedData.hashCode());
      Object $decryptedData = this.getDecryptedData();
      result = result * 59 + ($decryptedData == null ? 43 : $decryptedData.hashCode());
      Object $errorMsg = this.getErrorMsg();
      result = result * 59 + ($errorMsg == null ? 43 : $errorMsg.hashCode());
      return result;
   }

   public String toString() {
      return "DecryptedInfo(dataTag=" + this.getDataTag() + ", encryptedData=" + this.getEncryptedData() + ", decryptedData=" + this.getDecryptedData() + ", errorCode=" + this.getErrorCode() + ", errorMsg=" + this.getErrorMsg() + ")";
   }
}

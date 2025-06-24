package com.xiaohongshu.fls.opensdk.entity.finance.response;

public class DownloadStatementResponse {
   public String downloadUrl;

   public String getDownloadUrl() {
      return this.downloadUrl;
   }

   public void setDownloadUrl(String downloadUrl) {
      this.downloadUrl = downloadUrl;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof DownloadStatementResponse)) {
         return false;
      } else {
         DownloadStatementResponse other = (DownloadStatementResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$downloadUrl = this.getDownloadUrl();
            Object other$downloadUrl = other.getDownloadUrl();
            if (this$downloadUrl == null) {
               if (other$downloadUrl != null) {
                  return false;
               }
            } else if (!this$downloadUrl.equals(other$downloadUrl)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof DownloadStatementResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $downloadUrl = this.getDownloadUrl();
      result = result * 59 + ($downloadUrl == null ? 43 : $downloadUrl.hashCode());
      return result;
   }

   public String toString() {
      return "DownloadStatementResponse(downloadUrl=" + this.getDownloadUrl() + ")";
   }
}

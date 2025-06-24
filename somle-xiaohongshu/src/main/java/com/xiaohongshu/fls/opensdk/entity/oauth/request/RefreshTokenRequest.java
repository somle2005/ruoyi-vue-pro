package com.xiaohongshu.fls.opensdk.entity.oauth.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class RefreshTokenRequest extends BaseRequest {
   public String refreshToken;

   public String getAppId() {
      return this.appId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public RefreshTokenRequest() {
   }

   public RefreshTokenRequest(String refreshToken) {
      this.refreshToken = refreshToken;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }

   public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof RefreshTokenRequest)) {
         return false;
      } else {
         RefreshTokenRequest other = (RefreshTokenRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$refreshToken = this.getRefreshToken();
            Object other$refreshToken = other.getRefreshToken();
            if (this$refreshToken == null) {
               if (other$refreshToken != null) {
                  return false;
               }
            } else if (!this$refreshToken.equals(other$refreshToken)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof RefreshTokenRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $refreshToken = this.getRefreshToken();
      result = result * 59 + ($refreshToken == null ? 43 : $refreshToken.hashCode());
      return result;
   }

   public String toString() {
      return "RefreshTokenRequest(refreshToken=" + this.getRefreshToken() + ")";
   }
}

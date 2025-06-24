package com.xiaohongshu.fls.opensdk.entity.oauth.response;

public class GetAccessTokenResponse {
   String accessToken;
   long accessTokenExpiresAt;
   String refreshToken;
   long refreshTokenExpiresAt;
   String sellerId;
   String sellerName;

   public String getAccessToken() {
      return this.accessToken;
   }

   public long getAccessTokenExpiresAt() {
      return this.accessTokenExpiresAt;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }

   public long getRefreshTokenExpiresAt() {
      return this.refreshTokenExpiresAt;
   }

   public String getSellerId() {
      return this.sellerId;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public void setAccessTokenExpiresAt(long accessTokenExpiresAt) {
      this.accessTokenExpiresAt = accessTokenExpiresAt;
   }

   public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
   }

   public void setRefreshTokenExpiresAt(long refreshTokenExpiresAt) {
      this.refreshTokenExpiresAt = refreshTokenExpiresAt;
   }

   public void setSellerId(String sellerId) {
      this.sellerId = sellerId;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAccessTokenResponse)) {
         return false;
      } else {
         GetAccessTokenResponse other = (GetAccessTokenResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getAccessTokenExpiresAt() != other.getAccessTokenExpiresAt()) {
            return false;
         } else if (this.getRefreshTokenExpiresAt() != other.getRefreshTokenExpiresAt()) {
            return false;
         } else {
            Object this$accessToken = this.getAccessToken();
            Object other$accessToken = other.getAccessToken();
            if (this$accessToken == null) {
               if (other$accessToken != null) {
                  return false;
               }
            } else if (!this$accessToken.equals(other$accessToken)) {
               return false;
            }

            Object this$refreshToken = this.getRefreshToken();
            Object other$refreshToken = other.getRefreshToken();
            if (this$refreshToken == null) {
               if (other$refreshToken != null) {
                  return false;
               }
            } else if (!this$refreshToken.equals(other$refreshToken)) {
               return false;
            }

            Object this$sellerId = this.getSellerId();
            Object other$sellerId = other.getSellerId();
            if (this$sellerId == null) {
               if (other$sellerId != null) {
                  return false;
               }
            } else if (!this$sellerId.equals(other$sellerId)) {
               return false;
            }

            Object this$sellerName = this.getSellerName();
            Object other$sellerName = other.getSellerName();
            if (this$sellerName == null) {
               if (other$sellerName != null) {
                  return false;
               }
            } else if (!this$sellerName.equals(other$sellerName)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAccessTokenResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      long $accessTokenExpiresAt = this.getAccessTokenExpiresAt();
      result = result * 59 + (int)($accessTokenExpiresAt >>> 32 ^ $accessTokenExpiresAt);
      long $refreshTokenExpiresAt = this.getRefreshTokenExpiresAt();
      result = result * 59 + (int)($refreshTokenExpiresAt >>> 32 ^ $refreshTokenExpiresAt);
      Object $accessToken = this.getAccessToken();
      result = result * 59 + ($accessToken == null ? 43 : $accessToken.hashCode());
      Object $refreshToken = this.getRefreshToken();
      result = result * 59 + ($refreshToken == null ? 43 : $refreshToken.hashCode());
      Object $sellerId = this.getSellerId();
      result = result * 59 + ($sellerId == null ? 43 : $sellerId.hashCode());
      Object $sellerName = this.getSellerName();
      result = result * 59 + ($sellerName == null ? 43 : $sellerName.hashCode());
      return result;
   }

   public String toString() {
      return "GetAccessTokenResponse(accessToken=" + this.getAccessToken() + ", accessTokenExpiresAt=" + this.getAccessTokenExpiresAt() + ", refreshToken=" + this.getRefreshToken() + ", refreshTokenExpiresAt=" + this.getRefreshTokenExpiresAt() + ", sellerId=" + this.getSellerId() + ", sellerName=" + this.getSellerName() + ")";
   }
}

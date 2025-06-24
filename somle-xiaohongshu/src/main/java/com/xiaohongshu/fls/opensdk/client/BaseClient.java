package com.xiaohongshu.fls.opensdk.client;

import okhttp3.MediaType;

public class BaseClient {
   public static final MediaType JSONTYPE = MediaType.parse("application/json; charset=utf-8");
   public String url;
   public String appId;
   public String version;
   public String appSecret;

   public BaseClient(String url, String appId, String version, String appSecret) {
      this.url = url;
      this.appId = appId;
      this.version = version;
      this.appSecret = appSecret;
   }

   public String getUrl() {
      return this.url;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getVersion() {
      return this.version;
   }

   public String getAppSecret() {
      return this.appSecret;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public void setVersion(String version) {
      this.version = version;
   }

   public void setAppSecret(String appSecret) {
      this.appSecret = appSecret;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BaseClient)) {
         return false;
      } else {
         BaseClient other = (BaseClient)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$url = this.getUrl();
            Object other$url = other.getUrl();
            if (this$url == null) {
               if (other$url != null) {
                  return false;
               }
            } else if (!this$url.equals(other$url)) {
               return false;
            }

            Object this$appId = this.getAppId();
            Object other$appId = other.getAppId();
            if (this$appId == null) {
               if (other$appId != null) {
                  return false;
               }
            } else if (!this$appId.equals(other$appId)) {
               return false;
            }

            Object this$version = this.getVersion();
            Object other$version = other.getVersion();
            if (this$version == null) {
               if (other$version != null) {
                  return false;
               }
            } else if (!this$version.equals(other$version)) {
               return false;
            }

            Object this$appSecret = this.getAppSecret();
            Object other$appSecret = other.getAppSecret();
            if (this$appSecret == null) {
               if (other$appSecret != null) {
                  return false;
               }
            } else if (!this$appSecret.equals(other$appSecret)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BaseClient;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $url = this.getUrl();
      result = result * 59 + ($url == null ? 43 : $url.hashCode());
      Object $appId = this.getAppId();
      result = result * 59 + ($appId == null ? 43 : $appId.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $appSecret = this.getAppSecret();
      result = result * 59 + ($appSecret == null ? 43 : $appSecret.hashCode());
      return result;
   }

   public String toString() {
      return "BaseClient(url=" + this.getUrl() + ", appId=" + this.getAppId() + ", version=" + this.getVersion() + ", appSecret=" + this.getAppSecret() + ")";
   }
}

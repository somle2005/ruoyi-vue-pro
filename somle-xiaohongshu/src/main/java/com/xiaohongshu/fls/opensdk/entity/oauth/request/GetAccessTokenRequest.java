package com.xiaohongshu.fls.opensdk.entity.oauth.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetAccessTokenRequest extends BaseRequest {
   private String code;

   public String getAppId() {
      return this.appId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public GetAccessTokenRequest() {
   }

   public GetAccessTokenRequest(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetAccessTokenRequest)) {
         return false;
      } else {
         GetAccessTokenRequest other = (GetAccessTokenRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$code = this.getCode();
            Object other$code = other.getCode();
            if (this$code == null) {
               if (other$code != null) {
                  return false;
               }
            } else if (!this$code.equals(other$code)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetAccessTokenRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      return result;
   }

   public String toString() {
      return "GetAccessTokenRequest(code=" + this.getCode() + ")";
   }
}

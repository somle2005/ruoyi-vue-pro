package com.xiaohongshu.fls.opensdk.entity.packages.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class AddDeclarePortRequest extends BaseRequest {
   public String packageId;
   public Boolean banned;
   public String port;
   public String bannedReason;

   public String getPackageId() {
      return this.packageId;
   }

   public Boolean getBanned() {
      return this.banned;
   }

   public String getPort() {
      return this.port;
   }

   public String getBannedReason() {
      return this.bannedReason;
   }

   public void setPackageId(String packageId) {
      this.packageId = packageId;
   }

   public void setBanned(Boolean banned) {
      this.banned = banned;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public void setBannedReason(String bannedReason) {
      this.bannedReason = bannedReason;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddDeclarePortRequest)) {
         return false;
      } else {
         AddDeclarePortRequest other = (AddDeclarePortRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$banned = this.getBanned();
            Object other$banned = other.getBanned();
            if (this$banned == null) {
               if (other$banned != null) {
                  return false;
               }
            } else if (!this$banned.equals(other$banned)) {
               return false;
            }

            Object this$packageId = this.getPackageId();
            Object other$packageId = other.getPackageId();
            if (this$packageId == null) {
               if (other$packageId != null) {
                  return false;
               }
            } else if (!this$packageId.equals(other$packageId)) {
               return false;
            }

            Object this$port = this.getPort();
            Object other$port = other.getPort();
            if (this$port == null) {
               if (other$port != null) {
                  return false;
               }
            } else if (!this$port.equals(other$port)) {
               return false;
            }

            Object this$bannedReason = this.getBannedReason();
            Object other$bannedReason = other.getBannedReason();
            if (this$bannedReason == null) {
               if (other$bannedReason != null) {
                  return false;
               }
            } else if (!this$bannedReason.equals(other$bannedReason)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AddDeclarePortRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $banned = this.getBanned();
      result = result * 59 + ($banned == null ? 43 : $banned.hashCode());
      Object $packageId = this.getPackageId();
      result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
      Object $port = this.getPort();
      result = result * 59 + ($port == null ? 43 : $port.hashCode());
      Object $bannedReason = this.getBannedReason();
      result = result * 59 + ($bannedReason == null ? 43 : $bannedReason.hashCode());
      return result;
   }

   public String toString() {
      return "AddDeclarePortRequest(packageId=" + this.getPackageId() + ", banned=" + this.getBanned() + ", port=" + this.getPort() + ", bannedReason=" + this.getBannedReason() + ")";
   }
}

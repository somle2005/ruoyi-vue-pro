package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.ArrayList;
import java.util.List;

public class GetPackageDeclareResponse {
   public List<PackageDeclareInfo> packageDeclareInfos = new ArrayList();

   public List<PackageDeclareInfo> getPackageDeclareInfos() {
      return this.packageDeclareInfos;
   }

   public void setPackageDeclareInfos(List<PackageDeclareInfo> packageDeclareInfos) {
      this.packageDeclareInfos = packageDeclareInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetPackageDeclareResponse)) {
         return false;
      } else {
         GetPackageDeclareResponse other = (GetPackageDeclareResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$packageDeclareInfos = this.getPackageDeclareInfos();
            Object other$packageDeclareInfos = other.getPackageDeclareInfos();
            if (this$packageDeclareInfos == null) {
               if (other$packageDeclareInfos != null) {
                  return false;
               }
            } else if (!this$packageDeclareInfos.equals(other$packageDeclareInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetPackageDeclareResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $packageDeclareInfos = this.getPackageDeclareInfos();
      result = result * 59 + ($packageDeclareInfos == null ? 43 : $packageDeclareInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetPackageDeclareResponse(packageDeclareInfos=" + this.getPackageDeclareInfos() + ")";
   }

   public static class PackageDeclareInfo {
      public String packageId;
      public String idName;
      public String idNumber;
      public String linkPhone;
      public String frontUrl;
      public String backUrl;
      public String type;

      public String getPackageId() {
         return this.packageId;
      }

      public String getIdName() {
         return this.idName;
      }

      public String getIdNumber() {
         return this.idNumber;
      }

      public String getLinkPhone() {
         return this.linkPhone;
      }

      public String getFrontUrl() {
         return this.frontUrl;
      }

      public String getBackUrl() {
         return this.backUrl;
      }

      public String getType() {
         return this.type;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setIdName(String idName) {
         this.idName = idName;
      }

      public void setIdNumber(String idNumber) {
         this.idNumber = idNumber;
      }

      public void setLinkPhone(String linkPhone) {
         this.linkPhone = linkPhone;
      }

      public void setFrontUrl(String frontUrl) {
         this.frontUrl = frontUrl;
      }

      public void setBackUrl(String backUrl) {
         this.backUrl = backUrl;
      }

      public void setType(String type) {
         this.type = type;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof PackageDeclareInfo)) {
            return false;
         } else {
            PackageDeclareInfo other = (PackageDeclareInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$packageId = this.getPackageId();
               Object other$packageId = other.getPackageId();
               if (this$packageId == null) {
                  if (other$packageId != null) {
                     return false;
                  }
               } else if (!this$packageId.equals(other$packageId)) {
                  return false;
               }

               Object this$idName = this.getIdName();
               Object other$idName = other.getIdName();
               if (this$idName == null) {
                  if (other$idName != null) {
                     return false;
                  }
               } else if (!this$idName.equals(other$idName)) {
                  return false;
               }

               Object this$idNumber = this.getIdNumber();
               Object other$idNumber = other.getIdNumber();
               if (this$idNumber == null) {
                  if (other$idNumber != null) {
                     return false;
                  }
               } else if (!this$idNumber.equals(other$idNumber)) {
                  return false;
               }

               Object this$linkPhone = this.getLinkPhone();
               Object other$linkPhone = other.getLinkPhone();
               if (this$linkPhone == null) {
                  if (other$linkPhone != null) {
                     return false;
                  }
               } else if (!this$linkPhone.equals(other$linkPhone)) {
                  return false;
               }

               Object this$frontUrl = this.getFrontUrl();
               Object other$frontUrl = other.getFrontUrl();
               if (this$frontUrl == null) {
                  if (other$frontUrl != null) {
                     return false;
                  }
               } else if (!this$frontUrl.equals(other$frontUrl)) {
                  return false;
               }

               Object this$backUrl = this.getBackUrl();
               Object other$backUrl = other.getBackUrl();
               if (this$backUrl == null) {
                  if (other$backUrl != null) {
                     return false;
                  }
               } else if (!this$backUrl.equals(other$backUrl)) {
                  return false;
               }

               Object this$type = this.getType();
               Object other$type = other.getType();
               if (this$type == null) {
                  if (other$type != null) {
                     return false;
                  }
               } else if (!this$type.equals(other$type)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof PackageDeclareInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $idName = this.getIdName();
         result = result * 59 + ($idName == null ? 43 : $idName.hashCode());
         Object $idNumber = this.getIdNumber();
         result = result * 59 + ($idNumber == null ? 43 : $idNumber.hashCode());
         Object $linkPhone = this.getLinkPhone();
         result = result * 59 + ($linkPhone == null ? 43 : $linkPhone.hashCode());
         Object $frontUrl = this.getFrontUrl();
         result = result * 59 + ($frontUrl == null ? 43 : $frontUrl.hashCode());
         Object $backUrl = this.getBackUrl();
         result = result * 59 + ($backUrl == null ? 43 : $backUrl.hashCode());
         Object $type = this.getType();
         result = result * 59 + ($type == null ? 43 : $type.hashCode());
         return result;
      }

      public String toString() {
         return "GetPackageDeclareResponse.PackageDeclareInfo(packageId=" + this.getPackageId() + ", idName=" + this.getIdName() + ", idNumber=" + this.getIdNumber() + ", linkPhone=" + this.getLinkPhone() + ", frontUrl=" + this.getFrontUrl() + ", backUrl=" + this.getBackUrl() + ", type=" + this.getType() + ")";
      }
   }
}

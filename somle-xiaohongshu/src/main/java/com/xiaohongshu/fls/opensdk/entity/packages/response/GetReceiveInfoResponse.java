package com.xiaohongshu.fls.opensdk.entity.packages.response;

import java.util.List;

public class GetReceiveInfoResponse {
   public List<ReceiverInfo> receiverInfos;

   public List<ReceiverInfo> getReceiverInfos() {
      return this.receiverInfos;
   }

   public void setReceiverInfos(List<ReceiverInfo> receiverInfos) {
      this.receiverInfos = receiverInfos;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetReceiveInfoResponse)) {
         return false;
      } else {
         GetReceiveInfoResponse other = (GetReceiveInfoResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$receiverInfos = this.getReceiverInfos();
            Object other$receiverInfos = other.getReceiverInfos();
            if (this$receiverInfos == null) {
               if (other$receiverInfos != null) {
                  return false;
               }
            } else if (!this$receiverInfos.equals(other$receiverInfos)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetReceiveInfoResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $receiverInfos = this.getReceiverInfos();
      result = result * 59 + ($receiverInfos == null ? 43 : $receiverInfos.hashCode());
      return result;
   }

   public String toString() {
      return "GetReceiveInfoResponse(receiverInfos=" + this.getReceiverInfos() + ")";
   }

   public static class ReceiverInfo {
      public String packageId;
      public Boolean matched;
      public String receiverProvinceName;
      public String receiverCityName;
      public String receiverDistrictName;
      public String receiverTownName;
      public String receiverName;
      public String receiverPhone;
      public String receiverAddress;

      public String getPackageId() {
         return this.packageId;
      }

      public Boolean getMatched() {
         return this.matched;
      }

      public String getReceiverProvinceName() {
         return this.receiverProvinceName;
      }

      public String getReceiverCityName() {
         return this.receiverCityName;
      }

      public String getReceiverDistrictName() {
         return this.receiverDistrictName;
      }

      public String getReceiverTownName() {
         return this.receiverTownName;
      }

      public String getReceiverName() {
         return this.receiverName;
      }

      public String getReceiverPhone() {
         return this.receiverPhone;
      }

      public String getReceiverAddress() {
         return this.receiverAddress;
      }

      public void setPackageId(String packageId) {
         this.packageId = packageId;
      }

      public void setMatched(Boolean matched) {
         this.matched = matched;
      }

      public void setReceiverProvinceName(String receiverProvinceName) {
         this.receiverProvinceName = receiverProvinceName;
      }

      public void setReceiverCityName(String receiverCityName) {
         this.receiverCityName = receiverCityName;
      }

      public void setReceiverDistrictName(String receiverDistrictName) {
         this.receiverDistrictName = receiverDistrictName;
      }

      public void setReceiverTownName(String receiverTownName) {
         this.receiverTownName = receiverTownName;
      }

      public void setReceiverName(String receiverName) {
         this.receiverName = receiverName;
      }

      public void setReceiverPhone(String receiverPhone) {
         this.receiverPhone = receiverPhone;
      }

      public void setReceiverAddress(String receiverAddress) {
         this.receiverAddress = receiverAddress;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ReceiverInfo)) {
            return false;
         } else {
            ReceiverInfo other = (ReceiverInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$matched = this.getMatched();
               Object other$matched = other.getMatched();
               if (this$matched == null) {
                  if (other$matched != null) {
                     return false;
                  }
               } else if (!this$matched.equals(other$matched)) {
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

               Object this$receiverProvinceName = this.getReceiverProvinceName();
               Object other$receiverProvinceName = other.getReceiverProvinceName();
               if (this$receiverProvinceName == null) {
                  if (other$receiverProvinceName != null) {
                     return false;
                  }
               } else if (!this$receiverProvinceName.equals(other$receiverProvinceName)) {
                  return false;
               }

               Object this$receiverCityName = this.getReceiverCityName();
               Object other$receiverCityName = other.getReceiverCityName();
               if (this$receiverCityName == null) {
                  if (other$receiverCityName != null) {
                     return false;
                  }
               } else if (!this$receiverCityName.equals(other$receiverCityName)) {
                  return false;
               }

               Object this$receiverDistrictName = this.getReceiverDistrictName();
               Object other$receiverDistrictName = other.getReceiverDistrictName();
               if (this$receiverDistrictName == null) {
                  if (other$receiverDistrictName != null) {
                     return false;
                  }
               } else if (!this$receiverDistrictName.equals(other$receiverDistrictName)) {
                  return false;
               }

               Object this$receiverTownName = this.getReceiverTownName();
               Object other$receiverTownName = other.getReceiverTownName();
               if (this$receiverTownName == null) {
                  if (other$receiverTownName != null) {
                     return false;
                  }
               } else if (!this$receiverTownName.equals(other$receiverTownName)) {
                  return false;
               }

               Object this$receiverName = this.getReceiverName();
               Object other$receiverName = other.getReceiverName();
               if (this$receiverName == null) {
                  if (other$receiverName != null) {
                     return false;
                  }
               } else if (!this$receiverName.equals(other$receiverName)) {
                  return false;
               }

               Object this$receiverPhone = this.getReceiverPhone();
               Object other$receiverPhone = other.getReceiverPhone();
               if (this$receiverPhone == null) {
                  if (other$receiverPhone != null) {
                     return false;
                  }
               } else if (!this$receiverPhone.equals(other$receiverPhone)) {
                  return false;
               }

               Object this$receiverAddress = this.getReceiverAddress();
               Object other$receiverAddress = other.getReceiverAddress();
               if (this$receiverAddress == null) {
                  if (other$receiverAddress != null) {
                     return false;
                  }
               } else if (!this$receiverAddress.equals(other$receiverAddress)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ReceiverInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $matched = this.getMatched();
         result = result * 59 + ($matched == null ? 43 : $matched.hashCode());
         Object $packageId = this.getPackageId();
         result = result * 59 + ($packageId == null ? 43 : $packageId.hashCode());
         Object $receiverProvinceName = this.getReceiverProvinceName();
         result = result * 59 + ($receiverProvinceName == null ? 43 : $receiverProvinceName.hashCode());
         Object $receiverCityName = this.getReceiverCityName();
         result = result * 59 + ($receiverCityName == null ? 43 : $receiverCityName.hashCode());
         Object $receiverDistrictName = this.getReceiverDistrictName();
         result = result * 59 + ($receiverDistrictName == null ? 43 : $receiverDistrictName.hashCode());
         Object $receiverTownName = this.getReceiverTownName();
         result = result * 59 + ($receiverTownName == null ? 43 : $receiverTownName.hashCode());
         Object $receiverName = this.getReceiverName();
         result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
         Object $receiverPhone = this.getReceiverPhone();
         result = result * 59 + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
         Object $receiverAddress = this.getReceiverAddress();
         result = result * 59 + ($receiverAddress == null ? 43 : $receiverAddress.hashCode());
         return result;
      }

      public String toString() {
         return "GetReceiveInfoResponse.ReceiverInfo(packageId=" + this.getPackageId() + ", matched=" + this.getMatched() + ", receiverProvinceName=" + this.getReceiverProvinceName() + ", receiverCityName=" + this.getReceiverCityName() + ", receiverDistrictName=" + this.getReceiverDistrictName() + ", receiverTownName=" + this.getReceiverTownName() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", receiverAddress=" + this.getReceiverAddress() + ")";
      }
   }
}

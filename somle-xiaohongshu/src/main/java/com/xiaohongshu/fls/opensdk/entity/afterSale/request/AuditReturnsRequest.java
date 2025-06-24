package com.xiaohongshu.fls.opensdk.entity.afterSale.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class AuditReturnsRequest extends BaseRequest {
   public String returnsId;
   public Integer action;
   public Integer reason;
   public String description;
   public String message;
   public AuditReturnsReceiverInfo receiverInfo;

   public String getReturnsId() {
      return this.returnsId;
   }

   public Integer getAction() {
      return this.action;
   }

   public Integer getReason() {
      return this.reason;
   }

   public String getDescription() {
      return this.description;
   }

   public String getMessage() {
      return this.message;
   }

   public AuditReturnsReceiverInfo getReceiverInfo() {
      return this.receiverInfo;
   }

   public void setReturnsId(String returnsId) {
      this.returnsId = returnsId;
   }

   public void setAction(Integer action) {
      this.action = action;
   }

   public void setReason(Integer reason) {
      this.reason = reason;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public void setReceiverInfo(AuditReturnsReceiverInfo receiverInfo) {
      this.receiverInfo = receiverInfo;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AuditReturnsRequest)) {
         return false;
      } else {
         AuditReturnsRequest other = (AuditReturnsRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$action = this.getAction();
            Object other$action = other.getAction();
            if (this$action == null) {
               if (other$action != null) {
                  return false;
               }
            } else if (!this$action.equals(other$action)) {
               return false;
            }

            Object this$reason = this.getReason();
            Object other$reason = other.getReason();
            if (this$reason == null) {
               if (other$reason != null) {
                  return false;
               }
            } else if (!this$reason.equals(other$reason)) {
               return false;
            }

            Object this$returnsId = this.getReturnsId();
            Object other$returnsId = other.getReturnsId();
            if (this$returnsId == null) {
               if (other$returnsId != null) {
                  return false;
               }
            } else if (!this$returnsId.equals(other$returnsId)) {
               return false;
            }

            Object this$description = this.getDescription();
            Object other$description = other.getDescription();
            if (this$description == null) {
               if (other$description != null) {
                  return false;
               }
            } else if (!this$description.equals(other$description)) {
               return false;
            }

            Object this$message = this.getMessage();
            Object other$message = other.getMessage();
            if (this$message == null) {
               if (other$message != null) {
                  return false;
               }
            } else if (!this$message.equals(other$message)) {
               return false;
            }

            Object this$receiverInfo = this.getReceiverInfo();
            Object other$receiverInfo = other.getReceiverInfo();
            if (this$receiverInfo == null) {
               if (other$receiverInfo != null) {
                  return false;
               }
            } else if (!this$receiverInfo.equals(other$receiverInfo)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AuditReturnsRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $action = this.getAction();
      result = result * 59 + ($action == null ? 43 : $action.hashCode());
      Object $reason = this.getReason();
      result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
      Object $returnsId = this.getReturnsId();
      result = result * 59 + ($returnsId == null ? 43 : $returnsId.hashCode());
      Object $description = this.getDescription();
      result = result * 59 + ($description == null ? 43 : $description.hashCode());
      Object $message = this.getMessage();
      result = result * 59 + ($message == null ? 43 : $message.hashCode());
      Object $receiverInfo = this.getReceiverInfo();
      result = result * 59 + ($receiverInfo == null ? 43 : $receiverInfo.hashCode());
      return result;
   }

   public String toString() {
      return "AuditReturnsRequest(returnsId=" + this.getReturnsId() + ", action=" + this.getAction() + ", reason=" + this.getReason() + ", description=" + this.getDescription() + ", message=" + this.getMessage() + ", receiverInfo=" + this.getReceiverInfo() + ")";
   }

   public static class AuditReturnsReceiverInfo {
      public String code;
      public String country;
      public String city;
      public String province;
      public String district;
      public String street;
      public String receiverName;
      public String receiverPhone;
      public Long sellerAddressRecordId;
      public Integer sellerAddressRecordVersion;

      public String getCode() {
         return this.code;
      }

      public String getCountry() {
         return this.country;
      }

      public String getCity() {
         return this.city;
      }

      public String getProvince() {
         return this.province;
      }

      public String getDistrict() {
         return this.district;
      }

      public String getStreet() {
         return this.street;
      }

      public String getReceiverName() {
         return this.receiverName;
      }

      public String getReceiverPhone() {
         return this.receiverPhone;
      }

      public Long getSellerAddressRecordId() {
         return this.sellerAddressRecordId;
      }

      public Integer getSellerAddressRecordVersion() {
         return this.sellerAddressRecordVersion;
      }

      public void setCode(String code) {
         this.code = code;
      }

      public void setCountry(String country) {
         this.country = country;
      }

      public void setCity(String city) {
         this.city = city;
      }

      public void setProvince(String province) {
         this.province = province;
      }

      public void setDistrict(String district) {
         this.district = district;
      }

      public void setStreet(String street) {
         this.street = street;
      }

      public void setReceiverName(String receiverName) {
         this.receiverName = receiverName;
      }

      public void setReceiverPhone(String receiverPhone) {
         this.receiverPhone = receiverPhone;
      }

      public void setSellerAddressRecordId(Long sellerAddressRecordId) {
         this.sellerAddressRecordId = sellerAddressRecordId;
      }

      public void setSellerAddressRecordVersion(Integer sellerAddressRecordVersion) {
         this.sellerAddressRecordVersion = sellerAddressRecordVersion;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AuditReturnsReceiverInfo)) {
            return false;
         } else {
            AuditReturnsReceiverInfo other = (AuditReturnsReceiverInfo)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$sellerAddressRecordId = this.getSellerAddressRecordId();
               Object other$sellerAddressRecordId = other.getSellerAddressRecordId();
               if (this$sellerAddressRecordId == null) {
                  if (other$sellerAddressRecordId != null) {
                     return false;
                  }
               } else if (!this$sellerAddressRecordId.equals(other$sellerAddressRecordId)) {
                  return false;
               }

               Object this$sellerAddressRecordVersion = this.getSellerAddressRecordVersion();
               Object other$sellerAddressRecordVersion = other.getSellerAddressRecordVersion();
               if (this$sellerAddressRecordVersion == null) {
                  if (other$sellerAddressRecordVersion != null) {
                     return false;
                  }
               } else if (!this$sellerAddressRecordVersion.equals(other$sellerAddressRecordVersion)) {
                  return false;
               }

               Object this$code = this.getCode();
               Object other$code = other.getCode();
               if (this$code == null) {
                  if (other$code != null) {
                     return false;
                  }
               } else if (!this$code.equals(other$code)) {
                  return false;
               }

               Object this$country = this.getCountry();
               Object other$country = other.getCountry();
               if (this$country == null) {
                  if (other$country != null) {
                     return false;
                  }
               } else if (!this$country.equals(other$country)) {
                  return false;
               }

               Object this$city = this.getCity();
               Object other$city = other.getCity();
               if (this$city == null) {
                  if (other$city != null) {
                     return false;
                  }
               } else if (!this$city.equals(other$city)) {
                  return false;
               }

               Object this$province = this.getProvince();
               Object other$province = other.getProvince();
               if (this$province == null) {
                  if (other$province != null) {
                     return false;
                  }
               } else if (!this$province.equals(other$province)) {
                  return false;
               }

               Object this$district = this.getDistrict();
               Object other$district = other.getDistrict();
               if (this$district == null) {
                  if (other$district != null) {
                     return false;
                  }
               } else if (!this$district.equals(other$district)) {
                  return false;
               }

               Object this$street = this.getStreet();
               Object other$street = other.getStreet();
               if (this$street == null) {
                  if (other$street != null) {
                     return false;
                  }
               } else if (!this$street.equals(other$street)) {
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AuditReturnsReceiverInfo;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $sellerAddressRecordId = this.getSellerAddressRecordId();
         result = result * 59 + ($sellerAddressRecordId == null ? 43 : $sellerAddressRecordId.hashCode());
         Object $sellerAddressRecordVersion = this.getSellerAddressRecordVersion();
         result = result * 59 + ($sellerAddressRecordVersion == null ? 43 : $sellerAddressRecordVersion.hashCode());
         Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
         Object $country = this.getCountry();
         result = result * 59 + ($country == null ? 43 : $country.hashCode());
         Object $city = this.getCity();
         result = result * 59 + ($city == null ? 43 : $city.hashCode());
         Object $province = this.getProvince();
         result = result * 59 + ($province == null ? 43 : $province.hashCode());
         Object $district = this.getDistrict();
         result = result * 59 + ($district == null ? 43 : $district.hashCode());
         Object $street = this.getStreet();
         result = result * 59 + ($street == null ? 43 : $street.hashCode());
         Object $receiverName = this.getReceiverName();
         result = result * 59 + ($receiverName == null ? 43 : $receiverName.hashCode());
         Object $receiverPhone = this.getReceiverPhone();
         result = result * 59 + ($receiverPhone == null ? 43 : $receiverPhone.hashCode());
         return result;
      }

      public String toString() {
         return "AuditReturnsRequest.AuditReturnsReceiverInfo(code=" + this.getCode() + ", country=" + this.getCountry() + ", city=" + this.getCity() + ", province=" + this.getProvince() + ", district=" + this.getDistrict() + ", street=" + this.getStreet() + ", receiverName=" + this.getReceiverName() + ", receiverPhone=" + this.getReceiverPhone() + ", sellerAddressRecordId=" + this.getSellerAddressRecordId() + ", sellerAddressRecordVersion=" + this.getSellerAddressRecordVersion() + ")";
      }
   }
}

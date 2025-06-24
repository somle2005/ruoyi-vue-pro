package com.xiaohongshu.fls.opensdk.entity.common.response;

public class SellerAddressRecord {
   public Long sellerAddressRecordId;
   public String contactName;
   public String phoneAreaCode;
   public String phone;
   public String landlineAreaCode;
   public String landlinePhone;
   public String landlineExtensionNumber;
   public String countryCode;
   public String provinceCode;
   public String cityCode;
   public String countyCode;
   public String townCode;
   public String countryName;
   public String provinceName;
   public String cityName;
   public String countyName;
   public String townName;
   public String address;
   public String fullAddress;
   public String deliveryDefault;
   public String aftersaleDefault;
   public Integer version;
   public String active;
   public Long createTime;
   public Long updateTime;

   public Long getSellerAddressRecordId() {
      return this.sellerAddressRecordId;
   }

   public String getContactName() {
      return this.contactName;
   }

   public String getPhoneAreaCode() {
      return this.phoneAreaCode;
   }

   public String getPhone() {
      return this.phone;
   }

   public String getLandlineAreaCode() {
      return this.landlineAreaCode;
   }

   public String getLandlinePhone() {
      return this.landlinePhone;
   }

   public String getLandlineExtensionNumber() {
      return this.landlineExtensionNumber;
   }

   public String getCountryCode() {
      return this.countryCode;
   }

   public String getProvinceCode() {
      return this.provinceCode;
   }

   public String getCityCode() {
      return this.cityCode;
   }

   public String getCountyCode() {
      return this.countyCode;
   }

   public String getTownCode() {
      return this.townCode;
   }

   public String getCountryName() {
      return this.countryName;
   }

   public String getProvinceName() {
      return this.provinceName;
   }

   public String getCityName() {
      return this.cityName;
   }

   public String getCountyName() {
      return this.countyName;
   }

   public String getTownName() {
      return this.townName;
   }

   public String getAddress() {
      return this.address;
   }

   public String getFullAddress() {
      return this.fullAddress;
   }

   public String getDeliveryDefault() {
      return this.deliveryDefault;
   }

   public String getAftersaleDefault() {
      return this.aftersaleDefault;
   }

   public Integer getVersion() {
      return this.version;
   }

   public String getActive() {
      return this.active;
   }

   public Long getCreateTime() {
      return this.createTime;
   }

   public Long getUpdateTime() {
      return this.updateTime;
   }

   public void setSellerAddressRecordId(Long sellerAddressRecordId) {
      this.sellerAddressRecordId = sellerAddressRecordId;
   }

   public void setContactName(String contactName) {
      this.contactName = contactName;
   }

   public void setPhoneAreaCode(String phoneAreaCode) {
      this.phoneAreaCode = phoneAreaCode;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void setLandlineAreaCode(String landlineAreaCode) {
      this.landlineAreaCode = landlineAreaCode;
   }

   public void setLandlinePhone(String landlinePhone) {
      this.landlinePhone = landlinePhone;
   }

   public void setLandlineExtensionNumber(String landlineExtensionNumber) {
      this.landlineExtensionNumber = landlineExtensionNumber;
   }

   public void setCountryCode(String countryCode) {
      this.countryCode = countryCode;
   }

   public void setProvinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
   }

   public void setCityCode(String cityCode) {
      this.cityCode = cityCode;
   }

   public void setCountyCode(String countyCode) {
      this.countyCode = countyCode;
   }

   public void setTownCode(String townCode) {
      this.townCode = townCode;
   }

   public void setCountryName(String countryName) {
      this.countryName = countryName;
   }

   public void setProvinceName(String provinceName) {
      this.provinceName = provinceName;
   }

   public void setCityName(String cityName) {
      this.cityName = cityName;
   }

   public void setCountyName(String countyName) {
      this.countyName = countyName;
   }

   public void setTownName(String townName) {
      this.townName = townName;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   public void setDeliveryDefault(String deliveryDefault) {
      this.deliveryDefault = deliveryDefault;
   }

   public void setAftersaleDefault(String aftersaleDefault) {
      this.aftersaleDefault = aftersaleDefault;
   }

   public void setVersion(Integer version) {
      this.version = version;
   }

   public void setActive(String active) {
      this.active = active;
   }

   public void setCreateTime(Long createTime) {
      this.createTime = createTime;
   }

   public void setUpdateTime(Long updateTime) {
      this.updateTime = updateTime;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof SellerAddressRecord)) {
         return false;
      } else {
         SellerAddressRecord other = (SellerAddressRecord)o;
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

            Object this$version = this.getVersion();
            Object other$version = other.getVersion();
            if (this$version == null) {
               if (other$version != null) {
                  return false;
               }
            } else if (!this$version.equals(other$version)) {
               return false;
            }

            Object this$createTime = this.getCreateTime();
            Object other$createTime = other.getCreateTime();
            if (this$createTime == null) {
               if (other$createTime != null) {
                  return false;
               }
            } else if (!this$createTime.equals(other$createTime)) {
               return false;
            }

            Object this$updateTime = this.getUpdateTime();
            Object other$updateTime = other.getUpdateTime();
            if (this$updateTime == null) {
               if (other$updateTime != null) {
                  return false;
               }
            } else if (!this$updateTime.equals(other$updateTime)) {
               return false;
            }

            Object this$contactName = this.getContactName();
            Object other$contactName = other.getContactName();
            if (this$contactName == null) {
               if (other$contactName != null) {
                  return false;
               }
            } else if (!this$contactName.equals(other$contactName)) {
               return false;
            }

            Object this$phoneAreaCode = this.getPhoneAreaCode();
            Object other$phoneAreaCode = other.getPhoneAreaCode();
            if (this$phoneAreaCode == null) {
               if (other$phoneAreaCode != null) {
                  return false;
               }
            } else if (!this$phoneAreaCode.equals(other$phoneAreaCode)) {
               return false;
            }

            Object this$phone = this.getPhone();
            Object other$phone = other.getPhone();
            if (this$phone == null) {
               if (other$phone != null) {
                  return false;
               }
            } else if (!this$phone.equals(other$phone)) {
               return false;
            }

            Object this$landlineAreaCode = this.getLandlineAreaCode();
            Object other$landlineAreaCode = other.getLandlineAreaCode();
            if (this$landlineAreaCode == null) {
               if (other$landlineAreaCode != null) {
                  return false;
               }
            } else if (!this$landlineAreaCode.equals(other$landlineAreaCode)) {
               return false;
            }

            Object this$landlinePhone = this.getLandlinePhone();
            Object other$landlinePhone = other.getLandlinePhone();
            if (this$landlinePhone == null) {
               if (other$landlinePhone != null) {
                  return false;
               }
            } else if (!this$landlinePhone.equals(other$landlinePhone)) {
               return false;
            }

            Object this$landlineExtensionNumber = this.getLandlineExtensionNumber();
            Object other$landlineExtensionNumber = other.getLandlineExtensionNumber();
            if (this$landlineExtensionNumber == null) {
               if (other$landlineExtensionNumber != null) {
                  return false;
               }
            } else if (!this$landlineExtensionNumber.equals(other$landlineExtensionNumber)) {
               return false;
            }

            Object this$countryCode = this.getCountryCode();
            Object other$countryCode = other.getCountryCode();
            if (this$countryCode == null) {
               if (other$countryCode != null) {
                  return false;
               }
            } else if (!this$countryCode.equals(other$countryCode)) {
               return false;
            }

            Object this$provinceCode = this.getProvinceCode();
            Object other$provinceCode = other.getProvinceCode();
            if (this$provinceCode == null) {
               if (other$provinceCode != null) {
                  return false;
               }
            } else if (!this$provinceCode.equals(other$provinceCode)) {
               return false;
            }

            Object this$cityCode = this.getCityCode();
            Object other$cityCode = other.getCityCode();
            if (this$cityCode == null) {
               if (other$cityCode != null) {
                  return false;
               }
            } else if (!this$cityCode.equals(other$cityCode)) {
               return false;
            }

            Object this$countyCode = this.getCountyCode();
            Object other$countyCode = other.getCountyCode();
            if (this$countyCode == null) {
               if (other$countyCode != null) {
                  return false;
               }
            } else if (!this$countyCode.equals(other$countyCode)) {
               return false;
            }

            Object this$townCode = this.getTownCode();
            Object other$townCode = other.getTownCode();
            if (this$townCode == null) {
               if (other$townCode != null) {
                  return false;
               }
            } else if (!this$townCode.equals(other$townCode)) {
               return false;
            }

            Object this$countryName = this.getCountryName();
            Object other$countryName = other.getCountryName();
            if (this$countryName == null) {
               if (other$countryName != null) {
                  return false;
               }
            } else if (!this$countryName.equals(other$countryName)) {
               return false;
            }

            Object this$provinceName = this.getProvinceName();
            Object other$provinceName = other.getProvinceName();
            if (this$provinceName == null) {
               if (other$provinceName != null) {
                  return false;
               }
            } else if (!this$provinceName.equals(other$provinceName)) {
               return false;
            }

            Object this$cityName = this.getCityName();
            Object other$cityName = other.getCityName();
            if (this$cityName == null) {
               if (other$cityName != null) {
                  return false;
               }
            } else if (!this$cityName.equals(other$cityName)) {
               return false;
            }

            Object this$countyName = this.getCountyName();
            Object other$countyName = other.getCountyName();
            if (this$countyName == null) {
               if (other$countyName != null) {
                  return false;
               }
            } else if (!this$countyName.equals(other$countyName)) {
               return false;
            }

            Object this$townName = this.getTownName();
            Object other$townName = other.getTownName();
            if (this$townName == null) {
               if (other$townName != null) {
                  return false;
               }
            } else if (!this$townName.equals(other$townName)) {
               return false;
            }

            Object this$address = this.getAddress();
            Object other$address = other.getAddress();
            if (this$address == null) {
               if (other$address != null) {
                  return false;
               }
            } else if (!this$address.equals(other$address)) {
               return false;
            }

            Object this$fullAddress = this.getFullAddress();
            Object other$fullAddress = other.getFullAddress();
            if (this$fullAddress == null) {
               if (other$fullAddress != null) {
                  return false;
               }
            } else if (!this$fullAddress.equals(other$fullAddress)) {
               return false;
            }

            Object this$deliveryDefault = this.getDeliveryDefault();
            Object other$deliveryDefault = other.getDeliveryDefault();
            if (this$deliveryDefault == null) {
               if (other$deliveryDefault != null) {
                  return false;
               }
            } else if (!this$deliveryDefault.equals(other$deliveryDefault)) {
               return false;
            }

            Object this$aftersaleDefault = this.getAftersaleDefault();
            Object other$aftersaleDefault = other.getAftersaleDefault();
            if (this$aftersaleDefault == null) {
               if (other$aftersaleDefault != null) {
                  return false;
               }
            } else if (!this$aftersaleDefault.equals(other$aftersaleDefault)) {
               return false;
            }

            Object this$active = this.getActive();
            Object other$active = other.getActive();
            if (this$active == null) {
               if (other$active != null) {
                  return false;
               }
            } else if (!this$active.equals(other$active)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof SellerAddressRecord;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $sellerAddressRecordId = this.getSellerAddressRecordId();
      result = result * 59 + ($sellerAddressRecordId == null ? 43 : $sellerAddressRecordId.hashCode());
      Object $version = this.getVersion();
      result = result * 59 + ($version == null ? 43 : $version.hashCode());
      Object $createTime = this.getCreateTime();
      result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
      Object $updateTime = this.getUpdateTime();
      result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
      Object $contactName = this.getContactName();
      result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
      Object $phoneAreaCode = this.getPhoneAreaCode();
      result = result * 59 + ($phoneAreaCode == null ? 43 : $phoneAreaCode.hashCode());
      Object $phone = this.getPhone();
      result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
      Object $landlineAreaCode = this.getLandlineAreaCode();
      result = result * 59 + ($landlineAreaCode == null ? 43 : $landlineAreaCode.hashCode());
      Object $landlinePhone = this.getLandlinePhone();
      result = result * 59 + ($landlinePhone == null ? 43 : $landlinePhone.hashCode());
      Object $landlineExtensionNumber = this.getLandlineExtensionNumber();
      result = result * 59 + ($landlineExtensionNumber == null ? 43 : $landlineExtensionNumber.hashCode());
      Object $countryCode = this.getCountryCode();
      result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
      Object $provinceCode = this.getProvinceCode();
      result = result * 59 + ($provinceCode == null ? 43 : $provinceCode.hashCode());
      Object $cityCode = this.getCityCode();
      result = result * 59 + ($cityCode == null ? 43 : $cityCode.hashCode());
      Object $countyCode = this.getCountyCode();
      result = result * 59 + ($countyCode == null ? 43 : $countyCode.hashCode());
      Object $townCode = this.getTownCode();
      result = result * 59 + ($townCode == null ? 43 : $townCode.hashCode());
      Object $countryName = this.getCountryName();
      result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
      Object $provinceName = this.getProvinceName();
      result = result * 59 + ($provinceName == null ? 43 : $provinceName.hashCode());
      Object $cityName = this.getCityName();
      result = result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
      Object $countyName = this.getCountyName();
      result = result * 59 + ($countyName == null ? 43 : $countyName.hashCode());
      Object $townName = this.getTownName();
      result = result * 59 + ($townName == null ? 43 : $townName.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $fullAddress = this.getFullAddress();
      result = result * 59 + ($fullAddress == null ? 43 : $fullAddress.hashCode());
      Object $deliveryDefault = this.getDeliveryDefault();
      result = result * 59 + ($deliveryDefault == null ? 43 : $deliveryDefault.hashCode());
      Object $aftersaleDefault = this.getAftersaleDefault();
      result = result * 59 + ($aftersaleDefault == null ? 43 : $aftersaleDefault.hashCode());
      Object $active = this.getActive();
      result = result * 59 + ($active == null ? 43 : $active.hashCode());
      return result;
   }

   public String toString() {
      return "SellerAddressRecord(sellerAddressRecordId=" + this.getSellerAddressRecordId() + ", contactName=" + this.getContactName() + ", phoneAreaCode=" + this.getPhoneAreaCode() + ", phone=" + this.getPhone() + ", landlineAreaCode=" + this.getLandlineAreaCode() + ", landlinePhone=" + this.getLandlinePhone() + ", landlineExtensionNumber=" + this.getLandlineExtensionNumber() + ", countryCode=" + this.getCountryCode() + ", provinceCode=" + this.getProvinceCode() + ", cityCode=" + this.getCityCode() + ", countyCode=" + this.getCountyCode() + ", townCode=" + this.getTownCode() + ", countryName=" + this.getCountryName() + ", provinceName=" + this.getProvinceName() + ", cityName=" + this.getCityName() + ", countyName=" + this.getCountyName() + ", townName=" + this.getTownName() + ", address=" + this.getAddress() + ", fullAddress=" + this.getFullAddress() + ", deliveryDefault=" + this.getDeliveryDefault() + ", aftersaleDefault=" + this.getAftersaleDefault() + ", version=" + this.getVersion() + ", active=" + this.getActive() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
   }
}

package com.xiaohongshu.fls.opensdk.entity.express;

public class ElectronicBillAddress {
   private String city;
   private String detail;
   private String district;
   private String province;
   private String town;

   public String getCity() {
      return this.city;
   }

   public String getDetail() {
      return this.detail;
   }

   public String getDistrict() {
      return this.district;
   }

   public String getProvince() {
      return this.province;
   }

   public String getTown() {
      return this.town;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public void setDetail(String detail) {
      this.detail = detail;
   }

   public void setDistrict(String district) {
      this.district = district;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillAddress)) {
         return false;
      } else {
         ElectronicBillAddress other = (ElectronicBillAddress)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$city = this.getCity();
            Object other$city = other.getCity();
            if (this$city == null) {
               if (other$city != null) {
                  return false;
               }
            } else if (!this$city.equals(other$city)) {
               return false;
            }

            Object this$detail = this.getDetail();
            Object other$detail = other.getDetail();
            if (this$detail == null) {
               if (other$detail != null) {
                  return false;
               }
            } else if (!this$detail.equals(other$detail)) {
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

            Object this$province = this.getProvince();
            Object other$province = other.getProvince();
            if (this$province == null) {
               if (other$province != null) {
                  return false;
               }
            } else if (!this$province.equals(other$province)) {
               return false;
            }

            Object this$town = this.getTown();
            Object other$town = other.getTown();
            if (this$town == null) {
               if (other$town != null) {
                  return false;
               }
            } else if (!this$town.equals(other$town)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillAddress;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $city = this.getCity();
      result = result * 59 + ($city == null ? 43 : $city.hashCode());
      Object $detail = this.getDetail();
      result = result * 59 + ($detail == null ? 43 : $detail.hashCode());
      Object $district = this.getDistrict();
      result = result * 59 + ($district == null ? 43 : $district.hashCode());
      Object $province = this.getProvince();
      result = result * 59 + ($province == null ? 43 : $province.hashCode());
      Object $town = this.getTown();
      result = result * 59 + ($town == null ? 43 : $town.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillAddress(city=" + this.getCity() + ", detail=" + this.getDetail() + ", district=" + this.getDistrict() + ", province=" + this.getProvince() + ", town=" + this.getTown() + ")";
   }
}

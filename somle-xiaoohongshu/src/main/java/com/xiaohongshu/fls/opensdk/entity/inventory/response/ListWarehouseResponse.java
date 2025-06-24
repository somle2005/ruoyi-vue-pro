package com.xiaohongshu.fls.opensdk.entity.inventory.response;

import java.util.List;

public class ListWarehouseResponse {
   public Integer total;
   public List<Warehouse> warehouseList;

   public Integer getTotal() {
      return this.total;
   }

   public List<Warehouse> getWarehouseList() {
      return this.warehouseList;
   }

   public void setTotal(Integer total) {
      this.total = total;
   }

   public void setWarehouseList(List<Warehouse> warehouseList) {
      this.warehouseList = warehouseList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ListWarehouseResponse)) {
         return false;
      } else {
         ListWarehouseResponse other = (ListWarehouseResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$total = this.getTotal();
            Object other$total = other.getTotal();
            if (this$total == null) {
               if (other$total != null) {
                  return false;
               }
            } else if (!this$total.equals(other$total)) {
               return false;
            }

            Object this$warehouseList = this.getWarehouseList();
            Object other$warehouseList = other.getWarehouseList();
            if (this$warehouseList == null) {
               if (other$warehouseList != null) {
                  return false;
               }
            } else if (!this$warehouseList.equals(other$warehouseList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ListWarehouseResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $total = this.getTotal();
      result = result * 59 + ($total == null ? 43 : $total.hashCode());
      Object $warehouseList = this.getWarehouseList();
      result = result * 59 + ($warehouseList == null ? 43 : $warehouseList.hashCode());
      return result;
   }

   public String toString() {
      return "ListWarehouseResponse(total=" + this.getTotal() + ", warehouseList=" + this.getWarehouseList() + ")";
   }

   public static class Warehouse {
      public String code;
      public String name;
      public String province;
      public String provinceCode;
      public String city;
      public String cityCode;
      public String area;
      public String areaCode;
      public String town;
      public String townCode;
      public String address;
      public String contactName;
      public String contactTel;

      public String getCode() {
         return this.code;
      }

      public String getName() {
         return this.name;
      }

      public String getProvince() {
         return this.province;
      }

      public String getProvinceCode() {
         return this.provinceCode;
      }

      public String getCity() {
         return this.city;
      }

      public String getCityCode() {
         return this.cityCode;
      }

      public String getArea() {
         return this.area;
      }

      public String getAreaCode() {
         return this.areaCode;
      }

      public String getTown() {
         return this.town;
      }

      public String getTownCode() {
         return this.townCode;
      }

      public String getAddress() {
         return this.address;
      }

      public String getContactName() {
         return this.contactName;
      }

      public String getContactTel() {
         return this.contactTel;
      }

      public void setCode(String code) {
         this.code = code;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setProvince(String province) {
         this.province = province;
      }

      public void setProvinceCode(String provinceCode) {
         this.provinceCode = provinceCode;
      }

      public void setCity(String city) {
         this.city = city;
      }

      public void setCityCode(String cityCode) {
         this.cityCode = cityCode;
      }

      public void setArea(String area) {
         this.area = area;
      }

      public void setAreaCode(String areaCode) {
         this.areaCode = areaCode;
      }

      public void setTown(String town) {
         this.town = town;
      }

      public void setTownCode(String townCode) {
         this.townCode = townCode;
      }

      public void setAddress(String address) {
         this.address = address;
      }

      public void setContactName(String contactName) {
         this.contactName = contactName;
      }

      public void setContactTel(String contactTel) {
         this.contactTel = contactTel;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Warehouse)) {
            return false;
         } else {
            Warehouse other = (Warehouse)o;
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

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
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

               Object this$provinceCode = this.getProvinceCode();
               Object other$provinceCode = other.getProvinceCode();
               if (this$provinceCode == null) {
                  if (other$provinceCode != null) {
                     return false;
                  }
               } else if (!this$provinceCode.equals(other$provinceCode)) {
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

               Object this$cityCode = this.getCityCode();
               Object other$cityCode = other.getCityCode();
               if (this$cityCode == null) {
                  if (other$cityCode != null) {
                     return false;
                  }
               } else if (!this$cityCode.equals(other$cityCode)) {
                  return false;
               }

               Object this$area = this.getArea();
               Object other$area = other.getArea();
               if (this$area == null) {
                  if (other$area != null) {
                     return false;
                  }
               } else if (!this$area.equals(other$area)) {
                  return false;
               }

               Object this$areaCode = this.getAreaCode();
               Object other$areaCode = other.getAreaCode();
               if (this$areaCode == null) {
                  if (other$areaCode != null) {
                     return false;
                  }
               } else if (!this$areaCode.equals(other$areaCode)) {
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

               Object this$townCode = this.getTownCode();
               Object other$townCode = other.getTownCode();
               if (this$townCode == null) {
                  if (other$townCode != null) {
                     return false;
                  }
               } else if (!this$townCode.equals(other$townCode)) {
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

               Object this$contactName = this.getContactName();
               Object other$contactName = other.getContactName();
               if (this$contactName == null) {
                  if (other$contactName != null) {
                     return false;
                  }
               } else if (!this$contactName.equals(other$contactName)) {
                  return false;
               }

               Object this$contactTel = this.getContactTel();
               Object other$contactTel = other.getContactTel();
               if (this$contactTel == null) {
                  if (other$contactTel != null) {
                     return false;
                  }
               } else if (!this$contactTel.equals(other$contactTel)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Warehouse;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $province = this.getProvince();
         result = result * 59 + ($province == null ? 43 : $province.hashCode());
         Object $provinceCode = this.getProvinceCode();
         result = result * 59 + ($provinceCode == null ? 43 : $provinceCode.hashCode());
         Object $city = this.getCity();
         result = result * 59 + ($city == null ? 43 : $city.hashCode());
         Object $cityCode = this.getCityCode();
         result = result * 59 + ($cityCode == null ? 43 : $cityCode.hashCode());
         Object $area = this.getArea();
         result = result * 59 + ($area == null ? 43 : $area.hashCode());
         Object $areaCode = this.getAreaCode();
         result = result * 59 + ($areaCode == null ? 43 : $areaCode.hashCode());
         Object $town = this.getTown();
         result = result * 59 + ($town == null ? 43 : $town.hashCode());
         Object $townCode = this.getTownCode();
         result = result * 59 + ($townCode == null ? 43 : $townCode.hashCode());
         Object $address = this.getAddress();
         result = result * 59 + ($address == null ? 43 : $address.hashCode());
         Object $contactName = this.getContactName();
         result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
         Object $contactTel = this.getContactTel();
         result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
         return result;
      }

      public String toString() {
         return "ListWarehouseResponse.Warehouse(code=" + this.getCode() + ", name=" + this.getName() + ", province=" + this.getProvince() + ", provinceCode=" + this.getProvinceCode() + ", city=" + this.getCity() + ", cityCode=" + this.getCityCode() + ", area=" + this.getArea() + ", areaCode=" + this.getAreaCode() + ", town=" + this.getTown() + ", townCode=" + this.getTownCode() + ", address=" + this.getAddress() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ")";
      }
   }
}

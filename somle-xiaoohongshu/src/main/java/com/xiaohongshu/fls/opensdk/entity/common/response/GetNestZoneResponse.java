package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetNestZoneResponse {
   public List<ProvinceZone> provinceZoneList;

   public List<ProvinceZone> getProvinceZoneList() {
      return this.provinceZoneList;
   }

   public void setProvinceZoneList(List<ProvinceZone> provinceZoneList) {
      this.provinceZoneList = provinceZoneList;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetNestZoneResponse)) {
         return false;
      } else {
         GetNestZoneResponse other = (GetNestZoneResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$provinceZoneList = this.getProvinceZoneList();
            Object other$provinceZoneList = other.getProvinceZoneList();
            if (this$provinceZoneList == null) {
               if (other$provinceZoneList != null) {
                  return false;
               }
            } else if (!this$provinceZoneList.equals(other$provinceZoneList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetNestZoneResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $provinceZoneList = this.getProvinceZoneList();
      result = result * 59 + ($provinceZoneList == null ? 43 : $provinceZoneList.hashCode());
      return result;
   }

   public String toString() {
      return "GetNestZoneResponse(provinceZoneList=" + this.getProvinceZoneList() + ")";
   }

   public static class ProvinceZone {
      public String id;
      public String code;
      public String name;
      public String upper;
      public String zipcode;
      public Boolean isDeactive;
      public List<CityZone> zones;

      public String getId() {
         return this.id;
      }

      public String getCode() {
         return this.code;
      }

      public String getName() {
         return this.name;
      }

      public String getUpper() {
         return this.upper;
      }

      public String getZipcode() {
         return this.zipcode;
      }

      public Boolean getIsDeactive() {
         return this.isDeactive;
      }

      public List<CityZone> getZones() {
         return this.zones;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setCode(String code) {
         this.code = code;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setUpper(String upper) {
         this.upper = upper;
      }

      public void setZipcode(String zipcode) {
         this.zipcode = zipcode;
      }

      public void setIsDeactive(Boolean isDeactive) {
         this.isDeactive = isDeactive;
      }

      public void setZones(List<CityZone> zones) {
         this.zones = zones;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ProvinceZone)) {
            return false;
         } else {
            ProvinceZone other = (ProvinceZone)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$isDeactive = this.getIsDeactive();
               Object other$isDeactive = other.getIsDeactive();
               if (this$isDeactive == null) {
                  if (other$isDeactive != null) {
                     return false;
                  }
               } else if (!this$isDeactive.equals(other$isDeactive)) {
                  return false;
               }

               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
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

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$upper = this.getUpper();
               Object other$upper = other.getUpper();
               if (this$upper == null) {
                  if (other$upper != null) {
                     return false;
                  }
               } else if (!this$upper.equals(other$upper)) {
                  return false;
               }

               Object this$zipcode = this.getZipcode();
               Object other$zipcode = other.getZipcode();
               if (this$zipcode == null) {
                  if (other$zipcode != null) {
                     return false;
                  }
               } else if (!this$zipcode.equals(other$zipcode)) {
                  return false;
               }

               Object this$zones = this.getZones();
               Object other$zones = other.getZones();
               if (this$zones == null) {
                  if (other$zones != null) {
                     return false;
                  }
               } else if (!this$zones.equals(other$zones)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ProvinceZone;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $isDeactive = this.getIsDeactive();
         result = result * 59 + ($isDeactive == null ? 43 : $isDeactive.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $upper = this.getUpper();
         result = result * 59 + ($upper == null ? 43 : $upper.hashCode());
         Object $zipcode = this.getZipcode();
         result = result * 59 + ($zipcode == null ? 43 : $zipcode.hashCode());
         Object $zones = this.getZones();
         result = result * 59 + ($zones == null ? 43 : $zones.hashCode());
         return result;
      }

      public String toString() {
         return "GetNestZoneResponse.ProvinceZone(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", upper=" + this.getUpper() + ", zipcode=" + this.getZipcode() + ", isDeactive=" + this.getIsDeactive() + ", zones=" + this.getZones() + ")";
      }
   }

   public static class CityZone {
      public String id;
      public String code;
      public String name;
      public String upper;
      public String zipcode;
      public Boolean isDeactive;
      public List<Zone> zones;

      public String getId() {
         return this.id;
      }

      public String getCode() {
         return this.code;
      }

      public String getName() {
         return this.name;
      }

      public String getUpper() {
         return this.upper;
      }

      public String getZipcode() {
         return this.zipcode;
      }

      public Boolean getIsDeactive() {
         return this.isDeactive;
      }

      public List<Zone> getZones() {
         return this.zones;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setCode(String code) {
         this.code = code;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setUpper(String upper) {
         this.upper = upper;
      }

      public void setZipcode(String zipcode) {
         this.zipcode = zipcode;
      }

      public void setIsDeactive(Boolean isDeactive) {
         this.isDeactive = isDeactive;
      }

      public void setZones(List<Zone> zones) {
         this.zones = zones;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof CityZone)) {
            return false;
         } else {
            CityZone other = (CityZone)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$isDeactive = this.getIsDeactive();
               Object other$isDeactive = other.getIsDeactive();
               if (this$isDeactive == null) {
                  if (other$isDeactive != null) {
                     return false;
                  }
               } else if (!this$isDeactive.equals(other$isDeactive)) {
                  return false;
               }

               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
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

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$upper = this.getUpper();
               Object other$upper = other.getUpper();
               if (this$upper == null) {
                  if (other$upper != null) {
                     return false;
                  }
               } else if (!this$upper.equals(other$upper)) {
                  return false;
               }

               Object this$zipcode = this.getZipcode();
               Object other$zipcode = other.getZipcode();
               if (this$zipcode == null) {
                  if (other$zipcode != null) {
                     return false;
                  }
               } else if (!this$zipcode.equals(other$zipcode)) {
                  return false;
               }

               Object this$zones = this.getZones();
               Object other$zones = other.getZones();
               if (this$zones == null) {
                  if (other$zones != null) {
                     return false;
                  }
               } else if (!this$zones.equals(other$zones)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof CityZone;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $isDeactive = this.getIsDeactive();
         result = result * 59 + ($isDeactive == null ? 43 : $isDeactive.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $upper = this.getUpper();
         result = result * 59 + ($upper == null ? 43 : $upper.hashCode());
         Object $zipcode = this.getZipcode();
         result = result * 59 + ($zipcode == null ? 43 : $zipcode.hashCode());
         Object $zones = this.getZones();
         result = result * 59 + ($zones == null ? 43 : $zones.hashCode());
         return result;
      }

      public String toString() {
         return "GetNestZoneResponse.CityZone(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", upper=" + this.getUpper() + ", zipcode=" + this.getZipcode() + ", isDeactive=" + this.getIsDeactive() + ", zones=" + this.getZones() + ")";
      }
   }

   public static class Zone {
      public String id;
      public String code;
      public String name;
      public String upper;
      public String zipcode;
      public Boolean isDeactive;

      public String getId() {
         return this.id;
      }

      public String getCode() {
         return this.code;
      }

      public String getName() {
         return this.name;
      }

      public String getUpper() {
         return this.upper;
      }

      public String getZipcode() {
         return this.zipcode;
      }

      public Boolean getIsDeactive() {
         return this.isDeactive;
      }

      public void setId(String id) {
         this.id = id;
      }

      public void setCode(String code) {
         this.code = code;
      }

      public void setName(String name) {
         this.name = name;
      }

      public void setUpper(String upper) {
         this.upper = upper;
      }

      public void setZipcode(String zipcode) {
         this.zipcode = zipcode;
      }

      public void setIsDeactive(Boolean isDeactive) {
         this.isDeactive = isDeactive;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Zone)) {
            return false;
         } else {
            Zone other = (Zone)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$isDeactive = this.getIsDeactive();
               Object other$isDeactive = other.getIsDeactive();
               if (this$isDeactive == null) {
                  if (other$isDeactive != null) {
                     return false;
                  }
               } else if (!this$isDeactive.equals(other$isDeactive)) {
                  return false;
               }

               Object this$id = this.getId();
               Object other$id = other.getId();
               if (this$id == null) {
                  if (other$id != null) {
                     return false;
                  }
               } else if (!this$id.equals(other$id)) {
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

               Object this$name = this.getName();
               Object other$name = other.getName();
               if (this$name == null) {
                  if (other$name != null) {
                     return false;
                  }
               } else if (!this$name.equals(other$name)) {
                  return false;
               }

               Object this$upper = this.getUpper();
               Object other$upper = other.getUpper();
               if (this$upper == null) {
                  if (other$upper != null) {
                     return false;
                  }
               } else if (!this$upper.equals(other$upper)) {
                  return false;
               }

               Object this$zipcode = this.getZipcode();
               Object other$zipcode = other.getZipcode();
               if (this$zipcode == null) {
                  if (other$zipcode != null) {
                     return false;
                  }
               } else if (!this$zipcode.equals(other$zipcode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Zone;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $isDeactive = this.getIsDeactive();
         result = result * 59 + ($isDeactive == null ? 43 : $isDeactive.hashCode());
         Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
         Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
         Object $name = this.getName();
         result = result * 59 + ($name == null ? 43 : $name.hashCode());
         Object $upper = this.getUpper();
         result = result * 59 + ($upper == null ? 43 : $upper.hashCode());
         Object $zipcode = this.getZipcode();
         result = result * 59 + ($zipcode == null ? 43 : $zipcode.hashCode());
         return result;
      }

      public String toString() {
         return "GetNestZoneResponse.Zone(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", upper=" + this.getUpper() + ", zipcode=" + this.getZipcode() + ", isDeactive=" + this.getIsDeactive() + ")";
      }
   }
}

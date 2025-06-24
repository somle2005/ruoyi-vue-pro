package com.xiaohongshu.fls.opensdk.entity.instantshopping;

public class AddressLocation {
   private String longitude;
   private String latitude;
   private String coordinateSystem;

   public String getLongitude() {
      return this.longitude;
   }

   public String getLatitude() {
      return this.latitude;
   }

   public String getCoordinateSystem() {
      return this.coordinateSystem;
   }

   public void setLongitude(String longitude) {
      this.longitude = longitude;
   }

   public void setLatitude(String latitude) {
      this.latitude = latitude;
   }

   public void setCoordinateSystem(String coordinateSystem) {
      this.coordinateSystem = coordinateSystem;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof AddressLocation)) {
         return false;
      } else {
         AddressLocation other = (AddressLocation)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$longitude = this.getLongitude();
            Object other$longitude = other.getLongitude();
            if (this$longitude == null) {
               if (other$longitude != null) {
                  return false;
               }
            } else if (!this$longitude.equals(other$longitude)) {
               return false;
            }

            Object this$latitude = this.getLatitude();
            Object other$latitude = other.getLatitude();
            if (this$latitude == null) {
               if (other$latitude != null) {
                  return false;
               }
            } else if (!this$latitude.equals(other$latitude)) {
               return false;
            }

            Object this$coordinateSystem = this.getCoordinateSystem();
            Object other$coordinateSystem = other.getCoordinateSystem();
            if (this$coordinateSystem == null) {
               if (other$coordinateSystem != null) {
                  return false;
               }
            } else if (!this$coordinateSystem.equals(other$coordinateSystem)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof AddressLocation;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $longitude = this.getLongitude();
      result = result * 59 + ($longitude == null ? 43 : $longitude.hashCode());
      Object $latitude = this.getLatitude();
      result = result * 59 + ($latitude == null ? 43 : $latitude.hashCode());
      Object $coordinateSystem = this.getCoordinateSystem();
      result = result * 59 + ($coordinateSystem == null ? 43 : $coordinateSystem.hashCode());
      return result;
   }

   public String toString() {
      return "AddressLocation(longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", coordinateSystem=" + this.getCoordinateSystem() + ")";
   }
}

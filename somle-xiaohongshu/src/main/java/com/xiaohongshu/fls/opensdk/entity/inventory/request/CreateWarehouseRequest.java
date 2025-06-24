package com.xiaohongshu.fls.opensdk.entity.inventory.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class CreateWarehouseRequest extends BaseRequest {
   public String code;
   public String name;
   public String zoneCode;
   public String address;
   public String contactName;
   public String contactTel;

   public String getCode() {
      return this.code;
   }

   public String getName() {
      return this.name;
   }

   public String getZoneCode() {
      return this.zoneCode;
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

   public void setZoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
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
      } else if (!(o instanceof CreateWarehouseRequest)) {
         return false;
      } else {
         CreateWarehouseRequest other = (CreateWarehouseRequest)o;
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

            Object this$zoneCode = this.getZoneCode();
            Object other$zoneCode = other.getZoneCode();
            if (this$zoneCode == null) {
               if (other$zoneCode != null) {
                  return false;
               }
            } else if (!this$zoneCode.equals(other$zoneCode)) {
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
      return other instanceof CreateWarehouseRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $zoneCode = this.getZoneCode();
      result = result * 59 + ($zoneCode == null ? 43 : $zoneCode.hashCode());
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $contactName = this.getContactName();
      result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
      Object $contactTel = this.getContactTel();
      result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
      return result;
   }

   public String toString() {
      return "CreateWarehouseRequest(code=" + this.getCode() + ", name=" + this.getName() + ", zoneCode=" + this.getZoneCode() + ", address=" + this.getAddress() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ")";
   }
}

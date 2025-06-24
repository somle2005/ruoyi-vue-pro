package com.xiaohongshu.fls.opensdk.entity.express;

public class ElectronicBillUserInfo {
   private ElectronicBillAddress address;
   private String mobile;
   private String name;
   private String phone;
   private String openAddressId;

   public ElectronicBillAddress getAddress() {
      return this.address;
   }

   public String getMobile() {
      return this.mobile;
   }

   public String getName() {
      return this.name;
   }

   public String getPhone() {
      return this.phone;
   }

   public String getOpenAddressId() {
      return this.openAddressId;
   }

   public void setAddress(ElectronicBillAddress address) {
      this.address = address;
   }

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void setOpenAddressId(String openAddressId) {
      this.openAddressId = openAddressId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillUserInfo)) {
         return false;
      } else {
         ElectronicBillUserInfo other = (ElectronicBillUserInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$address = this.getAddress();
            Object other$address = other.getAddress();
            if (this$address == null) {
               if (other$address != null) {
                  return false;
               }
            } else if (!this$address.equals(other$address)) {
               return false;
            }

            Object this$mobile = this.getMobile();
            Object other$mobile = other.getMobile();
            if (this$mobile == null) {
               if (other$mobile != null) {
                  return false;
               }
            } else if (!this$mobile.equals(other$mobile)) {
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

            Object this$phone = this.getPhone();
            Object other$phone = other.getPhone();
            if (this$phone == null) {
               if (other$phone != null) {
                  return false;
               }
            } else if (!this$phone.equals(other$phone)) {
               return false;
            }

            Object this$openAddressId = this.getOpenAddressId();
            Object other$openAddressId = other.getOpenAddressId();
            if (this$openAddressId == null) {
               if (other$openAddressId != null) {
                  return false;
               }
            } else if (!this$openAddressId.equals(other$openAddressId)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillUserInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $address = this.getAddress();
      result = result * 59 + ($address == null ? 43 : $address.hashCode());
      Object $mobile = this.getMobile();
      result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $phone = this.getPhone();
      result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
      Object $openAddressId = this.getOpenAddressId();
      result = result * 59 + ($openAddressId == null ? 43 : $openAddressId.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillUserInfo(address=" + this.getAddress() + ", mobile=" + this.getMobile() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ", openAddressId=" + this.getOpenAddressId() + ")";
   }
}

package com.xiaohongshu.fls.opensdk.entity.express.response;

import java.util.List;

public class ElectronicBillSubscribesQueryResponse {
   private List<Subscribe> subscribeList;
   private Long accountId;

   public List<Subscribe> getSubscribeList() {
      return this.subscribeList;
   }

   public Long getAccountId() {
      return this.accountId;
   }

   public void setSubscribeList(List<Subscribe> subscribeList) {
      this.subscribeList = subscribeList;
   }

   public void setAccountId(Long accountId) {
      this.accountId = accountId;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof ElectronicBillSubscribesQueryResponse)) {
         return false;
      } else {
         ElectronicBillSubscribesQueryResponse other = (ElectronicBillSubscribesQueryResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$accountId = this.getAccountId();
            Object other$accountId = other.getAccountId();
            if (this$accountId == null) {
               if (other$accountId != null) {
                  return false;
               }
            } else if (!this$accountId.equals(other$accountId)) {
               return false;
            }

            Object this$subscribeList = this.getSubscribeList();
            Object other$subscribeList = other.getSubscribeList();
            if (this$subscribeList == null) {
               if (other$subscribeList != null) {
                  return false;
               }
            } else if (!this$subscribeList.equals(other$subscribeList)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof ElectronicBillSubscribesQueryResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $accountId = this.getAccountId();
      result = result * 59 + ($accountId == null ? 43 : $accountId.hashCode());
      Object $subscribeList = this.getSubscribeList();
      result = result * 59 + ($subscribeList == null ? 43 : $subscribeList.hashCode());
      return result;
   }

   public String toString() {
      return "ElectronicBillSubscribesQueryResponse(subscribeList=" + this.getSubscribeList() + ", accountId=" + this.getAccountId() + ")";
   }

   public static class Subscribe {
      private String cpCode;
      private String cpName;
      private Integer cpType;
      private String branchCode;
      private String branchName;
      private String brandCode;
      private String customerCode;
      private String subscribeType;
      private List<SenderAddress> senderAddressList;
      private Usage usage;

      public String getCpCode() {
         return this.cpCode;
      }

      public String getCpName() {
         return this.cpName;
      }

      public Integer getCpType() {
         return this.cpType;
      }

      public String getBranchCode() {
         return this.branchCode;
      }

      public String getBranchName() {
         return this.branchName;
      }

      public String getBrandCode() {
         return this.brandCode;
      }

      public String getCustomerCode() {
         return this.customerCode;
      }

      public String getSubscribeType() {
         return this.subscribeType;
      }

      public List<SenderAddress> getSenderAddressList() {
         return this.senderAddressList;
      }

      public Usage getUsage() {
         return this.usage;
      }

      public void setCpCode(String cpCode) {
         this.cpCode = cpCode;
      }

      public void setCpName(String cpName) {
         this.cpName = cpName;
      }

      public void setCpType(Integer cpType) {
         this.cpType = cpType;
      }

      public void setBranchCode(String branchCode) {
         this.branchCode = branchCode;
      }

      public void setBranchName(String branchName) {
         this.branchName = branchName;
      }

      public void setBrandCode(String brandCode) {
         this.brandCode = brandCode;
      }

      public void setCustomerCode(String customerCode) {
         this.customerCode = customerCode;
      }

      public void setSubscribeType(String subscribeType) {
         this.subscribeType = subscribeType;
      }

      public void setSenderAddressList(List<SenderAddress> senderAddressList) {
         this.senderAddressList = senderAddressList;
      }

      public void setUsage(Usage usage) {
         this.usage = usage;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Subscribe)) {
            return false;
         } else {
            Subscribe other = (Subscribe)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$cpType = this.getCpType();
               Object other$cpType = other.getCpType();
               if (this$cpType == null) {
                  if (other$cpType != null) {
                     return false;
                  }
               } else if (!this$cpType.equals(other$cpType)) {
                  return false;
               }

               Object this$cpCode = this.getCpCode();
               Object other$cpCode = other.getCpCode();
               if (this$cpCode == null) {
                  if (other$cpCode != null) {
                     return false;
                  }
               } else if (!this$cpCode.equals(other$cpCode)) {
                  return false;
               }

               Object this$cpName = this.getCpName();
               Object other$cpName = other.getCpName();
               if (this$cpName == null) {
                  if (other$cpName != null) {
                     return false;
                  }
               } else if (!this$cpName.equals(other$cpName)) {
                  return false;
               }

               Object this$branchCode = this.getBranchCode();
               Object other$branchCode = other.getBranchCode();
               if (this$branchCode == null) {
                  if (other$branchCode != null) {
                     return false;
                  }
               } else if (!this$branchCode.equals(other$branchCode)) {
                  return false;
               }

               Object this$branchName = this.getBranchName();
               Object other$branchName = other.getBranchName();
               if (this$branchName == null) {
                  if (other$branchName != null) {
                     return false;
                  }
               } else if (!this$branchName.equals(other$branchName)) {
                  return false;
               }

               Object this$brandCode = this.getBrandCode();
               Object other$brandCode = other.getBrandCode();
               if (this$brandCode == null) {
                  if (other$brandCode != null) {
                     return false;
                  }
               } else if (!this$brandCode.equals(other$brandCode)) {
                  return false;
               }

               Object this$customerCode = this.getCustomerCode();
               Object other$customerCode = other.getCustomerCode();
               if (this$customerCode == null) {
                  if (other$customerCode != null) {
                     return false;
                  }
               } else if (!this$customerCode.equals(other$customerCode)) {
                  return false;
               }

               Object this$subscribeType = this.getSubscribeType();
               Object other$subscribeType = other.getSubscribeType();
               if (this$subscribeType == null) {
                  if (other$subscribeType != null) {
                     return false;
                  }
               } else if (!this$subscribeType.equals(other$subscribeType)) {
                  return false;
               }

               Object this$senderAddressList = this.getSenderAddressList();
               Object other$senderAddressList = other.getSenderAddressList();
               if (this$senderAddressList == null) {
                  if (other$senderAddressList != null) {
                     return false;
                  }
               } else if (!this$senderAddressList.equals(other$senderAddressList)) {
                  return false;
               }

               Object this$usage = this.getUsage();
               Object other$usage = other.getUsage();
               if (this$usage == null) {
                  if (other$usage != null) {
                     return false;
                  }
               } else if (!this$usage.equals(other$usage)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Subscribe;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $cpType = this.getCpType();
         result = result * 59 + ($cpType == null ? 43 : $cpType.hashCode());
         Object $cpCode = this.getCpCode();
         result = result * 59 + ($cpCode == null ? 43 : $cpCode.hashCode());
         Object $cpName = this.getCpName();
         result = result * 59 + ($cpName == null ? 43 : $cpName.hashCode());
         Object $branchCode = this.getBranchCode();
         result = result * 59 + ($branchCode == null ? 43 : $branchCode.hashCode());
         Object $branchName = this.getBranchName();
         result = result * 59 + ($branchName == null ? 43 : $branchName.hashCode());
         Object $brandCode = this.getBrandCode();
         result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
         Object $customerCode = this.getCustomerCode();
         result = result * 59 + ($customerCode == null ? 43 : $customerCode.hashCode());
         Object $subscribeType = this.getSubscribeType();
         result = result * 59 + ($subscribeType == null ? 43 : $subscribeType.hashCode());
         Object $senderAddressList = this.getSenderAddressList();
         result = result * 59 + ($senderAddressList == null ? 43 : $senderAddressList.hashCode());
         Object $usage = this.getUsage();
         result = result * 59 + ($usage == null ? 43 : $usage.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillSubscribesQueryResponse.Subscribe(cpCode=" + this.getCpCode() + ", cpName=" + this.getCpName() + ", cpType=" + this.getCpType() + ", branchCode=" + this.getBranchCode() + ", branchName=" + this.getBranchName() + ", brandCode=" + this.getBrandCode() + ", customerCode=" + this.getCustomerCode() + ", subscribeType=" + this.getSubscribeType() + ", senderAddressList=" + this.getSenderAddressList() + ", usage=" + this.getUsage() + ")";
      }
   }

   public static class SenderAddress {
      private Address address;
      private String mobile;
      private String name;
      private String phone;

      public Address getAddress() {
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

      public void setAddress(Address address) {
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

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SenderAddress)) {
            return false;
         } else {
            SenderAddress other = (SenderAddress)o;
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

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SenderAddress;
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
         return result;
      }

      public String toString() {
         return "ElectronicBillSubscribesQueryResponse.SenderAddress(address=" + this.getAddress() + ", mobile=" + this.getMobile() + ", name=" + this.getName() + ", phone=" + this.getPhone() + ")";
      }
   }

   public static class Address {
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
         } else if (!(o instanceof Address)) {
            return false;
         } else {
            Address other = (Address)o;
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
         return other instanceof Address;
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
         return "ElectronicBillSubscribesQueryResponse.Address(city=" + this.getCity() + ", detail=" + this.getDetail() + ", district=" + this.getDistrict() + ", province=" + this.getProvince() + ", town=" + this.getTown() + ")";
      }
   }

   public static class Usage {
      private Integer quantity;
      private Integer allocatedQuantity;
      private Integer cancelQuantity;
      private Integer recycledQuantity;

      public Integer getQuantity() {
         return this.quantity;
      }

      public Integer getAllocatedQuantity() {
         return this.allocatedQuantity;
      }

      public Integer getCancelQuantity() {
         return this.cancelQuantity;
      }

      public Integer getRecycledQuantity() {
         return this.recycledQuantity;
      }

      public void setQuantity(Integer quantity) {
         this.quantity = quantity;
      }

      public void setAllocatedQuantity(Integer allocatedQuantity) {
         this.allocatedQuantity = allocatedQuantity;
      }

      public void setCancelQuantity(Integer cancelQuantity) {
         this.cancelQuantity = cancelQuantity;
      }

      public void setRecycledQuantity(Integer recycledQuantity) {
         this.recycledQuantity = recycledQuantity;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof Usage)) {
            return false;
         } else {
            Usage other = (Usage)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$quantity = this.getQuantity();
               Object other$quantity = other.getQuantity();
               if (this$quantity == null) {
                  if (other$quantity != null) {
                     return false;
                  }
               } else if (!this$quantity.equals(other$quantity)) {
                  return false;
               }

               Object this$allocatedQuantity = this.getAllocatedQuantity();
               Object other$allocatedQuantity = other.getAllocatedQuantity();
               if (this$allocatedQuantity == null) {
                  if (other$allocatedQuantity != null) {
                     return false;
                  }
               } else if (!this$allocatedQuantity.equals(other$allocatedQuantity)) {
                  return false;
               }

               Object this$cancelQuantity = this.getCancelQuantity();
               Object other$cancelQuantity = other.getCancelQuantity();
               if (this$cancelQuantity == null) {
                  if (other$cancelQuantity != null) {
                     return false;
                  }
               } else if (!this$cancelQuantity.equals(other$cancelQuantity)) {
                  return false;
               }

               Object this$recycledQuantity = this.getRecycledQuantity();
               Object other$recycledQuantity = other.getRecycledQuantity();
               if (this$recycledQuantity == null) {
                  if (other$recycledQuantity != null) {
                     return false;
                  }
               } else if (!this$recycledQuantity.equals(other$recycledQuantity)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof Usage;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $quantity = this.getQuantity();
         result = result * 59 + ($quantity == null ? 43 : $quantity.hashCode());
         Object $allocatedQuantity = this.getAllocatedQuantity();
         result = result * 59 + ($allocatedQuantity == null ? 43 : $allocatedQuantity.hashCode());
         Object $cancelQuantity = this.getCancelQuantity();
         result = result * 59 + ($cancelQuantity == null ? 43 : $cancelQuantity.hashCode());
         Object $recycledQuantity = this.getRecycledQuantity();
         result = result * 59 + ($recycledQuantity == null ? 43 : $recycledQuantity.hashCode());
         return result;
      }

      public String toString() {
         return "ElectronicBillSubscribesQueryResponse.Usage(quantity=" + this.getQuantity() + ", allocatedQuantity=" + this.getAllocatedQuantity() + ", cancelQuantity=" + this.getCancelQuantity() + ", recycledQuantity=" + this.getRecycledQuantity() + ")";
      }
   }
}

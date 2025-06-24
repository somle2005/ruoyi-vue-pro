package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.List;

public class GetLogisticsListResponse {
   public List<LogisticsPlan> logisticsPlans;

   public List<LogisticsPlan> getLogisticsPlans() {
      return this.logisticsPlans;
   }

   public void setLogisticsPlans(List<LogisticsPlan> logisticsPlans) {
      this.logisticsPlans = logisticsPlans;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetLogisticsListResponse)) {
         return false;
      } else {
         GetLogisticsListResponse other = (GetLogisticsListResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$logisticsPlans = this.getLogisticsPlans();
            Object other$logisticsPlans = other.getLogisticsPlans();
            if (this$logisticsPlans == null) {
               if (other$logisticsPlans != null) {
                  return false;
               }
            } else if (!this$logisticsPlans.equals(other$logisticsPlans)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetLogisticsListResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $logisticsPlans = this.getLogisticsPlans();
      result = result * 59 + ($logisticsPlans == null ? 43 : $logisticsPlans.hashCode());
      return result;
   }

   public String toString() {
      return "GetLogisticsListResponse(logisticsPlans=" + this.getLogisticsPlans() + ")";
   }

   public static class LogisticsPlan {
      public String planInfoId;
      public String shopName;
      public String planInfoName;
      public Integer tradeMode;
      public String customsCode;
      public String logisticsCompanyCode;
      public String logisticName;
      public Boolean isValid;
      public String countryName;
      public String privinceName;
      public String cityName;
      public String street;
      public String postCode;
      public Long sellerAddressRecordId;

      public String getPlanInfoId() {
         return this.planInfoId;
      }

      public String getShopName() {
         return this.shopName;
      }

      public String getPlanInfoName() {
         return this.planInfoName;
      }

      public Integer getTradeMode() {
         return this.tradeMode;
      }

      public String getCustomsCode() {
         return this.customsCode;
      }

      public String getLogisticsCompanyCode() {
         return this.logisticsCompanyCode;
      }

      public String getLogisticName() {
         return this.logisticName;
      }

      public Boolean getIsValid() {
         return this.isValid;
      }

      public String getCountryName() {
         return this.countryName;
      }

      public String getPrivinceName() {
         return this.privinceName;
      }

      public String getCityName() {
         return this.cityName;
      }

      public String getStreet() {
         return this.street;
      }

      public String getPostCode() {
         return this.postCode;
      }

      public Long getSellerAddressRecordId() {
         return this.sellerAddressRecordId;
      }

      public void setPlanInfoId(String planInfoId) {
         this.planInfoId = planInfoId;
      }

      public void setShopName(String shopName) {
         this.shopName = shopName;
      }

      public void setPlanInfoName(String planInfoName) {
         this.planInfoName = planInfoName;
      }

      public void setTradeMode(Integer tradeMode) {
         this.tradeMode = tradeMode;
      }

      public void setCustomsCode(String customsCode) {
         this.customsCode = customsCode;
      }

      public void setLogisticsCompanyCode(String logisticsCompanyCode) {
         this.logisticsCompanyCode = logisticsCompanyCode;
      }

      public void setLogisticName(String logisticName) {
         this.logisticName = logisticName;
      }

      public void setIsValid(Boolean isValid) {
         this.isValid = isValid;
      }

      public void setCountryName(String countryName) {
         this.countryName = countryName;
      }

      public void setPrivinceName(String privinceName) {
         this.privinceName = privinceName;
      }

      public void setCityName(String cityName) {
         this.cityName = cityName;
      }

      public void setStreet(String street) {
         this.street = street;
      }

      public void setPostCode(String postCode) {
         this.postCode = postCode;
      }

      public void setSellerAddressRecordId(Long sellerAddressRecordId) {
         this.sellerAddressRecordId = sellerAddressRecordId;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof LogisticsPlan)) {
            return false;
         } else {
            LogisticsPlan other = (LogisticsPlan)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$tradeMode = this.getTradeMode();
               Object other$tradeMode = other.getTradeMode();
               if (this$tradeMode == null) {
                  if (other$tradeMode != null) {
                     return false;
                  }
               } else if (!this$tradeMode.equals(other$tradeMode)) {
                  return false;
               }

               Object this$isValid = this.getIsValid();
               Object other$isValid = other.getIsValid();
               if (this$isValid == null) {
                  if (other$isValid != null) {
                     return false;
                  }
               } else if (!this$isValid.equals(other$isValid)) {
                  return false;
               }

               Object this$sellerAddressRecordId = this.getSellerAddressRecordId();
               Object other$sellerAddressRecordId = other.getSellerAddressRecordId();
               if (this$sellerAddressRecordId == null) {
                  if (other$sellerAddressRecordId != null) {
                     return false;
                  }
               } else if (!this$sellerAddressRecordId.equals(other$sellerAddressRecordId)) {
                  return false;
               }

               Object this$planInfoId = this.getPlanInfoId();
               Object other$planInfoId = other.getPlanInfoId();
               if (this$planInfoId == null) {
                  if (other$planInfoId != null) {
                     return false;
                  }
               } else if (!this$planInfoId.equals(other$planInfoId)) {
                  return false;
               }

               Object this$shopName = this.getShopName();
               Object other$shopName = other.getShopName();
               if (this$shopName == null) {
                  if (other$shopName != null) {
                     return false;
                  }
               } else if (!this$shopName.equals(other$shopName)) {
                  return false;
               }

               Object this$planInfoName = this.getPlanInfoName();
               Object other$planInfoName = other.getPlanInfoName();
               if (this$planInfoName == null) {
                  if (other$planInfoName != null) {
                     return false;
                  }
               } else if (!this$planInfoName.equals(other$planInfoName)) {
                  return false;
               }

               Object this$customsCode = this.getCustomsCode();
               Object other$customsCode = other.getCustomsCode();
               if (this$customsCode == null) {
                  if (other$customsCode != null) {
                     return false;
                  }
               } else if (!this$customsCode.equals(other$customsCode)) {
                  return false;
               }

               Object this$logisticsCompanyCode = this.getLogisticsCompanyCode();
               Object other$logisticsCompanyCode = other.getLogisticsCompanyCode();
               if (this$logisticsCompanyCode == null) {
                  if (other$logisticsCompanyCode != null) {
                     return false;
                  }
               } else if (!this$logisticsCompanyCode.equals(other$logisticsCompanyCode)) {
                  return false;
               }

               Object this$logisticName = this.getLogisticName();
               Object other$logisticName = other.getLogisticName();
               if (this$logisticName == null) {
                  if (other$logisticName != null) {
                     return false;
                  }
               } else if (!this$logisticName.equals(other$logisticName)) {
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

               Object this$privinceName = this.getPrivinceName();
               Object other$privinceName = other.getPrivinceName();
               if (this$privinceName == null) {
                  if (other$privinceName != null) {
                     return false;
                  }
               } else if (!this$privinceName.equals(other$privinceName)) {
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

               Object this$street = this.getStreet();
               Object other$street = other.getStreet();
               if (this$street == null) {
                  if (other$street != null) {
                     return false;
                  }
               } else if (!this$street.equals(other$street)) {
                  return false;
               }

               Object this$postCode = this.getPostCode();
               Object other$postCode = other.getPostCode();
               if (this$postCode == null) {
                  if (other$postCode != null) {
                     return false;
                  }
               } else if (!this$postCode.equals(other$postCode)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof LogisticsPlan;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $tradeMode = this.getTradeMode();
         result = result * 59 + ($tradeMode == null ? 43 : $tradeMode.hashCode());
         Object $isValid = this.getIsValid();
         result = result * 59 + ($isValid == null ? 43 : $isValid.hashCode());
         Object $sellerAddressRecordId = this.getSellerAddressRecordId();
         result = result * 59 + ($sellerAddressRecordId == null ? 43 : $sellerAddressRecordId.hashCode());
         Object $planInfoId = this.getPlanInfoId();
         result = result * 59 + ($planInfoId == null ? 43 : $planInfoId.hashCode());
         Object $shopName = this.getShopName();
         result = result * 59 + ($shopName == null ? 43 : $shopName.hashCode());
         Object $planInfoName = this.getPlanInfoName();
         result = result * 59 + ($planInfoName == null ? 43 : $planInfoName.hashCode());
         Object $customsCode = this.getCustomsCode();
         result = result * 59 + ($customsCode == null ? 43 : $customsCode.hashCode());
         Object $logisticsCompanyCode = this.getLogisticsCompanyCode();
         result = result * 59 + ($logisticsCompanyCode == null ? 43 : $logisticsCompanyCode.hashCode());
         Object $logisticName = this.getLogisticName();
         result = result * 59 + ($logisticName == null ? 43 : $logisticName.hashCode());
         Object $countryName = this.getCountryName();
         result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
         Object $privinceName = this.getPrivinceName();
         result = result * 59 + ($privinceName == null ? 43 : $privinceName.hashCode());
         Object $cityName = this.getCityName();
         result = result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
         Object $street = this.getStreet();
         result = result * 59 + ($street == null ? 43 : $street.hashCode());
         Object $postCode = this.getPostCode();
         result = result * 59 + ($postCode == null ? 43 : $postCode.hashCode());
         return result;
      }

      public String toString() {
         return "GetLogisticsListResponse.LogisticsPlan(planInfoId=" + this.getPlanInfoId() + ", shopName=" + this.getShopName() + ", planInfoName=" + this.getPlanInfoName() + ", tradeMode=" + this.getTradeMode() + ", customsCode=" + this.getCustomsCode() + ", logisticsCompanyCode=" + this.getLogisticsCompanyCode() + ", logisticName=" + this.getLogisticName() + ", isValid=" + this.getIsValid() + ", countryName=" + this.getCountryName() + ", privinceName=" + this.getPrivinceName() + ", cityName=" + this.getCityName() + ", street=" + this.getStreet() + ", postCode=" + this.getPostCode() + ", sellerAddressRecordId=" + this.getSellerAddressRecordId() + ")";
      }
   }
}

package com.xiaohongshu.fls.opensdk.entity.common.request;

import com.xiaohongshu.fls.opensdk.entity.BaseRequest;

public class GetZonesRequest extends BaseRequest {
   public String code;
   public String name;
   public String upper;
   public Boolean filterNonContinental;

   public String getCode() {
      return this.code;
   }

   public String getName() {
      return this.name;
   }

   public String getUpper() {
      return this.upper;
   }

   public Boolean getFilterNonContinental() {
      return this.filterNonContinental;
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

   public void setFilterNonContinental(Boolean filterNonContinental) {
      this.filterNonContinental = filterNonContinental;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof GetZonesRequest)) {
         return false;
      } else {
         GetZonesRequest other = (GetZonesRequest)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$filterNonContinental = this.getFilterNonContinental();
            Object other$filterNonContinental = other.getFilterNonContinental();
            if (this$filterNonContinental == null) {
               if (other$filterNonContinental != null) {
                  return false;
               }
            } else if (!this$filterNonContinental.equals(other$filterNonContinental)) {
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

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof GetZonesRequest;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $filterNonContinental = this.getFilterNonContinental();
      result = result * 59 + ($filterNonContinental == null ? 43 : $filterNonContinental.hashCode());
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      Object $name = this.getName();
      result = result * 59 + ($name == null ? 43 : $name.hashCode());
      Object $upper = this.getUpper();
      result = result * 59 + ($upper == null ? 43 : $upper.hashCode());
      return result;
   }

   public String toString() {
      return "GetZonesRequest(code=" + this.getCode() + ", name=" + this.getName() + ", upper=" + this.getUpper() + ", filterNonContinental=" + this.getFilterNonContinental() + ")";
   }
}

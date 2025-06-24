package com.xiaohongshu.fls.opensdk.entity.order.Response;

public class CustomsInfo {
   public String barcode;
   public String customsName;
   public String hsCode;
   public Double generalTaxRate;
   public Double quantity1;
   public Double quantity2;

   public String getBarcode() {
      return this.barcode;
   }

   public String getCustomsName() {
      return this.customsName;
   }

   public String getHsCode() {
      return this.hsCode;
   }

   public Double getGeneralTaxRate() {
      return this.generalTaxRate;
   }

   public Double getQuantity1() {
      return this.quantity1;
   }

   public Double getQuantity2() {
      return this.quantity2;
   }

   public void setBarcode(String barcode) {
      this.barcode = barcode;
   }

   public void setCustomsName(String customsName) {
      this.customsName = customsName;
   }

   public void setHsCode(String hsCode) {
      this.hsCode = hsCode;
   }

   public void setGeneralTaxRate(Double generalTaxRate) {
      this.generalTaxRate = generalTaxRate;
   }

   public void setQuantity1(Double quantity1) {
      this.quantity1 = quantity1;
   }

   public void setQuantity2(Double quantity2) {
      this.quantity2 = quantity2;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CustomsInfo)) {
         return false;
      } else {
         CustomsInfo other = (CustomsInfo)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$generalTaxRate = this.getGeneralTaxRate();
            Object other$generalTaxRate = other.getGeneralTaxRate();
            if (this$generalTaxRate == null) {
               if (other$generalTaxRate != null) {
                  return false;
               }
            } else if (!this$generalTaxRate.equals(other$generalTaxRate)) {
               return false;
            }

            Object this$quantity1 = this.getQuantity1();
            Object other$quantity1 = other.getQuantity1();
            if (this$quantity1 == null) {
               if (other$quantity1 != null) {
                  return false;
               }
            } else if (!this$quantity1.equals(other$quantity1)) {
               return false;
            }

            Object this$quantity2 = this.getQuantity2();
            Object other$quantity2 = other.getQuantity2();
            if (this$quantity2 == null) {
               if (other$quantity2 != null) {
                  return false;
               }
            } else if (!this$quantity2.equals(other$quantity2)) {
               return false;
            }

            Object this$barcode = this.getBarcode();
            Object other$barcode = other.getBarcode();
            if (this$barcode == null) {
               if (other$barcode != null) {
                  return false;
               }
            } else if (!this$barcode.equals(other$barcode)) {
               return false;
            }

            Object this$customsName = this.getCustomsName();
            Object other$customsName = other.getCustomsName();
            if (this$customsName == null) {
               if (other$customsName != null) {
                  return false;
               }
            } else if (!this$customsName.equals(other$customsName)) {
               return false;
            }

            Object this$hsCode = this.getHsCode();
            Object other$hsCode = other.getHsCode();
            if (this$hsCode == null) {
               if (other$hsCode != null) {
                  return false;
               }
            } else if (!this$hsCode.equals(other$hsCode)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CustomsInfo;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $generalTaxRate = this.getGeneralTaxRate();
      result = result * 59 + ($generalTaxRate == null ? 43 : $generalTaxRate.hashCode());
      Object $quantity1 = this.getQuantity1();
      result = result * 59 + ($quantity1 == null ? 43 : $quantity1.hashCode());
      Object $quantity2 = this.getQuantity2();
      result = result * 59 + ($quantity2 == null ? 43 : $quantity2.hashCode());
      Object $barcode = this.getBarcode();
      result = result * 59 + ($barcode == null ? 43 : $barcode.hashCode());
      Object $customsName = this.getCustomsName();
      result = result * 59 + ($customsName == null ? 43 : $customsName.hashCode());
      Object $hsCode = this.getHsCode();
      result = result * 59 + ($hsCode == null ? 43 : $hsCode.hashCode());
      return result;
   }

   public String toString() {
      return "CustomsInfo(barcode=" + this.getBarcode() + ", customsName=" + this.getCustomsName() + ", hsCode=" + this.getHsCode() + ", generalTaxRate=" + this.getGeneralTaxRate() + ", quantity1=" + this.getQuantity1() + ", quantity2=" + this.getQuantity2() + ")";
   }
}

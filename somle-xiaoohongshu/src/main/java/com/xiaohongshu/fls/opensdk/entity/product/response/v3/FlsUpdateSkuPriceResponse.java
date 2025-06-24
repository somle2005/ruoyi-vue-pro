package com.xiaohongshu.fls.opensdk.entity.product.response.v3;

public class FlsUpdateSkuPriceResponse {
   public int taxType;
   public int priceUnit;
   public long pricePreTax;
   public long pricePostTax;
   public double priceTaxRate;
   public long priceTax;
   public long membershipPricePreTax;
   public long membershipPricePostTax;
   public double membershipPriceTaxRate;
   public long membershipPriceTax;

   public int getTaxType() {
      return this.taxType;
   }

   public int getPriceUnit() {
      return this.priceUnit;
   }

   public long getPricePreTax() {
      return this.pricePreTax;
   }

   public long getPricePostTax() {
      return this.pricePostTax;
   }

   public double getPriceTaxRate() {
      return this.priceTaxRate;
   }

   public long getPriceTax() {
      return this.priceTax;
   }

   public long getMembershipPricePreTax() {
      return this.membershipPricePreTax;
   }

   public long getMembershipPricePostTax() {
      return this.membershipPricePostTax;
   }

   public double getMembershipPriceTaxRate() {
      return this.membershipPriceTaxRate;
   }

   public long getMembershipPriceTax() {
      return this.membershipPriceTax;
   }

   public void setTaxType(int taxType) {
      this.taxType = taxType;
   }

   public void setPriceUnit(int priceUnit) {
      this.priceUnit = priceUnit;
   }

   public void setPricePreTax(long pricePreTax) {
      this.pricePreTax = pricePreTax;
   }

   public void setPricePostTax(long pricePostTax) {
      this.pricePostTax = pricePostTax;
   }

   public void setPriceTaxRate(double priceTaxRate) {
      this.priceTaxRate = priceTaxRate;
   }

   public void setPriceTax(long priceTax) {
      this.priceTax = priceTax;
   }

   public void setMembershipPricePreTax(long membershipPricePreTax) {
      this.membershipPricePreTax = membershipPricePreTax;
   }

   public void setMembershipPricePostTax(long membershipPricePostTax) {
      this.membershipPricePostTax = membershipPricePostTax;
   }

   public void setMembershipPriceTaxRate(double membershipPriceTaxRate) {
      this.membershipPriceTaxRate = membershipPriceTaxRate;
   }

   public void setMembershipPriceTax(long membershipPriceTax) {
      this.membershipPriceTax = membershipPriceTax;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof FlsUpdateSkuPriceResponse)) {
         return false;
      } else {
         FlsUpdateSkuPriceResponse other = (FlsUpdateSkuPriceResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getTaxType() != other.getTaxType()) {
            return false;
         } else if (this.getPriceUnit() != other.getPriceUnit()) {
            return false;
         } else if (this.getPricePreTax() != other.getPricePreTax()) {
            return false;
         } else if (this.getPricePostTax() != other.getPricePostTax()) {
            return false;
         } else if (Double.compare(this.getPriceTaxRate(), other.getPriceTaxRate()) != 0) {
            return false;
         } else if (this.getPriceTax() != other.getPriceTax()) {
            return false;
         } else if (this.getMembershipPricePreTax() != other.getMembershipPricePreTax()) {
            return false;
         } else if (this.getMembershipPricePostTax() != other.getMembershipPricePostTax()) {
            return false;
         } else if (Double.compare(this.getMembershipPriceTaxRate(), other.getMembershipPriceTaxRate()) != 0) {
            return false;
         } else {
            return this.getMembershipPriceTax() == other.getMembershipPriceTax();
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof FlsUpdateSkuPriceResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getTaxType();
      result = result * 59 + this.getPriceUnit();
      long $pricePreTax = this.getPricePreTax();
      result = result * 59 + (int)($pricePreTax >>> 32 ^ $pricePreTax);
      long $pricePostTax = this.getPricePostTax();
      result = result * 59 + (int)($pricePostTax >>> 32 ^ $pricePostTax);
      long $priceTaxRate = Double.doubleToLongBits(this.getPriceTaxRate());
      result = result * 59 + (int)($priceTaxRate >>> 32 ^ $priceTaxRate);
      long $priceTax = this.getPriceTax();
      result = result * 59 + (int)($priceTax >>> 32 ^ $priceTax);
      long $membershipPricePreTax = this.getMembershipPricePreTax();
      result = result * 59 + (int)($membershipPricePreTax >>> 32 ^ $membershipPricePreTax);
      long $membershipPricePostTax = this.getMembershipPricePostTax();
      result = result * 59 + (int)($membershipPricePostTax >>> 32 ^ $membershipPricePostTax);
      long $membershipPriceTaxRate = Double.doubleToLongBits(this.getMembershipPriceTaxRate());
      result = result * 59 + (int)($membershipPriceTaxRate >>> 32 ^ $membershipPriceTaxRate);
      long $membershipPriceTax = this.getMembershipPriceTax();
      result = result * 59 + (int)($membershipPriceTax >>> 32 ^ $membershipPriceTax);
      return result;
   }

   public String toString() {
      return "FlsUpdateSkuPriceResponse(taxType=" + this.getTaxType() + ", priceUnit=" + this.getPriceUnit() + ", pricePreTax=" + this.getPricePreTax() + ", pricePostTax=" + this.getPricePostTax() + ", priceTaxRate=" + this.getPriceTaxRate() + ", priceTax=" + this.getPriceTax() + ", membershipPricePreTax=" + this.getMembershipPricePreTax() + ", membershipPricePostTax=" + this.getMembershipPricePostTax() + ", membershipPriceTaxRate=" + this.getMembershipPriceTaxRate() + ", membershipPriceTax=" + this.getMembershipPriceTax() + ")";
   }
}

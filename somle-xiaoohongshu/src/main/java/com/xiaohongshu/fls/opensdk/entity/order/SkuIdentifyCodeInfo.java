package com.xiaohongshu.fls.opensdk.entity.order;

public class SkuIdentifyCodeInfo {
   private String sNCode;
   private String barCode;
   private String iMEI1Code;
   private String iMEI2Code;

   public String getsNCode() {
      return this.sNCode;
   }

   public void setsNCode(String sNCode) {
      this.sNCode = sNCode;
   }

   public String getBarCode() {
      return this.barCode;
   }

   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   public String getiMEI1Code() {
      return this.iMEI1Code;
   }

   public void setiMEI1Code(String iMEI1Code) {
      this.iMEI1Code = iMEI1Code;
   }

   public String getiMEI2Code() {
      return this.iMEI2Code;
   }

   public void setiMEI2Code(String iMEI2Code) {
      this.iMEI2Code = iMEI2Code;
   }
}

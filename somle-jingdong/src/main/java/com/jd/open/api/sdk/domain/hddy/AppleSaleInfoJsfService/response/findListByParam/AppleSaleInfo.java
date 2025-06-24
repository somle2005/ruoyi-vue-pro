package com.jd.open.api.sdk.domain.hddy.AppleSaleInfoJsfService.response.findListByParam;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AppleSaleInfo implements Serializable {
   private String saleDate;
   private String appleProvinceName;
   private String appleCityName;
   private String appleCountyName;
   private String lob;
   private String mpn;
   private String qtty;

   @JsonProperty("sale_date")
   public void setSaleDate(String saleDate) {
      this.saleDate = saleDate;
   }

   @JsonProperty("sale_date")
   public String getSaleDate() {
      return this.saleDate;
   }

   @JsonProperty("apple_province_name")
   public void setAppleProvinceName(String appleProvinceName) {
      this.appleProvinceName = appleProvinceName;
   }

   @JsonProperty("apple_province_name")
   public String getAppleProvinceName() {
      return this.appleProvinceName;
   }

   @JsonProperty("apple_city_name")
   public void setAppleCityName(String appleCityName) {
      this.appleCityName = appleCityName;
   }

   @JsonProperty("apple_city_name")
   public String getAppleCityName() {
      return this.appleCityName;
   }

   @JsonProperty("apple_county_name")
   public void setAppleCountyName(String appleCountyName) {
      this.appleCountyName = appleCountyName;
   }

   @JsonProperty("apple_county_name")
   public String getAppleCountyName() {
      return this.appleCountyName;
   }

   @JsonProperty("lob")
   public void setLob(String lob) {
      this.lob = lob;
   }

   @JsonProperty("lob")
   public String getLob() {
      return this.lob;
   }

   @JsonProperty("mpn")
   public void setMpn(String mpn) {
      this.mpn = mpn;
   }

   @JsonProperty("mpn")
   public String getMpn() {
      return this.mpn;
   }

   @JsonProperty("qtty")
   public void setQtty(String qtty) {
      this.qtty = qtty;
   }

   @JsonProperty("qtty")
   public String getQtty() {
      return this.qtty;
   }
}

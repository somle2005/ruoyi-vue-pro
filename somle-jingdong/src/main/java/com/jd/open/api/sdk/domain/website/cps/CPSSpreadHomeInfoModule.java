package com.jd.open.api.sdk.domain.website.cps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CPSSpreadHomeInfoModule {
   private String title;
   private String picUrl;
   private String commissionFee;
   private String clickUrl;

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("pic_url")
   public String getPicUrl() {
      return this.picUrl;
   }

   @JsonProperty("pic_url")
   public void setPicUrl(String picUrl) {
      this.picUrl = picUrl;
   }

   @JsonProperty("commission_fee")
   public String getCommissionFee() {
      return this.commissionFee;
   }

   @JsonProperty("commission_fee")
   public void setCommissionFee(String commissionFee) {
      this.commissionFee = commissionFee;
   }

   @JsonProperty("click_url")
   public String getClickUrl() {
      return this.clickUrl;
   }

   @JsonProperty("click_url")
   public void setClickUrl(String clickUrl) {
      this.clickUrl = clickUrl;
   }
}

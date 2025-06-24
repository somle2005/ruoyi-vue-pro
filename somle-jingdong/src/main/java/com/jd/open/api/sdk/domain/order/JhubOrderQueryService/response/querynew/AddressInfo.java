package com.jd.open.api.sdk.domain.order.JhubOrderQueryService.response.querynew;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AddressInfo implements Serializable {
   private String receiver;
   private String mobile;
   private String province;
   private String city;
   private String area;
   private String detail;

   @JsonProperty("receiver")
   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   @JsonProperty("receiver")
   public String getReceiver() {
      return this.receiver;
   }

   @JsonProperty("mobile")
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   @JsonProperty("mobile")
   public String getMobile() {
      return this.mobile;
   }

   @JsonProperty("province")
   public void setProvince(String province) {
      this.province = province;
   }

   @JsonProperty("province")
   public String getProvince() {
      return this.province;
   }

   @JsonProperty("city")
   public void setCity(String city) {
      this.city = city;
   }

   @JsonProperty("city")
   public String getCity() {
      return this.city;
   }

   @JsonProperty("area")
   public void setArea(String area) {
      this.area = area;
   }

   @JsonProperty("area")
   public String getArea() {
      return this.area;
   }

   @JsonProperty("detail")
   public void setDetail(String detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public String getDetail() {
      return this.detail;
   }
}

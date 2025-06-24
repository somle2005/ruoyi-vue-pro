package com.jd.open.api.sdk.domain.etms.TraceQueryJsf.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TraceDTO implements Serializable {
   private String opeTitle;
   private String opeRemark;
   private String opeName;
   private String opeTime;
   private String waybillCode;
   private String courier;
   private String courierTel;
   private Integer opeProvinceId;
   private String opeProvinceName;
   private Integer opeCityId;
   private String opeCityName;

   @JsonProperty("opeTitle")
   public void setOpeTitle(String opeTitle) {
      this.opeTitle = opeTitle;
   }

   @JsonProperty("opeTitle")
   public String getOpeTitle() {
      return this.opeTitle;
   }

   @JsonProperty("opeRemark")
   public void setOpeRemark(String opeRemark) {
      this.opeRemark = opeRemark;
   }

   @JsonProperty("opeRemark")
   public String getOpeRemark() {
      return this.opeRemark;
   }

   @JsonProperty("opeName")
   public void setOpeName(String opeName) {
      this.opeName = opeName;
   }

   @JsonProperty("opeName")
   public String getOpeName() {
      return this.opeName;
   }

   @JsonProperty("opeTime")
   public void setOpeTime(String opeTime) {
      this.opeTime = opeTime;
   }

   @JsonProperty("opeTime")
   public String getOpeTime() {
      return this.opeTime;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("courier")
   public void setCourier(String courier) {
      this.courier = courier;
   }

   @JsonProperty("courier")
   public String getCourier() {
      return this.courier;
   }

   @JsonProperty("courierTel")
   public void setCourierTel(String courierTel) {
      this.courierTel = courierTel;
   }

   @JsonProperty("courierTel")
   public String getCourierTel() {
      return this.courierTel;
   }

   @JsonProperty("opeProvinceId")
   public void setOpeProvinceId(Integer opeProvinceId) {
      this.opeProvinceId = opeProvinceId;
   }

   @JsonProperty("opeProvinceId")
   public Integer getOpeProvinceId() {
      return this.opeProvinceId;
   }

   @JsonProperty("opeProvinceName")
   public void setOpeProvinceName(String opeProvinceName) {
      this.opeProvinceName = opeProvinceName;
   }

   @JsonProperty("opeProvinceName")
   public String getOpeProvinceName() {
      return this.opeProvinceName;
   }

   @JsonProperty("opeCityId")
   public void setOpeCityId(Integer opeCityId) {
      this.opeCityId = opeCityId;
   }

   @JsonProperty("opeCityId")
   public Integer getOpeCityId() {
      return this.opeCityId;
   }

   @JsonProperty("opeCityName")
   public void setOpeCityName(String opeCityName) {
      this.opeCityName = opeCityName;
   }

   @JsonProperty("opeCityName")
   public String getOpeCityName() {
      return this.opeCityName;
   }
}

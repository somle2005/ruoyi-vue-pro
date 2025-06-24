package com.jd.open.api.sdk.domain.etms.TraceDynamicQueryService.response.queryDynamicTraceInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class TraceInfo implements Serializable {
   private String opeRemark;
   private Map<String, String> extend;
   private String opeTitle;
   private String courier;
   private String opeTime;
   private String opeName;
   private String waybillCode;
   private String state;
   private String courierTel;

   @JsonProperty("opeRemark")
   public void setOpeRemark(String opeRemark) {
      this.opeRemark = opeRemark;
   }

   @JsonProperty("opeRemark")
   public String getOpeRemark() {
      return this.opeRemark;
   }

   @JsonProperty("extend")
   public void setExtend(Map<String, String> extend) {
      this.extend = extend;
   }

   @JsonProperty("extend")
   public Map<String, String> getExtend() {
      return this.extend;
   }

   @JsonProperty("opeTitle")
   public void setOpeTitle(String opeTitle) {
      this.opeTitle = opeTitle;
   }

   @JsonProperty("opeTitle")
   public String getOpeTitle() {
      return this.opeTitle;
   }

   @JsonProperty("courier")
   public void setCourier(String courier) {
      this.courier = courier;
   }

   @JsonProperty("courier")
   public String getCourier() {
      return this.courier;
   }

   @JsonProperty("opeTime")
   public void setOpeTime(String opeTime) {
      this.opeTime = opeTime;
   }

   @JsonProperty("opeTime")
   public String getOpeTime() {
      return this.opeTime;
   }

   @JsonProperty("opeName")
   public void setOpeName(String opeName) {
      this.opeName = opeName;
   }

   @JsonProperty("opeName")
   public String getOpeName() {
      return this.opeName;
   }

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("state")
   public void setState(String state) {
      this.state = state;
   }

   @JsonProperty("state")
   public String getState() {
      return this.state;
   }

   @JsonProperty("courierTel")
   public void setCourierTel(String courierTel) {
      this.courierTel = courierTel;
   }

   @JsonProperty("courierTel")
   public String getCourierTel() {
      return this.courierTel;
   }
}

package com.jd.open.api.sdk.domain.youE.OrderUpperDoorExportService.request.upperDoorOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UpperDoorOrder implements Serializable {
   private String orderNo;
   private String verifyCode;
   private String lng;
   private String engineerId;
   private String remark;
   private String lat;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("verifyCode")
   public void setVerifyCode(String verifyCode) {
      this.verifyCode = verifyCode;
   }

   @JsonProperty("verifyCode")
   public String getVerifyCode() {
      return this.verifyCode;
   }

   @JsonProperty("lng")
   public void setLng(String lng) {
      this.lng = lng;
   }

   @JsonProperty("lng")
   public String getLng() {
      return this.lng;
   }

   @JsonProperty("engineerId")
   public void setEngineerId(String engineerId) {
      this.engineerId = engineerId;
   }

   @JsonProperty("engineerId")
   public String getEngineerId() {
      return this.engineerId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("lat")
   public void setLat(String lat) {
      this.lat = lat;
   }

   @JsonProperty("lat")
   public String getLat() {
      return this.lat;
   }
}

package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.gotoB2BSWbMainAllTrack;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class B2bLwbTrack implements Serializable {
   private String opeTitle;
   private String opeRemark;
   private String opeName;
   private String opeTime;
   private String waybillCode;
   private String packageCode;

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

   @JsonProperty("packageCode")
   public void setPackageCode(String packageCode) {
      this.packageCode = packageCode;
   }

   @JsonProperty("packageCode")
   public String getPackageCode() {
      return this.packageCode;
   }
}

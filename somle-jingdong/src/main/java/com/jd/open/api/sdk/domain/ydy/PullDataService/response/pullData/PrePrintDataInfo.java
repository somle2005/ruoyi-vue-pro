package com.jd.open.api.sdk.domain.ydy.PullDataService.response.pullData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PrePrintDataInfo implements Serializable {
   private String wayBillNo;
   private String code;
   private String msg;
   private String perPrintData;
   private String packageCode;

   @JsonProperty("wayBillNo")
   public void setWayBillNo(String wayBillNo) {
      this.wayBillNo = wayBillNo;
   }

   @JsonProperty("wayBillNo")
   public String getWayBillNo() {
      return this.wayBillNo;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("perPrintData")
   public void setPerPrintData(String perPrintData) {
      this.perPrintData = perPrintData;
   }

   @JsonProperty("perPrintData")
   public String getPerPrintData() {
      return this.perPrintData;
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

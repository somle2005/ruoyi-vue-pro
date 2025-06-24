package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.addRtwOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RtwResult implements Serializable {
   private String eclpRtwNo;
   private String isvRtwNum;
   private String eclpSoNo;
   private String deptNo;
   private String warehouseNo;
   private String source;
   private String reason;
   private String createTime;
   private String createUser;
   private String status;
   private String resultCode;
   private String msg;

   @JsonProperty("eclpRtwNo")
   public void setEclpRtwNo(String eclpRtwNo) {
      this.eclpRtwNo = eclpRtwNo;
   }

   @JsonProperty("eclpRtwNo")
   public String getEclpRtwNo() {
      return this.eclpRtwNo;
   }

   @JsonProperty("isvRtwNum")
   public void setIsvRtwNum(String isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   @JsonProperty("isvRtwNum")
   public String getIsvRtwNum() {
      return this.isvRtwNum;
   }

   @JsonProperty("eclpSoNo")
   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   @JsonProperty("eclpSoNo")
   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }
}

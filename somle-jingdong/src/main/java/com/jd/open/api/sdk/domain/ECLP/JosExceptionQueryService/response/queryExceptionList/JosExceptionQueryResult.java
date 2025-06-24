package com.jd.open.api.sdk.domain.ECLP.JosExceptionQueryService.response.queryExceptionList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosExceptionQueryResult implements Serializable {
   private String orderNo;
   private String isvOrderNo;
   private String sellerName;
   private String deptName;
   private String warehouseName;
   private String code;
   private String message;
   private String errReason;
   private String solution;
   private String pauseTime;
   private String isvCreateTime;
   private String createTime;
   private String orderTypeName;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("isvOrderNo")
   public void setIsvOrderNo(String isvOrderNo) {
      this.isvOrderNo = isvOrderNo;
   }

   @JsonProperty("isvOrderNo")
   public String getIsvOrderNo() {
      return this.isvOrderNo;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("errReason")
   public void setErrReason(String errReason) {
      this.errReason = errReason;
   }

   @JsonProperty("errReason")
   public String getErrReason() {
      return this.errReason;
   }

   @JsonProperty("solution")
   public void setSolution(String solution) {
      this.solution = solution;
   }

   @JsonProperty("solution")
   public String getSolution() {
      return this.solution;
   }

   @JsonProperty("pauseTime")
   public void setPauseTime(String pauseTime) {
      this.pauseTime = pauseTime;
   }

   @JsonProperty("pauseTime")
   public String getPauseTime() {
      return this.pauseTime;
   }

   @JsonProperty("isvCreateTime")
   public void setIsvCreateTime(String isvCreateTime) {
      this.isvCreateTime = isvCreateTime;
   }

   @JsonProperty("isvCreateTime")
   public String getIsvCreateTime() {
      return this.isvCreateTime;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("orderTypeName")
   public void setOrderTypeName(String orderTypeName) {
      this.orderTypeName = orderTypeName;
   }

   @JsonProperty("orderTypeName")
   public String getOrderTypeName() {
      return this.orderTypeName;
   }
}

package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderCustoms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class DeclaredResult implements Serializable {
   private String logisticsCode;
   private String logisticsNo;
   private String customId;
   private String pattern;
   private String deptNo;
   private String spSoNo;
   private String venderId;
   private Integer result;
   private Date time;
   private String processStatus;
   private String statusMsg;
   private String goodsCheck;
   private Double actualTax;
   private String message;
   private String storeId;
   private String isvUUID;
   private String errorCode;

   @JsonProperty("logisticsCode")
   public void setLogisticsCode(String logisticsCode) {
      this.logisticsCode = logisticsCode;
   }

   @JsonProperty("logisticsCode")
   public String getLogisticsCode() {
      return this.logisticsCode;
   }

   @JsonProperty("logisticsNo")
   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   @JsonProperty("logisticsNo")
   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   @JsonProperty("customId")
   public void setCustomId(String customId) {
      this.customId = customId;
   }

   @JsonProperty("customId")
   public String getCustomId() {
      return this.customId;
   }

   @JsonProperty("pattern")
   public void setPattern(String pattern) {
      this.pattern = pattern;
   }

   @JsonProperty("pattern")
   public String getPattern() {
      return this.pattern;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("spSoNo")
   public void setSpSoNo(String spSoNo) {
      this.spSoNo = spSoNo;
   }

   @JsonProperty("spSoNo")
   public String getSpSoNo() {
      return this.spSoNo;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("result")
   public void setResult(Integer result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Integer getResult() {
      return this.result;
   }

   @JsonProperty("time")
   public void setTime(Date time) {
      this.time = time;
   }

   @JsonProperty("time")
   public Date getTime() {
      return this.time;
   }

   @JsonProperty("processStatus")
   public void setProcessStatus(String processStatus) {
      this.processStatus = processStatus;
   }

   @JsonProperty("processStatus")
   public String getProcessStatus() {
      return this.processStatus;
   }

   @JsonProperty("statusMsg")
   public void setStatusMsg(String statusMsg) {
      this.statusMsg = statusMsg;
   }

   @JsonProperty("statusMsg")
   public String getStatusMsg() {
      return this.statusMsg;
   }

   @JsonProperty("goodsCheck")
   public void setGoodsCheck(String goodsCheck) {
      this.goodsCheck = goodsCheck;
   }

   @JsonProperty("goodsCheck")
   public String getGoodsCheck() {
      return this.goodsCheck;
   }

   @JsonProperty("actualTax")
   public void setActualTax(Double actualTax) {
      this.actualTax = actualTax;
   }

   @JsonProperty("actualTax")
   public Double getActualTax() {
      return this.actualTax;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("isvUUID")
   public void setIsvUUID(String isvUUID) {
      this.isvUUID = isvUUID;
   }

   @JsonProperty("isvUUID")
   public String getIsvUUID() {
      return this.isvUUID;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }
}

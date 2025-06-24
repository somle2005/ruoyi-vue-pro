package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySerialBySkuAndSerial;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class GoodsSID implements Serializable {
   private String[] ckStoreName;
   private String[] rkStoreName;
   private String[] wareId;
   private String[] serial;
   private String[] rkBusId;
   private String[] ckBusId;
   private String[] rkStoreId;
   private String[] ckStoreId;
   private String[] rkBusType;
   private Date[] rkTime;
   private String[] ckBusType;
   private Date[] ckTime;
   private String[] ckDateStr;
   private String[] rkDateStr;
   private String[] isOutStr;
   private String[] rkBusTypeStr;
   private String[] ckBusTypeStr;

   @JsonProperty("ckStoreName")
   public void setCkStoreName(String[] ckStoreName) {
      this.ckStoreName = ckStoreName;
   }

   @JsonProperty("ckStoreName")
   public String[] getCkStoreName() {
      return this.ckStoreName;
   }

   @JsonProperty("rkStoreName")
   public void setRkStoreName(String[] rkStoreName) {
      this.rkStoreName = rkStoreName;
   }

   @JsonProperty("rkStoreName")
   public String[] getRkStoreName() {
      return this.rkStoreName;
   }

   @JsonProperty("wareId")
   public void setWareId(String[] wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public String[] getWareId() {
      return this.wareId;
   }

   @JsonProperty("serial")
   public void setSerial(String[] serial) {
      this.serial = serial;
   }

   @JsonProperty("serial")
   public String[] getSerial() {
      return this.serial;
   }

   @JsonProperty("rkBusId")
   public void setRkBusId(String[] rkBusId) {
      this.rkBusId = rkBusId;
   }

   @JsonProperty("rkBusId")
   public String[] getRkBusId() {
      return this.rkBusId;
   }

   @JsonProperty("ckBusId")
   public void setCkBusId(String[] ckBusId) {
      this.ckBusId = ckBusId;
   }

   @JsonProperty("ckBusId")
   public String[] getCkBusId() {
      return this.ckBusId;
   }

   @JsonProperty("rkStoreId")
   public void setRkStoreId(String[] rkStoreId) {
      this.rkStoreId = rkStoreId;
   }

   @JsonProperty("rkStoreId")
   public String[] getRkStoreId() {
      return this.rkStoreId;
   }

   @JsonProperty("ckStoreId")
   public void setCkStoreId(String[] ckStoreId) {
      this.ckStoreId = ckStoreId;
   }

   @JsonProperty("ckStoreId")
   public String[] getCkStoreId() {
      return this.ckStoreId;
   }

   @JsonProperty("rkBusType")
   public void setRkBusType(String[] rkBusType) {
      this.rkBusType = rkBusType;
   }

   @JsonProperty("rkBusType")
   public String[] getRkBusType() {
      return this.rkBusType;
   }

   @JsonProperty("rkTime")
   public void setRkTime(Date[] rkTime) {
      this.rkTime = rkTime;
   }

   @JsonProperty("rkTime")
   public Date[] getRkTime() {
      return this.rkTime;
   }

   @JsonProperty("ckBusType")
   public void setCkBusType(String[] ckBusType) {
      this.ckBusType = ckBusType;
   }

   @JsonProperty("ckBusType")
   public String[] getCkBusType() {
      return this.ckBusType;
   }

   @JsonProperty("ckTime")
   public void setCkTime(Date[] ckTime) {
      this.ckTime = ckTime;
   }

   @JsonProperty("ckTime")
   public Date[] getCkTime() {
      return this.ckTime;
   }

   @JsonProperty("ckDateStr")
   public void setCkDateStr(String[] ckDateStr) {
      this.ckDateStr = ckDateStr;
   }

   @JsonProperty("ckDateStr")
   public String[] getCkDateStr() {
      return this.ckDateStr;
   }

   @JsonProperty("rkDateStr")
   public void setRkDateStr(String[] rkDateStr) {
      this.rkDateStr = rkDateStr;
   }

   @JsonProperty("rkDateStr")
   public String[] getRkDateStr() {
      return this.rkDateStr;
   }

   @JsonProperty("isOutStr")
   public void setIsOutStr(String[] isOutStr) {
      this.isOutStr = isOutStr;
   }

   @JsonProperty("isOutStr")
   public String[] getIsOutStr() {
      return this.isOutStr;
   }

   @JsonProperty("rkBusTypeStr")
   public void setRkBusTypeStr(String[] rkBusTypeStr) {
      this.rkBusTypeStr = rkBusTypeStr;
   }

   @JsonProperty("rkBusTypeStr")
   public String[] getRkBusTypeStr() {
      return this.rkBusTypeStr;
   }

   @JsonProperty("ckBusTypeStr")
   public void setCkBusTypeStr(String[] ckBusTypeStr) {
      this.ckBusTypeStr = ckBusTypeStr;
   }

   @JsonProperty("ckBusTypeStr")
   public String[] getCkBusTypeStr() {
      return this.ckBusTypeStr;
   }
}

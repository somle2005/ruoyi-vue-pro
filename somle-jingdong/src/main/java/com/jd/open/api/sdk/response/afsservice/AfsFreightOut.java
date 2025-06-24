package com.jd.open.api.sdk.response.afsservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AfsFreightOut implements Serializable {
   private Long afsFreightId;
   private Long afsServiceId;
   private Long partReceiveId;
   private String freightCode;
   private String expressCode;
   private BigDecimal freightMoney;
   private BigDecimal modifiedMoney;
   private String expressCompany;
   private String remark;

   @JsonProperty("afsFreightId")
   public void setAfsFreightId(Long afsFreightId) {
      this.afsFreightId = afsFreightId;
   }

   @JsonProperty("afsFreightId")
   public Long getAfsFreightId() {
      return this.afsFreightId;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   @JsonProperty("partReceiveId")
   public void setPartReceiveId(Long partReceiveId) {
      this.partReceiveId = partReceiveId;
   }

   @JsonProperty("partReceiveId")
   public Long getPartReceiveId() {
      return this.partReceiveId;
   }

   @JsonProperty("freightCode")
   public void setFreightCode(String freightCode) {
      this.freightCode = freightCode;
   }

   @JsonProperty("freightCode")
   public String getFreightCode() {
      return this.freightCode;
   }

   @JsonProperty("expressCode")
   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   @JsonProperty("expressCode")
   public String getExpressCode() {
      return this.expressCode;
   }

   @JsonProperty("freightMoney")
   public void setFreightMoney(BigDecimal freightMoney) {
      this.freightMoney = freightMoney;
   }

   @JsonProperty("freightMoney")
   public BigDecimal getFreightMoney() {
      return this.freightMoney;
   }

   @JsonProperty("modifiedMoney")
   public void setModifiedMoney(BigDecimal modifiedMoney) {
      this.modifiedMoney = modifiedMoney;
   }

   @JsonProperty("modifiedMoney")
   public BigDecimal getModifiedMoney() {
      return this.modifiedMoney;
   }

   @JsonProperty("expressCompany")
   public void setExpressCompany(String expressCompany) {
      this.expressCompany = expressCompany;
   }

   @JsonProperty("expressCompany")
   public String getExpressCompany() {
      return this.expressCompany;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}

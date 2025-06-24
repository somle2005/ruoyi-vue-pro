package com.jd.open.api.sdk.domain.wujiemiandan.StockQueryApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class RechargeRecordDTO implements Serializable {
   private String providerCode;
   private String providerName;
   private String branchCode;
   private String branchName;
   private Integer state;
   private Date operatorTime;
   private Date operatorName;
   private Integer amount;

   @JsonProperty("providerCode")
   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   @JsonProperty("providerCode")
   public String getProviderCode() {
      return this.providerCode;
   }

   @JsonProperty("providerName")
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   @JsonProperty("providerName")
   public String getProviderName() {
      return this.providerName;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("branchName")
   public void setBranchName(String branchName) {
      this.branchName = branchName;
   }

   @JsonProperty("branchName")
   public String getBranchName() {
      return this.branchName;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("operatorTime")
   public void setOperatorTime(Date operatorTime) {
      this.operatorTime = operatorTime;
   }

   @JsonProperty("operatorTime")
   public Date getOperatorTime() {
      return this.operatorTime;
   }

   @JsonProperty("operatorName")
   public void setOperatorName(Date operatorName) {
      this.operatorName = operatorName;
   }

   @JsonProperty("operatorName")
   public Date getOperatorName() {
      return this.operatorName;
   }

   @JsonProperty("amount")
   public void setAmount(Integer amount) {
      this.amount = amount;
   }

   @JsonProperty("amount")
   public Integer getAmount() {
      return this.amount;
   }
}

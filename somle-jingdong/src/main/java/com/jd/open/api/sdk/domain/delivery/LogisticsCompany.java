package com.jd.open.api.sdk.domain.delivery;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogisticsCompany {
   private Long logisticsId;
   private String logisticsName;
   private String logisticsRemark;
   private String sequence;
   private String agreeFlag;
   private boolean isCod;

   @JsonProperty("is_cod")
   public boolean isCod() {
      return this.isCod;
   }

   @JsonProperty("is_cod")
   public void setCod(boolean cod) {
      this.isCod = cod;
   }

   @JsonProperty("logistics_remark")
   public String getLogisticsRemark() {
      return this.logisticsRemark;
   }

   @JsonProperty("logistics_remark")
   public void setLogisticsRemark(String logisticsRemark) {
      this.logisticsRemark = logisticsRemark;
   }

   @JsonProperty("sequence")
   public String getSequence() {
      return this.sequence;
   }

   @JsonProperty("sequence")
   public void setSequence(String sequence) {
      this.sequence = sequence;
   }

   @JsonProperty("logistics_id")
   public Long getLogisticsId() {
      return this.logisticsId;
   }

   @JsonProperty("logistics_id")
   public void setLogisticsId(Long logisticsId) {
      this.logisticsId = logisticsId;
   }

   @JsonProperty("logistics_name")
   public String getLogisticsName() {
      return this.logisticsName;
   }

   @JsonProperty("logistics_name")
   public void setLogisticsName(String logisticsName) {
      this.logisticsName = logisticsName;
   }

   @JsonProperty("agree_flag")
   public String getAgreeFlag() {
      return this.agreeFlag;
   }

   @JsonProperty("agree_flag")
   public void setAgreeFlag(String agreeFlag) {
      this.agreeFlag = agreeFlag;
   }
}

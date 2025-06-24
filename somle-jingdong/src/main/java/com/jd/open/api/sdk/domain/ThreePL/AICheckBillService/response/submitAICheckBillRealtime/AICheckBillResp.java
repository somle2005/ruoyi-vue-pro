package com.jd.open.api.sdk.domain.ThreePL.AICheckBillService.response.submitAICheckBillRealtime;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AICheckBillResp implements Serializable {
   private boolean success;
   private Integer aiCheckOrderState;
   private String aiCheckOrderStateDesc;
   private String appCode;
   private String bizOrderId;
   private Integer bizType;
   private List<AICheckBillResult> aiCheckBillResult;
   private Integer bizOrderIdType;
   private Integer bizCode;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("aiCheckOrderState")
   public void setAiCheckOrderState(Integer aiCheckOrderState) {
      this.aiCheckOrderState = aiCheckOrderState;
   }

   @JsonProperty("aiCheckOrderState")
   public Integer getAiCheckOrderState() {
      return this.aiCheckOrderState;
   }

   @JsonProperty("aiCheckOrderStateDesc")
   public void setAiCheckOrderStateDesc(String aiCheckOrderStateDesc) {
      this.aiCheckOrderStateDesc = aiCheckOrderStateDesc;
   }

   @JsonProperty("aiCheckOrderStateDesc")
   public String getAiCheckOrderStateDesc() {
      return this.aiCheckOrderStateDesc;
   }

   @JsonProperty("appCode")
   public void setAppCode(String appCode) {
      this.appCode = appCode;
   }

   @JsonProperty("appCode")
   public String getAppCode() {
      return this.appCode;
   }

   @JsonProperty("bizOrderId")
   public void setBizOrderId(String bizOrderId) {
      this.bizOrderId = bizOrderId;
   }

   @JsonProperty("bizOrderId")
   public String getBizOrderId() {
      return this.bizOrderId;
   }

   @JsonProperty("bizType")
   public void setBizType(Integer bizType) {
      this.bizType = bizType;
   }

   @JsonProperty("bizType")
   public Integer getBizType() {
      return this.bizType;
   }

   @JsonProperty("aiCheckBillResult")
   public void setAiCheckBillResult(List<AICheckBillResult> aiCheckBillResult) {
      this.aiCheckBillResult = aiCheckBillResult;
   }

   @JsonProperty("aiCheckBillResult")
   public List<AICheckBillResult> getAiCheckBillResult() {
      return this.aiCheckBillResult;
   }

   @JsonProperty("bizOrderIdType")
   public void setBizOrderIdType(Integer bizOrderIdType) {
      this.bizOrderIdType = bizOrderIdType;
   }

   @JsonProperty("bizOrderIdType")
   public Integer getBizOrderIdType() {
      return this.bizOrderIdType;
   }

   @JsonProperty("bizCode")
   public void setBizCode(Integer bizCode) {
      this.bizCode = bizCode;
   }

   @JsonProperty("bizCode")
   public Integer getBizCode() {
      return this.bizCode;
   }
}

package com.jd.open.api.sdk.domain.order.OrderRemarkService.response.modifyVenderRemark;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OperatorResult implements Serializable {
   private String chineseErrCode;
   private String englishErrCode;
   private String errorCode;
   private boolean success;
   private Long outBatchId;
   private Long sendbatchId;

   @JsonProperty("chinese_err_code")
   public void setChineseErrCode(String chineseErrCode) {
      this.chineseErrCode = chineseErrCode;
   }

   @JsonProperty("chinese_err_code")
   public String getChineseErrCode() {
      return this.chineseErrCode;
   }

   @JsonProperty("english_err_code")
   public void setEnglishErrCode(String englishErrCode) {
      this.englishErrCode = englishErrCode;
   }

   @JsonProperty("english_err_code")
   public String getEnglishErrCode() {
      return this.englishErrCode;
   }

   @JsonProperty("error_code")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("error_code")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("out_batch_id")
   public void setOutBatchId(Long outBatchId) {
      this.outBatchId = outBatchId;
   }

   @JsonProperty("out_batch_id")
   public Long getOutBatchId() {
      return this.outBatchId;
   }

   @JsonProperty("sendbatch_id")
   public void setSendbatchId(Long sendbatchId) {
      this.sendbatchId = sendbatchId;
   }

   @JsonProperty("sendbatch_id")
   public Long getSendbatchId() {
      return this.sendbatchId;
   }
}

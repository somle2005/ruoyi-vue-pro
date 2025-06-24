package com.jd.open.api.sdk.domain.refundapply.RefundApplySoaService.response.queryPageList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryResult implements Serializable {
   private Long totalCount;
   private List<RefundApplyVo> result;
   private Boolean success;
   private String errorCode;
   private String errorMsg;

   @JsonProperty("totalCount")
   public void setTotalCount(Long totalCount) {
      this.totalCount = totalCount;
   }

   @JsonProperty("totalCount")
   public Long getTotalCount() {
      return this.totalCount;
   }

   @JsonProperty("result")
   public void setResult(List<RefundApplyVo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<RefundApplyVo> getResult() {
      return this.result;
   }

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public String getErrorCode() {
      return this.errorCode;
   }

   @JsonProperty("errorMsg")
   public void setErrorMsg(String errorMsg) {
      this.errorMsg = errorMsg;
   }

   @JsonProperty("errorMsg")
   public String getErrorMsg() {
      return this.errorMsg;
   }
}

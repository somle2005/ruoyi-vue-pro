package com.jd.open.api.sdk.domain.ware.SeriesProductJosWriteService.response.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosResult implements Serializable {
   private Boolean success;
   private Integer errorCode;
   private String errorMsg;
   private Boolean data;
   private String traceId;
   private List<DeleteRelResponse> deleteRels;

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(Integer errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public Integer getErrorCode() {
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

   @JsonProperty("data")
   public void setData(Boolean data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Boolean getData() {
      return this.data;
   }

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
   }

   @JsonProperty("deleteRels")
   public void setDeleteRels(List<DeleteRelResponse> deleteRels) {
      this.deleteRels = deleteRels;
   }

   @JsonProperty("deleteRels")
   public List<DeleteRelResponse> getDeleteRels() {
      return this.deleteRels;
   }
}

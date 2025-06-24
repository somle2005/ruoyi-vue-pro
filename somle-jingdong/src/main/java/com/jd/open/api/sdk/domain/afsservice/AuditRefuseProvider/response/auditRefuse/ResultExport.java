package com.jd.open.api.sdk.domain.afsservice.AuditRefuseProvider.response.auditRefuse;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultExport implements Serializable {
   private int resultCode;
   private Integer data;
   private String errMsg;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(Integer data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Integer getData() {
      return this.data;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }
}

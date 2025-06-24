package com.jd.open.api.sdk.domain.order.SnUploadJosService.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SnUploadResp implements Serializable {
   private String statusDesc;
   private Integer status;
   private String subCode;
   private String subMsg;
   private String suggestion;

   @JsonProperty("statusDesc")
   public void setStatusDesc(String statusDesc) {
      this.statusDesc = statusDesc;
   }

   @JsonProperty("statusDesc")
   public String getStatusDesc() {
      return this.statusDesc;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("subCode")
   public void setSubCode(String subCode) {
      this.subCode = subCode;
   }

   @JsonProperty("subCode")
   public String getSubCode() {
      return this.subCode;
   }

   @JsonProperty("subMsg")
   public void setSubMsg(String subMsg) {
      this.subMsg = subMsg;
   }

   @JsonProperty("subMsg")
   public String getSubMsg() {
      return this.subMsg;
   }

   @JsonProperty("suggestion")
   public void setSuggestion(String suggestion) {
      this.suggestion = suggestion;
   }

   @JsonProperty("suggestion")
   public String getSuggestion() {
      return this.suggestion;
   }
}

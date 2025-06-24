package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LogisticsSkuAddResponse extends AbstractResponse {
   private long processCode;
   private String processStatus;
   private String errorMessage;
   private String resultNo;

   @JsonProperty("process_code")
   public void setProcessCode(long processCode) {
      this.processCode = processCode;
   }

   @JsonProperty("process_code")
   public long getProcessCode() {
      return this.processCode;
   }

   @JsonProperty("process_status")
   public void setProcessStatus(String processStatus) {
      this.processStatus = processStatus;
   }

   @JsonProperty("process_status")
   public String getProcessStatus() {
      return this.processStatus;
   }

   @JsonProperty("error_message")
   public void setErrorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
   }

   @JsonProperty("error_message")
   public String getErrorMessage() {
      return this.errorMessage;
   }

   @JsonProperty("result_no")
   public void setResultNo(String resultNo) {
      this.resultNo = resultNo;
   }

   @JsonProperty("result_no")
   public String getResultNo() {
      return this.resultNo;
   }
}

package com.jd.open.api.sdk.domain.afsservice.PriceProtectSoaService.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PublicResult implements Serializable {
   private boolean success;
   private String errorCode;
   private String errorMsg;
   private PriceProtectRecordDetailDto data;

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
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

   @JsonProperty("data")
   public void setData(PriceProtectRecordDetailDto data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PriceProtectRecordDetailDto getData() {
      return this.data;
   }
}

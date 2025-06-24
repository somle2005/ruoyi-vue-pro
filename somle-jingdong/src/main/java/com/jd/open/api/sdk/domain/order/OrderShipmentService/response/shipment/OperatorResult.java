package com.jd.open.api.sdk.domain.order.OrderShipmentService.response.shipment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OperatorResult implements Serializable {
   private String chineseErrCode;
   private String englishErrCode;
   private String errorCode;
   private boolean success;

   @JsonProperty("chineseErrCode")
   public void setChineseErrCode(String chineseErrCode) {
      this.chineseErrCode = chineseErrCode;
   }

   @JsonProperty("chineseErrCode")
   public String getChineseErrCode() {
      return this.chineseErrCode;
   }

   @JsonProperty("englishErrCode")
   public void setEnglishErrCode(String englishErrCode) {
      this.englishErrCode = englishErrCode;
   }

   @JsonProperty("englishErrCode")
   public String getEnglishErrCode() {
      return this.englishErrCode;
   }

   @JsonProperty("errorCode")
   public void setErrorCode(String errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
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
}

package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.cancelBjkServiceOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BjkResult implements Serializable {
   private int errorCode;
   private String errorMsg;
   private String serviceNo;

   @JsonProperty("errorCode")
   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }

   @JsonProperty("errorCode")
   public int getErrorCode() {
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

   @JsonProperty("serviceNo")
   public void setServiceNo(String serviceNo) {
      this.serviceNo = serviceNo;
   }

   @JsonProperty("serviceNo")
   public String getServiceNo() {
      return this.serviceNo;
   }
}

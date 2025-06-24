package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.createServiceOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServicesResult implements Serializable {
   private String serivcesNo;
   private int errorCode;
   private String errorMsg;

   @JsonProperty("serivcesNo")
   public void setSerivcesNo(String serivcesNo) {
      this.serivcesNo = serivcesNo;
   }

   @JsonProperty("serivcesNo")
   public String getSerivcesNo() {
      return this.serivcesNo;
   }

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
}

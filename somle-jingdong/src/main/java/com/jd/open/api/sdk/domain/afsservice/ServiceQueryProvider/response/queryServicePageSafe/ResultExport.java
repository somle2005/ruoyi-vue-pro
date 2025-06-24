package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.queryServicePageSafe;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultExport implements Serializable {
   private int resultCode;
   private String errMsg;
   private ServicePageExport data;

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("data")
   public void setData(ServicePageExport data) {
      this.data = data;
   }

   @JsonProperty("data")
   public ServicePageExport getData() {
      return this.data;
   }
}

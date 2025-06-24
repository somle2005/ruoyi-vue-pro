package com.jd.open.api.sdk.domain.youE.IvcActualQueryUeService.response.ivcActualQuery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServerResult implements Serializable {
   private boolean sccuess;
   private String errMsg;
   private int resultCode;
   private String data;

   @JsonProperty("sccuess")
   public void setSccuess(boolean sccuess) {
      this.sccuess = sccuess;
   }

   @JsonProperty("sccuess")
   public boolean getSccuess() {
      return this.sccuess;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}

package com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.push;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private boolean suc;
   private Boolean con;
   private int errCod;
   private String errMsg;

   @JsonProperty("suc")
   public void setSuc(boolean suc) {
      this.suc = suc;
   }

   @JsonProperty("suc")
   public boolean getSuc() {
      return this.suc;
   }

   @JsonProperty("con")
   public void setCon(Boolean con) {
      this.con = con;
   }

   @JsonProperty("con")
   public Boolean getCon() {
      return this.con;
   }

   @JsonProperty("err_cod")
   public void setErrCod(int errCod) {
      this.errCod = errCod;
   }

   @JsonProperty("err_cod")
   public int getErrCod() {
      return this.errCod;
   }

   @JsonProperty("err_msg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("err_msg")
   public String getErrMsg() {
      return this.errMsg;
   }
}

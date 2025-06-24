package com.jd.open.api.sdk.domain.xny.CarChargeResultService.response.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer Ret;
   private NotifyChargeResult Data;
   private String Sig;
   private String Msg;

   @JsonProperty("Ret")
   public void setRet(Integer Ret) {
      this.Ret = Ret;
   }

   @JsonProperty("Ret")
   public Integer getRet() {
      return this.Ret;
   }

   @JsonProperty("Data")
   public void setData(NotifyChargeResult Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public NotifyChargeResult getData() {
      return this.Data;
   }

   @JsonProperty("Sig")
   public void setSig(String Sig) {
      this.Sig = Sig;
   }

   @JsonProperty("Sig")
   public String getSig() {
      return this.Sig;
   }

   @JsonProperty("Msg")
   public void setMsg(String Msg) {
      this.Msg = Msg;
   }

   @JsonProperty("Msg")
   public String getMsg() {
      return this.Msg;
   }
}

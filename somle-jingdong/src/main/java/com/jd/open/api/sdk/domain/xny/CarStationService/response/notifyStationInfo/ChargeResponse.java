package com.jd.open.api.sdk.domain.xny.CarStationService.response.notifyStationInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ChargeResponse implements Serializable {
   private Integer Ret;
   private String Msg;
   private String Sig;
   private Integer Data;

   @JsonProperty("Ret")
   public void setRet(Integer Ret) {
      this.Ret = Ret;
   }

   @JsonProperty("Ret")
   public Integer getRet() {
      return this.Ret;
   }

   @JsonProperty("Msg")
   public void setMsg(String Msg) {
      this.Msg = Msg;
   }

   @JsonProperty("Msg")
   public String getMsg() {
      return this.Msg;
   }

   @JsonProperty("Sig")
   public void setSig(String Sig) {
      this.Sig = Sig;
   }

   @JsonProperty("Sig")
   public String getSig() {
      return this.Sig;
   }

   @JsonProperty("Data")
   public void setData(Integer Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public Integer getData() {
      return this.Data;
   }
}

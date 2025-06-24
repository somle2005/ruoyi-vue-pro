package com.jd.open.api.sdk.domain.xny.CarOrderService.response.getBatchChargeOrderMappingInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ChargeResponse implements Serializable {
   private Integer Ret;
   private String Msg;
   private List<String> Data;

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

   @JsonProperty("Data")
   public void setData(List<String> Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public List<String> getData() {
      return this.Data;
   }
}

package com.jd.open.api.sdk.domain.ECLP.EclpIsvService.response.addLcOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApiStringResponse implements Serializable {
   private String status;
   private int resultCode;
   private String msg;

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("resultCode")
   public void setResultCode(int resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public int getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }
}

package com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.response.batchAdd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ValidationErroInfoVo implements Serializable {
   private String gtin;
   private String message;
   private Long serialNo;

   @JsonProperty("gtin")
   public void setGtin(String gtin) {
      this.gtin = gtin;
   }

   @JsonProperty("gtin")
   public String getGtin() {
      return this.gtin;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("serialNo")
   public void setSerialNo(Long serialNo) {
      this.serialNo = serialNo;
   }

   @JsonProperty("serialNo")
   public Long getSerialNo() {
      return this.serialNo;
   }
}

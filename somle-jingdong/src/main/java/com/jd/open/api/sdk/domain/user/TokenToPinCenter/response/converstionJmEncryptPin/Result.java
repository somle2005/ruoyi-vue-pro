package com.jd.open.api.sdk.domain.user.TokenToPinCenter.response.converstionJmEncryptPin;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private int code;
   private String requestId;
   private String message;
   private String data;
   private String openIdSeller;
   private String xidSeller;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("requestId")
   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   @JsonProperty("requestId")
   public String getRequestId() {
      return this.requestId;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }

   @JsonProperty("open_id_seller")
   public void setOpenIdSeller(String openIdSeller) {
      this.openIdSeller = openIdSeller;
   }

   @JsonProperty("open_id_seller")
   public String getOpenIdSeller() {
      return this.openIdSeller;
   }

   @JsonProperty("xid_seller")
   public void setXidSeller(String xidSeller) {
      this.xidSeller = xidSeller;
   }

   @JsonProperty("xid_seller")
   public String getXidSeller() {
      return this.xidSeller;
   }
}

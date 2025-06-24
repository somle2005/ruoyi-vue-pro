package com.jd.open.api.sdk.domain.iopdz.QueryAddressOpenProvider.response.convertFourAreaByLatLng;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BaseRpcResponse implements Serializable {
   private String code;
   private boolean success;
   private String message;
   private QueryAreaFourIdOpenResp data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("success")
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
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
   public void setData(QueryAreaFourIdOpenResp data) {
      this.data = data;
   }

   @JsonProperty("data")
   public QueryAreaFourIdOpenResp getData() {
      return this.data;
   }
}

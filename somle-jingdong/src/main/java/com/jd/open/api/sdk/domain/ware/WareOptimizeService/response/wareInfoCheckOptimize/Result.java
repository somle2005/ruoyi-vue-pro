package com.jd.open.api.sdk.domain.ware.WareOptimizeService.response.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String message;
   private int status;
   private CheckOptimizeResult data;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("data")
   public void setData(CheckOptimizeResult data) {
      this.data = data;
   }

   @JsonProperty("data")
   public CheckOptimizeResult getData() {
      return this.data;
   }
}

package com.jd.open.api.sdk.domain.qchfw.ApplyService.response.checkGmsCarCategory;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String message;
   private Integer status;
   private Integer data;

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("data")
   public void setData(Integer data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Integer getData() {
      return this.data;
   }
}

package com.jd.open.api.sdk.domain.ware.JosWareImageService.response.airesizeimg;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JosResponse implements Serializable {
   private String msg;
   private Integer code;
   private String requestId;
   private JosWareImageResponse data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
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

   @JsonProperty("data")
   public void setData(JosWareImageResponse data) {
      this.data = data;
   }

   @JsonProperty("data")
   public JosWareImageResponse getData() {
      return this.data;
   }
}

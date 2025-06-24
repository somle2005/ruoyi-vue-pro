package com.jd.open.api.sdk.domain.udp.IsvJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StatusDataResult implements Serializable {
   private int code;
   private String msg;
   private String requestId;
   private IsvSmsAuditStatusOutVo data;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
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
   public void setData(IsvSmsAuditStatusOutVo data) {
      this.data = data;
   }

   @JsonProperty("data")
   public IsvSmsAuditStatusOutVo getData() {
      return this.data;
   }
}

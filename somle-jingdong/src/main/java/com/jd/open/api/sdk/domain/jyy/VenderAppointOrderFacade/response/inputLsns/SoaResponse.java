package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.response.inputLsns;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SoaResponse implements Serializable {
   private String reason;
   private int code;
   private boolean success;
   private List<LsnResultVO> result;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
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

   @JsonProperty("result")
   public void setResult(List<LsnResultVO> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<LsnResultVO> getResult() {
      return this.result;
   }
}

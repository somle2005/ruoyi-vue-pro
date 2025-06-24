package com.jd.open.api.sdk.domain.promotion.UnitPromoWriteOutService.response.selfUnitPromo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
   private String msg;
   private Integer code;
   private Boolean success;
   private List<RtnPromInfo> result;

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

   @JsonProperty("success")
   public void setSuccess(Boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public Boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("result")
   public void setResult(List<RtnPromInfo> result) {
      this.result = result;
   }

   @JsonProperty("result")
   public List<RtnPromInfo> getResult() {
      return this.result;
   }
}

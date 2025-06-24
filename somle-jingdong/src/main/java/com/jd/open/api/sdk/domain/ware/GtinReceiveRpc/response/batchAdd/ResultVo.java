package com.jd.open.api.sdk.domain.ware.GtinReceiveRpc.response.batchAdd;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ResultVo implements Serializable {
   private String msg;
   private Integer code;
   private boolean success;
   private String uuid;
   private List<ValidationErroInfoVo> validationErroInfos;

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
   public void setSuccess(boolean success) {
      this.success = success;
   }

   @JsonProperty("success")
   public boolean getSuccess() {
      return this.success;
   }

   @JsonProperty("uuid")
   public void setUuid(String uuid) {
      this.uuid = uuid;
   }

   @JsonProperty("uuid")
   public String getUuid() {
      return this.uuid;
   }

   @JsonProperty("validationErroInfos")
   public void setValidationErroInfos(List<ValidationErroInfoVo> validationErroInfos) {
      this.validationErroInfos = validationErroInfos;
   }

   @JsonProperty("validationErroInfos")
   public List<ValidationErroInfoVo> getValidationErroInfos() {
      return this.validationErroInfos;
   }
}

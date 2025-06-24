package com.jd.open.api.sdk.domain.youE.SubInfoExportService.response.subMsgAndInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private String msg;
   private int code;
   private InfoSubVo subVo;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("subVo")
   public void setSubVo(InfoSubVo subVo) {
      this.subVo = subVo;
   }

   @JsonProperty("subVo")
   public InfoSubVo getSubVo() {
      return this.subVo;
   }
}

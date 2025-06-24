package com.jd.open.api.sdk.domain.jjfw.VirtualNumberService.response.virtualNumberService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Result implements Serializable {
   private Integer resultCode;
   private String errMsg;
   private VirtualNum data;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(String errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public String getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("data")
   public void setData(VirtualNum data) {
      this.data = data;
   }

   @JsonProperty("data")
   public VirtualNum getData() {
      return this.data;
   }
}

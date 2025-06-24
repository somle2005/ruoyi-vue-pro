package com.jd.open.api.sdk.domain.youE.VirtualMobileExportService.response.queryUserMobile;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PerformResult implements Serializable {
   private String msg;
   private Integer resultCode;
   private PhoneNumBindVO data;

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("data")
   public void setData(PhoneNumBindVO data) {
      this.data = data;
   }

   @JsonProperty("data")
   public PhoneNumBindVO getData() {
      return this.data;
   }
}

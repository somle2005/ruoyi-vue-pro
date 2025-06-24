package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class ResponseEntity implements Serializable {
   private String code;
   private Map<String, String> errMsg;
   private String showMsg;
   private String data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("errMsg")
   public void setErrMsg(Map<String, String> errMsg) {
      this.errMsg = errMsg;
   }

   @JsonProperty("errMsg")
   public Map<String, String> getErrMsg() {
      return this.errMsg;
   }

   @JsonProperty("showMsg")
   public void setShowMsg(String showMsg) {
      this.showMsg = showMsg;
   }

   @JsonProperty("showMsg")
   public String getShowMsg() {
      return this.showMsg;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}

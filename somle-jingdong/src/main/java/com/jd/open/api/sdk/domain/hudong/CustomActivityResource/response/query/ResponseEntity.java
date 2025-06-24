package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseEntity implements Serializable {
   private String code;
   private String showMsg;
   private EcoActivitySkuDetailRes data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
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
   public void setData(EcoActivitySkuDetailRes data) {
      this.data = data;
   }

   @JsonProperty("data")
   public EcoActivitySkuDetailRes getData() {
      return this.data;
   }
}

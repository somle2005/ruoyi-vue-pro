package com.jd.open.api.sdk.domain.customsglobalAPI.OnlineRecordJosService.response.customsUpdate;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ORNumberResult implements Serializable {
   private int result;
   private int code;
   private String desc;

   @JsonProperty("result")
   public void setResult(int result) {
      this.result = result;
   }

   @JsonProperty("result")
   public int getResult() {
      return this.result;
   }

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("desc")
   public void setDesc(String desc) {
      this.desc = desc;
   }

   @JsonProperty("desc")
   public String getDesc() {
      return this.desc;
   }
}

package com.jd.open.api.sdk.domain.digitalstore.CloudPosPayExportService.response.getpreorderid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JpassResult implements Serializable {
   private Integer code;
   private String desc;
   private String data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
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

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }
}

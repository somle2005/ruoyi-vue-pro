package com.jd.open.api.sdk.domain.etms.TraceQueryJsf.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class TraceQueryResultDTO implements Serializable {
   private Integer code;
   private String messsage;
   private List<TraceDTO> data;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("messsage")
   public void setMesssage(String messsage) {
      this.messsage = messsage;
   }

   @JsonProperty("messsage")
   public String getMesssage() {
      return this.messsage;
   }

   @JsonProperty("data")
   public void setData(List<TraceDTO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<TraceDTO> getData() {
      return this.data;
   }
}

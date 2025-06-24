package com.jd.open.api.sdk.domain.order.SnUploadJosService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SerialCode implements Serializable {
   private String codeType;
   private String codeValue;

   @JsonProperty("codeType")
   public void setCodeType(String codeType) {
      this.codeType = codeType;
   }

   @JsonProperty("codeType")
   public String getCodeType() {
      return this.codeType;
   }

   @JsonProperty("codeValue")
   public void setCodeValue(String codeValue) {
      this.codeValue = codeValue;
   }

   @JsonProperty("codeValue")
   public String getCodeValue() {
      return this.codeValue;
   }
}

package com.jd.open.api.sdk.domain.etms.CloudPrintApi.response.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class InvokeResult implements Serializable {
   private Integer code;
   private String message;
   private String data;
   private List<CodeAssociation> codeAssociations;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("data")
   public void setData(String data) {
      this.data = data;
   }

   @JsonProperty("data")
   public String getData() {
      return this.data;
   }

   @JsonProperty("codeAssociations")
   public void setCodeAssociations(List<CodeAssociation> codeAssociations) {
      this.codeAssociations = codeAssociations;
   }

   @JsonProperty("codeAssociations")
   public List<CodeAssociation> getCodeAssociations() {
      return this.codeAssociations;
   }
}

package com.jd.open.api.sdk.domain.ware.ProductPublishTemplateService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JdResult implements Serializable {
   private String traceId;
   private String code;
   private List<ComponentRulesVO> data;
   private String message;

   @JsonProperty("traceId")
   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   @JsonProperty("traceId")
   public String getTraceId() {
      return this.traceId;
   }

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(List<ComponentRulesVO> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<ComponentRulesVO> getData() {
      return this.data;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }
}

package com.jd.open.api.sdk.domain.udp.StrategyService.response.byid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Err implements Serializable {
   private String code;
   private String detail;
   private String source;
   private String title;
   private String status;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("detail")
   public void setDetail(String detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public String getDetail() {
      return this.detail;
   }

   @JsonProperty("source")
   public void setSource(String source) {
      this.source = source;
   }

   @JsonProperty("source")
   public String getSource() {
      return this.source;
   }

   @JsonProperty("title")
   public void setTitle(String title) {
      this.title = title;
   }

   @JsonProperty("title")
   public String getTitle() {
      return this.title;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }
}

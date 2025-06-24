package com.jd.open.api.sdk.domain.order.PresaleOrderExportServiceForJOS.response.getPresaleOrderCount;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceResponse implements Serializable {
   private String code;
   private Integer data;
   private String detail;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(Integer data) {
      this.data = data;
   }

   @JsonProperty("data")
   public Integer getData() {
      return this.data;
   }

   @JsonProperty("detail")
   public void setDetail(String detail) {
      this.detail = detail;
   }

   @JsonProperty("detail")
   public String getDetail() {
      return this.detail;
   }
}

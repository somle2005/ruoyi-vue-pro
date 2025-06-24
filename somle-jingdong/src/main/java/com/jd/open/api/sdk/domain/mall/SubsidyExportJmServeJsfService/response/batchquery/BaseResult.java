package com.jd.open.api.sdk.domain.mall.SubsidyExportJmServeJsfService.response.batchquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResult implements Serializable {
   private String code;
   private String message;
   private List<SubsidyImgDto> data;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
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
   public void setData(List<SubsidyImgDto> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SubsidyImgDto> getData() {
      return this.data;
   }
}

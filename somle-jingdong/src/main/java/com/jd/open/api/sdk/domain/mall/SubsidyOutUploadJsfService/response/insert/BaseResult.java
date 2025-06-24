package com.jd.open.api.sdk.domain.mall.SubsidyOutUploadJsfService.response.insert;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class BaseResult implements Serializable {
   private String code;
   private List<SubsidySkuInfoErrorDto> data;
   private String message;

   @JsonProperty("code")
   public void setCode(String code) {
      this.code = code;
   }

   @JsonProperty("code")
   public String getCode() {
      return this.code;
   }

   @JsonProperty("data")
   public void setData(List<SubsidySkuInfoErrorDto> data) {
      this.data = data;
   }

   @JsonProperty("data")
   public List<SubsidySkuInfoErrorDto> getData() {
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

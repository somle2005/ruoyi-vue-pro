package com.jd.open.api.sdk.domain.ThreePL.PresortBaseSiteFenceImportService.response.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FenceImportResponseDto implements Serializable {
   private Integer resultCode;
   private String message;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
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

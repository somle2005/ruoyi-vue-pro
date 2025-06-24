package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.skuCustomServiceBatchApply;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SkuServiceApplyDetailResp implements Serializable {
   private int code;
   private String identityId;
   private String message;

   @JsonProperty("code")
   public void setCode(int code) {
      this.code = code;
   }

   @JsonProperty("code")
   public int getCode() {
      return this.code;
   }

   @JsonProperty("identityId")
   public void setIdentityId(String identityId) {
      this.identityId = identityId;
   }

   @JsonProperty("identityId")
   public String getIdentityId() {
      return this.identityId;
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

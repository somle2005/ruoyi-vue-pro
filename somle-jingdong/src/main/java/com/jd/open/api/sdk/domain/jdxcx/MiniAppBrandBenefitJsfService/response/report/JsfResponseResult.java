package com.jd.open.api.sdk.domain.jdxcx.MiniAppBrandBenefitJsfService.response.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class JsfResponseResult implements Serializable {
   private Integer code;
   private String error;
   private CreateBenefitResult createBenefitResult;

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("error")
   public void setError(String error) {
      this.error = error;
   }

   @JsonProperty("error")
   public String getError() {
      return this.error;
   }

   @JsonProperty("createBenefitResult")
   public void setCreateBenefitResult(CreateBenefitResult createBenefitResult) {
      this.createBenefitResult = createBenefitResult;
   }

   @JsonProperty("createBenefitResult")
   public CreateBenefitResult getCreateBenefitResult() {
      return this.createBenefitResult;
   }
}

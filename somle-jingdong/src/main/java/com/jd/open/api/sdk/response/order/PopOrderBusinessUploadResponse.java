package com.jd.open.api.sdk.response.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.IOrderBusinessUploadService.response.upload.ApiSafResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class PopOrderBusinessUploadResponse extends AbstractResponse {
   private ApiSafResult businessuploadResult;

   @JsonProperty("businessupload_result")
   public void setBusinessuploadResult(ApiSafResult businessuploadResult) {
      this.businessuploadResult = businessuploadResult;
   }

   @JsonProperty("businessupload_result")
   public ApiSafResult getBusinessuploadResult() {
      return this.businessuploadResult;
   }
}

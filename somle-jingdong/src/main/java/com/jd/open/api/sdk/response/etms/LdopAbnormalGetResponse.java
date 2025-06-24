package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.AbnormalOrderRequestApi.response.get.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class LdopAbnormalGetResponse extends AbstractResponse {
   private ResponseDTO querybyconditionResult;

   @JsonProperty("querybycondition_result")
   public void setQuerybyconditionResult(ResponseDTO querybyconditionResult) {
      this.querybyconditionResult = querybyconditionResult;
   }

   @JsonProperty("querybycondition_result")
   public ResponseDTO getQuerybyconditionResult() {
      return this.querybyconditionResult;
   }
}

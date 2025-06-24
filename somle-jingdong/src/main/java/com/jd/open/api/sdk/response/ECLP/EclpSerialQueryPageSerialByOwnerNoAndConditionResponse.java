package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPageSerialByOwnerNoAndCondition.OQueryResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpSerialQueryPageSerialByOwnerNoAndConditionResponse extends AbstractResponse {
   private OQueryResult querypageserialbyownernoandconditionResult;

   @JsonProperty("querypageserialbyownernoandcondition_result")
   public void setQuerypageserialbyownernoandconditionResult(OQueryResult querypageserialbyownernoandconditionResult) {
      this.querypageserialbyownernoandconditionResult = querypageserialbyownernoandconditionResult;
   }

   @JsonProperty("querypageserialbyownernoandcondition_result")
   public OQueryResult getQuerypageserialbyownernoandconditionResult() {
      return this.querypageserialbyownernoandconditionResult;
   }
}

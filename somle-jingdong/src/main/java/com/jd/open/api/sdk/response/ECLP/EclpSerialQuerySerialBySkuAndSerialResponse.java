package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySerialBySkuAndSerial.GoodsSIDResponse;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpSerialQuerySerialBySkuAndSerialResponse extends AbstractResponse {
   private GoodsSIDResponse queryserialbyskuandserialResult;

   @JsonProperty("queryserialbyskuandserial_result")
   public void setQueryserialbyskuandserialResult(GoodsSIDResponse queryserialbyskuandserialResult) {
      this.queryserialbyskuandserialResult = queryserialbyskuandserialResult;
   }

   @JsonProperty("queryserialbyskuandserial_result")
   public GoodsSIDResponse getQueryserialbyskuandserialResult() {
      return this.queryserialbyskuandserialResult;
   }
}

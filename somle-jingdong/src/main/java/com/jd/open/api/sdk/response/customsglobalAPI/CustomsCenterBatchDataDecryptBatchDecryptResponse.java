package com.jd.open.api.sdk.response.customsglobalAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.customsglobalAPI.BatchDataDecrypt.response.batchDecrypt.CommonResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class CustomsCenterBatchDataDecryptBatchDecryptResponse extends AbstractResponse {
   private CommonResult result;

   @JsonProperty("result")
   public void setResult(CommonResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public CommonResult getResult() {
      return this.result;
   }
}

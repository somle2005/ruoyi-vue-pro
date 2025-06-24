package com.jd.open.api.sdk.response.digitalstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.digitalstore.CloudPosPayExportService.response.getpreorderid.JpassResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WujiePayGetpreorderidResponse extends AbstractResponse {
   private JpassResult result;

   @JsonProperty("result")
   public void setResult(JpassResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JpassResult getResult() {
      return this.result;
   }
}

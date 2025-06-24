package com.jd.open.api.sdk.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.SeriesProductJosReadService.response.get.JosResult;
import com.jd.open.api.sdk.response.AbstractResponse;

public class WareSeriesObjectGetResponse extends AbstractResponse {
   private JosResult result;

   @JsonProperty("result")
   public void setResult(JosResult result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosResult getResult() {
      return this.result;
   }
}

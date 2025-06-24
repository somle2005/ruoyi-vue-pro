package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.WarePerformanceDataJosService.response.get.JosWarePerformanceResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvWarePerformancedataGetResponse extends AbstractResponse {
   private JosWarePerformanceResultDTO result;

   @JsonProperty("result")
   public void setResult(JosWarePerformanceResultDTO result) {
      this.result = result;
   }

   @JsonProperty("result")
   public JosWarePerformanceResultDTO getResult() {
      return this.result;
   }
}

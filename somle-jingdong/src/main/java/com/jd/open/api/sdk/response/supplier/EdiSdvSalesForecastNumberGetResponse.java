package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EdiSdvSalesForecastNumberGetResponse extends AbstractResponse {
   private int salesForecastNumber;

   @JsonProperty("salesForecastNumber")
   public void setSalesForecastNumber(int salesForecastNumber) {
      this.salesForecastNumber = salesForecastNumber;
   }

   @JsonProperty("salesForecastNumber")
   public int getSalesForecastNumber() {
      return this.salesForecastNumber;
   }
}

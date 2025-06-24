package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.SalesForecastJosService.response.search.SalesForecastDTO;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EdiSdvSalesForecastNumberSearchResponse extends AbstractResponse {
   private List<SalesForecastDTO> forecast;

   @JsonProperty("forecast")
   public void setForecast(List<SalesForecastDTO> forecast) {
      this.forecast = forecast;
   }

   @JsonProperty("forecast")
   public List<SalesForecastDTO> getForecast() {
      return this.forecast;
   }
}

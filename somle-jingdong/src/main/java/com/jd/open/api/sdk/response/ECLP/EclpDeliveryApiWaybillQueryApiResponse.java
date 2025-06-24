package com.jd.open.api.sdk.response.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.WaybillQueryApi.response.WaybillQueryApi.WaybillQryFreightsResultDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class EclpDeliveryApiWaybillQueryApiResponse extends AbstractResponse {
   private WaybillQryFreightsResultDTO responseDTO;

   @JsonProperty("responseDTO")
   public void setResponseDTO(WaybillQryFreightsResultDTO responseDTO) {
      this.responseDTO = responseDTO;
   }

   @JsonProperty("responseDTO")
   public WaybillQryFreightsResultDTO getResponseDTO() {
      return this.responseDTO;
   }
}

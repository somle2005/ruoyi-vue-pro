package com.jd.open.api.sdk.response.kdgjapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.kdgjapi.WaybillQueryApi.response.queryDetail.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class JingdongLdopAlphaWaybillQueryDetailResponse extends AbstractResponse {
   private ResponseDTO responseDTO;

   @JsonProperty("responseDTO")
   public void setResponseDTO(ResponseDTO responseDTO) {
      this.responseDTO = responseDTO;
   }

   @JsonProperty("responseDTO")
   public ResponseDTO getResponseDTO() {
      return this.responseDTO;
   }
}

package com.jd.open.api.sdk.response.etms;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.etms.WaybillWeightAndVolumeApi.response.weightAndVolume.ResponseDTO;
import com.jd.open.api.sdk.response.AbstractResponse;

public class QueryWeightAndVolumeResponse extends AbstractResponse {
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

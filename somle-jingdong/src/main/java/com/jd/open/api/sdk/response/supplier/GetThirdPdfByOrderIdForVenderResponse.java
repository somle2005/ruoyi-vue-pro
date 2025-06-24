package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.JppoCollectJsf.response.getThirdPdfByOrderIdForVender.PoPdfDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class GetThirdPdfByOrderIdForVenderResponse extends AbstractResponse {
   private PoPdfDto poPdfDto;

   @JsonProperty("poPdfDto")
   public void setPoPdfDto(PoPdfDto poPdfDto) {
      this.poPdfDto = poPdfDto;
   }

   @JsonProperty("poPdfDto")
   public PoPdfDto getPoPdfDto() {
      return this.poPdfDto;
   }
}

package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.PoCreateForJosWebService.response.getrequisitiondetailbywareid.RequisitionInfoResultDto;
import com.jd.open.api.sdk.response.AbstractResponse;

public class VcGetrequisitiondetailbywareidResponse extends AbstractResponse {
   private RequisitionInfoResultDto requisitionInfoResultDto;

   @JsonProperty("requisition_info_result_dto")
   public void setRequisitionInfoResultDto(RequisitionInfoResultDto requisitionInfoResultDto) {
      this.requisitionInfoResultDto = requisitionInfoResultDto;
   }

   @JsonProperty("requisition_info_result_dto")
   public RequisitionInfoResultDto getRequisitionInfoResultDto() {
      return this.requisitionInfoResultDto;
   }
}

package com.jd.open.api.sdk.domain.youE.BizOrderDetailsJsfService.response.queryBizOrderDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class FeeInfo implements Serializable {
   private ElectronicBillDTO electronicBillDTO;

   @JsonProperty("electronicBillDTO")
   public void setElectronicBillDTO(ElectronicBillDTO electronicBillDTO) {
      this.electronicBillDTO = electronicBillDTO;
   }

   @JsonProperty("electronicBillDTO")
   public ElectronicBillDTO getElectronicBillDTO() {
      return this.electronicBillDTO;
   }
}

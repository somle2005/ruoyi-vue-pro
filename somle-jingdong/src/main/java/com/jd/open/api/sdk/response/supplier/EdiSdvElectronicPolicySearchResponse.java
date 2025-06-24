package com.jd.open.api.sdk.response.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ElectronicPolicyJosService.response.search.ElectronicPolicyDTO;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class EdiSdvElectronicPolicySearchResponse extends AbstractResponse {
   private List<ElectronicPolicyDTO> electronicPolicys;

   @JsonProperty("electronicPolicys")
   public void setElectronicPolicys(List<ElectronicPolicyDTO> electronicPolicys) {
      this.electronicPolicys = electronicPolicys;
   }

   @JsonProperty("electronicPolicys")
   public List<ElectronicPolicyDTO> getElectronicPolicys() {
      return this.electronicPolicys;
   }
}

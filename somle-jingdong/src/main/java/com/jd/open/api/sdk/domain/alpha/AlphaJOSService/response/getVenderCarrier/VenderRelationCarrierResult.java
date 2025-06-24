package com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.getVenderCarrier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class VenderRelationCarrierResult implements Serializable {
   private List<Carrier> carrierList;

   @JsonProperty("carrierList")
   public void setCarrierList(List<Carrier> carrierList) {
      this.carrierList = carrierList;
   }

   @JsonProperty("carrierList")
   public List<Carrier> getCarrierList() {
      return this.carrierList;
   }
}

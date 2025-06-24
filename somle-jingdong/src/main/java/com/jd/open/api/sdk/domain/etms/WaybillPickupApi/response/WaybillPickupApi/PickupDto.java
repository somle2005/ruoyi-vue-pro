package com.jd.open.api.sdk.domain.etms.WaybillPickupApi.response.WaybillPickupApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PickupDto implements Serializable {
   private Double againWeight;

   @JsonProperty("againWeight")
   public void setAgainWeight(Double againWeight) {
      this.againWeight = againWeight;
   }

   @JsonProperty("againWeight")
   public Double getAgainWeight() {
      return this.againWeight;
   }
}

package com.jd.open.api.sdk.domain.etms.WaybillWeightQueryApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillWeightDto implements Serializable {
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

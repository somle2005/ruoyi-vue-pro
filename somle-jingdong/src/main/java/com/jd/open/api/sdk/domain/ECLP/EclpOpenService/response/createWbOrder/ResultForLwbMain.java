package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.createWbOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResultForLwbMain implements Serializable {
   private String wb;
   private String lwb;

   @JsonProperty("wb")
   public void setWb(String wb) {
      this.wb = wb;
   }

   @JsonProperty("wb")
   public String getWb() {
      return this.wb;
   }

   @JsonProperty("lwb")
   public void setLwb(String lwb) {
      this.lwb = lwb;
   }

   @JsonProperty("lwb")
   public String getLwb() {
      return this.lwb;
   }
}

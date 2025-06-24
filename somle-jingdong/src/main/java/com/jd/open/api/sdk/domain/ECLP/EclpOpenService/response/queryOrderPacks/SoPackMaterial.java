package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryOrderPacks;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SoPackMaterial implements Serializable {
   private String goodsMaterialName;
   private String model;

   @JsonProperty("goodsMaterialName")
   public void setGoodsMaterialName(String goodsMaterialName) {
      this.goodsMaterialName = goodsMaterialName;
   }

   @JsonProperty("goodsMaterialName")
   public String getGoodsMaterialName() {
      return this.goodsMaterialName;
   }

   @JsonProperty("model")
   public void setModel(String model) {
      this.model = model;
   }

   @JsonProperty("model")
   public String getModel() {
      return this.model;
   }
}

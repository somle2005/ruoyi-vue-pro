package com.jd.open.api.sdk.domain.ware.JosSpuReadService.response.searchCar;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Spu implements Serializable {
   private Long cspuId;
   private String cspuName;

   @JsonProperty("cspuId")
   public void setCspuId(Long cspuId) {
      this.cspuId = cspuId;
   }

   @JsonProperty("cspuId")
   public Long getCspuId() {
      return this.cspuId;
   }

   @JsonProperty("cspuName")
   public void setCspuName(String cspuName) {
      this.cspuName = cspuName;
   }

   @JsonProperty("cspuName")
   public String getCspuName() {
      return this.cspuName;
   }
}

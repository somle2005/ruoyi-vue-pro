package com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.response.getSuitPromoDtail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderTypeInfo implements Serializable {
   private Integer venderType;

   @JsonProperty("venderType")
   public void setVenderType(Integer venderType) {
      this.venderType = venderType;
   }

   @JsonProperty("venderType")
   public Integer getVenderType() {
      return this.venderType;
   }
}

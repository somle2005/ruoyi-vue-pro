package com.jd.open.api.sdk.domain.hudong.CustomActivityResource.response.sign;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AgreementSignedRes implements Serializable {
   private String venderType;

   @JsonProperty("venderType")
   public void setVenderType(String venderType) {
      this.venderType = venderType;
   }

   @JsonProperty("venderType")
   public String getVenderType() {
      return this.venderType;
   }
}

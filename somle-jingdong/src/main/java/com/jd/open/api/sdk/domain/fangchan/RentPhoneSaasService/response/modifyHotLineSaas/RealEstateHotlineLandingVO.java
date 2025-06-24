package com.jd.open.api.sdk.domain.fangchan.RentPhoneSaasService.response.modifyHotLineSaas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RealEstateHotlineLandingVO implements Serializable {
   private String[] phoneLanding;
   private Integer[] type;

   @JsonProperty("phoneLanding")
   public void setPhoneLanding(String[] phoneLanding) {
      this.phoneLanding = phoneLanding;
   }

   @JsonProperty("phoneLanding")
   public String[] getPhoneLanding() {
      return this.phoneLanding;
   }

   @JsonProperty("type")
   public void setType(Integer[] type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer[] getType() {
      return this.type;
   }
}

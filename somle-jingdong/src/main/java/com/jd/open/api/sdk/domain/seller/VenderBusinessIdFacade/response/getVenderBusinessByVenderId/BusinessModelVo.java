package com.jd.open.api.sdk.domain.seller.VenderBusinessIdFacade.response.getVenderBusinessByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusinessModelVo implements Serializable {
   private String businessModelName;
   private String businessModelKey;

   @JsonProperty("businessModelName")
   public void setBusinessModelName(String businessModelName) {
      this.businessModelName = businessModelName;
   }

   @JsonProperty("businessModelName")
   public String getBusinessModelName() {
      return this.businessModelName;
   }

   @JsonProperty("businessModelKey")
   public void setBusinessModelKey(String businessModelKey) {
      this.businessModelKey = businessModelKey;
   }

   @JsonProperty("businessModelKey")
   public String getBusinessModelKey() {
      return this.businessModelKey;
   }
}

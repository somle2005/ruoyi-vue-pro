package com.jd.open.api.sdk.domain.seller.VenderBusinessIdFacade.response.getVenderBusinessByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BusinessValueVo implements Serializable {
   private String businessKeyName;
   private Integer businessValueType;
   private String businessValueName;

   @JsonProperty("businessKeyName")
   public void setBusinessKeyName(String businessKeyName) {
      this.businessKeyName = businessKeyName;
   }

   @JsonProperty("businessKeyName")
   public String getBusinessKeyName() {
      return this.businessKeyName;
   }

   @JsonProperty("businessValueType")
   public void setBusinessValueType(Integer businessValueType) {
      this.businessValueType = businessValueType;
   }

   @JsonProperty("businessValueType")
   public Integer getBusinessValueType() {
      return this.businessValueType;
   }

   @JsonProperty("businessValueName")
   public void setBusinessValueName(String businessValueName) {
      this.businessValueName = businessValueName;
   }

   @JsonProperty("businessValueName")
   public String getBusinessValueName() {
      return this.businessValueName;
   }
}

package com.jd.open.api.sdk.domain.afsservice.ServiceQueryProvider.response.queryServicePageSafe;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AfsSpecialPropertyExport implements Serializable {
   private String specialPropertyType;
   private String specialPropertyValue;
   private Long afsServiceId;

   @JsonProperty("specialPropertyType")
   public void setSpecialPropertyType(String specialPropertyType) {
      this.specialPropertyType = specialPropertyType;
   }

   @JsonProperty("specialPropertyType")
   public String getSpecialPropertyType() {
      return this.specialPropertyType;
   }

   @JsonProperty("specialPropertyValue")
   public void setSpecialPropertyValue(String specialPropertyValue) {
      this.specialPropertyValue = specialPropertyValue;
   }

   @JsonProperty("specialPropertyValue")
   public String getSpecialPropertyValue() {
      return this.specialPropertyValue;
   }

   @JsonProperty("afsServiceId")
   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   @JsonProperty("afsServiceId")
   public Long getAfsServiceId() {
      return this.afsServiceId;
   }
}

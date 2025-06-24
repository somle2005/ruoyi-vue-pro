package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PackageConsumableDto implements Serializable {
   private String packingCode;
   private String packingName;
   private Double packingNumber;

   @JsonProperty("packingCode")
   public void setPackingCode(String packingCode) {
      this.packingCode = packingCode;
   }

   @JsonProperty("packingCode")
   public String getPackingCode() {
      return this.packingCode;
   }

   @JsonProperty("packingName")
   public void setPackingName(String packingName) {
      this.packingName = packingName;
   }

   @JsonProperty("packingName")
   public String getPackingName() {
      return this.packingName;
   }

   @JsonProperty("packingNumber")
   public void setPackingNumber(Double packingNumber) {
      this.packingNumber = packingNumber;
   }

   @JsonProperty("packingNumber")
   public Double getPackingNumber() {
      return this.packingNumber;
   }
}

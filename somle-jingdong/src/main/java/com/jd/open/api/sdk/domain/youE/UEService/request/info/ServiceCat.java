package com.jd.open.api.sdk.domain.youE.UEService.request.info;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ServiceCat implements Serializable {
   private Integer serviceQty;
   private String secondLevelCat;
   private String firstLevelCat;
   private String thirdLevelCat;

   @JsonProperty("serviceQty")
   public void setServiceQty(Integer serviceQty) {
      this.serviceQty = serviceQty;
   }

   @JsonProperty("serviceQty")
   public Integer getServiceQty() {
      return this.serviceQty;
   }

   @JsonProperty("secondLevelCat")
   public void setSecondLevelCat(String secondLevelCat) {
      this.secondLevelCat = secondLevelCat;
   }

   @JsonProperty("secondLevelCat")
   public String getSecondLevelCat() {
      return this.secondLevelCat;
   }

   @JsonProperty("firstLevelCat")
   public void setFirstLevelCat(String firstLevelCat) {
      this.firstLevelCat = firstLevelCat;
   }

   @JsonProperty("firstLevelCat")
   public String getFirstLevelCat() {
      return this.firstLevelCat;
   }

   @JsonProperty("thirdLevelCat")
   public void setThirdLevelCat(String thirdLevelCat) {
      this.thirdLevelCat = thirdLevelCat;
   }

   @JsonProperty("thirdLevelCat")
   public String getThirdLevelCat() {
      return this.thirdLevelCat;
   }
}

package com.jd.open.api.sdk.domain.website.order;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CanBuyAddress {
   private Long id;
   private String name;
   private String isSupCOD;

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("is_sup_cod")
   public String getIsSupCOD() {
      return this.isSupCOD;
   }

   @JsonProperty("is_sup_cod")
   public void setIsSupCOD(String isSupCOD) {
      this.isSupCOD = isSupCOD;
   }
}

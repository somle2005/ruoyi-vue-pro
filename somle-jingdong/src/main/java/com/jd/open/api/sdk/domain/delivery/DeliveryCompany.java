package com.jd.open.api.sdk.domain.delivery;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("DeliveryCompany")
public class DeliveryCompany {
   private long id;
   private String name;
   private String description;

   @JsonProperty("id")
   public long getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(long id) {
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

   @JsonProperty("description")
   public String getDescription() {
      return this.description;
   }

   @JsonProperty("description")
   public void setDescription(String description) {
      this.description = description;
   }
}

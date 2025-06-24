package com.jd.open.api.sdk.domain.c2mdzkfpt.CarrierBaseInfoOpenService.response.queryRecommandCarriers;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CarrierBaseEnity implements Serializable {
   private String name;
   private Long id;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }
}

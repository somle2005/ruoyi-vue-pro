package com.jd.open.api.sdk.domain.alpha.AlphaJOSService.response.getVenderCarrier;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Carrier implements Serializable {
   private Integer id;
   private String name;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }
}

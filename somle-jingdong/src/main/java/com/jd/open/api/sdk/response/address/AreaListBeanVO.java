package com.jd.open.api.sdk.response.address;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AreaListBeanVO implements Serializable {
   private Long id;
   private String name;
   private String is3cod;
   private Boolean cod;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
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

   @JsonProperty("is3cod")
   public void setIs3cod(String is3cod) {
      this.is3cod = is3cod;
   }

   @JsonProperty("is3cod")
   public String getIs3cod() {
      return this.is3cod;
   }

   @JsonProperty("cod")
   public void setCod(Boolean cod) {
      this.cod = cod;
   }

   @JsonProperty("cod")
   public Boolean getCod() {
      return this.cod;
   }
}

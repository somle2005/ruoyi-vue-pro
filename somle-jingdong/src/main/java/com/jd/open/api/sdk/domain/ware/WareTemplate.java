package com.jd.open.api.sdk.domain.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WareTemplate implements Serializable {
   private Long id;
   private Long venderId;
   private String name;
   private String[] contents;

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("contents")
   public String[] getContents() {
      return this.contents;
   }

   @JsonProperty("contents")
   public void setContents(String[] contents) {
      this.contents = contents;
   }
}

package com.jd.open.api.sdk.domain.website.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttributeValue {
   private Long vid;
   private String name;

   @JsonProperty("vid")
   public Long getVid() {
      return this.vid;
   }

   @JsonProperty("vid")
   public void setVid(Long vid) {
      this.vid = vid;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }
}

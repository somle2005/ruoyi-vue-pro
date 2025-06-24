package com.jd.open.api.sdk.domain.website.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WareAttribute {
   private Long aid;
   private String name;
   private List<AttributeValue> attributeValues;

   @JsonProperty("aid")
   public Long getAid() {
      return this.aid;
   }

   @JsonProperty("aid")
   public void setAid(Long aid) {
      this.aid = aid;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("attribute_values")
   public List<AttributeValue> getAttributeValues() {
      return this.attributeValues;
   }

   @JsonProperty("attribute_values")
   public void setAttributeValues(List<AttributeValue> attributeValues) {
      this.attributeValues = attributeValues;
   }
}

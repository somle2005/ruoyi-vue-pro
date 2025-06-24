package com.jd.open.api.sdk.domain.wujiemiandan.WaybillReceiveOpenApi.request.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ValueAddedService implements Serializable {
   private String name;
   private List<ExtendAttributeDTO> attributes;
   private List<String> productCodes;
   private String value;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("attributes")
   public void setAttributes(List<ExtendAttributeDTO> attributes) {
      this.attributes = attributes;
   }

   @JsonProperty("attributes")
   public List<ExtendAttributeDTO> getAttributes() {
      return this.attributes;
   }

   @JsonProperty("productCodes")
   public void setProductCodes(List<String> productCodes) {
      this.productCodes = productCodes;
   }

   @JsonProperty("productCodes")
   public List<String> getProductCodes() {
      return this.productCodes;
   }

   @JsonProperty("value")
   public void setValue(String value) {
      this.value = value;
   }

   @JsonProperty("value")
   public String getValue() {
      return this.value;
   }
}

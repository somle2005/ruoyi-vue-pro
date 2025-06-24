package com.jd.open.api.sdk.domain.etms.CloudPrintApi.request.sheet;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CustomerPropertyRequest implements Serializable {
   private String customProperty;

   @JsonProperty("customProperty")
   public void setCustomProperty(String customProperty) {
      this.customProperty = customProperty;
   }

   @JsonProperty("customProperty")
   public String getCustomProperty() {
      return this.customProperty;
   }
}

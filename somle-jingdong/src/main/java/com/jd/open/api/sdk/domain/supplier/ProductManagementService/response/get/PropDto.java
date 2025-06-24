package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PropDto implements Serializable {
   private Integer id;
   private PropValueDto attrValues;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("attr_values")
   public void setAttrValues(PropValueDto attrValues) {
      this.attrValues = attrValues;
   }

   @JsonProperty("attr_values")
   public PropValueDto getAttrValues() {
      return this.attrValues;
   }
}

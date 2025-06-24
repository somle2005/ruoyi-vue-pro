package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class JosModelDto implements Serializable {
   private Boolean custom;
   private List<CategoryBrandSpuDto> models;

   @JsonProperty("custom")
   public void setCustom(Boolean custom) {
      this.custom = custom;
   }

   @JsonProperty("custom")
   public Boolean getCustom() {
      return this.custom;
   }

   @JsonProperty("models")
   public void setModels(List<CategoryBrandSpuDto> models) {
      this.models = models;
   }

   @JsonProperty("models")
   public List<CategoryBrandSpuDto> getModels() {
      return this.models;
   }
}

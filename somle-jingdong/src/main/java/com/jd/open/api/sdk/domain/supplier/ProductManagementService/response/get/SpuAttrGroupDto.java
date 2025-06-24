package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SpuAttrGroupDto implements Serializable {
   private Integer id;
   private Integer type;
   private List<PropDto> propAndExt;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("prop_and_ext")
   public void setPropAndExt(List<PropDto> propAndExt) {
      this.propAndExt = propAndExt;
   }

   @JsonProperty("prop_and_ext")
   public List<PropDto> getPropAndExt() {
      return this.propAndExt;
   }
}

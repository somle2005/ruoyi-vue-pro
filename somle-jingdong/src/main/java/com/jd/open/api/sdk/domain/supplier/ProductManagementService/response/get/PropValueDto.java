package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PropValueDto implements Serializable {
   private Integer propValueId;
   private String propValueName;
   private String vremark;
   private String unit;
   private Integer parentId;
   private List<String[]> units;

   @JsonProperty("prop_value_id")
   public void setPropValueId(Integer propValueId) {
      this.propValueId = propValueId;
   }

   @JsonProperty("prop_value_id")
   public Integer getPropValueId() {
      return this.propValueId;
   }

   @JsonProperty("prop_value_name")
   public void setPropValueName(String propValueName) {
      this.propValueName = propValueName;
   }

   @JsonProperty("prop_value_name")
   public String getPropValueName() {
      return this.propValueName;
   }

   @JsonProperty("vremark")
   public void setVremark(String vremark) {
      this.vremark = vremark;
   }

   @JsonProperty("vremark")
   public String getVremark() {
      return this.vremark;
   }

   @JsonProperty("unit")
   public void setUnit(String unit) {
      this.unit = unit;
   }

   @JsonProperty("unit")
   public String getUnit() {
      return this.unit;
   }

   @JsonProperty("parentId")
   public void setParentId(Integer parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Integer getParentId() {
      return this.parentId;
   }

   @JsonProperty("units")
   public void setUnits(List<String[]> units) {
      this.units = units;
   }

   @JsonProperty("units")
   public List<String[]> getUnits() {
      return this.units;
   }
}

package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PropValueDto implements Serializable {
   private Integer id;
   private Integer orderSort;
   private boolean selected;
   private String name;
   private String vremark;
   private List<String[]> units;
   private String unit;
   private Long parentId;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("order_sort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("order_sort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("selected")
   public void setSelected(boolean selected) {
      this.selected = selected;
   }

   @JsonProperty("selected")
   public boolean getSelected() {
      return this.selected;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("vremark")
   public void setVremark(String vremark) {
      this.vremark = vremark;
   }

   @JsonProperty("vremark")
   public String getVremark() {
      return this.vremark;
   }

   @JsonProperty("units")
   public void setUnits(List<String[]> units) {
      this.units = units;
   }

   @JsonProperty("units")
   public List<String[]> getUnits() {
      return this.units;
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
   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   @JsonProperty("parentId")
   public Long getParentId() {
      return this.parentId;
   }
}

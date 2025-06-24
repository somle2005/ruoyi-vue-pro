package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ExtPropValueDto implements Serializable {
   private Integer valueId;
   private Integer attId;
   private String valueName;
   private Integer type;
   private Integer yn;
   private String brandPrx;
   private Integer sort;
   private Integer gradeAvg;
   private String remarks;
   private Integer isRequired;
   private String aliasContent;
   private String vremark;
   private List<String[]> units;
   private String unit;
   private Long parentId;

   @JsonProperty("value_id")
   public void setValueId(Integer valueId) {
      this.valueId = valueId;
   }

   @JsonProperty("value_id")
   public Integer getValueId() {
      return this.valueId;
   }

   @JsonProperty("att_id")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("att_id")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("value_name")
   public void setValueName(String valueName) {
      this.valueName = valueName;
   }

   @JsonProperty("value_name")
   public String getValueName() {
      return this.valueName;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("brand_prx")
   public void setBrandPrx(String brandPrx) {
      this.brandPrx = brandPrx;
   }

   @JsonProperty("brand_prx")
   public String getBrandPrx() {
      return this.brandPrx;
   }

   @JsonProperty("sort")
   public void setSort(Integer sort) {
      this.sort = sort;
   }

   @JsonProperty("sort")
   public Integer getSort() {
      return this.sort;
   }

   @JsonProperty("grade_avg")
   public void setGradeAvg(Integer gradeAvg) {
      this.gradeAvg = gradeAvg;
   }

   @JsonProperty("grade_avg")
   public Integer getGradeAvg() {
      return this.gradeAvg;
   }

   @JsonProperty("remarks")
   public void setRemarks(String remarks) {
      this.remarks = remarks;
   }

   @JsonProperty("remarks")
   public String getRemarks() {
      return this.remarks;
   }

   @JsonProperty("is_required")
   public void setIsRequired(Integer isRequired) {
      this.isRequired = isRequired;
   }

   @JsonProperty("is_required")
   public Integer getIsRequired() {
      return this.isRequired;
   }

   @JsonProperty("alias_content")
   public void setAliasContent(String aliasContent) {
      this.aliasContent = aliasContent;
   }

   @JsonProperty("alias_content")
   public String getAliasContent() {
      return this.aliasContent;
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

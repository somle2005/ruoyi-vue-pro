package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ExtPropDtow implements Serializable {
   private Integer attId;
   private String name;
   private Integer cid;
   private Integer cataClass;
   private Integer type;
   private Integer orderSort;
   private Integer isRequired;
   private Integer isShield;
   private Integer isSearch;
   private Integer isKeyProperty;
   private Integer isCustom;
   private Integer isMultiSele;
   private Integer colNum;
   private Integer yn;
   private Integer groupId;
   private Integer inputType;
   private String attrAlias;
   private String valUnit;
   private String maintainRemark;
   private List<ExtPropValueDto> extPropValue;
   private Integer valCount;
   private Integer cascadeGroupId;
   private String cascadeGroupName;
   private Integer cascadeGroupLevel;
   private String inputAreaLevel;
   private List<ExtPropDtow> cascadePropList;
   private Integer originInputType;
   private Integer level;

   @JsonProperty("att_id")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("att_id")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("cid")
   public void setCid(Integer cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Integer getCid() {
      return this.cid;
   }

   @JsonProperty("cata_class")
   public void setCataClass(Integer cataClass) {
      this.cataClass = cataClass;
   }

   @JsonProperty("cata_class")
   public Integer getCataClass() {
      return this.cataClass;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }

   @JsonProperty("order_sort")
   public void setOrderSort(Integer orderSort) {
      this.orderSort = orderSort;
   }

   @JsonProperty("order_sort")
   public Integer getOrderSort() {
      return this.orderSort;
   }

   @JsonProperty("is_required")
   public void setIsRequired(Integer isRequired) {
      this.isRequired = isRequired;
   }

   @JsonProperty("is_required")
   public Integer getIsRequired() {
      return this.isRequired;
   }

   @JsonProperty("is_shield")
   public void setIsShield(Integer isShield) {
      this.isShield = isShield;
   }

   @JsonProperty("is_shield")
   public Integer getIsShield() {
      return this.isShield;
   }

   @JsonProperty("is_search")
   public void setIsSearch(Integer isSearch) {
      this.isSearch = isSearch;
   }

   @JsonProperty("is_search")
   public Integer getIsSearch() {
      return this.isSearch;
   }

   @JsonProperty("is_keyProperty")
   public void setIsKeyProperty(Integer isKeyProperty) {
      this.isKeyProperty = isKeyProperty;
   }

   @JsonProperty("is_keyProperty")
   public Integer getIsKeyProperty() {
      return this.isKeyProperty;
   }

   @JsonProperty("is_custom")
   public void setIsCustom(Integer isCustom) {
      this.isCustom = isCustom;
   }

   @JsonProperty("is_custom")
   public Integer getIsCustom() {
      return this.isCustom;
   }

   @JsonProperty("is_multiSele")
   public void setIsMultiSele(Integer isMultiSele) {
      this.isMultiSele = isMultiSele;
   }

   @JsonProperty("is_multiSele")
   public Integer getIsMultiSele() {
      return this.isMultiSele;
   }

   @JsonProperty("col_num")
   public void setColNum(Integer colNum) {
      this.colNum = colNum;
   }

   @JsonProperty("col_num")
   public Integer getColNum() {
      return this.colNum;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }

   @JsonProperty("group_id")
   public void setGroupId(Integer groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("group_id")
   public Integer getGroupId() {
      return this.groupId;
   }

   @JsonProperty("input_type")
   public void setInputType(Integer inputType) {
      this.inputType = inputType;
   }

   @JsonProperty("input_type")
   public Integer getInputType() {
      return this.inputType;
   }

   @JsonProperty("attr_alias")
   public void setAttrAlias(String attrAlias) {
      this.attrAlias = attrAlias;
   }

   @JsonProperty("attr_alias")
   public String getAttrAlias() {
      return this.attrAlias;
   }

   @JsonProperty("val_unit")
   public void setValUnit(String valUnit) {
      this.valUnit = valUnit;
   }

   @JsonProperty("val_unit")
   public String getValUnit() {
      return this.valUnit;
   }

   @JsonProperty("maintain_remark")
   public void setMaintainRemark(String maintainRemark) {
      this.maintainRemark = maintainRemark;
   }

   @JsonProperty("maintain_remark")
   public String getMaintainRemark() {
      return this.maintainRemark;
   }

   @JsonProperty("ext_prop_value")
   public void setExtPropValue(List<ExtPropValueDto> extPropValue) {
      this.extPropValue = extPropValue;
   }

   @JsonProperty("ext_prop_value")
   public List<ExtPropValueDto> getExtPropValue() {
      return this.extPropValue;
   }

   @JsonProperty("valCount")
   public void setValCount(Integer valCount) {
      this.valCount = valCount;
   }

   @JsonProperty("valCount")
   public Integer getValCount() {
      return this.valCount;
   }

   @JsonProperty("cascadeGroupId")
   public void setCascadeGroupId(Integer cascadeGroupId) {
      this.cascadeGroupId = cascadeGroupId;
   }

   @JsonProperty("cascadeGroupId")
   public Integer getCascadeGroupId() {
      return this.cascadeGroupId;
   }

   @JsonProperty("cascadeGroupName")
   public void setCascadeGroupName(String cascadeGroupName) {
      this.cascadeGroupName = cascadeGroupName;
   }

   @JsonProperty("cascadeGroupName")
   public String getCascadeGroupName() {
      return this.cascadeGroupName;
   }

   @JsonProperty("cascadeGroupLevel")
   public void setCascadeGroupLevel(Integer cascadeGroupLevel) {
      this.cascadeGroupLevel = cascadeGroupLevel;
   }

   @JsonProperty("cascadeGroupLevel")
   public Integer getCascadeGroupLevel() {
      return this.cascadeGroupLevel;
   }

   @JsonProperty("inputAreaLevel")
   public void setInputAreaLevel(String inputAreaLevel) {
      this.inputAreaLevel = inputAreaLevel;
   }

   @JsonProperty("inputAreaLevel")
   public String getInputAreaLevel() {
      return this.inputAreaLevel;
   }

   @JsonProperty("cascadePropList")
   public void setCascadePropList(List<ExtPropDtow> cascadePropList) {
      this.cascadePropList = cascadePropList;
   }

   @JsonProperty("cascadePropList")
   public List<ExtPropDtow> getCascadePropList() {
      return this.cascadePropList;
   }

   @JsonProperty("originInputType")
   public void setOriginInputType(Integer originInputType) {
      this.originInputType = originInputType;
   }

   @JsonProperty("originInputType")
   public Integer getOriginInputType() {
      return this.originInputType;
   }

   @JsonProperty("level")
   public void setLevel(Integer level) {
      this.level = level;
   }

   @JsonProperty("level")
   public Integer getLevel() {
      return this.level;
   }
}

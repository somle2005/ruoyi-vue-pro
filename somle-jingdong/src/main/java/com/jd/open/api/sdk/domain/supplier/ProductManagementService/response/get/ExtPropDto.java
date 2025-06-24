package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ExtPropDto implements Serializable {
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
   private List<ExtPropValueDto> values;

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

   @JsonProperty("is_key_property")
   public void setIsKeyProperty(Integer isKeyProperty) {
      this.isKeyProperty = isKeyProperty;
   }

   @JsonProperty("is_key_property")
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

   @JsonProperty("is_multi_sele")
   public void setIsMultiSele(Integer isMultiSele) {
      this.isMultiSele = isMultiSele;
   }

   @JsonProperty("is_multi_sele")
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

   @JsonProperty("values")
   public void setValues(List<ExtPropValueDto> values) {
      this.values = values;
   }

   @JsonProperty("values")
   public List<ExtPropValueDto> getValues() {
      return this.values;
   }
}

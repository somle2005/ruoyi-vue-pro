package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.find;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PropDto implements Serializable {
   private Integer id;
   private Integer orderSort;
   private String name;
   private boolean required;
   private Integer inputType;
   private String attrAlias;
   private String valUnit;
   private String maintainRemark;
   private String aliasContent;
   private Integer choosePurchase;
   private List<PropValueDto> values;
   private Integer valCount;
   private Integer cascadeGroupId;
   private String cascadeGroupName;
   private Integer cascadeGroupLevel;
   private String inputAreaLevel;
   private List<PropDto> cascadePropList;
   private Integer originInputType;
   private Integer level;

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

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("required")
   public void setRequired(boolean required) {
      this.required = required;
   }

   @JsonProperty("required")
   public boolean getRequired() {
      return this.required;
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

   @JsonProperty("alias_content")
   public void setAliasContent(String aliasContent) {
      this.aliasContent = aliasContent;
   }

   @JsonProperty("alias_content")
   public String getAliasContent() {
      return this.aliasContent;
   }

   @JsonProperty("choose_purchase")
   public void setChoosePurchase(Integer choosePurchase) {
      this.choosePurchase = choosePurchase;
   }

   @JsonProperty("choose_purchase")
   public Integer getChoosePurchase() {
      return this.choosePurchase;
   }

   @JsonProperty("values")
   public void setValues(List<PropValueDto> values) {
      this.values = values;
   }

   @JsonProperty("values")
   public List<PropValueDto> getValues() {
      return this.values;
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
   public void setCascadePropList(List<PropDto> cascadePropList) {
      this.cascadePropList = cascadePropList;
   }

   @JsonProperty("cascadePropList")
   public List<PropDto> getCascadePropList() {
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

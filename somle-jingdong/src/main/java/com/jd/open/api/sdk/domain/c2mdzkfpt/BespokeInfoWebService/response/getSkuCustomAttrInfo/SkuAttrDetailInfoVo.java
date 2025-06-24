package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuCustomAttrInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SkuAttrDetailInfoVo implements Serializable {
   private Integer id;
   private String name;
   private int type;
   private int order;
   private int componentAttrType;
   private Integer isReletedProp;
   private Integer required;
   private List<SkuAttrValueDetailInfoVo> values;

   @JsonProperty("id")
   public void setId(Integer id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("type")
   public void setType(int type) {
      this.type = type;
   }

   @JsonProperty("type")
   public int getType() {
      return this.type;
   }

   @JsonProperty("order")
   public void setOrder(int order) {
      this.order = order;
   }

   @JsonProperty("order")
   public int getOrder() {
      return this.order;
   }

   @JsonProperty("componentAttrType")
   public void setComponentAttrType(int componentAttrType) {
      this.componentAttrType = componentAttrType;
   }

   @JsonProperty("componentAttrType")
   public int getComponentAttrType() {
      return this.componentAttrType;
   }

   @JsonProperty("isReletedProp")
   public void setIsReletedProp(Integer isReletedProp) {
      this.isReletedProp = isReletedProp;
   }

   @JsonProperty("isReletedProp")
   public Integer getIsReletedProp() {
      return this.isReletedProp;
   }

   @JsonProperty("required")
   public void setRequired(Integer required) {
      this.required = required;
   }

   @JsonProperty("required")
   public Integer getRequired() {
      return this.required;
   }

   @JsonProperty("values")
   public void setValues(List<SkuAttrValueDetailInfoVo> values) {
      this.values = values;
   }

   @JsonProperty("values")
   public List<SkuAttrValueDetailInfoVo> getValues() {
      return this.values;
   }
}

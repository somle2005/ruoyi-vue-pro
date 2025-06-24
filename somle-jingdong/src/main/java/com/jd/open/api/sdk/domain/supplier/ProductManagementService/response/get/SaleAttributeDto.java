package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SaleAttributeDto implements Serializable {
   private Integer attrDim;
   private String attrValue;
   private Integer attrSeq;

   @JsonProperty("attr_dim")
   public void setAttrDim(Integer attrDim) {
      this.attrDim = attrDim;
   }

   @JsonProperty("attr_dim")
   public Integer getAttrDim() {
      return this.attrDim;
   }

   @JsonProperty("attr_value")
   public void setAttrValue(String attrValue) {
      this.attrValue = attrValue;
   }

   @JsonProperty("attr_value")
   public String getAttrValue() {
      return this.attrValue;
   }

   @JsonProperty("attr_seq")
   public void setAttrSeq(Integer attrSeq) {
      this.attrSeq = attrSeq;
   }

   @JsonProperty("attr_seq")
   public Integer getAttrSeq() {
      return this.attrSeq;
   }
}

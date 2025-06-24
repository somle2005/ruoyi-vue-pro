package com.jd.open.api.sdk.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class Prop {
   private String type = "com.jd.pop.ware.ic.api.domain.Prop";
   private String attrId;
   private String[] attrValues;
   private String[] attrValueAlias;
   private Integer index;
   private Integer[] attrValuesSeqNo;
   private String[] expands;
   private String[] units;

   @JsonProperty("@type")
   public String getType() {
      return this.type;
   }

   public String getAttrId() {
      return this.attrId;
   }

   public void setAttrId(String attrId) {
      this.attrId = attrId;
   }

   public String[] getAttrValues() {
      return this.attrValues;
   }

   public void setAttrValues(String[] attrValues) {
      this.attrValues = attrValues;
   }

   public String[] getAttrValueAlias() {
      return this.attrValueAlias;
   }

   public void setAttrValueAlias(String[] attrValueAlias) {
      this.attrValueAlias = attrValueAlias;
   }

   public Integer getIndex() {
      return this.index;
   }

   public void setIndex(Integer index) {
      this.index = index;
   }

   public Integer[] getAttrValuesSeqNo() {
      return this.attrValuesSeqNo;
   }

   public void setAttrValuesSeqNo(Integer[] attrValuesSeqNo) {
      this.attrValuesSeqNo = attrValuesSeqNo;
   }

   public String[] getExpands() {
      return this.expands;
   }

   public void setExpands(String[] expands) {
      this.expands = expands;
   }

   public String[] getUnits() {
      return this.units;
   }

   public void setUnits(String[] units) {
      this.units = units;
   }

   public String toString() {
      return "Prop [attrId=" + this.attrId + ", attrValues=" + Arrays.toString(this.attrValues) + ", attrValueAlias=" + Arrays.toString(this.attrValueAlias) + ", index=" + this.index + "]";
   }
}

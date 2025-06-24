package com.jd.open.api.sdk.domain.ware.WareReadService.response.searchWare4Valid;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Prop implements Serializable {
   private String attrId;
   private String[] attrValueAlias;
   private String[] attrValues;
   private String expands;
   private String units;

   @JsonProperty("attrId")
   public void setAttrId(String attrId) {
      this.attrId = attrId;
   }

   @JsonProperty("attrId")
   public String getAttrId() {
      return this.attrId;
   }

   @JsonProperty("attrValueAlias")
   public void setAttrValueAlias(String[] attrValueAlias) {
      this.attrValueAlias = attrValueAlias;
   }

   @JsonProperty("attrValueAlias")
   public String[] getAttrValueAlias() {
      return this.attrValueAlias;
   }

   @JsonProperty("attrValues")
   public void setAttrValues(String[] attrValues) {
      this.attrValues = attrValues;
   }

   @JsonProperty("attrValues")
   public String[] getAttrValues() {
      return this.attrValues;
   }

   @JsonProperty("expands")
   public void setExpands(String expands) {
      this.expands = expands;
   }

   @JsonProperty("expands")
   public String getExpands() {
      return this.expands;
   }

   @JsonProperty("units")
   public void setUnits(String units) {
      this.units = units;
   }

   @JsonProperty("units")
   public String getUnits() {
      return this.units;
   }
}

package com.jd.open.api.sdk.domain.ware.WareReadService.response.findWareById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Prop implements Serializable {
   private String attrId;
   private String[] attrValueAlias;
   private String[] attrValues;

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
}

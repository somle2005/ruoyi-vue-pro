package com.jd.open.api.sdk.domain.ware.CategoryAttrValueReadService.response.findSaleAttrValueTemplates;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SaleAttrValueTemplate implements Serializable {
   private Long attrId;
   private String valueRules;

   @JsonProperty("attrId")
   public void setAttrId(Long attrId) {
      this.attrId = attrId;
   }

   @JsonProperty("attrId")
   public Long getAttrId() {
      return this.attrId;
   }

   @JsonProperty("valueRules")
   public void setValueRules(String valueRules) {
      this.valueRules = valueRules;
   }

   @JsonProperty("valueRules")
   public String getValueRules() {
      return this.valueRules;
   }
}

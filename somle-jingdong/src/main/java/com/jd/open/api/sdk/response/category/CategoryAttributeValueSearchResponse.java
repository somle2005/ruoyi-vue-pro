package com.jd.open.api.sdk.response.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.category.AttValue;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryAttributeValueSearchResponse extends AbstractResponse {
   private int total;
   private List<AttValue> attValues;

   public int getTotal() {
      return this.total;
   }

   public void setTotal(int total) {
      this.total = total;
   }

   @JsonProperty("att_values")
   public List<AttValue> getAttValues() {
      return this.attValues;
   }

   @JsonProperty("att_values")
   public void setAttValues(List<AttValue> attValues) {
      this.attValues = attValues;
   }
}

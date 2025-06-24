package com.jd.open.api.sdk.domain.B2B.BWareSearchService.request.fx;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Sort implements Serializable {
   private String field;
   private String sortType;
   private String missing;

   @JsonProperty("field")
   public void setField(String field) {
      this.field = field;
   }

   @JsonProperty("field")
   public String getField() {
      return this.field;
   }

   @JsonProperty("sortType")
   public void setSortType(String sortType) {
      this.sortType = sortType;
   }

   @JsonProperty("sortType")
   public String getSortType() {
      return this.sortType;
   }

   @JsonProperty("missing")
   public void setMissing(String missing) {
      this.missing = missing;
   }

   @JsonProperty("missing")
   public String getMissing() {
      return this.missing;
   }
}

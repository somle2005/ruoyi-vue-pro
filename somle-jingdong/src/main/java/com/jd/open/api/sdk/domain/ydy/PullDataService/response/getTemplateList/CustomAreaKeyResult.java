package com.jd.open.api.sdk.domain.ydy.PullDataService.response.getTemplateList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class CustomAreaKeyResult implements Serializable {
   private String key;
   private String type;
   private String name;
   private List<ColumnDo> columns;

   @JsonProperty("key")
   public void setKey(String key) {
      this.key = key;
   }

   @JsonProperty("key")
   public String getKey() {
      return this.key;
   }

   @JsonProperty("type")
   public void setType(String type) {
      this.type = type;
   }

   @JsonProperty("type")
   public String getType() {
      return this.type;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("columns")
   public void setColumns(List<ColumnDo> columns) {
      this.columns = columns;
   }

   @JsonProperty("columns")
   public List<ColumnDo> getColumns() {
      return this.columns;
   }
}

package com.jd.open.api.sdk.domain.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Group {
   private int categoryId;
   private int id;
   private String name;
   private String status;
   private int index;

   @JsonProperty("cid")
   public int getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("cid")
   public void setCategoryId(int categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("group_id")
   public int getId() {
      return this.id;
   }

   @JsonProperty("group_id")
   public void setId(int id) {
      this.id = id;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("status")
   public String getStatus() {
      return this.status;
   }

   @JsonProperty("status")
   public void setStatus(String status) {
      this.status = status;
   }

   @JsonProperty("index_id")
   public int getIndex() {
      return this.index;
   }

   @JsonProperty("index_id")
   public void setIndex(int index) {
      this.index = index;
   }
}

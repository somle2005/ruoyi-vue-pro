package com.jd.open.api.sdk.domain.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
   private int id;
   private int fid;
   private String name;
   private int indexId;
   private String status;
   private int lev;
   private boolean isParent;

   @JsonProperty("is_parent")
   public boolean isParent() {
      return this.isParent;
   }

   @JsonProperty("is_parent")
   public void setParent(boolean parent) {
      this.isParent = parent;
   }

   @JsonProperty("id")
   public int getId() {
      return this.id;
   }

   @JsonProperty("id")
   public void setId(int id) {
      this.id = id;
   }

   @JsonProperty("fid")
   public int getFid() {
      return this.fid;
   }

   @JsonProperty("fid")
   public void setFid(int fid) {
      this.fid = fid;
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

   @JsonProperty("lev")
   public int getLev() {
      return this.lev;
   }

   @JsonProperty("lev")
   public void setLev(int lev) {
      this.lev = lev;
   }

   @JsonProperty("index_id")
   public int getIndexId() {
      return this.indexId;
   }

   @JsonProperty("index_id")
   public void setIndexId(int indexId) {
      this.indexId = indexId;
   }
}

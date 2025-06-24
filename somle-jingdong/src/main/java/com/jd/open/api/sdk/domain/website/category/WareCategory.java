package com.jd.open.api.sdk.domain.website.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WareCategory {
   private Long cid;
   private Long fid;
   private Long level;
   private String name;
   private Long index;
   private Long childLevel;

   @JsonProperty("cid")
   public Long getCid() {
      return this.cid;
   }

   @JsonProperty("cid")
   public void setCid(Long cid) {
      this.cid = cid;
   }

   @JsonProperty("fid")
   public Long getFid() {
      return this.fid;
   }

   @JsonProperty("fid")
   public void setFid(Long fid) {
      this.fid = fid;
   }

   @JsonProperty("level")
   public Long getLevel() {
      return this.level;
   }

   @JsonProperty("level")
   public void setLevel(Long level) {
      this.level = level;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("index")
   public Long getIndex() {
      return this.index;
   }

   @JsonProperty("index")
   public void setIndex(Long index) {
      this.index = index;
   }

   @JsonProperty("child_level")
   public Long getChildLevel() {
      return this.childLevel;
   }

   @JsonProperty("child_level")
   public void setChildLevel(Long childLevel) {
      this.childLevel = childLevel;
   }
}

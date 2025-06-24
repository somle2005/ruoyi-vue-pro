package com.jd.open.api.sdk.domain.category;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttValue {
   private long aid;
   private long vid;
   private String name;
   private String status;
   private long indexId;
   private String features;

   @JsonProperty("aid")
   public long getAid() {
      return this.aid;
   }

   @JsonProperty("aid")
   public void setAid(long aid) {
      this.aid = aid;
   }

   @JsonProperty("vid")
   public long getVid() {
      return this.vid;
   }

   @JsonProperty("vid")
   public void setVid(long vid) {
      this.vid = vid;
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
   public long getIndexId() {
      return this.indexId;
   }

   @JsonProperty("index_id")
   public void setIndexId(long indexId) {
      this.indexId = indexId;
   }

   @JsonProperty("features")
   public String getFeatures() {
      return this.features;
   }

   @JsonProperty("features")
   public void setFeatures(String features) {
      this.features = features;
   }
}

package com.jd.open.api.sdk.domain.list.CategoryReadService.response.findById;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class Category implements Serializable {
   private Long fid;
   private Long id;
   private Integer lev;
   private String name;
   private Integer order;
   private Set<Feature> features;

   @JsonProperty("fid")
   public void setFid(Long fid) {
      this.fid = fid;
   }

   @JsonProperty("fid")
   public Long getFid() {
      return this.fid;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("lev")
   public void setLev(Integer lev) {
      this.lev = lev;
   }

   @JsonProperty("lev")
   public Integer getLev() {
      return this.lev;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("order")
   public void setOrder(Integer order) {
      this.order = order;
   }

   @JsonProperty("order")
   public Integer getOrder() {
      return this.order;
   }

   @JsonProperty("features")
   public void setFeatures(Set<Feature> features) {
      this.features = features;
   }

   @JsonProperty("features")
   public Set<Feature> getFeatures() {
      return this.features;
   }
}

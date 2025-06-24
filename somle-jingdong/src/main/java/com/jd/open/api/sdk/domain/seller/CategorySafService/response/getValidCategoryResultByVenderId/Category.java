package com.jd.open.api.sdk.domain.seller.CategorySafService.response.getValidCategoryResultByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Category implements Serializable {
   private int id;
   private int fid;
   private String name;
   private String aliasName;
   private int status;
   private int indexId;
   private String logo;
   private String notes;
   private String features;
   private Date created;
   private Date modified;
   private int lev;
   private Map<String, String> featureMap;

   @JsonProperty("id")
   public void setId(int id) {
      this.id = id;
   }

   @JsonProperty("id")
   public int getId() {
      return this.id;
   }

   @JsonProperty("fid")
   public void setFid(int fid) {
      this.fid = fid;
   }

   @JsonProperty("fid")
   public int getFid() {
      return this.fid;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("aliasName")
   public void setAliasName(String aliasName) {
      this.aliasName = aliasName;
   }

   @JsonProperty("aliasName")
   public String getAliasName() {
      return this.aliasName;
   }

   @JsonProperty("status")
   public void setStatus(int status) {
      this.status = status;
   }

   @JsonProperty("status")
   public int getStatus() {
      return this.status;
   }

   @JsonProperty("indexId")
   public void setIndexId(int indexId) {
      this.indexId = indexId;
   }

   @JsonProperty("indexId")
   public int getIndexId() {
      return this.indexId;
   }

   @JsonProperty("logo")
   public void setLogo(String logo) {
      this.logo = logo;
   }

   @JsonProperty("logo")
   public String getLogo() {
      return this.logo;
   }

   @JsonProperty("notes")
   public void setNotes(String notes) {
      this.notes = notes;
   }

   @JsonProperty("notes")
   public String getNotes() {
      return this.notes;
   }

   @JsonProperty("features")
   public void setFeatures(String features) {
      this.features = features;
   }

   @JsonProperty("features")
   public String getFeatures() {
      return this.features;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date getModified() {
      return this.modified;
   }

   @JsonProperty("lev")
   public void setLev(int lev) {
      this.lev = lev;
   }

   @JsonProperty("lev")
   public int getLev() {
      return this.lev;
   }

   @JsonProperty("featureMap")
   public void setFeatureMap(Map<String, String> featureMap) {
      this.featureMap = featureMap;
   }

   @JsonProperty("featureMap")
   public Map<String, String> getFeatureMap() {
      return this.featureMap;
   }
}

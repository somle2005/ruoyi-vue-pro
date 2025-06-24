package com.jd.open.api.sdk.domain.EPT.WareApiClient.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class RecommendTempVO implements Serializable {
   private Integer[] id;
   private String[] name;
   private Integer[] status;
   private Date[] created;
   private Date[] modified;

   @JsonProperty("id")
   public void setId(Integer[] id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Integer[] getId() {
      return this.id;
   }

   @JsonProperty("name")
   public void setName(String[] name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String[] getName() {
      return this.name;
   }

   @JsonProperty("status")
   public void setStatus(Integer[] status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer[] getStatus() {
      return this.status;
   }

   @JsonProperty("created")
   public void setCreated(Date[] created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date[] getCreated() {
      return this.created;
   }

   @JsonProperty("modified")
   public void setModified(Date[] modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Date[] getModified() {
      return this.modified;
   }
}

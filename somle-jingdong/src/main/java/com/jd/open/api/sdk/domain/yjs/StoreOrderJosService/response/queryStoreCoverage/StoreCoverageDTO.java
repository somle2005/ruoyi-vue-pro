package com.jd.open.api.sdk.domain.yjs.StoreOrderJosService.response.queryStoreCoverage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreCoverageDTO implements Serializable {
   private Long venderId;
   private Integer mapType;
   private Long modified;
   private String vertexs;
   private String storeId;

   @JsonProperty("venderId")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("mapType")
   public void setMapType(Integer mapType) {
      this.mapType = mapType;
   }

   @JsonProperty("mapType")
   public Integer getMapType() {
      return this.mapType;
   }

   @JsonProperty("modified")
   public void setModified(Long modified) {
      this.modified = modified;
   }

   @JsonProperty("modified")
   public Long getModified() {
      return this.modified;
   }

   @JsonProperty("vertexs")
   public void setVertexs(String vertexs) {
      this.vertexs = vertexs;
   }

   @JsonProperty("vertexs")
   public String getVertexs() {
      return this.vertexs;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }
}

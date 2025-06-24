package com.jd.open.api.sdk.domain.c2mdzkfpt.SkuCustomServiceOpenApi.response.getServiceProjectInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ServiceCdInfo implements Serializable {
   private Long parent;
   private Integer level;
   private List<ServiceCdInfo> children;
   private Long serviceCdId;
   private String serviceCdName;

   @JsonProperty("parent")
   public void setParent(Long parent) {
      this.parent = parent;
   }

   @JsonProperty("parent")
   public Long getParent() {
      return this.parent;
   }

   @JsonProperty("level")
   public void setLevel(Integer level) {
      this.level = level;
   }

   @JsonProperty("level")
   public Integer getLevel() {
      return this.level;
   }

   @JsonProperty("children")
   public void setChildren(List<ServiceCdInfo> children) {
      this.children = children;
   }

   @JsonProperty("children")
   public List<ServiceCdInfo> getChildren() {
      return this.children;
   }

   @JsonProperty("serviceCdId")
   public void setServiceCdId(Long serviceCdId) {
      this.serviceCdId = serviceCdId;
   }

   @JsonProperty("serviceCdId")
   public Long getServiceCdId() {
      return this.serviceCdId;
   }

   @JsonProperty("serviceCdName")
   public void setServiceCdName(String serviceCdName) {
      this.serviceCdName = serviceCdName;
   }

   @JsonProperty("serviceCdName")
   public String getServiceCdName() {
      return this.serviceCdName;
   }
}

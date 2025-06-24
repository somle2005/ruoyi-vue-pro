package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AttributeGroup implements Serializable {
   private Integer groupId;
   private String name;
   private Integer cid;

   @JsonProperty("groupId")
   public void setGroupId(Integer groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public Integer getGroupId() {
      return this.groupId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("cid")
   public void setCid(Integer cid) {
      this.cid = cid;
   }

   @JsonProperty("cid")
   public Integer getCid() {
      return this.cid;
   }
}

package com.jd.open.api.sdk.domain.mall.ProductWrapService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Attribute implements Serializable {
   private Integer attId;
   private String attName;
   private Integer groupId;
   private Integer type;

   @JsonProperty("attId")
   public void setAttId(Integer attId) {
      this.attId = attId;
   }

   @JsonProperty("attId")
   public Integer getAttId() {
      return this.attId;
   }

   @JsonProperty("attName")
   public void setAttName(String attName) {
      this.attName = attName;
   }

   @JsonProperty("attName")
   public String getAttName() {
      return this.attName;
   }

   @JsonProperty("groupId")
   public void setGroupId(Integer groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public Integer getGroupId() {
      return this.groupId;
   }

   @JsonProperty("type")
   public void setType(Integer type) {
      this.type = type;
   }

   @JsonProperty("type")
   public Integer getType() {
      return this.type;
   }
}

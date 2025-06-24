package com.jd.open.api.sdk.domain.list.CategoryAttrReadService.response.findAttrsByCategoryIdJos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class CategoryAttrGroupJos implements Serializable {
   private Long groupId;
   private String groupName;
   private Integer attrGroupIndexId;
   private Set<FeatureCateAttrGroupJos> attrGroupfeatures;

   @JsonProperty("groupId")
   public void setGroupId(Long groupId) {
      this.groupId = groupId;
   }

   @JsonProperty("groupId")
   public Long getGroupId() {
      return this.groupId;
   }

   @JsonProperty("groupName")
   public void setGroupName(String groupName) {
      this.groupName = groupName;
   }

   @JsonProperty("groupName")
   public String getGroupName() {
      return this.groupName;
   }

   @JsonProperty("attrGroupIndexId")
   public void setAttrGroupIndexId(Integer attrGroupIndexId) {
      this.attrGroupIndexId = attrGroupIndexId;
   }

   @JsonProperty("attrGroupIndexId")
   public Integer getAttrGroupIndexId() {
      return this.attrGroupIndexId;
   }

   @JsonProperty("attrGroupfeatures")
   public void setAttrGroupfeatures(Set<FeatureCateAttrGroupJos> attrGroupfeatures) {
      this.attrGroupfeatures = attrGroupfeatures;
   }

   @JsonProperty("attrGroupfeatures")
   public Set<FeatureCateAttrGroupJos> getAttrGroupfeatures() {
      return this.attrGroupfeatures;
   }
}

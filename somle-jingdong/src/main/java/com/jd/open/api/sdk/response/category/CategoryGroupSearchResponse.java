package com.jd.open.api.sdk.response.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.category.Group;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.List;

public class CategoryGroupSearchResponse extends AbstractResponse {
   private List<Group> groups;

   @JsonProperty("groups")
   public List<Group> getGroups() {
      return this.groups;
   }

   @JsonProperty("groups")
   public void setGroups(List<Group> groups) {
      this.groups = groups;
   }
}

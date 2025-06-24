package com.jd.open.api.sdk.domain.list.CategoryFeatureReadService.request.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

public class GetCategoryFeatureByKeyRecursiveParam implements Serializable {
   private Set<String> featureKeys;
   private boolean containParent;
   private Integer categoryId;
   private ClientInfo clientInfo;

   @JsonProperty("featureKeys")
   public void setFeatureKeys(Set<String> featureKeys) {
      this.featureKeys = featureKeys;
   }

   @JsonProperty("featureKeys")
   public Set<String> getFeatureKeys() {
      return this.featureKeys;
   }

   @JsonProperty("containParent")
   public void setContainParent(boolean containParent) {
      this.containParent = containParent;
   }

   @JsonProperty("containParent")
   public boolean getContainParent() {
      return this.containParent;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }
}

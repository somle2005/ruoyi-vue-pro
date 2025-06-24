package com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.queryMetaAttrStoreQualificationList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StoreBaseInfoTO implements Serializable {
   private List<StoreQualificationInfoTo> storeQualificationList;
   private List<MetaAttrTO> metaAttrList;
   private Long categoryId;

   @JsonProperty("storeQualificationList")
   public void setStoreQualificationList(List<StoreQualificationInfoTo> storeQualificationList) {
      this.storeQualificationList = storeQualificationList;
   }

   @JsonProperty("storeQualificationList")
   public List<StoreQualificationInfoTo> getStoreQualificationList() {
      return this.storeQualificationList;
   }

   @JsonProperty("metaAttrList")
   public void setMetaAttrList(List<MetaAttrTO> metaAttrList) {
      this.metaAttrList = metaAttrList;
   }

   @JsonProperty("metaAttrList")
   public List<MetaAttrTO> getMetaAttrList() {
      return this.metaAttrList;
   }

   @JsonProperty("categoryId")
   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("categoryId")
   public Long getCategoryId() {
      return this.categoryId;
   }
}

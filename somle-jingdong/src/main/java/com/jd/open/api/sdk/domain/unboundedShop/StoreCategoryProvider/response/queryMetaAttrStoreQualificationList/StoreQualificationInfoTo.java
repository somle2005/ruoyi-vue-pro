package com.jd.open.api.sdk.domain.unboundedShop.StoreCategoryProvider.response.queryMetaAttrStoreQualificationList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class StoreQualificationInfoTo implements Serializable {
   private Long qualificationId;
   private String qualificationName;
   private Integer isAble;

   @JsonProperty("qualificationId")
   public void setQualificationId(Long qualificationId) {
      this.qualificationId = qualificationId;
   }

   @JsonProperty("qualificationId")
   public Long getQualificationId() {
      return this.qualificationId;
   }

   @JsonProperty("qualificationName")
   public void setQualificationName(String qualificationName) {
      this.qualificationName = qualificationName;
   }

   @JsonProperty("qualificationName")
   public String getQualificationName() {
      return this.qualificationName;
   }

   @JsonProperty("isAble")
   public void setIsAble(Integer isAble) {
      this.isAble = isAble;
   }

   @JsonProperty("isAble")
   public Integer getIsAble() {
      return this.isAble;
   }
}

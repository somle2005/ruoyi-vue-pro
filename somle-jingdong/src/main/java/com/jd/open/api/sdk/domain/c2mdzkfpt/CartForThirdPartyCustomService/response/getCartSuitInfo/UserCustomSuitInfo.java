package com.jd.open.api.sdk.domain.c2mdzkfpt.CartForThirdPartyCustomService.response.getCartSuitInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UserCustomSuitInfo implements Serializable {
   private String suitInfoId;
   private String mainSkuId;
   private Integer mainSkuCount;
   private Integer suitSkuType;
   private String suitType;
   private List<SuitProductChildVo> childSkuList;

   @JsonProperty("suitInfoId")
   public void setSuitInfoId(String suitInfoId) {
      this.suitInfoId = suitInfoId;
   }

   @JsonProperty("suitInfoId")
   public String getSuitInfoId() {
      return this.suitInfoId;
   }

   @JsonProperty("mainSkuId")
   public void setMainSkuId(String mainSkuId) {
      this.mainSkuId = mainSkuId;
   }

   @JsonProperty("mainSkuId")
   public String getMainSkuId() {
      return this.mainSkuId;
   }

   @JsonProperty("mainSkuCount")
   public void setMainSkuCount(Integer mainSkuCount) {
      this.mainSkuCount = mainSkuCount;
   }

   @JsonProperty("mainSkuCount")
   public Integer getMainSkuCount() {
      return this.mainSkuCount;
   }

   @JsonProperty("suitSkuType")
   public void setSuitSkuType(Integer suitSkuType) {
      this.suitSkuType = suitSkuType;
   }

   @JsonProperty("suitSkuType")
   public Integer getSuitSkuType() {
      return this.suitSkuType;
   }

   @JsonProperty("suitType")
   public void setSuitType(String suitType) {
      this.suitType = suitType;
   }

   @JsonProperty("suitType")
   public String getSuitType() {
      return this.suitType;
   }

   @JsonProperty("childSkuList")
   public void setChildSkuList(List<SuitProductChildVo> childSkuList) {
      this.childSkuList = childSkuList;
   }

   @JsonProperty("childSkuList")
   public List<SuitProductChildVo> getChildSkuList() {
      return this.childSkuList;
   }
}

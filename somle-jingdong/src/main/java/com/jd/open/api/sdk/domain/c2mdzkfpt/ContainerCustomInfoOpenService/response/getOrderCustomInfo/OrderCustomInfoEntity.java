package com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.response.getOrderCustomInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderCustomInfoEntity implements Serializable {
   private Long coId;
   private String customInfoStr;
   private List<OfwSuitPack> ofwSuitPackList;

   @JsonProperty("coId")
   public void setCoId(Long coId) {
      this.coId = coId;
   }

   @JsonProperty("coId")
   public Long getCoId() {
      return this.coId;
   }

   @JsonProperty("customInfoStr")
   public void setCustomInfoStr(String customInfoStr) {
      this.customInfoStr = customInfoStr;
   }

   @JsonProperty("customInfoStr")
   public String getCustomInfoStr() {
      return this.customInfoStr;
   }

   @JsonProperty("ofwSuitPackList")
   public void setOfwSuitPackList(List<OfwSuitPack> ofwSuitPackList) {
      this.ofwSuitPackList = ofwSuitPackList;
   }

   @JsonProperty("ofwSuitPackList")
   public List<OfwSuitPack> getOfwSuitPackList() {
      return this.ofwSuitPackList;
   }
}

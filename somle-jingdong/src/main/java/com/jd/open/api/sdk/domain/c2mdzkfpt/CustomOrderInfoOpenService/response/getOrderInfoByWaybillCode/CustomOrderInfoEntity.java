package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderInfoByWaybillCode;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CustomOrderInfoEntity implements Serializable {
   private Long orderId;
   private Map<String, String> customOrderInfos;
   private List<OfwSuitPack> ofwSuitPackList;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("customOrderInfos")
   public void setCustomOrderInfos(Map<String, String> customOrderInfos) {
      this.customOrderInfos = customOrderInfos;
   }

   @JsonProperty("customOrderInfos")
   public Map<String, String> getCustomOrderInfos() {
      return this.customOrderInfos;
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

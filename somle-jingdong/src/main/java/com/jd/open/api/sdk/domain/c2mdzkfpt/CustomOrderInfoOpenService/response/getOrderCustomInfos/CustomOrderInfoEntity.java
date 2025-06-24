package com.jd.open.api.sdk.domain.c2mdzkfpt.CustomOrderInfoOpenService.response.getOrderCustomInfos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CustomOrderInfoEntity implements Serializable {
   private Long orderId;
   private Map<String, Object> customOrderInfos;
   private Integer orderState;
   private String orderStateName;
   private Date mtime;
   private String orderCreateDate;
   private Integer orderYn;
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
   public void setCustomOrderInfos(Map<String, Object> customOrderInfos) {
      this.customOrderInfos = customOrderInfos;
   }

   @JsonProperty("customOrderInfos")
   public Map<String, Object> getCustomOrderInfos() {
      return this.customOrderInfos;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("orderStateName")
   public void setOrderStateName(String orderStateName) {
      this.orderStateName = orderStateName;
   }

   @JsonProperty("orderStateName")
   public String getOrderStateName() {
      return this.orderStateName;
   }

   @JsonProperty("mtime")
   public void setMtime(Date mtime) {
      this.mtime = mtime;
   }

   @JsonProperty("mtime")
   public Date getMtime() {
      return this.mtime;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(String orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public String getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("orderYn")
   public void setOrderYn(Integer orderYn) {
      this.orderYn = orderYn;
   }

   @JsonProperty("orderYn")
   public Integer getOrderYn() {
      return this.orderYn;
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

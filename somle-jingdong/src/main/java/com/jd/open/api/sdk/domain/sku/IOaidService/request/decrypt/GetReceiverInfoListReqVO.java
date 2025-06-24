package com.jd.open.api.sdk.domain.sku.IOaidService.request.decrypt;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class GetReceiverInfoListReqVO implements Serializable {
   private String orderType;
   private String appName;
   private Map<String, Object> extendProps;
   private Set<OrderInfoReqVO> orderInfos;
   private Integer expiration;
   private String region;
   private String scenesType;

   @JsonProperty("orderType")
   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   @JsonProperty("orderType")
   public String getOrderType() {
      return this.orderType;
   }

   @JsonProperty("appName")
   public void setAppName(String appName) {
      this.appName = appName;
   }

   @JsonProperty("appName")
   public String getAppName() {
      return this.appName;
   }

   @JsonProperty("extendProps")
   public void setExtendProps(Map<String, Object> extendProps) {
      this.extendProps = extendProps;
   }

   @JsonProperty("extendProps")
   public Map<String, Object> getExtendProps() {
      return this.extendProps;
   }

   @JsonProperty("orderInfos")
   public void setOrderInfos(Set<OrderInfoReqVO> orderInfos) {
      this.orderInfos = orderInfos;
   }

   @JsonProperty("orderInfos")
   public Set<OrderInfoReqVO> getOrderInfos() {
      return this.orderInfos;
   }

   @JsonProperty("expiration")
   public void setExpiration(Integer expiration) {
      this.expiration = expiration;
   }

   @JsonProperty("expiration")
   public Integer getExpiration() {
      return this.expiration;
   }

   @JsonProperty("region")
   public void setRegion(String region) {
      this.region = region;
   }

   @JsonProperty("region")
   public String getRegion() {
      return this.region;
   }

   @JsonProperty("scenesType")
   public void setScenesType(String scenesType) {
      this.scenesType = scenesType;
   }

   @JsonProperty("scenesType")
   public String getScenesType() {
      return this.scenesType;
   }
}

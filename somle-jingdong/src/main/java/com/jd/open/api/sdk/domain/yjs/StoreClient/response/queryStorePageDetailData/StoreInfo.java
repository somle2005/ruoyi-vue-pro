package com.jd.open.api.sdk.domain.yjs.StoreClient.response.queryStorePageDetailData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StoreInfo implements Serializable {
   private String storeDetailUrl;
   private String freightText;
   private String agingText;
   private String venderId;
   private String deliveryModeText;
   private String storeName;
   private String storeId;
   private String initialDeliveryPriceText;
   private List<String> storeTagList;
   private Double grade;
   private String hitFence;
   private String distributionAging;

   @JsonProperty("storeDetailUrl")
   public void setStoreDetailUrl(String storeDetailUrl) {
      this.storeDetailUrl = storeDetailUrl;
   }

   @JsonProperty("storeDetailUrl")
   public String getStoreDetailUrl() {
      return this.storeDetailUrl;
   }

   @JsonProperty("freightText")
   public void setFreightText(String freightText) {
      this.freightText = freightText;
   }

   @JsonProperty("freightText")
   public String getFreightText() {
      return this.freightText;
   }

   @JsonProperty("agingText")
   public void setAgingText(String agingText) {
      this.agingText = agingText;
   }

   @JsonProperty("agingText")
   public String getAgingText() {
      return this.agingText;
   }

   @JsonProperty("venderId")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("deliveryModeText")
   public void setDeliveryModeText(String deliveryModeText) {
      this.deliveryModeText = deliveryModeText;
   }

   @JsonProperty("deliveryModeText")
   public String getDeliveryModeText() {
      return this.deliveryModeText;
   }

   @JsonProperty("storeName")
   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   @JsonProperty("storeName")
   public String getStoreName() {
      return this.storeName;
   }

   @JsonProperty("storeId")
   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   @JsonProperty("storeId")
   public String getStoreId() {
      return this.storeId;
   }

   @JsonProperty("initialDeliveryPriceText")
   public void setInitialDeliveryPriceText(String initialDeliveryPriceText) {
      this.initialDeliveryPriceText = initialDeliveryPriceText;
   }

   @JsonProperty("initialDeliveryPriceText")
   public String getInitialDeliveryPriceText() {
      return this.initialDeliveryPriceText;
   }

   @JsonProperty("storeTagList")
   public void setStoreTagList(List<String> storeTagList) {
      this.storeTagList = storeTagList;
   }

   @JsonProperty("storeTagList")
   public List<String> getStoreTagList() {
      return this.storeTagList;
   }

   @JsonProperty("grade")
   public void setGrade(Double grade) {
      this.grade = grade;
   }

   @JsonProperty("grade")
   public Double getGrade() {
      return this.grade;
   }

   @JsonProperty("hitFence")
   public void setHitFence(String hitFence) {
      this.hitFence = hitFence;
   }

   @JsonProperty("hitFence")
   public String getHitFence() {
      return this.hitFence;
   }

   @JsonProperty("distributionAging")
   public void setDistributionAging(String distributionAging) {
      this.distributionAging = distributionAging;
   }

   @JsonProperty("distributionAging")
   public String getDistributionAging() {
      return this.distributionAging;
   }
}

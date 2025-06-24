package com.jd.open.api.sdk.domain.ware.WareOptimizeService.request.wareInfoCheckOptimize;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class MarketingInfo implements Serializable {
   private Long skuPrimaryClassificationId;
   private Long skuSecondaryClassificationId;
   private Long skuMarketingId;
   private String skuPrimaryClassificationName;
   private String skuSecondaryClassificationName;
   private String skuMarketingName;
   private Long primaryClassificationId;
   private String primaryClassificationName;
   private String name;
   private Long secondaryClassificationId;
   private Long id;
   private String secondaryClassificationName;

   @JsonProperty("skuPrimaryClassificationId")
   public void setSkuPrimaryClassificationId(Long skuPrimaryClassificationId) {
      this.skuPrimaryClassificationId = skuPrimaryClassificationId;
   }

   @JsonProperty("skuPrimaryClassificationId")
   public Long getSkuPrimaryClassificationId() {
      return this.skuPrimaryClassificationId;
   }

   @JsonProperty("skuSecondaryClassificationId")
   public void setSkuSecondaryClassificationId(Long skuSecondaryClassificationId) {
      this.skuSecondaryClassificationId = skuSecondaryClassificationId;
   }

   @JsonProperty("skuSecondaryClassificationId")
   public Long getSkuSecondaryClassificationId() {
      return this.skuSecondaryClassificationId;
   }

   @JsonProperty("skuMarketingId")
   public void setSkuMarketingId(Long skuMarketingId) {
      this.skuMarketingId = skuMarketingId;
   }

   @JsonProperty("skuMarketingId")
   public Long getSkuMarketingId() {
      return this.skuMarketingId;
   }

   @JsonProperty("skuPrimaryClassificationName")
   public void setSkuPrimaryClassificationName(String skuPrimaryClassificationName) {
      this.skuPrimaryClassificationName = skuPrimaryClassificationName;
   }

   @JsonProperty("skuPrimaryClassificationName")
   public String getSkuPrimaryClassificationName() {
      return this.skuPrimaryClassificationName;
   }

   @JsonProperty("skuSecondaryClassificationName")
   public void setSkuSecondaryClassificationName(String skuSecondaryClassificationName) {
      this.skuSecondaryClassificationName = skuSecondaryClassificationName;
   }

   @JsonProperty("skuSecondaryClassificationName")
   public String getSkuSecondaryClassificationName() {
      return this.skuSecondaryClassificationName;
   }

   @JsonProperty("skuMarketingName")
   public void setSkuMarketingName(String skuMarketingName) {
      this.skuMarketingName = skuMarketingName;
   }

   @JsonProperty("skuMarketingName")
   public String getSkuMarketingName() {
      return this.skuMarketingName;
   }

   @JsonProperty("primaryClassificationId")
   public void setPrimaryClassificationId(Long primaryClassificationId) {
      this.primaryClassificationId = primaryClassificationId;
   }

   @JsonProperty("primaryClassificationId")
   public Long getPrimaryClassificationId() {
      return this.primaryClassificationId;
   }

   @JsonProperty("primaryClassificationName")
   public void setPrimaryClassificationName(String primaryClassificationName) {
      this.primaryClassificationName = primaryClassificationName;
   }

   @JsonProperty("primaryClassificationName")
   public String getPrimaryClassificationName() {
      return this.primaryClassificationName;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("secondaryClassificationId")
   public void setSecondaryClassificationId(Long secondaryClassificationId) {
      this.secondaryClassificationId = secondaryClassificationId;
   }

   @JsonProperty("secondaryClassificationId")
   public Long getSecondaryClassificationId() {
      return this.secondaryClassificationId;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("secondaryClassificationName")
   public void setSecondaryClassificationName(String secondaryClassificationName) {
      this.secondaryClassificationName = secondaryClassificationName;
   }

   @JsonProperty("secondaryClassificationName")
   public String getSecondaryClassificationName() {
      return this.secondaryClassificationName;
   }
}

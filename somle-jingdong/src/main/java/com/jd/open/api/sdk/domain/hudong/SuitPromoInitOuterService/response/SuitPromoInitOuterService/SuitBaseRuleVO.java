package com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.response.SuitPromoInitOuterService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SuitBaseRuleVO implements Serializable {
   private ElementConfig limitNumEnable;
   private ElementConfig promoType;
   private Integer normalSkuNumLimit;
   private Boolean xnzt;
   private String helpUrl;
   private ElementConfig title;
   private Integer suitpoolSpuNumLimit;
   private ElementConfig storeRange;
   private Integer suitpoolSkuNumLimit;
   private Integer maxEndDelay;
   private Boolean storeAuth;
   private ElementConfig maxDuration;
   private Boolean yddmEnable;

   @JsonProperty("limitNumEnable")
   public void setLimitNumEnable(ElementConfig limitNumEnable) {
      this.limitNumEnable = limitNumEnable;
   }

   @JsonProperty("limitNumEnable")
   public ElementConfig getLimitNumEnable() {
      return this.limitNumEnable;
   }

   @JsonProperty("promoType")
   public void setPromoType(ElementConfig promoType) {
      this.promoType = promoType;
   }

   @JsonProperty("promoType")
   public ElementConfig getPromoType() {
      return this.promoType;
   }

   @JsonProperty("normalSkuNumLimit")
   public void setNormalSkuNumLimit(Integer normalSkuNumLimit) {
      this.normalSkuNumLimit = normalSkuNumLimit;
   }

   @JsonProperty("normalSkuNumLimit")
   public Integer getNormalSkuNumLimit() {
      return this.normalSkuNumLimit;
   }

   @JsonProperty("xnzt")
   public void setXnzt(Boolean xnzt) {
      this.xnzt = xnzt;
   }

   @JsonProperty("xnzt")
   public Boolean getXnzt() {
      return this.xnzt;
   }

   @JsonProperty("helpUrl")
   public void setHelpUrl(String helpUrl) {
      this.helpUrl = helpUrl;
   }

   @JsonProperty("helpUrl")
   public String getHelpUrl() {
      return this.helpUrl;
   }

   @JsonProperty("title")
   public void setTitle(ElementConfig title) {
      this.title = title;
   }

   @JsonProperty("title")
   public ElementConfig getTitle() {
      return this.title;
   }

   @JsonProperty("suitpoolSpuNumLimit")
   public void setSuitpoolSpuNumLimit(Integer suitpoolSpuNumLimit) {
      this.suitpoolSpuNumLimit = suitpoolSpuNumLimit;
   }

   @JsonProperty("suitpoolSpuNumLimit")
   public Integer getSuitpoolSpuNumLimit() {
      return this.suitpoolSpuNumLimit;
   }

   @JsonProperty("storeRange")
   public void setStoreRange(ElementConfig storeRange) {
      this.storeRange = storeRange;
   }

   @JsonProperty("storeRange")
   public ElementConfig getStoreRange() {
      return this.storeRange;
   }

   @JsonProperty("suitpoolSkuNumLimit")
   public void setSuitpoolSkuNumLimit(Integer suitpoolSkuNumLimit) {
      this.suitpoolSkuNumLimit = suitpoolSkuNumLimit;
   }

   @JsonProperty("suitpoolSkuNumLimit")
   public Integer getSuitpoolSkuNumLimit() {
      return this.suitpoolSkuNumLimit;
   }

   @JsonProperty("maxEndDelay")
   public void setMaxEndDelay(Integer maxEndDelay) {
      this.maxEndDelay = maxEndDelay;
   }

   @JsonProperty("maxEndDelay")
   public Integer getMaxEndDelay() {
      return this.maxEndDelay;
   }

   @JsonProperty("storeAuth")
   public void setStoreAuth(Boolean storeAuth) {
      this.storeAuth = storeAuth;
   }

   @JsonProperty("storeAuth")
   public Boolean getStoreAuth() {
      return this.storeAuth;
   }

   @JsonProperty("maxDuration")
   public void setMaxDuration(ElementConfig maxDuration) {
      this.maxDuration = maxDuration;
   }

   @JsonProperty("maxDuration")
   public ElementConfig getMaxDuration() {
      return this.maxDuration;
   }

   @JsonProperty("yddmEnable")
   public void setYddmEnable(Boolean yddmEnable) {
      this.yddmEnable = yddmEnable;
   }

   @JsonProperty("yddmEnable")
   public Boolean getYddmEnable() {
      return this.yddmEnable;
   }
}

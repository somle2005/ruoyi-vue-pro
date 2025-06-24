package com.jd.open.api.sdk.domain.seller.OrderPromoFullCouponService.request.createFullCoupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OpenOrderPromoInfo implements Serializable {
   private String appKey;
   private String name;
   private String startTime;
   private String endTime;
   private String link;
   private List<Long> skuIds;
   private String busiCode;
   private OpenBusiPlatformCreateModelInfo busiPlatform;
   private OpenMemberCreateModelInfo member;
   private List<OpenOrderModeInfo> orderModes;

   @JsonProperty("appKey")
   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   @JsonProperty("appKey")
   public String getAppKey() {
      return this.appKey;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("link")
   public void setLink(String link) {
      this.link = link;
   }

   @JsonProperty("link")
   public String getLink() {
      return this.link;
   }

   @JsonProperty("skuIds")
   public void setSkuIds(List<Long> skuIds) {
      this.skuIds = skuIds;
   }

   @JsonProperty("skuIds")
   public List<Long> getSkuIds() {
      return this.skuIds;
   }

   @JsonProperty("busiCode")
   public void setBusiCode(String busiCode) {
      this.busiCode = busiCode;
   }

   @JsonProperty("busiCode")
   public String getBusiCode() {
      return this.busiCode;
   }

   @JsonProperty("busiPlatform")
   public void setBusiPlatform(OpenBusiPlatformCreateModelInfo busiPlatform) {
      this.busiPlatform = busiPlatform;
   }

   @JsonProperty("busiPlatform")
   public OpenBusiPlatformCreateModelInfo getBusiPlatform() {
      return this.busiPlatform;
   }

   @JsonProperty("member")
   public void setMember(OpenMemberCreateModelInfo member) {
      this.member = member;
   }

   @JsonProperty("member")
   public OpenMemberCreateModelInfo getMember() {
      return this.member;
   }

   @JsonProperty("orderModes")
   public void setOrderModes(List<OpenOrderModeInfo> orderModes) {
      this.orderModes = orderModes;
   }

   @JsonProperty("orderModes")
   public List<OpenOrderModeInfo> getOrderModes() {
      return this.orderModes;
   }
}

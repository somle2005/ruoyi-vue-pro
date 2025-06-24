package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.response.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ApplyDetail implements Serializable {
   private Integer applyDetailId;
   private Long skuId;
   private String wareName;
   private Integer wareType;
   private String wareTypeName;
   private String wareDescribe;
   private Integer skuType;
   private String skuTypeName;
   private String skuUuid;
   private String extJsonStr;
   private Long applyDetailIdLong;

   @JsonProperty("applyDetailId")
   public void setApplyDetailId(Integer applyDetailId) {
      this.applyDetailId = applyDetailId;
   }

   @JsonProperty("applyDetailId")
   public Integer getApplyDetailId() {
      return this.applyDetailId;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("wareName")
   public void setWareName(String wareName) {
      this.wareName = wareName;
   }

   @JsonProperty("wareName")
   public String getWareName() {
      return this.wareName;
   }

   @JsonProperty("wareType")
   public void setWareType(Integer wareType) {
      this.wareType = wareType;
   }

   @JsonProperty("wareType")
   public Integer getWareType() {
      return this.wareType;
   }

   @JsonProperty("wareTypeName")
   public void setWareTypeName(String wareTypeName) {
      this.wareTypeName = wareTypeName;
   }

   @JsonProperty("wareTypeName")
   public String getWareTypeName() {
      return this.wareTypeName;
   }

   @JsonProperty("wareDescribe")
   public void setWareDescribe(String wareDescribe) {
      this.wareDescribe = wareDescribe;
   }

   @JsonProperty("wareDescribe")
   public String getWareDescribe() {
      return this.wareDescribe;
   }

   @JsonProperty("skuType")
   public void setSkuType(Integer skuType) {
      this.skuType = skuType;
   }

   @JsonProperty("skuType")
   public Integer getSkuType() {
      return this.skuType;
   }

   @JsonProperty("skuTypeName")
   public void setSkuTypeName(String skuTypeName) {
      this.skuTypeName = skuTypeName;
   }

   @JsonProperty("skuTypeName")
   public String getSkuTypeName() {
      return this.skuTypeName;
   }

   @JsonProperty("skuUuid")
   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   @JsonProperty("skuUuid")
   public String getSkuUuid() {
      return this.skuUuid;
   }

   @JsonProperty("extJsonStr")
   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   @JsonProperty("extJsonStr")
   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   @JsonProperty("applyDetailIdLong")
   public void setApplyDetailIdLong(Long applyDetailIdLong) {
      this.applyDetailIdLong = applyDetailIdLong;
   }

   @JsonProperty("applyDetailIdLong")
   public Long getApplyDetailIdLong() {
      return this.applyDetailIdLong;
   }
}

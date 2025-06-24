package com.jd.open.api.sdk.domain.shangjiashouhou.ReceiveQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ReceiveWare implements Serializable {
   private Long skuId;
   private String wareName;
   private Integer wareType;
   private String wareTypeName;
   private Integer skuType;
   private String skuTypeName;
   private String skuUuid;
   private Integer wareNum;
   private String partCode;

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

   @JsonProperty("wareNum")
   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Integer getWareNum() {
      return this.wareNum;
   }

   @JsonProperty("partCode")
   public void setPartCode(String partCode) {
      this.partCode = partCode;
   }

   @JsonProperty("partCode")
   public String getPartCode() {
      return this.partCode;
   }
}

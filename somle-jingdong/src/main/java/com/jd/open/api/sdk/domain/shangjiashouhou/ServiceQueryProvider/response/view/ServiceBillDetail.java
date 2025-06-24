package com.jd.open.api.sdk.domain.shangjiashouhou.ServiceQueryProvider.response.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class ServiceBillDetail implements Serializable {
   private Long serviceDetailId;
   private Long skuId;
   private String wareName;
   private String wareBrand;
   private Integer wareType;
   private String wareTypeName;
   private String wareDescribe;
   private BigDecimal payPrice;
   private BigDecimal actualPayPrice;
   private Integer wareCid1;
   private Integer wareCid2;
   private Integer wareCid3;
   private Integer skuType;
   private String skuTypeName;
   private String skuUuid;
   private String extJsonStr;
   private Integer wareNum;
   private Long serviceDetailIdLong;

   @JsonProperty("serviceDetailId")
   public void setServiceDetailId(Long serviceDetailId) {
      this.serviceDetailId = serviceDetailId;
   }

   @JsonProperty("serviceDetailId")
   public Long getServiceDetailId() {
      return this.serviceDetailId;
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

   @JsonProperty("wareBrand")
   public void setWareBrand(String wareBrand) {
      this.wareBrand = wareBrand;
   }

   @JsonProperty("wareBrand")
   public String getWareBrand() {
      return this.wareBrand;
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

   @JsonProperty("payPrice")
   public void setPayPrice(BigDecimal payPrice) {
      this.payPrice = payPrice;
   }

   @JsonProperty("payPrice")
   public BigDecimal getPayPrice() {
      return this.payPrice;
   }

   @JsonProperty("actualPayPrice")
   public void setActualPayPrice(BigDecimal actualPayPrice) {
      this.actualPayPrice = actualPayPrice;
   }

   @JsonProperty("actualPayPrice")
   public BigDecimal getActualPayPrice() {
      return this.actualPayPrice;
   }

   @JsonProperty("wareCid1")
   public void setWareCid1(Integer wareCid1) {
      this.wareCid1 = wareCid1;
   }

   @JsonProperty("wareCid1")
   public Integer getWareCid1() {
      return this.wareCid1;
   }

   @JsonProperty("wareCid2")
   public void setWareCid2(Integer wareCid2) {
      this.wareCid2 = wareCid2;
   }

   @JsonProperty("wareCid2")
   public Integer getWareCid2() {
      return this.wareCid2;
   }

   @JsonProperty("wareCid3")
   public void setWareCid3(Integer wareCid3) {
      this.wareCid3 = wareCid3;
   }

   @JsonProperty("wareCid3")
   public Integer getWareCid3() {
      return this.wareCid3;
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

   @JsonProperty("wareNum")
   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   @JsonProperty("wareNum")
   public Integer getWareNum() {
      return this.wareNum;
   }

   @JsonProperty("serviceDetailIdLong")
   public void setServiceDetailIdLong(Long serviceDetailIdLong) {
      this.serviceDetailIdLong = serviceDetailIdLong;
   }

   @JsonProperty("serviceDetailIdLong")
   public Long getServiceDetailIdLong() {
      return this.serviceDetailIdLong;
   }
}

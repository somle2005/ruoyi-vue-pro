package com.jd.open.api.sdk.domain.c2mdzkfpt.BespokeInfoWebService.response.getSkuCustomAttrInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SkuAttrInfoVo implements Serializable {
   private String num;
   private String skuId;
   private Integer lowestBuy;
   private String modelld;
   private String designer;
   private int measurementServiceAtYourDoor;
   private BigDecimal toBMinPrice;
   private List<SkuAttrDetailInfoVo> attrs;
   private Integer supportToB;
   private int customStatus;
   private Integer toBMinCount;
   private Integer supportStagePrice;
   private BigDecimal SkuPrice;
   private Integer priceMode;
   private int attrRelationFlag;
   private List<Object> canvasAttrs;

   @JsonProperty("num")
   public void setNum(String num) {
      this.num = num;
   }

   @JsonProperty("num")
   public String getNum() {
      return this.num;
   }

   @JsonProperty("skuId")
   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public String getSkuId() {
      return this.skuId;
   }

   @JsonProperty("lowestBuy")
   public void setLowestBuy(Integer lowestBuy) {
      this.lowestBuy = lowestBuy;
   }

   @JsonProperty("lowestBuy")
   public Integer getLowestBuy() {
      return this.lowestBuy;
   }

   @JsonProperty("modelld")
   public void setModelld(String modelld) {
      this.modelld = modelld;
   }

   @JsonProperty("modelld")
   public String getModelld() {
      return this.modelld;
   }

   @JsonProperty("designer")
   public void setDesigner(String designer) {
      this.designer = designer;
   }

   @JsonProperty("designer")
   public String getDesigner() {
      return this.designer;
   }

   @JsonProperty("measurementServiceAtYourDoor")
   public void setMeasurementServiceAtYourDoor(int measurementServiceAtYourDoor) {
      this.measurementServiceAtYourDoor = measurementServiceAtYourDoor;
   }

   @JsonProperty("measurementServiceAtYourDoor")
   public int getMeasurementServiceAtYourDoor() {
      return this.measurementServiceAtYourDoor;
   }

   @JsonProperty("toBMinPrice")
   public void setToBMinPrice(BigDecimal toBMinPrice) {
      this.toBMinPrice = toBMinPrice;
   }

   @JsonProperty("toBMinPrice")
   public BigDecimal getToBMinPrice() {
      return this.toBMinPrice;
   }

   @JsonProperty("attrs")
   public void setAttrs(List<SkuAttrDetailInfoVo> attrs) {
      this.attrs = attrs;
   }

   @JsonProperty("attrs")
   public List<SkuAttrDetailInfoVo> getAttrs() {
      return this.attrs;
   }

   @JsonProperty("supportToB")
   public void setSupportToB(Integer supportToB) {
      this.supportToB = supportToB;
   }

   @JsonProperty("supportToB")
   public Integer getSupportToB() {
      return this.supportToB;
   }

   @JsonProperty("customStatus")
   public void setCustomStatus(int customStatus) {
      this.customStatus = customStatus;
   }

   @JsonProperty("customStatus")
   public int getCustomStatus() {
      return this.customStatus;
   }

   @JsonProperty("toBMinCount")
   public void setToBMinCount(Integer toBMinCount) {
      this.toBMinCount = toBMinCount;
   }

   @JsonProperty("toBMinCount")
   public Integer getToBMinCount() {
      return this.toBMinCount;
   }

   @JsonProperty("supportStagePrice")
   public void setSupportStagePrice(Integer supportStagePrice) {
      this.supportStagePrice = supportStagePrice;
   }

   @JsonProperty("supportStagePrice")
   public Integer getSupportStagePrice() {
      return this.supportStagePrice;
   }

   @JsonProperty("SkuPrice")
   public void setSkuPrice(BigDecimal SkuPrice) {
      this.SkuPrice = SkuPrice;
   }

   @JsonProperty("SkuPrice")
   public BigDecimal getSkuPrice() {
      return this.SkuPrice;
   }

   @JsonProperty("priceMode")
   public void setPriceMode(Integer priceMode) {
      this.priceMode = priceMode;
   }

   @JsonProperty("priceMode")
   public Integer getPriceMode() {
      return this.priceMode;
   }

   @JsonProperty("attrRelationFlag")
   public void setAttrRelationFlag(int attrRelationFlag) {
      this.attrRelationFlag = attrRelationFlag;
   }

   @JsonProperty("attrRelationFlag")
   public int getAttrRelationFlag() {
      return this.attrRelationFlag;
   }

   @JsonProperty("canvasAttrs")
   public void setCanvasAttrs(List<Object> canvasAttrs) {
      this.canvasAttrs = canvasAttrs;
   }

   @JsonProperty("canvasAttrs")
   public List<Object> getCanvasAttrs() {
      return this.canvasAttrs;
   }
}

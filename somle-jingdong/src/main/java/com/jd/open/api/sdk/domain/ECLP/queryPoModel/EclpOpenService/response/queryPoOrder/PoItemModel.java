package com.jd.open.api.sdk.domain.ECLP.queryPoModel.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PoItemModel implements Serializable {
   private String goodsNo;
   private String numApplication;
   private String goodsStatus;
   private String realInstoreQty;
   private String shortQty;
   private String damagedQty;
   private String emptyQty;
   private String expiredQty;
   private String otherQty;
   private String goodsDamagedQty;
   private String deformedQty;
   private String errorQty;
   private String excessQty;
   private String barcodeScanFailQty;
   private String expirationDateErrorQty;
   private String barcodeErrorQty;
   private String pollutionQty;
   private String markUnclearQty;
   private String remark;
   private String[] orderLine;
   private String[] realGoodsStatus;
   private String[] realGoodsLevel;
   private String batchCode;
   private String isvGoodsNo;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("numApplication")
   public void setNumApplication(String numApplication) {
      this.numApplication = numApplication;
   }

   @JsonProperty("numApplication")
   public String getNumApplication() {
      return this.numApplication;
   }

   @JsonProperty("goodsStatus")
   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goodsStatus")
   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   @JsonProperty("realInstoreQty")
   public void setRealInstoreQty(String realInstoreQty) {
      this.realInstoreQty = realInstoreQty;
   }

   @JsonProperty("realInstoreQty")
   public String getRealInstoreQty() {
      return this.realInstoreQty;
   }

   @JsonProperty("shortQty")
   public void setShortQty(String shortQty) {
      this.shortQty = shortQty;
   }

   @JsonProperty("shortQty")
   public String getShortQty() {
      return this.shortQty;
   }

   @JsonProperty("damagedQty")
   public void setDamagedQty(String damagedQty) {
      this.damagedQty = damagedQty;
   }

   @JsonProperty("damagedQty")
   public String getDamagedQty() {
      return this.damagedQty;
   }

   @JsonProperty("emptyQty")
   public void setEmptyQty(String emptyQty) {
      this.emptyQty = emptyQty;
   }

   @JsonProperty("emptyQty")
   public String getEmptyQty() {
      return this.emptyQty;
   }

   @JsonProperty("expiredQty")
   public void setExpiredQty(String expiredQty) {
      this.expiredQty = expiredQty;
   }

   @JsonProperty("expiredQty")
   public String getExpiredQty() {
      return this.expiredQty;
   }

   @JsonProperty("otherQty")
   public void setOtherQty(String otherQty) {
      this.otherQty = otherQty;
   }

   @JsonProperty("otherQty")
   public String getOtherQty() {
      return this.otherQty;
   }

   @JsonProperty("goodsDamagedQty")
   public void setGoodsDamagedQty(String goodsDamagedQty) {
      this.goodsDamagedQty = goodsDamagedQty;
   }

   @JsonProperty("goodsDamagedQty")
   public String getGoodsDamagedQty() {
      return this.goodsDamagedQty;
   }

   @JsonProperty("deformedQty")
   public void setDeformedQty(String deformedQty) {
      this.deformedQty = deformedQty;
   }

   @JsonProperty("deformedQty")
   public String getDeformedQty() {
      return this.deformedQty;
   }

   @JsonProperty("errorQty")
   public void setErrorQty(String errorQty) {
      this.errorQty = errorQty;
   }

   @JsonProperty("errorQty")
   public String getErrorQty() {
      return this.errorQty;
   }

   @JsonProperty("excessQty")
   public void setExcessQty(String excessQty) {
      this.excessQty = excessQty;
   }

   @JsonProperty("excessQty")
   public String getExcessQty() {
      return this.excessQty;
   }

   @JsonProperty("barcodeScanFailQty")
   public void setBarcodeScanFailQty(String barcodeScanFailQty) {
      this.barcodeScanFailQty = barcodeScanFailQty;
   }

   @JsonProperty("barcodeScanFailQty")
   public String getBarcodeScanFailQty() {
      return this.barcodeScanFailQty;
   }

   @JsonProperty("expirationDateErrorQty")
   public void setExpirationDateErrorQty(String expirationDateErrorQty) {
      this.expirationDateErrorQty = expirationDateErrorQty;
   }

   @JsonProperty("expirationDateErrorQty")
   public String getExpirationDateErrorQty() {
      return this.expirationDateErrorQty;
   }

   @JsonProperty("barcodeErrorQty")
   public void setBarcodeErrorQty(String barcodeErrorQty) {
      this.barcodeErrorQty = barcodeErrorQty;
   }

   @JsonProperty("barcodeErrorQty")
   public String getBarcodeErrorQty() {
      return this.barcodeErrorQty;
   }

   @JsonProperty("pollutionQty")
   public void setPollutionQty(String pollutionQty) {
      this.pollutionQty = pollutionQty;
   }

   @JsonProperty("pollutionQty")
   public String getPollutionQty() {
      return this.pollutionQty;
   }

   @JsonProperty("markUnclearQty")
   public void setMarkUnclearQty(String markUnclearQty) {
      this.markUnclearQty = markUnclearQty;
   }

   @JsonProperty("markUnclearQty")
   public String getMarkUnclearQty() {
      return this.markUnclearQty;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("orderLine")
   public void setOrderLine(String[] orderLine) {
      this.orderLine = orderLine;
   }

   @JsonProperty("orderLine")
   public String[] getOrderLine() {
      return this.orderLine;
   }

   @JsonProperty("realGoodsStatus")
   public void setRealGoodsStatus(String[] realGoodsStatus) {
      this.realGoodsStatus = realGoodsStatus;
   }

   @JsonProperty("realGoodsStatus")
   public String[] getRealGoodsStatus() {
      return this.realGoodsStatus;
   }

   @JsonProperty("realGoodsLevel")
   public void setRealGoodsLevel(String[] realGoodsLevel) {
      this.realGoodsLevel = realGoodsLevel;
   }

   @JsonProperty("realGoodsLevel")
   public String[] getRealGoodsLevel() {
      return this.realGoodsLevel;
   }

   @JsonProperty("batchCode")
   public void setBatchCode(String batchCode) {
      this.batchCode = batchCode;
   }

   @JsonProperty("batchCode")
   public String getBatchCode() {
      return this.batchCode;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }
}

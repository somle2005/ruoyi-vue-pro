package com.jd.open.api.sdk.domain.ECLP.WaybillQueryApi.response.WaybillQueryApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillExtraCharge implements Serializable {
   private String insuredCharge;
   private String honorCharge;
   private String specifiedSignCharge;
   private String upStairsCharge;
   private String intoWareHouseCharge;
   private String returnPermissionCharge;
   private String guaranteeCharge;
   private String payAfterDeliveryCharge;
   private String electronicSignCharge;
   private String transferGoodsCharge;
   private String loadCharge;
   private String unLoadCharge;
   private String collectCharge;
   private String deliveryCharge;
   private String peakPeriodCharge;
   private String oldReceivedFee;

   @JsonProperty("insuredCharge")
   public void setInsuredCharge(String insuredCharge) {
      this.insuredCharge = insuredCharge;
   }

   @JsonProperty("insuredCharge")
   public String getInsuredCharge() {
      return this.insuredCharge;
   }

   @JsonProperty("honorCharge")
   public void setHonorCharge(String honorCharge) {
      this.honorCharge = honorCharge;
   }

   @JsonProperty("honorCharge")
   public String getHonorCharge() {
      return this.honorCharge;
   }

   @JsonProperty("specifiedSignCharge")
   public void setSpecifiedSignCharge(String specifiedSignCharge) {
      this.specifiedSignCharge = specifiedSignCharge;
   }

   @JsonProperty("specifiedSignCharge")
   public String getSpecifiedSignCharge() {
      return this.specifiedSignCharge;
   }

   @JsonProperty("upStairsCharge")
   public void setUpStairsCharge(String upStairsCharge) {
      this.upStairsCharge = upStairsCharge;
   }

   @JsonProperty("upStairsCharge")
   public String getUpStairsCharge() {
      return this.upStairsCharge;
   }

   @JsonProperty("intoWareHouseCharge")
   public void setIntoWareHouseCharge(String intoWareHouseCharge) {
      this.intoWareHouseCharge = intoWareHouseCharge;
   }

   @JsonProperty("intoWareHouseCharge")
   public String getIntoWareHouseCharge() {
      return this.intoWareHouseCharge;
   }

   @JsonProperty("returnPermissionCharge")
   public void setReturnPermissionCharge(String returnPermissionCharge) {
      this.returnPermissionCharge = returnPermissionCharge;
   }

   @JsonProperty("returnPermissionCharge")
   public String getReturnPermissionCharge() {
      return this.returnPermissionCharge;
   }

   @JsonProperty("guaranteeCharge")
   public void setGuaranteeCharge(String guaranteeCharge) {
      this.guaranteeCharge = guaranteeCharge;
   }

   @JsonProperty("guaranteeCharge")
   public String getGuaranteeCharge() {
      return this.guaranteeCharge;
   }

   @JsonProperty("payAfterDeliveryCharge")
   public void setPayAfterDeliveryCharge(String payAfterDeliveryCharge) {
      this.payAfterDeliveryCharge = payAfterDeliveryCharge;
   }

   @JsonProperty("payAfterDeliveryCharge")
   public String getPayAfterDeliveryCharge() {
      return this.payAfterDeliveryCharge;
   }

   @JsonProperty("electronicSignCharge")
   public void setElectronicSignCharge(String electronicSignCharge) {
      this.electronicSignCharge = electronicSignCharge;
   }

   @JsonProperty("electronicSignCharge")
   public String getElectronicSignCharge() {
      return this.electronicSignCharge;
   }

   @JsonProperty("transferGoodsCharge")
   public void setTransferGoodsCharge(String transferGoodsCharge) {
      this.transferGoodsCharge = transferGoodsCharge;
   }

   @JsonProperty("transferGoodsCharge")
   public String getTransferGoodsCharge() {
      return this.transferGoodsCharge;
   }

   @JsonProperty("loadCharge")
   public void setLoadCharge(String loadCharge) {
      this.loadCharge = loadCharge;
   }

   @JsonProperty("loadCharge")
   public String getLoadCharge() {
      return this.loadCharge;
   }

   @JsonProperty("unLoadCharge")
   public void setUnLoadCharge(String unLoadCharge) {
      this.unLoadCharge = unLoadCharge;
   }

   @JsonProperty("unLoadCharge")
   public String getUnLoadCharge() {
      return this.unLoadCharge;
   }

   @JsonProperty("collectCharge")
   public void setCollectCharge(String collectCharge) {
      this.collectCharge = collectCharge;
   }

   @JsonProperty("collectCharge")
   public String getCollectCharge() {
      return this.collectCharge;
   }

   @JsonProperty("deliveryCharge")
   public void setDeliveryCharge(String deliveryCharge) {
      this.deliveryCharge = deliveryCharge;
   }

   @JsonProperty("deliveryCharge")
   public String getDeliveryCharge() {
      return this.deliveryCharge;
   }

   @JsonProperty("peakPeriodCharge")
   public void setPeakPeriodCharge(String peakPeriodCharge) {
      this.peakPeriodCharge = peakPeriodCharge;
   }

   @JsonProperty("peakPeriodCharge")
   public String getPeakPeriodCharge() {
      return this.peakPeriodCharge;
   }

   @JsonProperty("oldReceivedFee")
   public void setOldReceivedFee(String oldReceivedFee) {
      this.oldReceivedFee = oldReceivedFee;
   }

   @JsonProperty("oldReceivedFee")
   public String getOldReceivedFee() {
      return this.oldReceivedFee;
   }
}

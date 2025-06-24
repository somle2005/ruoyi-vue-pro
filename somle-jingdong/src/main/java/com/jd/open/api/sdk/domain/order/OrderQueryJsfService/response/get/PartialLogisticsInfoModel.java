package com.jd.open.api.sdk.domain.order.OrderQueryJsfService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PartialLogisticsInfoModel implements Serializable {
   private Integer shipmentId;
   private String logicId;
   private String waybillId;
   private Integer packageNum;
   private Long shipmentTime;
   private Long shipmentModifyTime;
   private List<PartialShipmentGoodsModel> skus;

   @JsonProperty("shipmentId")
   public void setShipmentId(Integer shipmentId) {
      this.shipmentId = shipmentId;
   }

   @JsonProperty("shipmentId")
   public Integer getShipmentId() {
      return this.shipmentId;
   }

   @JsonProperty("logicId")
   public void setLogicId(String logicId) {
      this.logicId = logicId;
   }

   @JsonProperty("logicId")
   public String getLogicId() {
      return this.logicId;
   }

   @JsonProperty("waybillId")
   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   @JsonProperty("waybillId")
   public String getWaybillId() {
      return this.waybillId;
   }

   @JsonProperty("packageNum")
   public void setPackageNum(Integer packageNum) {
      this.packageNum = packageNum;
   }

   @JsonProperty("packageNum")
   public Integer getPackageNum() {
      return this.packageNum;
   }

   @JsonProperty("shipmentTime")
   public void setShipmentTime(Long shipmentTime) {
      this.shipmentTime = shipmentTime;
   }

   @JsonProperty("shipmentTime")
   public Long getShipmentTime() {
      return this.shipmentTime;
   }

   @JsonProperty("shipmentModifyTime")
   public void setShipmentModifyTime(Long shipmentModifyTime) {
      this.shipmentModifyTime = shipmentModifyTime;
   }

   @JsonProperty("shipmentModifyTime")
   public Long getShipmentModifyTime() {
      return this.shipmentModifyTime;
   }

   @JsonProperty("skus")
   public void setSkus(List<PartialShipmentGoodsModel> skus) {
      this.skus = skus;
   }

   @JsonProperty("skus")
   public List<PartialShipmentGoodsModel> getSkus() {
      return this.skus;
   }
}

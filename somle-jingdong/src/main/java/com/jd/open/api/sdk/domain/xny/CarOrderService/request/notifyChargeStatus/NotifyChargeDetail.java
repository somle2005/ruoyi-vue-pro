package com.jd.open.api.sdk.domain.xny.CarOrderService.request.notifyChargeStatus;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class NotifyChargeDetail implements Serializable {
   private String DetailEndTime;
   private Double DetailSeviceMoney;
   private String DetailStartTime;
   private Double ElecPrice;
   private Double DetailPower;
   private Double SevicePrice;
   private Double DetailElecMoney;

   @JsonProperty("DetailEndTime")
   public void setDetailEndTime(String DetailEndTime) {
      this.DetailEndTime = DetailEndTime;
   }

   @JsonProperty("DetailEndTime")
   public String getDetailEndTime() {
      return this.DetailEndTime;
   }

   @JsonProperty("DetailSeviceMoney")
   public void setDetailSeviceMoney(Double DetailSeviceMoney) {
      this.DetailSeviceMoney = DetailSeviceMoney;
   }

   @JsonProperty("DetailSeviceMoney")
   public Double getDetailSeviceMoney() {
      return this.DetailSeviceMoney;
   }

   @JsonProperty("DetailStartTime")
   public void setDetailStartTime(String DetailStartTime) {
      this.DetailStartTime = DetailStartTime;
   }

   @JsonProperty("DetailStartTime")
   public String getDetailStartTime() {
      return this.DetailStartTime;
   }

   @JsonProperty("ElecPrice")
   public void setElecPrice(Double ElecPrice) {
      this.ElecPrice = ElecPrice;
   }

   @JsonProperty("ElecPrice")
   public Double getElecPrice() {
      return this.ElecPrice;
   }

   @JsonProperty("DetailPower")
   public void setDetailPower(Double DetailPower) {
      this.DetailPower = DetailPower;
   }

   @JsonProperty("DetailPower")
   public Double getDetailPower() {
      return this.DetailPower;
   }

   @JsonProperty("SevicePrice")
   public void setSevicePrice(Double SevicePrice) {
      this.SevicePrice = SevicePrice;
   }

   @JsonProperty("SevicePrice")
   public Double getSevicePrice() {
      return this.SevicePrice;
   }

   @JsonProperty("DetailElecMoney")
   public void setDetailElecMoney(Double DetailElecMoney) {
      this.DetailElecMoney = DetailElecMoney;
   }

   @JsonProperty("DetailElecMoney")
   public Double getDetailElecMoney() {
      return this.DetailElecMoney;
   }
}

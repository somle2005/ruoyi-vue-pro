package com.jd.open.api.sdk.domain.youE.OrderCargoOutExportService.request.cargoOut;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CargoOutParam implements Serializable {
   private String deliveryPhone;
   private String orderNo;
   private String deliveryPerson;
   private String logisticsNo;
   private String remark;

   @JsonProperty("deliveryPhone")
   public void setDeliveryPhone(String deliveryPhone) {
      this.deliveryPhone = deliveryPhone;
   }

   @JsonProperty("deliveryPhone")
   public String getDeliveryPhone() {
      return this.deliveryPhone;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("deliveryPerson")
   public void setDeliveryPerson(String deliveryPerson) {
      this.deliveryPerson = deliveryPerson;
   }

   @JsonProperty("deliveryPerson")
   public String getDeliveryPerson() {
      return this.deliveryPerson;
   }

   @JsonProperty("logisticsNo")
   public void setLogisticsNo(String logisticsNo) {
      this.logisticsNo = logisticsNo;
   }

   @JsonProperty("logisticsNo")
   public String getLogisticsNo() {
      return this.logisticsNo;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }
}

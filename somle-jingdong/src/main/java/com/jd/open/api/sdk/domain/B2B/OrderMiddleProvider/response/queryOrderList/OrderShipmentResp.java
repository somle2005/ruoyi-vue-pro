package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class OrderShipmentResp implements Serializable {
   private Integer shipmentType;
   private Integer shipmentTimeType;
   private Long picksiteId;
   private Date pickDate;
   private PromiseShipmentResp promiseShipment;

   @JsonProperty("shipmentType")
   public void setShipmentType(Integer shipmentType) {
      this.shipmentType = shipmentType;
   }

   @JsonProperty("shipmentType")
   public Integer getShipmentType() {
      return this.shipmentType;
   }

   @JsonProperty("shipmentTimeType")
   public void setShipmentTimeType(Integer shipmentTimeType) {
      this.shipmentTimeType = shipmentTimeType;
   }

   @JsonProperty("shipmentTimeType")
   public Integer getShipmentTimeType() {
      return this.shipmentTimeType;
   }

   @JsonProperty("picksiteId")
   public void setPicksiteId(Long picksiteId) {
      this.picksiteId = picksiteId;
   }

   @JsonProperty("picksiteId")
   public Long getPicksiteId() {
      return this.picksiteId;
   }

   @JsonProperty("pickDate")
   public void setPickDate(Date pickDate) {
      this.pickDate = pickDate;
   }

   @JsonProperty("pickDate")
   public Date getPickDate() {
      return this.pickDate;
   }

   @JsonProperty("promiseShipment")
   public void setPromiseShipment(PromiseShipmentResp promiseShipment) {
      this.promiseShipment = promiseShipment;
   }

   @JsonProperty("promiseShipment")
   public PromiseShipmentResp getPromiseShipment() {
      return this.promiseShipment;
   }
}

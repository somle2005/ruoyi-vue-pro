package com.jd.open.api.sdk.domain.order.WaybillJosService.request.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PartialLogisticsInfoVo implements Serializable {
   private Integer shipmentId;
   private String waybillId;
   private Long logicId;
   private String logicName;
   private Integer packageNum;

   @JsonProperty("shipmentId")
   public void setShipmentId(Integer shipmentId) {
      this.shipmentId = shipmentId;
   }

   @JsonProperty("shipmentId")
   public Integer getShipmentId() {
      return this.shipmentId;
   }

   @JsonProperty("waybillId")
   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   @JsonProperty("waybillId")
   public String getWaybillId() {
      return this.waybillId;
   }

   @JsonProperty("logicId")
   public void setLogicId(Long logicId) {
      this.logicId = logicId;
   }

   @JsonProperty("logicId")
   public Long getLogicId() {
      return this.logicId;
   }

   @JsonProperty("logicName")
   public void setLogicName(String logicName) {
      this.logicName = logicName;
   }

   @JsonProperty("logicName")
   public String getLogicName() {
      return this.logicName;
   }

   @JsonProperty("packageNum")
   public void setPackageNum(Integer packageNum) {
      this.packageNum = packageNum;
   }

   @JsonProperty("packageNum")
   public Integer getPackageNum() {
      return this.packageNum;
   }
}

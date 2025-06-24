package com.jd.open.api.sdk.domain.youE.OrderCargoCollectExportService.request.cargoCollect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CargoCollectParam implements Serializable {
   private String orderNo;
   private String logisticsNo;
   private String remark;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
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

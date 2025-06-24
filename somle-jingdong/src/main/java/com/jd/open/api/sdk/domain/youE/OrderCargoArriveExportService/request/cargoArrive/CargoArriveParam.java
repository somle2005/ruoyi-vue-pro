package com.jd.open.api.sdk.domain.youE.OrderCargoArriveExportService.request.cargoArrive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class CargoArriveParam implements Serializable {
   private String orderNo;
   private String remark;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
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

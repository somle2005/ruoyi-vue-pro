package com.jd.open.api.sdk.domain.order.WaybillJosService.request.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WayBillInfoDto implements Serializable {
   private List<PartialLogisticsInfoVo> partialShipmentInfoList;
   private Long orderId;

   @JsonProperty("partialShipmentInfoList")
   public void setPartialShipmentInfoList(List<PartialLogisticsInfoVo> partialShipmentInfoList) {
      this.partialShipmentInfoList = partialShipmentInfoList;
   }

   @JsonProperty("partialShipmentInfoList")
   public List<PartialLogisticsInfoVo> getPartialShipmentInfoList() {
      return this.partialShipmentInfoList;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }
}

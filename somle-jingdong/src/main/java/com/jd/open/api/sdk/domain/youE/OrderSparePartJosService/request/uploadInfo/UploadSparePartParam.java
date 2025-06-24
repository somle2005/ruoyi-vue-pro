package com.jd.open.api.sdk.domain.youE.OrderSparePartJosService.request.uploadInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class UploadSparePartParam implements Serializable {
   private String orderNo;
   private List<String> deliverNoList;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("deliverNoList")
   public void setDeliverNoList(List<String> deliverNoList) {
      this.deliverNoList = deliverNoList;
   }

   @JsonProperty("deliverNoList")
   public List<String> getDeliverNoList() {
      return this.deliverNoList;
   }
}

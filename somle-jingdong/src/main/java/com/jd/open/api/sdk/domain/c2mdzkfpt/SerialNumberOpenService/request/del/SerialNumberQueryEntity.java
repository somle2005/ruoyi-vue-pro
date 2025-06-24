package com.jd.open.api.sdk.domain.c2mdzkfpt.SerialNumberOpenService.request.del;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SerialNumberQueryEntity implements Serializable {
   private List<SerialNumberOrderEntity> orderSerialNumberList;
   private String loginName;
   private String vendorCode;

   @JsonProperty("orderSerialNumberList")
   public void setOrderSerialNumberList(List<SerialNumberOrderEntity> orderSerialNumberList) {
      this.orderSerialNumberList = orderSerialNumberList;
   }

   @JsonProperty("orderSerialNumberList")
   public List<SerialNumberOrderEntity> getOrderSerialNumberList() {
      return this.orderSerialNumberList;
   }

   @JsonProperty("loginName")
   public void setLoginName(String loginName) {
      this.loginName = loginName;
   }

   @JsonProperty("loginName")
   public String getLoginName() {
      return this.loginName;
   }

   @JsonProperty("vendorCode")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendorCode")
   public String getVendorCode() {
      return this.vendorCode;
   }
}

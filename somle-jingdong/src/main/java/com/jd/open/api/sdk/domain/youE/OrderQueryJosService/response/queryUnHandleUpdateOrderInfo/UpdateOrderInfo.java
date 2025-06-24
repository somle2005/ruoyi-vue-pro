package com.jd.open.api.sdk.domain.youE.OrderQueryJosService.response.queryUnHandleUpdateOrderInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class UpdateOrderInfo implements Serializable {
   private String changeInfo;
   private Integer secondServiceType;
   private String orderNo;
   private Integer firstServiceType;
   private String changeInfoVersion;

   @JsonProperty("changeInfo")
   public void setChangeInfo(String changeInfo) {
      this.changeInfo = changeInfo;
   }

   @JsonProperty("changeInfo")
   public String getChangeInfo() {
      return this.changeInfo;
   }

   @JsonProperty("secondServiceType")
   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   @JsonProperty("secondServiceType")
   public Integer getSecondServiceType() {
      return this.secondServiceType;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("firstServiceType")
   public void setFirstServiceType(Integer firstServiceType) {
      this.firstServiceType = firstServiceType;
   }

   @JsonProperty("firstServiceType")
   public Integer getFirstServiceType() {
      return this.firstServiceType;
   }

   @JsonProperty("changeInfoVersion")
   public void setChangeInfoVersion(String changeInfoVersion) {
      this.changeInfoVersion = changeInfoVersion;
   }

   @JsonProperty("changeInfoVersion")
   public String getChangeInfoVersion() {
      return this.changeInfoVersion;
   }
}

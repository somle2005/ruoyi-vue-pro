package com.jd.open.api.sdk.domain.youE.OrderConfirmExportService.request.orderConfirmReceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class OrderInfoConfirmParam implements Serializable {
   private List<String> orderNos;
   private Integer confirmType;
   private List<ChangeInfoParam> changeInfoList;

   @JsonProperty("orderNos")
   public void setOrderNos(List<String> orderNos) {
      this.orderNos = orderNos;
   }

   @JsonProperty("orderNos")
   public List<String> getOrderNos() {
      return this.orderNos;
   }

   @JsonProperty("confirmType")
   public void setConfirmType(Integer confirmType) {
      this.confirmType = confirmType;
   }

   @JsonProperty("confirmType")
   public Integer getConfirmType() {
      return this.confirmType;
   }

   @JsonProperty("changeInfoList")
   public void setChangeInfoList(List<ChangeInfoParam> changeInfoList) {
      this.changeInfoList = changeInfoList;
   }

   @JsonProperty("changeInfoList")
   public List<ChangeInfoParam> getChangeInfoList() {
      return this.changeInfoList;
   }
}

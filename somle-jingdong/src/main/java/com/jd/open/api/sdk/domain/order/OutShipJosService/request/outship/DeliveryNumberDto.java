package com.jd.open.api.sdk.domain.order.OutShipJosService.request.outship;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class DeliveryNumberDto implements Serializable {
   private List<String> deliveryNums;
   private String zsWayBillNum;
   private String zsDelivererPhone;
   private Integer deliveryId;
   private String zsCompanyPhone;
   private String zsCompanyName;
   private String zsDelivererName;
   private String deliveryName;
   private List<GoodsDto> partialShipmentGoodsList;

   @JsonProperty("deliveryNums")
   public void setDeliveryNums(List<String> deliveryNums) {
      this.deliveryNums = deliveryNums;
   }

   @JsonProperty("deliveryNums")
   public List<String> getDeliveryNums() {
      return this.deliveryNums;
   }

   @JsonProperty("zsWayBillNum")
   public void setZsWayBillNum(String zsWayBillNum) {
      this.zsWayBillNum = zsWayBillNum;
   }

   @JsonProperty("zsWayBillNum")
   public String getZsWayBillNum() {
      return this.zsWayBillNum;
   }

   @JsonProperty("zsDelivererPhone")
   public void setZsDelivererPhone(String zsDelivererPhone) {
      this.zsDelivererPhone = zsDelivererPhone;
   }

   @JsonProperty("zsDelivererPhone")
   public String getZsDelivererPhone() {
      return this.zsDelivererPhone;
   }

   @JsonProperty("deliveryId")
   public void setDeliveryId(Integer deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public Integer getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("zsCompanyPhone")
   public void setZsCompanyPhone(String zsCompanyPhone) {
      this.zsCompanyPhone = zsCompanyPhone;
   }

   @JsonProperty("zsCompanyPhone")
   public String getZsCompanyPhone() {
      return this.zsCompanyPhone;
   }

   @JsonProperty("zsCompanyName")
   public void setZsCompanyName(String zsCompanyName) {
      this.zsCompanyName = zsCompanyName;
   }

   @JsonProperty("zsCompanyName")
   public String getZsCompanyName() {
      return this.zsCompanyName;
   }

   @JsonProperty("zsDelivererName")
   public void setZsDelivererName(String zsDelivererName) {
      this.zsDelivererName = zsDelivererName;
   }

   @JsonProperty("zsDelivererName")
   public String getZsDelivererName() {
      return this.zsDelivererName;
   }

   @JsonProperty("deliveryName")
   public void setDeliveryName(String deliveryName) {
      this.deliveryName = deliveryName;
   }

   @JsonProperty("deliveryName")
   public String getDeliveryName() {
      return this.deliveryName;
   }

   @JsonProperty("partialShipmentGoodsList")
   public void setPartialShipmentGoodsList(List<GoodsDto> partialShipmentGoodsList) {
      this.partialShipmentGoodsList = partialShipmentGoodsList;
   }

   @JsonProperty("partialShipmentGoodsList")
   public List<GoodsDto> getPartialShipmentGoodsList() {
      return this.partialShipmentGoodsList;
   }
}

package com.jd.open.api.sdk.domain.order.PriceAdjustmentService.response.panel;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AdjustmentInfoDto implements Serializable {
   private boolean hasFreight;
   private Long orderId;
   private BigDecimal shouldPayPrice;
   private BigDecimal shouldPayTotalPrice;
   private String orderChangePriceText;
   private BigDecimal totalFreight;
   private String consAddress;
   private List<OrderItemChangePriceDto> orderItems;
   private String orderInfoStr;
   private String maxFreightFee;
   private BigDecimal changePrice;
   private BigDecimal preShouldPayPrice;
   private BigDecimal preShouldPayTotalPrice;
   private BigDecimal totalServiceFee;
   private String orderVersion;
   private Boolean hasServiceFee;

   @JsonProperty("hasFreight")
   public void setHasFreight(boolean hasFreight) {
      this.hasFreight = hasFreight;
   }

   @JsonProperty("hasFreight")
   public boolean getHasFreight() {
      return this.hasFreight;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("shouldPayPrice")
   public void setShouldPayPrice(BigDecimal shouldPayPrice) {
      this.shouldPayPrice = shouldPayPrice;
   }

   @JsonProperty("shouldPayPrice")
   public BigDecimal getShouldPayPrice() {
      return this.shouldPayPrice;
   }

   @JsonProperty("shouldPayTotalPrice")
   public void setShouldPayTotalPrice(BigDecimal shouldPayTotalPrice) {
      this.shouldPayTotalPrice = shouldPayTotalPrice;
   }

   @JsonProperty("shouldPayTotalPrice")
   public BigDecimal getShouldPayTotalPrice() {
      return this.shouldPayTotalPrice;
   }

   @JsonProperty("orderChangePriceText")
   public void setOrderChangePriceText(String orderChangePriceText) {
      this.orderChangePriceText = orderChangePriceText;
   }

   @JsonProperty("orderChangePriceText")
   public String getOrderChangePriceText() {
      return this.orderChangePriceText;
   }

   @JsonProperty("totalFreight")
   public void setTotalFreight(BigDecimal totalFreight) {
      this.totalFreight = totalFreight;
   }

   @JsonProperty("totalFreight")
   public BigDecimal getTotalFreight() {
      return this.totalFreight;
   }

   @JsonProperty("consAddress")
   public void setConsAddress(String consAddress) {
      this.consAddress = consAddress;
   }

   @JsonProperty("consAddress")
   public String getConsAddress() {
      return this.consAddress;
   }

   @JsonProperty("orderItems")
   public void setOrderItems(List<OrderItemChangePriceDto> orderItems) {
      this.orderItems = orderItems;
   }

   @JsonProperty("orderItems")
   public List<OrderItemChangePriceDto> getOrderItems() {
      return this.orderItems;
   }

   @JsonProperty("orderInfoStr")
   public void setOrderInfoStr(String orderInfoStr) {
      this.orderInfoStr = orderInfoStr;
   }

   @JsonProperty("orderInfoStr")
   public String getOrderInfoStr() {
      return this.orderInfoStr;
   }

   @JsonProperty("maxFreightFee")
   public void setMaxFreightFee(String maxFreightFee) {
      this.maxFreightFee = maxFreightFee;
   }

   @JsonProperty("maxFreightFee")
   public String getMaxFreightFee() {
      return this.maxFreightFee;
   }

   @JsonProperty("changePrice")
   public void setChangePrice(BigDecimal changePrice) {
      this.changePrice = changePrice;
   }

   @JsonProperty("changePrice")
   public BigDecimal getChangePrice() {
      return this.changePrice;
   }

   @JsonProperty("preShouldPayPrice")
   public void setPreShouldPayPrice(BigDecimal preShouldPayPrice) {
      this.preShouldPayPrice = preShouldPayPrice;
   }

   @JsonProperty("preShouldPayPrice")
   public BigDecimal getPreShouldPayPrice() {
      return this.preShouldPayPrice;
   }

   @JsonProperty("preShouldPayTotalPrice")
   public void setPreShouldPayTotalPrice(BigDecimal preShouldPayTotalPrice) {
      this.preShouldPayTotalPrice = preShouldPayTotalPrice;
   }

   @JsonProperty("preShouldPayTotalPrice")
   public BigDecimal getPreShouldPayTotalPrice() {
      return this.preShouldPayTotalPrice;
   }

   @JsonProperty("totalServiceFee")
   public void setTotalServiceFee(BigDecimal totalServiceFee) {
      this.totalServiceFee = totalServiceFee;
   }

   @JsonProperty("totalServiceFee")
   public BigDecimal getTotalServiceFee() {
      return this.totalServiceFee;
   }

   @JsonProperty("orderVersion")
   public void setOrderVersion(String orderVersion) {
      this.orderVersion = orderVersion;
   }

   @JsonProperty("orderVersion")
   public String getOrderVersion() {
      return this.orderVersion;
   }

   @JsonProperty("hasServiceFee")
   public void setHasServiceFee(Boolean hasServiceFee) {
      this.hasServiceFee = hasServiceFee;
   }

   @JsonProperty("hasServiceFee")
   public Boolean getHasServiceFee() {
      return this.hasServiceFee;
   }
}

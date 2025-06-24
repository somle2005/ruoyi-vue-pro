package com.jd.open.api.sdk.domain.market.OrderServiceProvider.response.listwithpage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class OrderVO implements Serializable {
   private Long orderId;
   private Date endDate;
   private String itemCode;
   private String itemName;
   private Integer articleType;
   private Long erpOrderId;
   private Long totalRealpayPrice;
   private Long skuId;
   private String fwsPin;
   private Long tpOrderId;
   private String nickName;
   private Date created;
   private String buyer;
   private Integer orderCycle;
   private Date orderDate;
   private Date startDate;
   private String serviceCode;
   private Integer orderStatus;
   private Integer orderNum;
   private String childBuyer;
   private String serviceName;
   private Map<String, String> extendMap;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("endDate")
   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("endDate")
   public Date getEndDate() {
      return this.endDate;
   }

   @JsonProperty("itemCode")
   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   @JsonProperty("itemCode")
   public String getItemCode() {
      return this.itemCode;
   }

   @JsonProperty("itemName")
   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   @JsonProperty("itemName")
   public String getItemName() {
      return this.itemName;
   }

   @JsonProperty("articleType")
   public void setArticleType(Integer articleType) {
      this.articleType = articleType;
   }

   @JsonProperty("articleType")
   public Integer getArticleType() {
      return this.articleType;
   }

   @JsonProperty("erpOrderId")
   public void setErpOrderId(Long erpOrderId) {
      this.erpOrderId = erpOrderId;
   }

   @JsonProperty("erpOrderId")
   public Long getErpOrderId() {
      return this.erpOrderId;
   }

   @JsonProperty("totalRealpayPrice")
   public void setTotalRealpayPrice(Long totalRealpayPrice) {
      this.totalRealpayPrice = totalRealpayPrice;
   }

   @JsonProperty("totalRealpayPrice")
   public Long getTotalRealpayPrice() {
      return this.totalRealpayPrice;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("fwsPin")
   public void setFwsPin(String fwsPin) {
      this.fwsPin = fwsPin;
   }

   @JsonProperty("fwsPin")
   public String getFwsPin() {
      return this.fwsPin;
   }

   @JsonProperty("tpOrderId")
   public void setTpOrderId(Long tpOrderId) {
      this.tpOrderId = tpOrderId;
   }

   @JsonProperty("tpOrderId")
   public Long getTpOrderId() {
      return this.tpOrderId;
   }

   @JsonProperty("nickName")
   public void setNickName(String nickName) {
      this.nickName = nickName;
   }

   @JsonProperty("nickName")
   public String getNickName() {
      return this.nickName;
   }

   @JsonProperty("created")
   public void setCreated(Date created) {
      this.created = created;
   }

   @JsonProperty("created")
   public Date getCreated() {
      return this.created;
   }

   @JsonProperty("buyer")
   public void setBuyer(String buyer) {
      this.buyer = buyer;
   }

   @JsonProperty("buyer")
   public String getBuyer() {
      return this.buyer;
   }

   @JsonProperty("orderCycle")
   public void setOrderCycle(Integer orderCycle) {
      this.orderCycle = orderCycle;
   }

   @JsonProperty("orderCycle")
   public Integer getOrderCycle() {
      return this.orderCycle;
   }

   @JsonProperty("orderDate")
   public void setOrderDate(Date orderDate) {
      this.orderDate = orderDate;
   }

   @JsonProperty("orderDate")
   public Date getOrderDate() {
      return this.orderDate;
   }

   @JsonProperty("startDate")
   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   @JsonProperty("startDate")
   public Date getStartDate() {
      return this.startDate;
   }

   @JsonProperty("serviceCode")
   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   @JsonProperty("serviceCode")
   public String getServiceCode() {
      return this.serviceCode;
   }

   @JsonProperty("orderStatus")
   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   @JsonProperty("orderStatus")
   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   @JsonProperty("orderNum")
   public void setOrderNum(Integer orderNum) {
      this.orderNum = orderNum;
   }

   @JsonProperty("orderNum")
   public Integer getOrderNum() {
      return this.orderNum;
   }

   @JsonProperty("childBuyer")
   public void setChildBuyer(String childBuyer) {
      this.childBuyer = childBuyer;
   }

   @JsonProperty("childBuyer")
   public String getChildBuyer() {
      return this.childBuyer;
   }

   @JsonProperty("serviceName")
   public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
   }

   @JsonProperty("serviceName")
   public String getServiceName() {
      return this.serviceName;
   }

   @JsonProperty("extendMap")
   public void setExtendMap(Map<String, String> extendMap) {
      this.extendMap = extendMap;
   }

   @JsonProperty("extendMap")
   public Map<String, String> getExtendMap() {
      return this.extendMap;
   }
}

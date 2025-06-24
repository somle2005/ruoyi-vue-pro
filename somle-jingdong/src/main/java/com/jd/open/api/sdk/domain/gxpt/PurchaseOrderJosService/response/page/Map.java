package com.jd.open.api.sdk.domain.gxpt.PurchaseOrderJosService.response.page;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Map implements Serializable {
   private Long purchaseId;
   private Long orderId;
   private Long originalOrderId;
   private Long sellerId;
   private String sellerVenderName;
   private Integer venderId;
   private Integer flag;
   private BigDecimal freightPrice;
   private Integer orderState;
   private String consumerPin;
   private String orderTime;
   private Integer shipmentId;
   private String shipmentNo;
   private String exStockTime;
   private String remark;
   private String consumerName;
   private String consumerTel;
   private String consumerAddress;
   private String areaProvince;
   private String areaCity;
   private String areaCounty;
   private Long jdStoreDeliver;
   private Long jdStoreId;
   private List<PurchaseOrderSkuJosDO> skuList;
   private String updateTime;
   private Integer paymentType;
   private Integer idSopShipmentType;
   private String shangJiaRemark;
   private String oaid;
   private Integer appointDeliveryCompanyCode;
   private String openIdBuyer;
   private String xidBuyer;
   private String desenConsumerTel;

   @JsonProperty("purchaseId")
   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   @JsonProperty("purchaseId")
   public Long getPurchaseId() {
      return this.purchaseId;
   }

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("originalOrderId")
   public void setOriginalOrderId(Long originalOrderId) {
      this.originalOrderId = originalOrderId;
   }

   @JsonProperty("originalOrderId")
   public Long getOriginalOrderId() {
      return this.originalOrderId;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("sellerVenderName")
   public void setSellerVenderName(String sellerVenderName) {
      this.sellerVenderName = sellerVenderName;
   }

   @JsonProperty("sellerVenderName")
   public String getSellerVenderName() {
      return this.sellerVenderName;
   }

   @JsonProperty("venderId")
   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Integer getVenderId() {
      return this.venderId;
   }

   @JsonProperty("flag")
   public void setFlag(Integer flag) {
      this.flag = flag;
   }

   @JsonProperty("flag")
   public Integer getFlag() {
      return this.flag;
   }

   @JsonProperty("freightPrice")
   public void setFreightPrice(BigDecimal freightPrice) {
      this.freightPrice = freightPrice;
   }

   @JsonProperty("freightPrice")
   public BigDecimal getFreightPrice() {
      return this.freightPrice;
   }

   @JsonProperty("orderState")
   public void setOrderState(Integer orderState) {
      this.orderState = orderState;
   }

   @JsonProperty("orderState")
   public Integer getOrderState() {
      return this.orderState;
   }

   @JsonProperty("consumerPin")
   public void setConsumerPin(String consumerPin) {
      this.consumerPin = consumerPin;
   }

   @JsonProperty("consumerPin")
   public String getConsumerPin() {
      return this.consumerPin;
   }

   @JsonProperty("orderTime")
   public void setOrderTime(String orderTime) {
      this.orderTime = orderTime;
   }

   @JsonProperty("orderTime")
   public String getOrderTime() {
      return this.orderTime;
   }

   @JsonProperty("shipmentId")
   public void setShipmentId(Integer shipmentId) {
      this.shipmentId = shipmentId;
   }

   @JsonProperty("shipmentId")
   public Integer getShipmentId() {
      return this.shipmentId;
   }

   @JsonProperty("shipmentNo")
   public void setShipmentNo(String shipmentNo) {
      this.shipmentNo = shipmentNo;
   }

   @JsonProperty("shipmentNo")
   public String getShipmentNo() {
      return this.shipmentNo;
   }

   @JsonProperty("exStockTime")
   public void setExStockTime(String exStockTime) {
      this.exStockTime = exStockTime;
   }

   @JsonProperty("exStockTime")
   public String getExStockTime() {
      return this.exStockTime;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("consumerName")
   public void setConsumerName(String consumerName) {
      this.consumerName = consumerName;
   }

   @JsonProperty("consumerName")
   public String getConsumerName() {
      return this.consumerName;
   }

   @JsonProperty("consumerTel")
   public void setConsumerTel(String consumerTel) {
      this.consumerTel = consumerTel;
   }

   @JsonProperty("consumerTel")
   public String getConsumerTel() {
      return this.consumerTel;
   }

   @JsonProperty("consumerAddress")
   public void setConsumerAddress(String consumerAddress) {
      this.consumerAddress = consumerAddress;
   }

   @JsonProperty("consumerAddress")
   public String getConsumerAddress() {
      return this.consumerAddress;
   }

   @JsonProperty("areaProvince")
   public void setAreaProvince(String areaProvince) {
      this.areaProvince = areaProvince;
   }

   @JsonProperty("areaProvince")
   public String getAreaProvince() {
      return this.areaProvince;
   }

   @JsonProperty("areaCity")
   public void setAreaCity(String areaCity) {
      this.areaCity = areaCity;
   }

   @JsonProperty("areaCity")
   public String getAreaCity() {
      return this.areaCity;
   }

   @JsonProperty("areaCounty")
   public void setAreaCounty(String areaCounty) {
      this.areaCounty = areaCounty;
   }

   @JsonProperty("areaCounty")
   public String getAreaCounty() {
      return this.areaCounty;
   }

   @JsonProperty("jdStoreDeliver")
   public void setJdStoreDeliver(Long jdStoreDeliver) {
      this.jdStoreDeliver = jdStoreDeliver;
   }

   @JsonProperty("jdStoreDeliver")
   public Long getJdStoreDeliver() {
      return this.jdStoreDeliver;
   }

   @JsonProperty("jdStoreId")
   public void setJdStoreId(Long jdStoreId) {
      this.jdStoreId = jdStoreId;
   }

   @JsonProperty("jdStoreId")
   public Long getJdStoreId() {
      return this.jdStoreId;
   }

   @JsonProperty("skuList")
   public void setSkuList(List<PurchaseOrderSkuJosDO> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("skuList")
   public List<PurchaseOrderSkuJosDO> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(String updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public String getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("paymentType")
   public void setPaymentType(Integer paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("paymentType")
   public Integer getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("idSopShipmentType")
   public void setIdSopShipmentType(Integer idSopShipmentType) {
      this.idSopShipmentType = idSopShipmentType;
   }

   @JsonProperty("idSopShipmentType")
   public Integer getIdSopShipmentType() {
      return this.idSopShipmentType;
   }

   @JsonProperty("shangJiaRemark")
   public void setShangJiaRemark(String shangJiaRemark) {
      this.shangJiaRemark = shangJiaRemark;
   }

   @JsonProperty("shangJiaRemark")
   public String getShangJiaRemark() {
      return this.shangJiaRemark;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }

   @JsonProperty("appointDeliveryCompanyCode")
   public void setAppointDeliveryCompanyCode(Integer appointDeliveryCompanyCode) {
      this.appointDeliveryCompanyCode = appointDeliveryCompanyCode;
   }

   @JsonProperty("appointDeliveryCompanyCode")
   public Integer getAppointDeliveryCompanyCode() {
      return this.appointDeliveryCompanyCode;
   }

   @JsonProperty("open_id_buyer")
   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   @JsonProperty("open_id_buyer")
   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   @JsonProperty("xid_buyer")
   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   @JsonProperty("xid_buyer")
   public String getXidBuyer() {
      return this.xidBuyer;
   }

   @JsonProperty("desen_consumerTel")
   public void setDesenConsumerTel(String desenConsumerTel) {
      this.desenConsumerTel = desenConsumerTel;
   }

   @JsonProperty("desen_consumerTel")
   public String getDesenConsumerTel() {
      return this.desenConsumerTel;
   }
}

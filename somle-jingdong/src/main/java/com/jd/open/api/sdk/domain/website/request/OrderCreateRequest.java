package com.jd.open.api.sdk.domain.website.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.website.response.OrderCreateResponse;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderCreateRequest extends AbstractRequest implements JdRequest<OrderCreateResponse> {
   private String skusInfo;
   private String buyerName;
   private String receiverName;
   private String receiverProvinc;
   private String receiverCity;
   private String receiverArea;
   private String receiverAddress;
   private String receiverZip;
   private String receiverPhone;
   private String receiverMobile;
   private String receiverEmail;
   private String price;
   private String promotionPrice;
   private String paymentType;
   private String paymentWay;
   private String shipmentType;
   private String codTime;

   @JsonProperty("skus_info")
   public String getSkusInfo() {
      return this.skusInfo;
   }

   @JsonProperty("skus_info")
   public void setSkusInfo(String skusInfo) {
      this.skusInfo = skusInfo;
   }

   @JsonProperty("buyer_name")
   public String getBuyerName() {
      return this.buyerName;
   }

   @JsonProperty("buyer_name")
   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   @JsonProperty("receiver_name")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("receiver_name")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiver_provinc")
   public String getReceiverProvinc() {
      return this.receiverProvinc;
   }

   @JsonProperty("receiver_provinc")
   public void setReceiverProvinc(String receiverProvinc) {
      this.receiverProvinc = receiverProvinc;
   }

   @JsonProperty("receiver_city")
   public String getReceiverCity() {
      return this.receiverCity;
   }

   @JsonProperty("receiver_city")
   public void setReceiverCity(String receiverCity) {
      this.receiverCity = receiverCity;
   }

   @JsonProperty("receiver_area")
   public String getReceiverArea() {
      return this.receiverArea;
   }

   @JsonProperty("receiver_area")
   public void setReceiverArea(String receiverArea) {
      this.receiverArea = receiverArea;
   }

   @JsonProperty("receiver_address")
   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   @JsonProperty("receiver_address")
   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   @JsonProperty("receiver_zip")
   public String getReceiverZip() {
      return this.receiverZip;
   }

   @JsonProperty("receiver_zip")
   public void setReceiverZip(String receiverZip) {
      this.receiverZip = receiverZip;
   }

   @JsonProperty("receiver_phone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("receiver_phone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiver_mobile")
   public String getReceiverMobile() {
      return this.receiverMobile;
   }

   @JsonProperty("receiver_mobile")
   public void setReceiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
   }

   @JsonProperty("receiver_email")
   public String getReceiverEmail() {
      return this.receiverEmail;
   }

   @JsonProperty("receiver_email")
   public void setReceiverEmail(String receiverEmail) {
      this.receiverEmail = receiverEmail;
   }

   @JsonProperty("price")
   public String getPrice() {
      return this.price;
   }

   @JsonProperty("price")
   public void setPrice(String price) {
      this.price = price;
   }

   @JsonProperty("promotion_price")
   public String getPromotionPrice() {
      return this.promotionPrice;
   }

   @JsonProperty("promotion_price")
   public void setPromotionPrice(String promotionPrice) {
      this.promotionPrice = promotionPrice;
   }

   @JsonProperty("payment_type")
   public String getPaymentType() {
      return this.paymentType;
   }

   @JsonProperty("payment_type")
   public void setPaymentType(String paymentType) {
      this.paymentType = paymentType;
   }

   @JsonProperty("payment_way")
   public String getPaymentWay() {
      return this.paymentWay;
   }

   @JsonProperty("payment_way")
   public void setPaymentWay(String paymentWay) {
      this.paymentWay = paymentWay;
   }

   @JsonProperty("shipment_type")
   public String getShipmentType() {
      return this.shipmentType;
   }

   @JsonProperty("shipment_type")
   public void setShipmentType(String shipmentType) {
      this.shipmentType = shipmentType;
   }

   @JsonProperty("cod_time")
   public String getCodTime() {
      return this.codTime;
   }

   @JsonProperty("cod_time")
   public void setCodTime(String codTime) {
      this.codTime = codTime;
   }

   public String getApiMethod() {
      return "jingdong.order.create";
   }

   public String getAppJsonParams() throws IOException {
      Map map = new HashMap();
      map.put("skus_info", this.skusInfo);
      map.put("buyer_name", this.buyerName);
      map.put("receiver_name", this.receiverName);
      map.put("receiver_provinc", this.receiverProvinc);
      map.put("receiver_city", this.receiverCity);
      map.put("receiver_area", this.receiverArea);
      map.put("receiver_address", this.receiverAddress);
      map.put("receiver_zip", this.receiverZip);
      map.put("receiver_phone", this.receiverPhone);
      map.put("receiver_mobile", this.receiverMobile);
      map.put("receiver_email", this.receiverEmail);
      map.put("price", this.price);
      map.put("promotion_price", this.promotionPrice);
      map.put("payment_type", this.paymentType);
      map.put("payment_way", this.paymentWay);
      map.put("shipment_type", this.shipmentType);
      map.put("cod_time", this.codTime);
      return JsonUtil.toJson(map);
   }

   public Class<OrderCreateResponse> getResponseClass() {
      return OrderCreateResponse.class;
   }
}

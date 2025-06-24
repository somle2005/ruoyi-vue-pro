package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderSoplOutstorageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderSoplOutstorageRequest extends AbstractRequest implements JdRequest<OrderSoplOutstorageResponse> {
   private String orderId;
   private String packageNum;
   private String sendType;
   private String addressId;
   private String logisticsId;
   private String waybill;
   private String tradeNo;

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getApiMethod() {
      return "360buy.order.sopl.outstorage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("package_num", this.packageNum);
      map.put("send_type", this.sendType);
      map.put("trade_no", this.tradeNo);
      map.put("address_id", this.addressId);
      map.put("logistics_id", this.logisticsId);
      map.put("waybill", this.waybill);
      return JsonUtil.toJson(map);
   }

   public Class<OrderSoplOutstorageResponse> getResponseClass() {
      return OrderSoplOutstorageResponse.class;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getPackageNum() {
      return this.packageNum;
   }

   public void setPackageNum(String packageNum) {
      this.packageNum = packageNum;
   }

   public String getSendType() {
      return this.sendType;
   }

   public void setSendType(String sendType) {
      this.sendType = sendType;
   }

   public String getAddressId() {
      return this.addressId;
   }

   public void setAddressId(String addressId) {
      this.addressId = addressId;
   }

   public String getLogisticsId() {
      return this.logisticsId;
   }

   public void setLogisticsId(String logisticsId) {
      this.logisticsId = logisticsId;
   }

   public String getWaybill() {
      return this.waybill;
   }

   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }
}

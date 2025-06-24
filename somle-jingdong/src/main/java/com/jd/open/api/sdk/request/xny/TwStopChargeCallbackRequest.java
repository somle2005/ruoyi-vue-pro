package com.jd.open.api.sdk.request.xny;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.TwStopChargeCallbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class TwStopChargeCallbackRequest extends AbstractRequest implements JdRequest<TwStopChargeCallbackResponse> {
   private Integer jdVenderId;
   private Double powerCount;
   private Double totalServiceFee;
   private String cardNum;
   private Integer portNum;
   private Integer endType;
   private Double payPrice;
   private Double totalElectricMoney;
   private String orderNum;
   private Long startTime;
   private Long endTime;
   private String deviceId;

   public void setJdVenderId(Integer jdVenderId) {
      this.jdVenderId = jdVenderId;
   }

   public Integer getJdVenderId() {
      return this.jdVenderId;
   }

   public void setPowerCount(Double powerCount) {
      this.powerCount = powerCount;
   }

   public Double getPowerCount() {
      return this.powerCount;
   }

   public void setTotalServiceFee(Double totalServiceFee) {
      this.totalServiceFee = totalServiceFee;
   }

   public Double getTotalServiceFee() {
      return this.totalServiceFee;
   }

   public void setCardNum(String cardNum) {
      this.cardNum = cardNum;
   }

   public String getCardNum() {
      return this.cardNum;
   }

   public void setPortNum(Integer portNum) {
      this.portNum = portNum;
   }

   public Integer getPortNum() {
      return this.portNum;
   }

   public void setEndType(Integer endType) {
      this.endType = endType;
   }

   public Integer getEndType() {
      return this.endType;
   }

   public void setPayPrice(Double payPrice) {
      this.payPrice = payPrice;
   }

   public Double getPayPrice() {
      return this.payPrice;
   }

   public void setTotalElectricMoney(Double totalElectricMoney) {
      this.totalElectricMoney = totalElectricMoney;
   }

   public Double getTotalElectricMoney() {
      return this.totalElectricMoney;
   }

   public void setOrderNum(String orderNum) {
      this.orderNum = orderNum;
   }

   public String getOrderNum() {
      return this.orderNum;
   }

   public void setStartTime(Long startTime) {
      this.startTime = startTime;
   }

   public Long getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Long endTime) {
      this.endTime = endTime;
   }

   public Long getEndTime() {
      return this.endTime;
   }

   public void setDeviceId(String deviceId) {
      this.deviceId = deviceId;
   }

   public String getDeviceId() {
      return this.deviceId;
   }

   public String getApiMethod() {
      return "jingdong.tw.stop.charge.callback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("jdVenderId", this.jdVenderId);
      pmap.put("powerCount", this.powerCount);
      pmap.put("totalServiceFee", this.totalServiceFee);
      pmap.put("cardNum", this.cardNum);
      pmap.put("portNum", this.portNum);
      pmap.put("endType", this.endType);
      pmap.put("payPrice", this.payPrice);
      pmap.put("totalElectricMoney", this.totalElectricMoney);
      pmap.put("orderNum", this.orderNum);
      pmap.put("startTime", this.startTime);
      pmap.put("endTime", this.endTime);
      pmap.put("deviceId", this.deviceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<TwStopChargeCallbackResponse> getResponseClass() {
      return TwStopChargeCallbackResponse.class;
   }
}

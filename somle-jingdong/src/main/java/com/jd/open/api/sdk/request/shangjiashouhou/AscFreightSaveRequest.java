package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscFreightSaveResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class AscFreightSaveRequest extends AbstractRequest implements JdRequest<AscFreightSaveResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String expressCode;
   private String expressCompany;
   private BigDecimal freightMoney;
   private Integer shipWayId;
   private String extJsonStr;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setExpressCompany(String expressCompany) {
      this.expressCompany = expressCompany;
   }

   public String getExpressCompany() {
      return this.expressCompany;
   }

   public void setFreightMoney(BigDecimal freightMoney) {
      this.freightMoney = freightMoney;
   }

   public BigDecimal getFreightMoney() {
      return this.freightMoney;
   }

   public void setShipWayId(Integer shipWayId) {
      this.shipWayId = shipWayId;
   }

   public Integer getShipWayId() {
      return this.shipWayId;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.freight.save";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("expressCode", this.expressCode);
      pmap.put("expressCompany", this.expressCompany);
      pmap.put("freightMoney", this.freightMoney);
      pmap.put("shipWayId", this.shipWayId);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscFreightSaveResponse> getResponseClass() {
      return AscFreightSaveResponse.class;
   }
}

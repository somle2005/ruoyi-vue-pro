package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderShipmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderShipmentRequest extends AbstractRequest implements JdRequest<PopOrderShipmentResponse> {
   private long orderId;
   private String logiCoprId;
   private String logiNo;
   private Long installId;
   private Long venderTaskAddressId;

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public void setLogiCoprId(String logiCoprId) {
      this.logiCoprId = logiCoprId;
   }

   public String getLogiCoprId() {
      return this.logiCoprId;
   }

   public void setLogiNo(String logiNo) {
      this.logiNo = logiNo;
   }

   public String getLogiNo() {
      return this.logiNo;
   }

   public void setInstallId(Long installId) {
      this.installId = installId;
   }

   public Long getInstallId() {
      return this.installId;
   }

   public void setVenderTaskAddressId(Long venderTaskAddressId) {
      this.venderTaskAddressId = venderTaskAddressId;
   }

   public Long getVenderTaskAddressId() {
      return this.venderTaskAddressId;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.shipment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("logiCoprId", this.logiCoprId);
      pmap.put("logiNo", this.logiNo);
      pmap.put("installId", this.installId);
      pmap.put("venderTaskAddressId", this.venderTaskAddressId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderShipmentResponse> getResponseClass() {
      return PopOrderShipmentResponse.class;
   }
}

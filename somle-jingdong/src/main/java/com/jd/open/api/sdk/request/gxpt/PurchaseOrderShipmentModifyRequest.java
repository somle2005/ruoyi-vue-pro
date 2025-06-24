package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.PurchaseOrderShipmentModifyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PurchaseOrderShipmentModifyRequest extends AbstractRequest implements JdRequest<PurchaseOrderShipmentModifyResponse> {
   private Long orderId;
   private String shipCompanyName;
   private String shipmentNo;
   private String shipCompanyId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setShipCompanyName(String shipCompanyName) {
      this.shipCompanyName = shipCompanyName;
   }

   public String getShipCompanyName() {
      return this.shipCompanyName;
   }

   public void setShipmentNo(String shipmentNo) {
      this.shipmentNo = shipmentNo;
   }

   public String getShipmentNo() {
      return this.shipmentNo;
   }

   public void setShipCompanyId(String shipCompanyId) {
      this.shipCompanyId = shipCompanyId;
   }

   public String getShipCompanyId() {
      return this.shipCompanyId;
   }

   public String getApiMethod() {
      return "jingdong.purchase.order.shipment.modify";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("shipCompanyName", this.shipCompanyName);
      pmap.put("shipmentNo", this.shipmentNo);
      pmap.put("shipCompanyId", this.shipCompanyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PurchaseOrderShipmentModifyResponse> getResponseClass() {
      return PurchaseOrderShipmentModifyResponse.class;
   }
}

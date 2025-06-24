package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.PurchaseOrderStockOutResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PurchaseOrderStockOutRequest extends AbstractRequest implements JdRequest<PurchaseOrderStockOutResponse> {
   private Long purchaseId;
   private Integer shipmentId;
   private String shipmentNo;
   private String tradeNo;

   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   public Long getPurchaseId() {
      return this.purchaseId;
   }

   public void setShipmentId(Integer shipmentId) {
      this.shipmentId = shipmentId;
   }

   public Integer getShipmentId() {
      return this.shipmentId;
   }

   public void setShipmentNo(String shipmentNo) {
      this.shipmentNo = shipmentNo;
   }

   public String getShipmentNo() {
      return this.shipmentNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public String getApiMethod() {
      return "jingdong.purchase.order.stock.out";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("purchaseId", this.purchaseId);
      pmap.put("shipmentId", this.shipmentId);
      pmap.put("shipmentNo", this.shipmentNo);
      pmap.put("tradeNo", this.tradeNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PurchaseOrderStockOutResponse> getResponseClass() {
      return PurchaseOrderStockOutResponse.class;
   }
}

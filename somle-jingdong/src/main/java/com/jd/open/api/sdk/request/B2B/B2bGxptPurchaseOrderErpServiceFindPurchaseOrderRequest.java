package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bGxptPurchaseOrderErpServiceFindPurchaseOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bGxptPurchaseOrderErpServiceFindPurchaseOrderRequest extends AbstractRequest implements JdRequest<B2bGxptPurchaseOrderErpServiceFindPurchaseOrderResponse> {
   private Long venderId;
   private Long purchaseOrderId;
   private Long jdOrderId;

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setPurchaseOrderId(Long purchaseOrderId) {
      this.purchaseOrderId = purchaseOrderId;
   }

   public Long getPurchaseOrderId() {
      return this.purchaseOrderId;
   }

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public String getApiMethod() {
      return "jingdong.b2b.gxpt.purchaseOrderErpService.findPurchaseOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("purchaseOrderId", this.purchaseOrderId);
      pmap.put("jdOrderId", this.jdOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bGxptPurchaseOrderErpServiceFindPurchaseOrderResponse> getResponseClass() {
      return B2bGxptPurchaseOrderErpServiceFindPurchaseOrderResponse.class;
   }
}

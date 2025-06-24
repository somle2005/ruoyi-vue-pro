package com.jd.open.api.sdk.request.gxpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gxpt.PurchaseOrderGetInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PurchaseOrderGetInfoRequest extends AbstractRequest implements JdRequest<PurchaseOrderGetInfoResponse> {
   private Long purchaseId;

   public void setPurchaseId(Long purchaseId) {
      this.purchaseId = purchaseId;
   }

   public Long getPurchaseId() {
      return this.purchaseId;
   }

   public String getApiMethod() {
      return "jingdong.purchase.order.get.info";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("purchaseId", this.purchaseId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PurchaseOrderGetInfoResponse> getResponseClass() {
      return PurchaseOrderGetInfoResponse.class;
   }
}

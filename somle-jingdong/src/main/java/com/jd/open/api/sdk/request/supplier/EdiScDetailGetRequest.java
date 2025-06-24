package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiScDetailGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiScDetailGetRequest extends AbstractRequest implements JdRequest<EdiScDetailGetResponse> {
   private String purchaseOrderCode;

   public void setPurchaseOrderCode(String purchaseOrderCode) {
      this.purchaseOrderCode = purchaseOrderCode;
   }

   public String getPurchaseOrderCode() {
      return this.purchaseOrderCode;
   }

   public String getApiMethod() {
      return "jingdong.edi.sc.detail.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("purchaseOrderCode", this.purchaseOrderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiScDetailGetResponse> getResponseClass() {
      return EdiScDetailGetResponse.class;
   }
}

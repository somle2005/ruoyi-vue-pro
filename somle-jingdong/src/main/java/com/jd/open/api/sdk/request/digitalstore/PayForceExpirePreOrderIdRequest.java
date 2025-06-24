package com.jd.open.api.sdk.request.digitalstore;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.digitalstore.PayForceExpirePreOrderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PayForceExpirePreOrderIdRequest extends AbstractRequest implements JdRequest<PayForceExpirePreOrderIdResponse> {
   private String preOrderId;

   public void setPreOrderId(String preOrderId) {
      this.preOrderId = preOrderId;
   }

   public String getPreOrderId() {
      return this.preOrderId;
   }

   public String getApiMethod() {
      return "jingdong.pay.forceExpirePreOrderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("preOrderId", this.preOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PayForceExpirePreOrderIdResponse> getResponseClass() {
      return PayForceExpirePreOrderIdResponse.class;
   }
}

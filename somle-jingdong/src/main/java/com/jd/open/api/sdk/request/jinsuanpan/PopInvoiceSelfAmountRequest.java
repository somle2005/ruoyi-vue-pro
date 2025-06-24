package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopInvoiceSelfAmountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopInvoiceSelfAmountRequest extends AbstractRequest implements JdRequest<PopInvoiceSelfAmountResponse> {
   private String orderId;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.invoice.self.amount";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopInvoiceSelfAmountResponse> getResponseClass() {
      return PopInvoiceSelfAmountResponse.class;
   }
}

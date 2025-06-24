package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopCinvoiceApplyOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCinvoiceApplyOrderRequest extends AbstractRequest implements JdRequest<PopCinvoiceApplyOrderResponse> {
   private Long orderId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public String getApiMethod() {
      return "jingdong.pop.cinvoice.apply.order";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCinvoiceApplyOrderResponse> getResponseClass() {
      return PopCinvoiceApplyOrderResponse.class;
   }
}

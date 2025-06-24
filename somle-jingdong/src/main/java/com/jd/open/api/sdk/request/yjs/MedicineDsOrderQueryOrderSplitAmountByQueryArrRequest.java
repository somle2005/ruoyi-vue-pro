package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderQueryOrderSplitAmountByQueryArrResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderQueryOrderSplitAmountByQueryArrRequest extends AbstractRequest implements JdRequest<MedicineDsOrderQueryOrderSplitAmountByQueryArrResponse> {
   private String orderId;
   private String clientIp;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.queryOrderSplitAmountByQueryArr";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("clientIp", this.clientIp);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderQueryOrderSplitAmountByQueryArrResponse> getResponseClass() {
      return MedicineDsOrderQueryOrderSplitAmountByQueryArrResponse.class;
   }
}

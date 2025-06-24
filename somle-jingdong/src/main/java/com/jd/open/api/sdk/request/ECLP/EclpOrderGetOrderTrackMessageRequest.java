package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderGetOrderTrackMessageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderGetOrderTrackMessageRequest extends AbstractRequest implements JdRequest<EclpOrderGetOrderTrackMessageResponse> {
   private String orderNo;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.getOrderTrackMessage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderGetOrderTrackMessageResponse> getResponseClass() {
      return EclpOrderGetOrderTrackMessageResponse.class;
   }
}

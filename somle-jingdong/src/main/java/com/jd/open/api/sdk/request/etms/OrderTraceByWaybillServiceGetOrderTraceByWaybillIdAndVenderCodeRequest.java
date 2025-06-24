package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeRequest extends AbstractRequest implements JdRequest<OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeResponse> {
   private String venderCode;
   private String waybillId;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   public String getWaybillId() {
      return this.waybillId;
   }

   public String getApiMethod() {
      return "jingdong.orderTraceByWaybillService.getOrderTraceByWaybillIdAndVenderCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("waybillId", this.waybillId);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeResponse> getResponseClass() {
      return OrderTraceByWaybillServiceGetOrderTraceByWaybillIdAndVenderCodeResponse.class;
   }
}

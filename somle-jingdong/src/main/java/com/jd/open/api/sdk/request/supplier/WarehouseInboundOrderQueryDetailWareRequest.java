package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseInboundOrderQueryDetailWareResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseInboundOrderQueryDetailWareRequest extends AbstractRequest implements JdRequest<WarehouseInboundOrderQueryDetailWareResponse> {
   private String docNo;

   public void setDocNo(String docNo) {
      this.docNo = docNo;
   }

   public String getDocNo() {
      return this.docNo;
   }

   public String getApiMethod() {
      return "jingdong.warehouse.inbound.order.query.detail.ware";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("docNo", this.docNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<WarehouseInboundOrderQueryDetailWareResponse> getResponseClass() {
      return WarehouseInboundOrderQueryDetailWareResponse.class;
   }
}

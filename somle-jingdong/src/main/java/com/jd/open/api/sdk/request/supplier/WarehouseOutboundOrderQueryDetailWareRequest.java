package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.WarehouseOutboundOrderQueryDetailWareResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WarehouseOutboundOrderQueryDetailWareRequest extends AbstractRequest implements JdRequest<WarehouseOutboundOrderQueryDetailWareResponse> {
   private String stockOutNo;

   public void setStockOutNo(String stockOutNo) {
      this.stockOutNo = stockOutNo;
   }

   public String getStockOutNo() {
      return this.stockOutNo;
   }

   public String getApiMethod() {
      return "jingdong.warehouse.outbound.order.query.detail.ware";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("stockOutNo", this.stockOutNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<WarehouseOutboundOrderQueryDetailWareResponse> getResponseClass() {
      return WarehouseOutboundOrderQueryDetailWareResponse.class;
   }
}

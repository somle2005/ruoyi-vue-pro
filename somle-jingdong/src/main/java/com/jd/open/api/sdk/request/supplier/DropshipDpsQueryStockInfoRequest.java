package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsQueryStockInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsQueryStockInfoRequest extends AbstractRequest implements JdRequest<DropshipDpsQueryStockInfoResponse> {
   private String sku;

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.queryStockInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku", this.sku);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsQueryStockInfoResponse> getResponseClass() {
      return DropshipDpsQueryStockInfoResponse.class;
   }
}

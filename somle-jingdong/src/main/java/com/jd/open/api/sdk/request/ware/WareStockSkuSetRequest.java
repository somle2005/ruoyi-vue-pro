package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.JosStockService.request.set.JosUpdateStockReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareStockSkuSetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareStockSkuSetRequest extends AbstractRequest implements JdRequest<WareStockSkuSetResponse> {
   private JosUpdateStockReq req;

   public String getApiMethod() {
      return "jingdong.ware.stock.sku.set";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("req", this.req);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareStockSkuSetResponse> getResponseClass() {
      return WareStockSkuSetResponse.class;
   }

   @JsonProperty("req")
   public void setReq(JosUpdateStockReq req) {
      this.req = req;
   }

   @JsonProperty("req")
   public JosUpdateStockReq getReq() {
      return this.req;
   }
}

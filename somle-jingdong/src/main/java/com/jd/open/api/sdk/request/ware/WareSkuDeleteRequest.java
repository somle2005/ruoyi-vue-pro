package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuDeleteRequest extends AbstractRequest implements JdRequest<WareSkuDeleteResponse> {
   private String skuId;
   private String tradeNo;

   public String getApiMethod() {
      return "360buy.ware.sku.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("trade_no", this.tradeNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuDeleteResponse> getResponseClass() {
      return WareSkuDeleteResponse.class;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }
}

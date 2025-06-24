package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareStockSkuQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareStockSkuQueryRequest extends AbstractRequest implements JdRequest<WareStockSkuQueryResponse> {
   private String stockModel;
   private Long skuId;

   public void setStockModel(String stockModel) {
      this.stockModel = stockModel;
   }

   public String getStockModel() {
      return this.stockModel;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.ware.stock.sku.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("stockModel", this.stockModel);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareStockSkuQueryResponse> getResponseClass() {
      return WareStockSkuQueryResponse.class;
   }
}

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.StockWriteUpdateSkuStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StockWriteUpdateSkuStockRequest extends AbstractRequest implements JdRequest<StockWriteUpdateSkuStockResponse> {
   private Long skuId;
   private Long stockNum;
   private Long storeId;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setStockNum(Long stockNum) {
      this.stockNum = stockNum;
   }

   public Long getStockNum() {
      return this.stockNum;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.stock.write.updateSkuStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("stockNum", this.stockNum);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<StockWriteUpdateSkuStockResponse> getResponseClass() {
      return StockWriteUpdateSkuStockResponse.class;
   }
}

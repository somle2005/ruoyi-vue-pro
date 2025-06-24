package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.StockWriteIncreaseSkuStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StockWriteIncreaseSkuStockRequest extends AbstractRequest implements JdRequest<StockWriteIncreaseSkuStockResponse> {
   private Long skuId;
   private Long stockNum;
   private Long storeId;
   private String stockRfId;

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

   public void setStockRfId(String stockRfId) {
      this.stockRfId = stockRfId;
   }

   public String getStockRfId() {
      return this.stockRfId;
   }

   public String getApiMethod() {
      return "jingdong.stock.write.increaseSkuStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("stockNum", this.stockNum);
      pmap.put("storeId", this.storeId);
      pmap.put("stockRfId", this.stockRfId);
      return JsonUtil.toJson(pmap);
   }

   public Class<StockWriteIncreaseSkuStockResponse> getResponseClass() {
      return StockWriteIncreaseSkuStockResponse.class;
   }
}

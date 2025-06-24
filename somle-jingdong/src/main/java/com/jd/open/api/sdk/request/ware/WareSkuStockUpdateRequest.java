package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuStockUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuStockUpdateRequest extends AbstractRequest implements JdRequest<WareSkuStockUpdateResponse> {
   private String skuId;
   private String outerId;
   private String quantity;
   private String tradeNo;
   private String storeId;

   public String getApiMethod() {
      return "360buy.sku.stock.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("outer_id", this.outerId);
      pmap.put("quantity", this.quantity);
      pmap.put("trade_no", this.tradeNo);
      pmap.put("store_id", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuStockUpdateResponse> getResponseClass() {
      return WareSkuStockUpdateResponse.class;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }
}

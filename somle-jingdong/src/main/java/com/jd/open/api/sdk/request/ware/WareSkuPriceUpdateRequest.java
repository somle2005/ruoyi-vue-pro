package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuPriceUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuPriceUpdateRequest extends AbstractRequest implements JdRequest<WareSkuPriceUpdateResponse> {
   private String skuId;
   private String outerId;
   private String price;
   private String tradeNo;
   private String marketPrice;
   private String jdPrice;

   public String getApiMethod() {
      return "360buy.sku.price.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("outer_id", this.outerId);
      pmap.put("price", this.price);
      pmap.put("market_price", this.marketPrice);
      pmap.put("jd_price", this.jdPrice);
      pmap.put("trade_no", this.tradeNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuPriceUpdateResponse> getResponseClass() {
      return WareSkuPriceUpdateResponse.class;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getPrice() {
      return this.price;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getMarketPrice() {
      return this.marketPrice;
   }

   public void setMarketPrice(String marketPrice) {
      this.marketPrice = marketPrice;
   }

   public String getJdPrice() {
      return this.jdPrice;
   }

   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }
}

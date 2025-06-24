package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuUpdateRequest extends AbstractRequest implements JdRequest<WareSkuUpdateResponse> {
   private String skuId;
   private String wareId;
   private String outerId;
   private String attributes;
   private String jdPrice;
   private String stockNum;
   private String tradeNo;
   private String skuUpcCode;

   public String getApiMethod() {
      return "360buy.ware.sku.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("ware_id", this.wareId);
      pmap.put("outer_id", this.outerId);
      pmap.put("attributes", this.attributes);
      pmap.put("stock_num", this.stockNum);
      pmap.put("jd_price", this.jdPrice);
      pmap.put("trade_no", this.tradeNo);
      pmap.put("sku_upccode", this.skuUpcCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuUpdateResponse> getResponseClass() {
      return WareSkuUpdateResponse.class;
   }

   public String getSkuUpcCode() {
      return this.skuUpcCode;
   }

   public void setSkuUpcCode(String skuUpcCode) {
      this.skuUpcCode = skuUpcCode;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getAttributes() {
      return this.attributes;
   }

   public void setAttributes(String attributes) {
      this.attributes = attributes;
   }

   public String getJdPrice() {
      return this.jdPrice;
   }

   public void setJdPrice(String jdPrice) {
      this.jdPrice = jdPrice;
   }

   public String getStockNum() {
      return this.stockNum;
   }

   public void setStockNum(String stockNum) {
      this.stockNum = stockNum;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
   }
}

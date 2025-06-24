package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareSkuAddResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareSkuAddRequest extends AbstractRequest implements JdRequest<WareSkuAddResponse> {
   private String wareId;
   private String attributes;
   private String jdPrice;
   private String stockNum;
   private String tradeNo;
   private String outerId;
   private String skuUpcCode;

   public String getApiMethod() {
      return "360buy.ware.sku.add";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("attributes", this.attributes);
      pmap.put("stock_num", this.stockNum);
      pmap.put("jd_price", this.jdPrice);
      pmap.put("trade_no", this.tradeNo);
      pmap.put("outer_id", this.outerId);
      pmap.put("sku_upccode", this.skuUpcCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareSkuAddResponse> getResponseClass() {
      return WareSkuAddResponse.class;
   }

   public String getSkuUpcCode() {
      return this.skuUpcCode;
   }

   public void setSkuUpcCode(String skuUpcCode) {
      this.skuUpcCode = skuUpcCode;
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

   public String getOuterId() {
      return this.outerId;
   }

   public void setOuterId(String outerId) {
      this.outerId = outerId;
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
}

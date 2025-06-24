package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicStockImportResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicStockImportRequest extends AbstractRequest implements JdRequest<OmnicStockImportResponse> {
   private String authKey;
   private String jdSkuId;
   private String stockType;
   private String outerSkuId;
   private String upc;
   private String updateTime;
   private String spotStockNum;
   private String storeId;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setJdSkuId(String jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   public String getJdSkuId() {
      return this.jdSkuId;
   }

   public void setStockType(String stockType) {
      this.stockType = stockType;
   }

   public String getStockType() {
      return this.stockType;
   }

   public void setOuterSkuId(String outerSkuId) {
      this.outerSkuId = outerSkuId;
   }

   public String getOuterSkuId() {
      return this.outerSkuId;
   }

   public void setUpc(String upc) {
      this.upc = upc;
   }

   public String getUpc() {
      return this.upc;
   }

   public void setUpdateTime(String updateTime) {
      this.updateTime = updateTime;
   }

   public String getUpdateTime() {
      return this.updateTime;
   }

   public void setSpotStockNum(String spotStockNum) {
      this.spotStockNum = spotStockNum;
   }

   public String getSpotStockNum() {
      return this.spotStockNum;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.omnic.stock.import";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("jdSkuId", this.jdSkuId);
      pmap.put("stockType", this.stockType);
      pmap.put("outerSkuId", this.outerSkuId);
      pmap.put("upc", this.upc);
      pmap.put("updateTime", this.updateTime);
      pmap.put("spotStockNum", this.spotStockNum);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicStockImportResponse> getResponseClass() {
      return OmnicStockImportResponse.class;
   }
}

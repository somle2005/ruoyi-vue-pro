package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsPartitionStockIncrementmaintainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsPartitionStockIncrementmaintainRequest extends AbstractRequest implements JdRequest<DropshipDpsPartitionStockIncrementmaintainResponse> {
   private String sku;
   private String stockNum;
   private String storeId;
   private String rfId;

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public void setStockNum(String stockNum) {
      this.stockNum = stockNum;
   }

   public String getStockNum() {
      return this.stockNum;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setRfId(String rfId) {
      this.rfId = rfId;
   }

   public String getRfId() {
      return this.rfId;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.partitionStock.incrementmaintain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku", this.sku);
      pmap.put("stockNum", this.stockNum);
      pmap.put("storeId", this.storeId);
      pmap.put("rfId", this.rfId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsPartitionStockIncrementmaintainResponse> getResponseClass() {
      return DropshipDpsPartitionStockIncrementmaintainResponse.class;
   }
}

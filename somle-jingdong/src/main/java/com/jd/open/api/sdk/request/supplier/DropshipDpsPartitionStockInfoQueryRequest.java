package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsPartitionStockInfoQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsPartitionStockInfoQueryRequest extends AbstractRequest implements JdRequest<DropshipDpsPartitionStockInfoQueryResponse> {
   private String sku;
   private String storeId;
   private String page;
   private String pageSize;

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPage() {
      return this.page;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.partitionStockInfo.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku", this.sku);
      pmap.put("storeId", this.storeId);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsPartitionStockInfoQueryResponse> getResponseClass() {
      return DropshipDpsPartitionStockInfoQueryResponse.class;
   }
}

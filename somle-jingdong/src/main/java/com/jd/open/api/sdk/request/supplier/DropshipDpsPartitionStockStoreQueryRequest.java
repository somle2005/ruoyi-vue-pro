package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsPartitionStockStoreQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsPartitionStockStoreQueryRequest extends AbstractRequest implements JdRequest<DropshipDpsPartitionStockStoreQueryResponse> {
   private String status;

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.partitionStock.store.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsPartitionStockStoreQueryResponse> getResponseClass() {
      return DropshipDpsPartitionStockStoreQueryResponse.class;
   }
}

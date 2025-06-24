package com.jd.open.api.sdk.request.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ISupplierStockSoaService.request.batchAddOrUpdateSupplierStock.BatchSupplierStockDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.JdiSupplyBatchAddOrUpdateSupplierStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JdiSupplyBatchAddOrUpdateSupplierStockRequest extends AbstractRequest implements JdRequest<JdiSupplyBatchAddOrUpdateSupplierStockResponse> {
   private BatchSupplierStockDto batchSupplierStockDto;

   public String getApiMethod() {
      return "jingdong.jdi.supply.batchAddOrUpdateSupplierStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("batchSupplierStockDto", this.batchSupplierStockDto);
      return JsonUtil.toJson(pmap);
   }

   public Class<JdiSupplyBatchAddOrUpdateSupplierStockResponse> getResponseClass() {
      return JdiSupplyBatchAddOrUpdateSupplierStockResponse.class;
   }

   @JsonProperty("batchSupplierStockDto")
   public void setBatchSupplierStockDto(BatchSupplierStockDto batchSupplierStockDto) {
      this.batchSupplierStockDto = batchSupplierStockDto;
   }

   @JsonProperty("batchSupplierStockDto")
   public BatchSupplierStockDto getBatchSupplierStockDto() {
      return this.batchSupplierStockDto;
   }
}

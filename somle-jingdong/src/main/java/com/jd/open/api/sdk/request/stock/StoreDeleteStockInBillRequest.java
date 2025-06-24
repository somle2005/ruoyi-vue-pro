package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.stock.StoreDeleteStockInBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StoreDeleteStockInBillRequest extends AbstractRequest implements JdRequest<StoreDeleteStockInBillResponse> {
   private Long stockInBillId;

   public void setStockInBillId(Long stockInBillId) {
      this.stockInBillId = stockInBillId;
   }

   public Long getStockInBillId() {
      return this.stockInBillId;
   }

   public String getApiMethod() {
      return "jingdong.store.deleteStockInBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("stock_in_bill_id", this.stockInBillId);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreDeleteStockInBillResponse> getResponseClass() {
      return StoreDeleteStockInBillResponse.class;
   }
}

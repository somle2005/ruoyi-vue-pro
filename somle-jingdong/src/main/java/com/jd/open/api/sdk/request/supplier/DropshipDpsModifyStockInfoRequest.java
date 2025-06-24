package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsModifyStockInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsModifyStockInfoRequest extends AbstractRequest implements JdRequest<DropshipDpsModifyStockInfoResponse> {
   private String sku;
   private String stockNum;

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

   public String getApiMethod() {
      return "jingdong.dropship.dps.modifyStockInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku", this.sku);
      pmap.put("stockNum", this.stockNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsModifyStockInfoResponse> getResponseClass() {
      return DropshipDpsModifyStockInfoResponse.class;
   }
}

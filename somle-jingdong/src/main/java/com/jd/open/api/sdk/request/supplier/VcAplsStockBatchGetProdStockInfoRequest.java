package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcAplsStockBatchGetProdStockInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcAplsStockBatchGetProdStockInfoRequest extends AbstractRequest implements JdRequest<VcAplsStockBatchGetProdStockInfoResponse> {
   private String vendorCode;
   private String skuList;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setSkuList(String skuList) {
      this.skuList = skuList;
   }

   public String getSkuList() {
      return this.skuList;
   }

   public String getApiMethod() {
      return "jingdong.vc.apls.stock.batchGetProdStockInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("skuList", this.skuList);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcAplsStockBatchGetProdStockInfoResponse> getResponseClass() {
      return VcAplsStockBatchGetProdStockInfoResponse.class;
   }
}

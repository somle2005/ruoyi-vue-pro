package com.jd.open.api.sdk.request.kdgjapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.kdgjapi.LdopAlphaProviderStockQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderStockQueryRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderStockQueryResponse> {
   private String providerCode;
   private String branchCode;
   private String vendorCode;

   public void setProviderCode(String providerCode) {
      this.providerCode = providerCode;
   }

   public String getProviderCode() {
      return this.providerCode;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.stock.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("providerCode", this.providerCode);
      pmap.put("branchCode", this.branchCode);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderStockQueryResponse> getResponseClass() {
      return LdopAlphaProviderStockQueryResponse.class;
   }
}

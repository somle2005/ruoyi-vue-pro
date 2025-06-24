package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaVendorStockQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaVendorStockQueryRequest extends AbstractRequest implements JdRequest<LdopAlphaVendorStockQueryResponse> {
   private String vendorCode;
   private Integer providerId;
   private String branchCode;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setProviderId(Integer providerId) {
      this.providerId = providerId;
   }

   public Integer getProviderId() {
      return this.providerId;
   }

   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   public String getBranchCode() {
      return this.branchCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.vendor.stock.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("providerId", this.providerId);
      pmap.put("branchCode", this.branchCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaVendorStockQueryResponse> getResponseClass() {
      return LdopAlphaVendorStockQueryResponse.class;
   }
}

package com.jd.open.api.sdk.request.wujiemiandan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wujiemiandan.LdopAlphaVendorStockQueryByProviderCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaVendorStockQueryByProviderCodeRequest extends AbstractRequest implements JdRequest<LdopAlphaVendorStockQueryByProviderCodeResponse> {
   private String vendorCode;
   private String providerCode;
   private String branchCode;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

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

   public String getApiMethod() {
      return "jingdong.ldop.alpha.vendor.stock.queryByProviderCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("providerCode", this.providerCode);
      pmap.put("branchCode", this.branchCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaVendorStockQueryByProviderCodeResponse> getResponseClass() {
      return LdopAlphaVendorStockQueryByProviderCodeResponse.class;
   }
}

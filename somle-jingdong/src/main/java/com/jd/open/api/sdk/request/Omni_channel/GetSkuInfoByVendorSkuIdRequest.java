package com.jd.open.api.sdk.request.Omni_channel;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Omni_channel.GetSkuInfoByVendorSkuIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetSkuInfoByVendorSkuIdRequest extends AbstractRequest implements JdRequest<GetSkuInfoByVendorSkuIdResponse> {
   private String authKey;
   private String pin;
   private String vendorSkuId;
   private Long tenantId;
   private Long storeId;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setVendorSkuId(String vendorSkuId) {
      this.vendorSkuId = vendorSkuId;
   }

   public String getVendorSkuId() {
      return this.vendorSkuId;
   }

   public void setTenantId(Long tenantId) {
      this.tenantId = tenantId;
   }

   public Long getTenantId() {
      return this.tenantId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.getSkuInfoByVendorSkuId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pin", this.pin);
      pmap.put("vendorSkuId", this.vendorSkuId);
      pmap.put("tenantId", this.tenantId);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetSkuInfoByVendorSkuIdResponse> getResponseClass() {
      return GetSkuInfoByVendorSkuIdResponse.class;
   }
}

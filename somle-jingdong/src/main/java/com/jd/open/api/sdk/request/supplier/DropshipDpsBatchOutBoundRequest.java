package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsBatchOutBoundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsBatchOutBoundRequest extends AbstractRequest implements JdRequest<DropshipDpsBatchOutBoundResponse> {
   private String customOrderId;
   private String memoByVendor;
   private String isJdexpress;
   private String parentOrderId;
   private String addressId;

   public void setCustomOrderId(String customOrderId) {
      this.customOrderId = customOrderId;
   }

   public String getCustomOrderId() {
      return this.customOrderId;
   }

   public void setMemoByVendor(String memoByVendor) {
      this.memoByVendor = memoByVendor;
   }

   public String getMemoByVendor() {
      return this.memoByVendor;
   }

   public void setIsJdexpress(String isJdexpress) {
      this.isJdexpress = isJdexpress;
   }

   public String getIsJdexpress() {
      return this.isJdexpress;
   }

   public void setParentOrderId(String parentOrderId) {
      this.parentOrderId = parentOrderId;
   }

   public String getParentOrderId() {
      return this.parentOrderId;
   }

   public void setAddressId(String addressId) {
      this.addressId = addressId;
   }

   public String getAddressId() {
      return this.addressId;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.batchOutBound";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      pmap.put("memoByVendor", this.memoByVendor);
      pmap.put("isJdexpress", this.isJdexpress);
      pmap.put("parentOrderId", this.parentOrderId);
      pmap.put("addressId", this.addressId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsBatchOutBoundResponse> getResponseClass() {
      return DropshipDpsBatchOutBoundResponse.class;
   }
}

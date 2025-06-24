package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsOutboundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsOutboundRequest extends AbstractRequest implements JdRequest<DropshipDpsOutboundResponse> {
   private Long customOrderId;
   private String memoByVendor;
   private Integer isJdexpress;
   private Long addressId;
   private String source;

   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   public void setMemoByVendor(String memoByVendor) {
      this.memoByVendor = memoByVendor;
   }

   public String getMemoByVendor() {
      return this.memoByVendor;
   }

   public void setIsJdexpress(Integer isJdexpress) {
      this.isJdexpress = isJdexpress;
   }

   public Integer getIsJdexpress() {
      return this.isJdexpress;
   }

   public void setAddressId(Long addressId) {
      this.addressId = addressId;
   }

   public Long getAddressId() {
      return this.addressId;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.outbound";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      pmap.put("memoByVendor", this.memoByVendor);
      pmap.put("isJdexpress", this.isJdexpress);
      pmap.put("addressId", this.addressId);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsOutboundResponse> getResponseClass() {
      return DropshipDpsOutboundResponse.class;
   }
}

package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopMiddleWaybillWaybillPickupApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopMiddleWaybillWaybillPickupApiRequest extends AbstractRequest implements JdRequest<LdopMiddleWaybillWaybillPickupApiResponse> {
   private String vendorCode;
   private String pickupCode;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setPickupCode(String pickupCode) {
      this.pickupCode = pickupCode;
   }

   public String getPickupCode() {
      return this.pickupCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.middle.waybill.WaybillPickupApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("pickupCode", this.pickupCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopMiddleWaybillWaybillPickupApiResponse> getResponseClass() {
      return LdopMiddleWaybillWaybillPickupApiResponse.class;
   }
}

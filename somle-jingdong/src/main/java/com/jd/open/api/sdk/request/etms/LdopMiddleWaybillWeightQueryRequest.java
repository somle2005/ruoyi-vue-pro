package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopMiddleWaybillWeightQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopMiddleWaybillWeightQueryRequest extends AbstractRequest implements JdRequest<LdopMiddleWaybillWeightQueryResponse> {
   private String vendorCode;
   private String waybillCode;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.middle.waybill.weight.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopMiddleWaybillWeightQueryResponse> getResponseClass() {
      return LdopMiddleWaybillWeightQueryResponse.class;
   }
}

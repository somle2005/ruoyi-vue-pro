package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopMiddleWaybillWaybill2CTraceApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopMiddleWaybillWaybill2CTraceApiRequest extends AbstractRequest implements JdRequest<LdopMiddleWaybillWaybill2CTraceApiResponse> {
   private String tradeCode;
   private String waybillCode;

   public void setTradeCode(String tradeCode) {
      this.tradeCode = tradeCode;
   }

   public String getTradeCode() {
      return this.tradeCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.middle.waybill.Waybill2CTraceApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tradeCode", this.tradeCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopMiddleWaybillWaybill2CTraceApiResponse> getResponseClass() {
      return LdopMiddleWaybillWaybill2CTraceApiResponse.class;
   }
}

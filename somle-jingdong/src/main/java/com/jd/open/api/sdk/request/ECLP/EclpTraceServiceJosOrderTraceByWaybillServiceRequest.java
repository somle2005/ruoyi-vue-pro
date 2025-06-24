package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpTraceServiceJosOrderTraceByWaybillServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpTraceServiceJosOrderTraceByWaybillServiceRequest extends AbstractRequest implements JdRequest<EclpTraceServiceJosOrderTraceByWaybillServiceResponse> {
   private String waybillId;
   private String carrierCode;
   private String role;
   private String userId;

   public void setWaybillId(String waybillId) {
      this.waybillId = waybillId;
   }

   public String getWaybillId() {
      return this.waybillId;
   }

   public void setCarrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
   }

   public String getCarrierCode() {
      return this.carrierCode;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getRole() {
      return this.role;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public String getApiMethod() {
      return "jingdong.eclp.trace.service.jos.OrderTraceByWaybillService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waybillId", this.waybillId);
      pmap.put("carrierCode", this.carrierCode);
      pmap.put("role", this.role);
      pmap.put("userId", this.userId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpTraceServiceJosOrderTraceByWaybillServiceResponse> getResponseClass() {
      return EclpTraceServiceJosOrderTraceByWaybillServiceResponse.class;
   }
}

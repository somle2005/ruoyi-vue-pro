package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpTraceServiceJosSubscribeTraceByWaybillServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpTraceServiceJosSubscribeTraceByWaybillServiceRequest extends AbstractRequest implements JdRequest<EclpTraceServiceJosSubscribeTraceByWaybillServiceResponse> {
   private String source;
   private String waybillId;
   private String carrierCode;
   private String sign;
   private Long t;

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

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

   public void setSign(String sign) {
      this.sign = sign;
   }

   public String getSign() {
      return this.sign;
   }

   public void setT(Long t) {
      this.t = t;
   }

   public Long getT() {
      return this.t;
   }

   public String getApiMethod() {
      return "jingdong.eclp.trace.service.jos.SubscribeTraceByWaybillService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("source", this.source);
      pmap.put("waybillId", this.waybillId);
      pmap.put("carrierCode", this.carrierCode);
      pmap.put("sign", this.sign);
      pmap.put("t", this.t);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpTraceServiceJosSubscribeTraceByWaybillServiceResponse> getResponseClass() {
      return EclpTraceServiceJosSubscribeTraceByWaybillServiceResponse.class;
   }
}

package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpTraceServiceJosDynamicTraceServiceQueryDynamicTraceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpTraceServiceJosDynamicTraceServiceQueryDynamicTraceRequest extends AbstractRequest implements JdRequest<EclpTraceServiceJosDynamicTraceServiceQueryDynamicTraceResponse> {
   private String extension;
   private Long t;
   private String orderId;
   private String sign;
   private String customerCode;
   private String waybillCode;
   private String source;

   public void setExtension(String extension) {
      this.extension = extension;
   }

   public String getExtension() {
      return this.extension;
   }

   public void setT(Long t) {
      this.t = t;
   }

   public Long getT() {
      return this.t;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setSign(String sign) {
      this.sign = sign;
   }

   public String getSign() {
      return this.sign;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.eclp.trace.service.jos.dynamicTraceService.queryDynamicTrace";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("extension", this.extension);
      pmap.put("t", this.t);
      pmap.put("orderId", this.orderId);
      pmap.put("sign", this.sign);
      pmap.put("customerCode", this.customerCode);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpTraceServiceJosDynamicTraceServiceQueryDynamicTraceResponse> getResponseClass() {
      return EclpTraceServiceJosDynamicTraceServiceQueryDynamicTraceResponse.class;
   }
}

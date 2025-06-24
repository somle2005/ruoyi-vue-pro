package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.OpenTraceTraceDynamicQueryServiceQueryB2CTraceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OpenTraceTraceDynamicQueryServiceQueryB2CTraceRequest extends AbstractRequest implements JdRequest<OpenTraceTraceDynamicQueryServiceQueryB2CTraceResponse> {
   private String orderNo;
   private Integer bizType;
   private String customerCode;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBizType(Integer bizType) {
      this.bizType = bizType;
   }

   public Integer getBizType() {
      return this.bizType;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.open.trace.TraceDynamicQueryService.queryB2CTrace";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("bizType", this.bizType);
      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<OpenTraceTraceDynamicQueryServiceQueryB2CTraceResponse> getResponseClass() {
      return OpenTraceTraceDynamicQueryServiceQueryB2CTraceResponse.class;
   }
}

package com.jd.open.api.sdk.request.SSCX;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.SSCX.QyzhfwPaymentInfoQueryPaymentInvoiceDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QyzhfwPaymentInfoQueryPaymentInvoiceDetailRequest extends AbstractRequest implements JdRequest<QyzhfwPaymentInfoQueryPaymentInvoiceDetailResponse> {
   private String request;

   public void setRequest(String request) {
      this.request = request;
   }

   public String getRequest() {
      return this.request;
   }

   public String getApiMethod() {
      return "jingdong.qyzhfw.paymentInfo.queryPaymentInvoiceDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<QyzhfwPaymentInfoQueryPaymentInvoiceDetailResponse> getResponseClass() {
      return QyzhfwPaymentInfoQueryPaymentInvoiceDetailResponse.class;
   }
}

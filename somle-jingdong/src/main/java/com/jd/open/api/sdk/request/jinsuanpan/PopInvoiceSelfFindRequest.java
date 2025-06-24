package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopInvoiceSelfFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopInvoiceSelfFindRequest extends AbstractRequest implements JdRequest<PopInvoiceSelfFindResponse> {
   private String orderId;
   private String invoiceCode;
   private Integer invoiceNo;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   public void setInvoiceNo(Integer invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public Integer getInvoiceNo() {
      return this.invoiceNo;
   }

   public String getApiMethod() {
      return "jingdong.pop.invoice.self.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("invoiceCode", this.invoiceCode);
      pmap.put("invoiceNo", this.invoiceNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopInvoiceSelfFindResponse> getResponseClass() {
      return PopInvoiceSelfFindResponse.class;
   }
}

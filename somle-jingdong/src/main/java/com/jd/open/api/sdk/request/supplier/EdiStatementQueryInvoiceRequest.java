package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiStatementQueryInvoiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiStatementQueryInvoiceRequest extends AbstractRequest implements JdRequest<EdiStatementQueryInvoiceResponse> {
   private String invoiceNo;

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public String getApiMethod() {
      return "jingdong.edi.statement.queryInvoice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("invoiceNo", this.invoiceNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiStatementQueryInvoiceResponse> getResponseClass() {
      return EdiStatementQueryInvoiceResponse.class;
   }
}

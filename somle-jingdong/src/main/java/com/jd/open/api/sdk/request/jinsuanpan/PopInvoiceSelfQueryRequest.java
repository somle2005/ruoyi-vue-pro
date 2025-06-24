package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopInvoiceSelfQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopInvoiceSelfQueryRequest extends AbstractRequest implements JdRequest<PopInvoiceSelfQueryResponse> {
   private String orderId;
   private String invoiceCode;
   private Integer invoiceNo;
   private Integer invoiceType;
   private String invoiceTimeStart;
   private String invoiceTimeEnd;
   private Long pageSize;
   private Long pageCurrent;

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

   public void setInvoiceType(Integer invoiceType) {
      this.invoiceType = invoiceType;
   }

   public Integer getInvoiceType() {
      return this.invoiceType;
   }

   public void setInvoiceTimeStart(String invoiceTimeStart) {
      this.invoiceTimeStart = invoiceTimeStart;
   }

   public String getInvoiceTimeStart() {
      return this.invoiceTimeStart;
   }

   public void setInvoiceTimeEnd(String invoiceTimeEnd) {
      this.invoiceTimeEnd = invoiceTimeEnd;
   }

   public String getInvoiceTimeEnd() {
      return this.invoiceTimeEnd;
   }

   public void setPageSize(Long pageSize) {
      this.pageSize = pageSize;
   }

   public Long getPageSize() {
      return this.pageSize;
   }

   public void setPageCurrent(Long pageCurrent) {
      this.pageCurrent = pageCurrent;
   }

   public Long getPageCurrent() {
      return this.pageCurrent;
   }

   public String getApiMethod() {
      return "jingdong.pop.invoice.self.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("invoiceCode", this.invoiceCode);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("invoiceType", this.invoiceType);
      pmap.put("invoiceTimeStart", this.invoiceTimeStart);
      pmap.put("invoiceTimeEnd", this.invoiceTimeEnd);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageCurrent", this.pageCurrent);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopInvoiceSelfQueryResponse> getResponseClass() {
      return PopInvoiceSelfQueryResponse.class;
   }
}

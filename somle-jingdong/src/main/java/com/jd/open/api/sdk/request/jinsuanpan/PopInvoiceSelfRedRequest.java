package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopInvoiceSelfRedResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PopInvoiceSelfRedRequest extends AbstractRequest implements JdRequest<PopInvoiceSelfRedResponse> {
   private String orderId;
   private String invoiceCode;
   private BigDecimal invoiceNo;
   private String invoiceTime;
   private String blueInvoiceCode;
   private BigDecimal blueInvoiceNo;
   private String pdfInfo;

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

   public void setInvoiceNo(BigDecimal invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public BigDecimal getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setInvoiceTime(String invoiceTime) {
      this.invoiceTime = invoiceTime;
   }

   public String getInvoiceTime() {
      return this.invoiceTime;
   }

   public void setBlueInvoiceCode(String blueInvoiceCode) {
      this.blueInvoiceCode = blueInvoiceCode;
   }

   public String getBlueInvoiceCode() {
      return this.blueInvoiceCode;
   }

   public void setBlueInvoiceNo(BigDecimal blueInvoiceNo) {
      this.blueInvoiceNo = blueInvoiceNo;
   }

   public BigDecimal getBlueInvoiceNo() {
      return this.blueInvoiceNo;
   }

   public void setPdfInfo(String pdfInfo) {
      this.pdfInfo = pdfInfo;
   }

   public String getPdfInfo() {
      return this.pdfInfo;
   }

   public String getApiMethod() {
      return "jingdong.pop.invoice.self.red";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("invoiceCode", this.invoiceCode);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("invoiceTime", this.invoiceTime);
      pmap.put("blueInvoiceCode", this.blueInvoiceCode);
      pmap.put("blueInvoiceNo", this.blueInvoiceNo);
      pmap.put("pdfInfo", this.pdfInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopInvoiceSelfRedResponse> getResponseClass() {
      return PopInvoiceSelfRedResponse.class;
   }
}

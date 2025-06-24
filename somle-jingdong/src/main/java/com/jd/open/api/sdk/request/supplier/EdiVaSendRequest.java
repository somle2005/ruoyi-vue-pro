package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiVaSendResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class EdiVaSendRequest extends AbstractRequest implements JdRequest<EdiVaSendResponse> {
   private String vendorName;
   private String billNo;
   private String businessType;
   private BigDecimal totalAmount;
   private String vendorCode;
   private String settleNo;
   private String payableAccountId;
   private String billType;
   private String verificationBillNo;
   private String billDate;
   private String poNo;
   private String soNo;
   private String amount;
   private String memo;
   private String invoiceNo;
   private String invoiceCode;
   private String taxAmount;

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   public String getBillNo() {
      return this.billNo;
   }

   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   public String getBusinessType() {
      return this.businessType;
   }

   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   public String getSettleNo() {
      return this.settleNo;
   }

   public void setPayableAccountId(String payableAccountId) {
      this.payableAccountId = payableAccountId;
   }

   public String getPayableAccountId() {
      return this.payableAccountId;
   }

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
   }

   public void setVerificationBillNo(String verificationBillNo) {
      this.verificationBillNo = verificationBillNo;
   }

   public String getVerificationBillNo() {
      return this.verificationBillNo;
   }

   public void setBillDate(String billDate) {
      this.billDate = billDate;
   }

   public String getBillDate() {
      return this.billDate;
   }

   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   public String getPoNo() {
      return this.poNo;
   }

   public void setSoNo(String soNo) {
      this.soNo = soNo;
   }

   public String getSoNo() {
      return this.soNo;
   }

   public void setAmount(String amount) {
      this.amount = amount;
   }

   public String getAmount() {
      return this.amount;
   }

   public void setMemo(String memo) {
      this.memo = memo;
   }

   public String getMemo() {
      return this.memo;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setInvoiceCode(String invoiceCode) {
      this.invoiceCode = invoiceCode;
   }

   public String getInvoiceCode() {
      return this.invoiceCode;
   }

   public void setTaxAmount(String taxAmount) {
      this.taxAmount = taxAmount;
   }

   public String getTaxAmount() {
      return this.taxAmount;
   }

   public String getApiMethod() {
      return "jingdong.edi.va.send";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorName", this.vendorName);
      pmap.put("billNo", this.billNo);
      pmap.put("businessType", this.businessType);
      pmap.put("totalAmount", this.totalAmount);
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("settleNo", this.settleNo);
      pmap.put("payableAccountId", this.payableAccountId);
      pmap.put("billType", this.billType);
      pmap.put("verificationBillNo", this.verificationBillNo);
      pmap.put("billDate", this.billDate);
      pmap.put("poNo", this.poNo);
      pmap.put("soNo", this.soNo);
      pmap.put("amount", this.amount);
      pmap.put("memo", this.memo);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("invoiceCode", this.invoiceCode);
      pmap.put("taxAmount", this.taxAmount);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiVaSendResponse> getResponseClass() {
      return EdiVaSendResponse.class;
   }
}

package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopInvoiceSelfApplyResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class PopInvoiceSelfApplyRequest extends AbstractRequest implements JdRequest<PopInvoiceSelfApplyResponse> {
   private String productId;
   private String productName;
   private String num;
   private String price;
   private String spec;
   private String unit;
   private String taxRate;
   private String taxCategroyCode;
   private String isTaxDiscount;
   private String taxDiscountContent;
   private String zeroTax;
   private String deductions;
   private String imei;
   private String discount;
   private String freight;
   private String orderId;
   private String receiverTaxNo;
   private String receiverName;
   private String invoiceCode;
   private BigDecimal invoiceNo;
   private String ivcTitle;
   private String totalPrice;
   private String invoiceTime;
   private String pdfInfo;
   private Integer orderType;
   private Integer ivcContentType;
   private String ivcContentName;
   private String eiRemark;
   private String receiverAddress;
   private String receiverPhone;
   private String receiverBankName;
   private String receiverBankAccount;
   private String drawer;
   private String payee;
   private String consumerAddress;
   private String consumerPhone;
   private String consumerBankName;
   private String consumerBankAccount;

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductName() {
      return this.productName;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getPrice() {
      return this.price;
   }

   public void setSpec(String spec) {
      this.spec = spec;
   }

   public String getSpec() {
      return this.spec;
   }

   public void setUnit(String unit) {
      this.unit = unit;
   }

   public String getUnit() {
      return this.unit;
   }

   public void setTaxRate(String taxRate) {
      this.taxRate = taxRate;
   }

   public String getTaxRate() {
      return this.taxRate;
   }

   public void setTaxCategroyCode(String taxCategroyCode) {
      this.taxCategroyCode = taxCategroyCode;
   }

   public String getTaxCategroyCode() {
      return this.taxCategroyCode;
   }

   public void setIsTaxDiscount(String isTaxDiscount) {
      this.isTaxDiscount = isTaxDiscount;
   }

   public String getIsTaxDiscount() {
      return this.isTaxDiscount;
   }

   public void setTaxDiscountContent(String taxDiscountContent) {
      this.taxDiscountContent = taxDiscountContent;
   }

   public String getTaxDiscountContent() {
      return this.taxDiscountContent;
   }

   public void setZeroTax(String zeroTax) {
      this.zeroTax = zeroTax;
   }

   public String getZeroTax() {
      return this.zeroTax;
   }

   public void setDeductions(String deductions) {
      this.deductions = deductions;
   }

   public String getDeductions() {
      return this.deductions;
   }

   public void setImei(String imei) {
      this.imei = imei;
   }

   public String getImei() {
      return this.imei;
   }

   public void setDiscount(String discount) {
      this.discount = discount;
   }

   public String getDiscount() {
      return this.discount;
   }

   public void setFreight(String freight) {
      this.freight = freight;
   }

   public String getFreight() {
      return this.freight;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setReceiverTaxNo(String receiverTaxNo) {
      this.receiverTaxNo = receiverTaxNo;
   }

   public String getReceiverTaxNo() {
      return this.receiverTaxNo;
   }

   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   public String getReceiverName() {
      return this.receiverName;
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

   public void setIvcTitle(String ivcTitle) {
      this.ivcTitle = ivcTitle;
   }

   public String getIvcTitle() {
      return this.ivcTitle;
   }

   public void setTotalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
   }

   public String getTotalPrice() {
      return this.totalPrice;
   }

   public void setInvoiceTime(String invoiceTime) {
      this.invoiceTime = invoiceTime;
   }

   public String getInvoiceTime() {
      return this.invoiceTime;
   }

   public void setPdfInfo(String pdfInfo) {
      this.pdfInfo = pdfInfo;
   }

   public String getPdfInfo() {
      return this.pdfInfo;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setIvcContentType(Integer ivcContentType) {
      this.ivcContentType = ivcContentType;
   }

   public Integer getIvcContentType() {
      return this.ivcContentType;
   }

   public void setIvcContentName(String ivcContentName) {
      this.ivcContentName = ivcContentName;
   }

   public String getIvcContentName() {
      return this.ivcContentName;
   }

   public void setEiRemark(String eiRemark) {
      this.eiRemark = eiRemark;
   }

   public String getEiRemark() {
      return this.eiRemark;
   }

   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setReceiverBankName(String receiverBankName) {
      this.receiverBankName = receiverBankName;
   }

   public String getReceiverBankName() {
      return this.receiverBankName;
   }

   public void setReceiverBankAccount(String receiverBankAccount) {
      this.receiverBankAccount = receiverBankAccount;
   }

   public String getReceiverBankAccount() {
      return this.receiverBankAccount;
   }

   public void setDrawer(String drawer) {
      this.drawer = drawer;
   }

   public String getDrawer() {
      return this.drawer;
   }

   public void setPayee(String payee) {
      this.payee = payee;
   }

   public String getPayee() {
      return this.payee;
   }

   public void setConsumerAddress(String consumerAddress) {
      this.consumerAddress = consumerAddress;
   }

   public String getConsumerAddress() {
      return this.consumerAddress;
   }

   public void setConsumerPhone(String consumerPhone) {
      this.consumerPhone = consumerPhone;
   }

   public String getConsumerPhone() {
      return this.consumerPhone;
   }

   public void setConsumerBankName(String consumerBankName) {
      this.consumerBankName = consumerBankName;
   }

   public String getConsumerBankName() {
      return this.consumerBankName;
   }

   public void setConsumerBankAccount(String consumerBankAccount) {
      this.consumerBankAccount = consumerBankAccount;
   }

   public String getConsumerBankAccount() {
      return this.consumerBankAccount;
   }

   public String getApiMethod() {
      return "jingdong.pop.invoice.self.apply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      pmap.put("productName", this.productName);
      pmap.put("num", this.num);
      pmap.put("price", this.price);
      pmap.put("spec", this.spec);
      pmap.put("unit", this.unit);
      pmap.put("taxRate", this.taxRate);
      pmap.put("taxCategroyCode", this.taxCategroyCode);
      pmap.put("isTaxDiscount", this.isTaxDiscount);
      pmap.put("taxDiscountContent", this.taxDiscountContent);
      pmap.put("zeroTax", this.zeroTax);
      pmap.put("deductions", this.deductions);
      pmap.put("imei", this.imei);
      pmap.put("discount", this.discount);
      pmap.put("freight", this.freight);
      pmap.put("orderId", this.orderId);
      pmap.put("receiverTaxNo", this.receiverTaxNo);
      pmap.put("receiverName", this.receiverName);
      pmap.put("invoiceCode", this.invoiceCode);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("ivcTitle", this.ivcTitle);
      pmap.put("totalPrice", this.totalPrice);
      pmap.put("invoiceTime", this.invoiceTime);
      pmap.put("pdfInfo", this.pdfInfo);
      pmap.put("orderType", this.orderType);
      pmap.put("ivcContentType", this.ivcContentType);
      pmap.put("ivcContentName", this.ivcContentName);
      pmap.put("eiRemark", this.eiRemark);
      pmap.put("receiverAddress", this.receiverAddress);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("receiverBankName", this.receiverBankName);
      pmap.put("receiverBankAccount", this.receiverBankAccount);
      pmap.put("drawer", this.drawer);
      pmap.put("payee", this.payee);
      pmap.put("consumerAddress", this.consumerAddress);
      pmap.put("consumerPhone", this.consumerPhone);
      pmap.put("consumerBankName", this.consumerBankName);
      pmap.put("consumerBankAccount", this.consumerBankAccount);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopInvoiceSelfApplyResponse> getResponseClass() {
      return PopInvoiceSelfApplyResponse.class;
   }
}

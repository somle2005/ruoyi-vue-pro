package com.jd.open.api.sdk.request.fapiao;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fapiao.ScfInvoiceApplySubmitApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ScfInvoiceApplySubmitApplyRequest extends AbstractRequest implements JdRequest<ScfInvoiceApplySubmitApplyResponse> {
   private Integer invoiceDirection;
   private String invoiceOrg;
   private String pin;
   private String venderId;
   private String rfBillType;
   private String dailyBillId;

   public void setInvoiceDirection(Integer invoiceDirection) {
      this.invoiceDirection = invoiceDirection;
   }

   public Integer getInvoiceDirection() {
      return this.invoiceDirection;
   }

   public void setInvoiceOrg(String invoiceOrg) {
      this.invoiceOrg = invoiceOrg;
   }

   public String getInvoiceOrg() {
      return this.invoiceOrg;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   public String getVenderId() {
      return this.venderId;
   }

   public void setRfBillType(String rfBillType) {
      this.rfBillType = rfBillType;
   }

   public String getRfBillType() {
      return this.rfBillType;
   }

   public void setDailyBillId(String dailyBillId) {
      this.dailyBillId = dailyBillId;
   }

   public String getDailyBillId() {
      return this.dailyBillId;
   }

   public String getApiMethod() {
      return "jingdong.scf.invoice.apply.submitApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("invoiceDirection", this.invoiceDirection);
      pmap.put("invoiceOrg", this.invoiceOrg);
      pmap.put("pin", this.pin);
      pmap.put("venderId", this.venderId);
      pmap.put("rfBillType", this.rfBillType);
      pmap.put("dailyBillId", this.dailyBillId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ScfInvoiceApplySubmitApplyResponse> getResponseClass() {
      return ScfInvoiceApplySubmitApplyResponse.class;
   }
}

package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.JiliRefundPaymentResultSyncResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class JiliRefundPaymentResultSyncRequest extends AbstractRequest implements JdRequest<JiliRefundPaymentResultSyncResponse> {
   private String orderId;
   private Long tenantId;
   private Long detailId;
   private Integer payChannel;
   private Date confirmTime;
   private Integer type;
   private String resMsg;
   private Integer status;
   private String receiptId;
   private String accountSn;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setTenantId(Long tenantId) {
      this.tenantId = tenantId;
   }

   public Long getTenantId() {
      return this.tenantId;
   }

   public void setDetailId(Long detailId) {
      this.detailId = detailId;
   }

   public Long getDetailId() {
      return this.detailId;
   }

   public void setPayChannel(Integer payChannel) {
      this.payChannel = payChannel;
   }

   public Integer getPayChannel() {
      return this.payChannel;
   }

   public void setConfirmTime(Date confirmTime) {
      this.confirmTime = confirmTime;
   }

   public Date getConfirmTime() {
      return this.confirmTime;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setResMsg(String resMsg) {
      this.resMsg = resMsg;
   }

   public String getResMsg() {
      return this.resMsg;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setReceiptId(String receiptId) {
      this.receiptId = receiptId;
   }

   public String getReceiptId() {
      return this.receiptId;
   }

   public void setAccountSn(String accountSn) {
      this.accountSn = accountSn;
   }

   public String getAccountSn() {
      return this.accountSn;
   }

   public String getApiMethod() {
      return "jingdong.jili.refund.payment.result.sync";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("tenantId", this.tenantId);
      pmap.put("detailId", this.detailId);
      pmap.put("payChannel", this.payChannel);

      try {
         if (this.confirmTime != null) {
            pmap.put("confirmTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.confirmTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("type", this.type);
      pmap.put("resMsg", this.resMsg);
      pmap.put("status", this.status);
      pmap.put("receiptId", this.receiptId);
      pmap.put("accountSn", this.accountSn);
      return JsonUtil.toJson(pmap);
   }

   public Class<JiliRefundPaymentResultSyncResponse> getResponseClass() {
      return JiliRefundPaymentResultSyncResponse.class;
   }
}

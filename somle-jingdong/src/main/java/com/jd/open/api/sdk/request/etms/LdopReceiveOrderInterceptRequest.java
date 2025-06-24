package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopReceiveOrderInterceptResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopReceiveOrderInterceptRequest extends AbstractRequest implements JdRequest<LdopReceiveOrderInterceptResponse> {
   private String vendorCode;
   private String deliveryId;
   private String interceptReason;
   private Integer cancelOperatorCodeType;
   private Date cancelTime;
   private String cancelOperator;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setInterceptReason(String interceptReason) {
      this.interceptReason = interceptReason;
   }

   public String getInterceptReason() {
      return this.interceptReason;
   }

   public void setCancelOperatorCodeType(Integer cancelOperatorCodeType) {
      this.cancelOperatorCodeType = cancelOperatorCodeType;
   }

   public Integer getCancelOperatorCodeType() {
      return this.cancelOperatorCodeType;
   }

   public void setCancelTime(Date cancelTime) {
      this.cancelTime = cancelTime;
   }

   public Date getCancelTime() {
      return this.cancelTime;
   }

   public void setCancelOperator(String cancelOperator) {
      this.cancelOperator = cancelOperator;
   }

   public String getCancelOperator() {
      return this.cancelOperator;
   }

   public String getApiMethod() {
      return "jingdong.ldop.receive.order.intercept";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("interceptReason", this.interceptReason);
      pmap.put("cancelOperatorCodeType", this.cancelOperatorCodeType);

      try {
         if (this.cancelTime != null) {
            pmap.put("cancelTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.cancelTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("cancelOperator", this.cancelOperator);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopReceiveOrderInterceptResponse> getResponseClass() {
      return LdopReceiveOrderInterceptResponse.class;
   }
}

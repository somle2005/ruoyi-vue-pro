package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.OrblsWaybillCancelInterceptResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OrblsWaybillCancelInterceptRequest extends AbstractRequest implements JdRequest<OrblsWaybillCancelInterceptResponse> {
   private String vendorCode;
   private Integer cancelReasonCode;
   private String deliveryId;
   private Date cancelTime;
   private String interceptReason;
   private String cancelOperator;
   private String isvOrderNo;
   private String cancelType;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setCancelReasonCode(Integer cancelReasonCode) {
      this.cancelReasonCode = cancelReasonCode;
   }

   public Integer getCancelReasonCode() {
      return this.cancelReasonCode;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setCancelTime(Date cancelTime) {
      this.cancelTime = cancelTime;
   }

   public Date getCancelTime() {
      return this.cancelTime;
   }

   public void setInterceptReason(String interceptReason) {
      this.interceptReason = interceptReason;
   }

   public String getInterceptReason() {
      return this.interceptReason;
   }

   public void setCancelOperator(String cancelOperator) {
      this.cancelOperator = cancelOperator;
   }

   public String getCancelOperator() {
      return this.cancelOperator;
   }

   public void setIsvOrderNo(String isvOrderNo) {
      this.isvOrderNo = isvOrderNo;
   }

   public String getIsvOrderNo() {
      return this.isvOrderNo;
   }

   public void setCancelType(String cancelType) {
      this.cancelType = cancelType;
   }

   public String getCancelType() {
      return this.cancelType;
   }

   public String getApiMethod() {
      return "jingdong.orbls.waybill.cancel.intercept";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("cancelReasonCode", this.cancelReasonCode);
      pmap.put("deliveryId", this.deliveryId);

      try {
         if (this.cancelTime != null) {
            pmap.put("cancelTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.cancelTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("interceptReason", this.interceptReason);
      pmap.put("cancelOperator", this.cancelOperator);
      pmap.put("isvOrderNo", this.isvOrderNo);
      pmap.put("cancelType", this.cancelType);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrblsWaybillCancelInterceptResponse> getResponseClass() {
      return OrblsWaybillCancelInterceptResponse.class;
   }
}

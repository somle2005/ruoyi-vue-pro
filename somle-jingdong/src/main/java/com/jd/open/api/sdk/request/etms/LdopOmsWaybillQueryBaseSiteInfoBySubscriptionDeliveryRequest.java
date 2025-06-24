package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryRequest extends AbstractRequest implements JdRequest<LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryResponse> {
   private String deliveryId;
   private String carrierCode;
   private String source;

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setCarrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
   }

   public String getCarrierCode() {
      return this.carrierCode;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.ldop.oms.waybill.queryBaseSiteInfoBySubscriptionDelivery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("carrierCode", this.carrierCode);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryResponse> getResponseClass() {
      return LdopOmsWaybillQueryBaseSiteInfoBySubscriptionDeliveryResponse.class;
   }
}

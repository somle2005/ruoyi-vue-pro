package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderSavecourierResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderSavecourierRequest extends AbstractRequest implements JdRequest<OmnicOrderSavecourierResponse> {
   private String authKey;
   private Long orderId;
   private String deliveryId;
   private Integer carrierType;
   private String carrierName;
   private String carrierNo;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setCarrierType(Integer carrierType) {
      this.carrierType = carrierType;
   }

   public Integer getCarrierType() {
      return this.carrierType;
   }

   public void setCarrierName(String carrierName) {
      this.carrierName = carrierName;
   }

   public String getCarrierName() {
      return this.carrierName;
   }

   public void setCarrierNo(String carrierNo) {
      this.carrierNo = carrierNo;
   }

   public String getCarrierNo() {
      return this.carrierNo;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.savecourier";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("orderId", this.orderId);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("carrierType", this.carrierType);
      pmap.put("carrierName", this.carrierName);
      pmap.put("carrierNo", this.carrierNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderSavecourierResponse> getResponseClass() {
      return OmnicOrderSavecourierResponse.class;
   }
}

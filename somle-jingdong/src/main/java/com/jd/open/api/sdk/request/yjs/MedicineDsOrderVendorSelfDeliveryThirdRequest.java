package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderVendorSelfDeliveryThirdResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderVendorSelfDeliveryThirdRequest extends AbstractRequest implements JdRequest<MedicineDsOrderVendorSelfDeliveryThirdResponse> {
   private String deliveryPhone;
   private String operatePerson;
   private String deliveryPerson;
   private Date reqTimestamp;
   private String orderId;
   private Double latitude;
   private Long storeId;
   private String deliveryPlatform;
   private Integer deliveryStatus;
   private Double longitude;

   public void setDeliveryPhone(String deliveryPhone) {
      this.deliveryPhone = deliveryPhone;
   }

   public String getDeliveryPhone() {
      return this.deliveryPhone;
   }

   public void setOperatePerson(String operatePerson) {
      this.operatePerson = operatePerson;
   }

   public String getOperatePerson() {
      return this.operatePerson;
   }

   public void setDeliveryPerson(String deliveryPerson) {
      this.deliveryPerson = deliveryPerson;
   }

   public String getDeliveryPerson() {
      return this.deliveryPerson;
   }

   public void setReqTimestamp(Date reqTimestamp) {
      this.reqTimestamp = reqTimestamp;
   }

   public Date getReqTimestamp() {
      return this.reqTimestamp;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setLatitude(Double latitude) {
      this.latitude = latitude;
   }

   public Double getLatitude() {
      return this.latitude;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setDeliveryPlatform(String deliveryPlatform) {
      this.deliveryPlatform = deliveryPlatform;
   }

   public String getDeliveryPlatform() {
      return this.deliveryPlatform;
   }

   public void setDeliveryStatus(Integer deliveryStatus) {
      this.deliveryStatus = deliveryStatus;
   }

   public Integer getDeliveryStatus() {
      return this.deliveryStatus;
   }

   public void setLongitude(Double longitude) {
      this.longitude = longitude;
   }

   public Double getLongitude() {
      return this.longitude;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.vendorSelfDeliveryThird";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deliveryPhone", this.deliveryPhone);
      pmap.put("operatePerson", this.operatePerson);
      pmap.put("deliveryPerson", this.deliveryPerson);

      try {
         if (this.reqTimestamp != null) {
            pmap.put("reqTimestamp", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.reqTimestamp));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderId", this.orderId);
      pmap.put("latitude", this.latitude);
      pmap.put("storeId", this.storeId);
      pmap.put("deliveryPlatform", this.deliveryPlatform);
      pmap.put("deliveryStatus", this.deliveryStatus);
      pmap.put("longitude", this.longitude);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderVendorSelfDeliveryThirdResponse> getResponseClass() {
      return MedicineDsOrderVendorSelfDeliveryThirdResponse.class;
   }
}

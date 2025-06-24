package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicShipUpdatestatusResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OmnicShipUpdatestatusRequest extends AbstractRequest implements JdRequest<OmnicShipUpdatestatusResponse> {
   private String authKey;
   private String deliveryId;
   private Long orderId;
   private Date operateTime;
   private String operateName;
   private String contactPhone;
   private Integer status;
   private String courierId;
   private String courierName;
   private String courierPhone;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   public Date getOperateTime() {
      return this.operateTime;
   }

   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   public String getOperateName() {
      return this.operateName;
   }

   public void setContactPhone(String contactPhone) {
      this.contactPhone = contactPhone;
   }

   public String getContactPhone() {
      return this.contactPhone;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setCourierId(String courierId) {
      this.courierId = courierId;
   }

   public String getCourierId() {
      return this.courierId;
   }

   public void setCourierName(String courierName) {
      this.courierName = courierName;
   }

   public String getCourierName() {
      return this.courierName;
   }

   public void setCourierPhone(String courierPhone) {
      this.courierPhone = courierPhone;
   }

   public String getCourierPhone() {
      return this.courierPhone;
   }

   public String getApiMethod() {
      return "jingdong.omnic.ship.updatestatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("orderId", this.orderId);

      try {
         if (this.operateTime != null) {
            pmap.put("operateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("operateName", this.operateName);
      pmap.put("contactPhone", this.contactPhone);
      pmap.put("status", this.status);
      pmap.put("courierId", this.courierId);
      pmap.put("courierName", this.courierName);
      pmap.put("courierPhone", this.courierPhone);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicShipUpdatestatusResponse> getResponseClass() {
      return OmnicShipUpdatestatusResponse.class;
   }
}

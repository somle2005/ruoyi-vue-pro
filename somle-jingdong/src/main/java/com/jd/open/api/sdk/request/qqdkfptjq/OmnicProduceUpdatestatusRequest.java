package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicProduceUpdatestatusResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OmnicProduceUpdatestatusRequest extends AbstractRequest implements JdRequest<OmnicProduceUpdatestatusResponse> {
   private String authKey;
   private String storeType;
   private Long orderId;
   private Date operateTime;
   private String storeId;
   private String operateName;
   private Integer status;
   private String courierId;
   private String courierName;
   private String courierPhone;
   private String remark;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setStoreType(String storeType) {
      this.storeType = storeType;
   }

   public String getStoreType() {
      return this.storeType;
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

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   public String getOperateName() {
      return this.operateName;
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

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.omnic.produce.updatestatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("storeType", this.storeType);
      pmap.put("orderId", this.orderId);

      try {
         if (this.operateTime != null) {
            pmap.put("operateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("storeId", this.storeId);
      pmap.put("operateName", this.operateName);
      pmap.put("status", this.status);
      pmap.put("courierId", this.courierId);
      pmap.put("courierName", this.courierName);
      pmap.put("courierPhone", this.courierPhone);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicProduceUpdatestatusResponse> getResponseClass() {
      return OmnicProduceUpdatestatusResponse.class;
   }
}

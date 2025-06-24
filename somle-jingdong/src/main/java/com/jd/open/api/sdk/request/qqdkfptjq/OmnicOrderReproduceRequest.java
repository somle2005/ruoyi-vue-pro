package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderReproduceResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderReproduceRequest extends AbstractRequest implements JdRequest<OmnicOrderReproduceResponse> {
   private String authKey;
   private Long orderId;
   private Date operateTime;
   private String remark;
   private Long storeId;
   private String operateName;

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

   public void setOperateTime(Date operateTime) {
      this.operateTime = operateTime;
   }

   public Date getOperateTime() {
      return this.operateTime;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setOperateName(String operateName) {
      this.operateName = operateName;
   }

   public String getOperateName() {
      return this.operateName;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.reproduce";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("orderId", this.orderId);

      try {
         if (this.operateTime != null) {
            pmap.put("operateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("remark", this.remark);
      pmap.put("storeId", this.storeId);
      pmap.put("operateName", this.operateName);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderReproduceResponse> getResponseClass() {
      return OmnicOrderReproduceResponse.class;
   }
}

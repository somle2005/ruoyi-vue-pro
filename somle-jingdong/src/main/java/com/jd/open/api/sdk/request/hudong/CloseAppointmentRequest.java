package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.CloseAppointmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CloseAppointmentRequest extends AbstractRequest implements JdRequest<CloseAppointmentResponse> {
   private String appName;
   private String appId;
   private String preSellId;
   private String groupType;
   private Long skuId;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPreSellId(String preSellId) {
      this.preSellId = preSellId;
   }

   public String getPreSellId() {
      return this.preSellId;
   }

   public void setGroupType(String groupType) {
      this.groupType = groupType;
   }

   public String getGroupType() {
      return this.groupType;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.closeAppointment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("preSellId", this.preSellId);
      pmap.put("groupType", this.groupType);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<CloseAppointmentResponse> getResponseClass() {
      return CloseAppointmentResponse.class;
   }
}

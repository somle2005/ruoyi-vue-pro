package com.jd.open.api.sdk.request.fresh7;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fresh7.JiliTcsOfflineResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JiliTcsOfflineRequest extends AbstractRequest implements JdRequest<JiliTcsOfflineResponse> {
   private Long tenantId;
   private Long storeId;
   private String pin;
   private String pinType;

   public void setTenantId(Long tenantId) {
      this.tenantId = tenantId;
   }

   public Long getTenantId() {
      return this.tenantId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setPinType(String pinType) {
      this.pinType = pinType;
   }

   public String getPinType() {
      return this.pinType;
   }

   public String getApiMethod() {
      return "jingdong.jili.tcs.offline";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tenantId", this.tenantId);
      pmap.put("storeId", this.storeId);
      pmap.put("pin", this.pin);
      pmap.put("pinType", this.pinType);
      return JsonUtil.toJson(pmap);
   }

   public Class<JiliTcsOfflineResponse> getResponseClass() {
      return JiliTcsOfflineResponse.class;
   }
}

package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipOrderAddCustomizedCartResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipOrderAddCustomizedCartRequest extends AbstractRequest implements JdRequest<YipOrderAddCustomizedCartResponse> {
   private String appId;
   private String businessId;
   private String customInstanceId;
   private String businessType;
   private String userId;
   private String skuInfoString;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setBusinessId(String businessId) {
      this.businessId = businessId;
   }

   public String getBusinessId() {
      return this.businessId;
   }

   public void setCustomInstanceId(String customInstanceId) {
      this.customInstanceId = customInstanceId;
   }

   public String getCustomInstanceId() {
      return this.customInstanceId;
   }

   public void setBusinessType(String businessType) {
      this.businessType = businessType;
   }

   public String getBusinessType() {
      return this.businessType;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserId() {
      return this.userId;
   }

   public void setSkuInfoString(String skuInfoString) {
      this.skuInfoString = skuInfoString;
   }

   public String getSkuInfoString() {
      return this.skuInfoString;
   }

   public String getApiMethod() {
      return "jingdong.yip.order.addCustomizedCart";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("businessId", this.businessId);
      pmap.put("customInstanceId", this.customInstanceId);
      pmap.put("businessType", this.businessType);
      pmap.put("userId", this.userId);
      pmap.put("skuInfoString", this.skuInfoString);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipOrderAddCustomizedCartResponse> getResponseClass() {
      return YipOrderAddCustomizedCartResponse.class;
   }
}

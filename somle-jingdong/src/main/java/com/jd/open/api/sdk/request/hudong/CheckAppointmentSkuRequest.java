package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.CheckAppointmentSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CheckAppointmentSkuRequest extends AbstractRequest implements JdRequest<CheckAppointmentSkuResponse> {
   private String appName;
   private String appId;
   private Integer autoAddCart;
   private String skuId;

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

   public void setAutoAddCart(Integer autoAddCart) {
      this.autoAddCart = autoAddCart;
   }

   public Integer getAutoAddCart() {
      return this.autoAddCart;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.checkAppointmentSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("autoAddCart", this.autoAddCart);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<CheckAppointmentSkuResponse> getResponseClass() {
      return CheckAppointmentSkuResponse.class;
   }
}

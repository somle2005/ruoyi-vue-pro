package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.YipOrderGetOrderCustomeInfosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipOrderGetOrderCustomeInfosRequest extends AbstractRequest implements JdRequest<YipOrderGetOrderCustomeInfosResponse> {
   private String orderId;
   private String subSkuId;
   private String appId;
   private String source;
   private String customFields;
   private String skuId;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setSubSkuId(String subSkuId) {
      this.subSkuId = subSkuId;
   }

   public String getSubSkuId() {
      return this.subSkuId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setCustomFields(String customFields) {
      this.customFields = customFields;
   }

   public String getCustomFields() {
      return this.customFields;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.yip.order.getOrderCustomeInfos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("subSkuId", this.subSkuId);
      pmap.put("appId", this.appId);
      pmap.put("source", this.source);
      pmap.put("customFields", this.customFields);
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipOrderGetOrderCustomeInfosResponse> getResponseClass() {
      return YipOrderGetOrderCustomeInfosResponse.class;
   }
}

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderBusinessUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderBusinessUploadRequest extends AbstractRequest implements JdRequest<PopOrderBusinessUploadResponse> {
   private Long orderId;
   private String businessIds;
   private String businessJson;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setBusinessIds(String businessIds) {
      this.businessIds = businessIds;
   }

   public String getBusinessIds() {
      return this.businessIds;
   }

   public void setBusinessJson(String businessJson) {
      this.businessJson = businessJson;
   }

   public String getBusinessJson() {
      return this.businessJson;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.business.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("businessIds", this.businessIds);
      pmap.put("businessJson", this.businessJson);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderBusinessUploadResponse> getResponseClass() {
      return PopOrderBusinessUploadResponse.class;
   }
}

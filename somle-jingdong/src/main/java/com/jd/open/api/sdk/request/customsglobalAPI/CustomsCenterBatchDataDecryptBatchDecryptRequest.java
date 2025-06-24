package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.CustomsCenterBatchDataDecryptBatchDecryptResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CustomsCenterBatchDataDecryptBatchDecryptRequest extends AbstractRequest implements JdRequest<CustomsCenterBatchDataDecryptBatchDecryptResponse> {
   private String customsId;
   private String serviceId;
   private String orderId;
   private String data;

   public void setCustomsId(String customsId) {
      this.customsId = customsId;
   }

   public String getCustomsId() {
      return this.customsId;
   }

   public void setServiceId(String serviceId) {
      this.serviceId = serviceId;
   }

   public String getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String getData() {
      return this.data;
   }

   public String getApiMethod() {
      return "jingdong.customs.center.BatchDataDecrypt.batchDecrypt";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customsId", this.customsId);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("data", this.data);
      return JsonUtil.toJson(pmap);
   }

   public Class<CustomsCenterBatchDataDecryptBatchDecryptResponse> getResponseClass() {
      return CustomsCenterBatchDataDecryptBatchDecryptResponse.class;
   }
}

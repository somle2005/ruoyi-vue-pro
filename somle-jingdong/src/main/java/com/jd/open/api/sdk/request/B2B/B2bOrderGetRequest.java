package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bOrderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bOrderGetRequest extends AbstractRequest implements JdRequest<B2bOrderGetResponse> {
   private Long jdOrderId;
   private String customKeys;

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public void setCustomKeys(String customKeys) {
      this.customKeys = customKeys;
   }

   public String getCustomKeys() {
      return this.customKeys;
   }

   public String getApiMethod() {
      return "jingdong.b2b.order.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("jdOrderId", this.jdOrderId);
      pmap.put("customKeys", this.customKeys);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bOrderGetResponse> getResponseClass() {
      return B2bOrderGetResponse.class;
   }
}

package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.SwitchDeliveryModeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SwitchDeliveryModeRequest extends AbstractRequest implements JdRequest<SwitchDeliveryModeResponse> {
   private Long storeId;
   private String value;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }

   public String getApiMethod() {
      return "jingdong.switchDeliveryMode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      pmap.put("value", this.value);
      return JsonUtil.toJson(pmap);
   }

   public Class<SwitchDeliveryModeResponse> getResponseClass() {
      return SwitchDeliveryModeResponse.class;
   }
}

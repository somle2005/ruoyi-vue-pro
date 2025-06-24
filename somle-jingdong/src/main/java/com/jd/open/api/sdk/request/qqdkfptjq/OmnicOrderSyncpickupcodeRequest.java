package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderSyncpickupcodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderSyncpickupcodeRequest extends AbstractRequest implements JdRequest<OmnicOrderSyncpickupcodeResponse> {
   private String authKey;
   private String pickUpCode;
   private String salesChannelOrderId;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setPickUpCode(String pickUpCode) {
      this.pickUpCode = pickUpCode;
   }

   public String getPickUpCode() {
      return this.pickUpCode;
   }

   public void setSalesChannelOrderId(String salesChannelOrderId) {
      this.salesChannelOrderId = salesChannelOrderId;
   }

   public String getSalesChannelOrderId() {
      return this.salesChannelOrderId;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.syncpickupcode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pickUpCode", this.pickUpCode);
      pmap.put("salesChannelOrderId", this.salesChannelOrderId);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderSyncpickupcodeResponse> getResponseClass() {
      return OmnicOrderSyncpickupcodeResponse.class;
   }
}

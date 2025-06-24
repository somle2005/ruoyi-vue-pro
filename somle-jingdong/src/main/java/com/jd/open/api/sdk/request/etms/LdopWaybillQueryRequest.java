package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopWaybillQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopWaybillQueryRequest extends AbstractRequest implements JdRequest<LdopWaybillQueryResponse> {
   private String deliveryId;
   private String customerCode;

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.waybill.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopWaybillQueryResponse> getResponseClass() {
      return LdopWaybillQueryResponse.class;
   }
}

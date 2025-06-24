package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderGetRequest extends AbstractRequest implements JdRequest<PopOrderGetResponse> {
   private String orderState;
   private String optionalFields;
   private long orderId;
   private String realPin;
   private String openIdBuyer;
   private String xidBuyer;

   public void setOrderState(String orderState) {
      this.orderState = orderState;
   }

   public String getOrderState() {
      return this.orderState;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOrderId(long orderId) {
      this.orderId = orderId;
   }

   public long getOrderId() {
      return this.orderId;
   }

   public void setRealPin(String realPin) {
      this.realPin = realPin;
   }

   public String getRealPin() {
      return this.realPin;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_state", this.orderState);
      pmap.put("optional_fields", this.optionalFields);
      pmap.put("order_id", this.orderId);
      pmap.put("realPin", this.realPin);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderGetResponse> getResponseClass() {
      return PopOrderGetResponse.class;
   }
}

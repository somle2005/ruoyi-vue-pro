package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopWaybillGeneralQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopWaybillGeneralQueryRequest extends AbstractRequest implements JdRequest<LdopWaybillGeneralQueryResponse> {
   private String customerCode;
   private String deliveryId;
   private String phone;
   private Integer dynamicTimeFlag;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setDynamicTimeFlag(Integer dynamicTimeFlag) {
      this.dynamicTimeFlag = dynamicTimeFlag;
   }

   public Integer getDynamicTimeFlag() {
      return this.dynamicTimeFlag;
   }

   public String getApiMethod() {
      return "jingdong.ldop.waybill.generalQuery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("phone", this.phone);
      pmap.put("dynamicTimeFlag", this.dynamicTimeFlag);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopWaybillGeneralQueryResponse> getResponseClass() {
      return LdopWaybillGeneralQueryResponse.class;
   }
}

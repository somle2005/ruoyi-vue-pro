package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeCswsDispatchConfirmOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeCswsDispatchConfirmOrderRequest extends AbstractRequest implements JdRequest<UeCswsDispatchConfirmOrderResponse> {
   private Integer customerOrderState;
   private String appId;
   private String cusOrderNo;
   private String vendorCode;

   public void setCustomerOrderState(Integer customerOrderState) {
      this.customerOrderState = customerOrderState;
   }

   public Integer getCustomerOrderState() {
      return this.customerOrderState;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCusOrderNo(String cusOrderNo) {
      this.cusOrderNo = cusOrderNo;
   }

   public String getCusOrderNo() {
      return this.cusOrderNo;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.csws.dispatch.confirmOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerOrderState", this.customerOrderState);
      pmap.put("appId", this.appId);
      pmap.put("cusOrderNo", this.cusOrderNo);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeCswsDispatchConfirmOrderResponse> getResponseClass() {
      return UeCswsDispatchConfirmOrderResponse.class;
   }
}

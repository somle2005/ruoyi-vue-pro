package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeCswsDispatchCustomerOrderVirtualInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeCswsDispatchCustomerOrderVirtualInfoRequest extends AbstractRequest implements JdRequest<UeCswsDispatchCustomerOrderVirtualInfoResponse> {
   private String appId;
   private String cusOrderNo;
   private String vendorCode;

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
      return "jingdong.ue.csws.dispatch.customerOrderVirtualInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("cusOrderNo", this.cusOrderNo);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeCswsDispatchCustomerOrderVirtualInfoResponse> getResponseClass() {
      return UeCswsDispatchCustomerOrderVirtualInfoResponse.class;
   }
}

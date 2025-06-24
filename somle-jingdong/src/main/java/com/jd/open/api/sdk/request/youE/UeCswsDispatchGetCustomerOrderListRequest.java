package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeCswsDispatchGetCustomerOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeCswsDispatchGetCustomerOrderListRequest extends AbstractRequest implements JdRequest<UeCswsDispatchGetCustomerOrderListResponse> {
   private String appId;
   private Integer type;
   private String vendorCode;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.csws.dispatch.getCustomerOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("type", this.type);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeCswsDispatchGetCustomerOrderListResponse> getResponseClass() {
      return UeCswsDispatchGetCustomerOrderListResponse.class;
   }
}

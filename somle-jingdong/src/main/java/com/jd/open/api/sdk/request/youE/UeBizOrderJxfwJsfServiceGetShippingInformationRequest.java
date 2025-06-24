package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceGetShippingInformationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceGetShippingInformationRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceGetShippingInformationResponse> {
   private String orderNo;
   private String appId;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.getShippingInformation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceGetShippingInformationResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceGetShippingInformationResponse.class;
   }
}

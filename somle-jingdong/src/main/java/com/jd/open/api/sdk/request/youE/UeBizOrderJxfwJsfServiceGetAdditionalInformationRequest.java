package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeBizOrderJxfwJsfServiceGetAdditionalInformationResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeBizOrderJxfwJsfServiceGetAdditionalInformationRequest extends AbstractRequest implements JdRequest<UeBizOrderJxfwJsfServiceGetAdditionalInformationResponse> {
   private String orderNos;
   private String appId;

   public void setOrderNos(String orderNos) {
      this.orderNos = orderNos;
   }

   public String getOrderNos() {
      return this.orderNos;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public String getApiMethod() {
      return "jingdong.ue.bizOrderJxfwJsfService.getAdditionalInformation";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNos", this.orderNos);
      pmap.put("appId", this.appId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeBizOrderJxfwJsfServiceGetAdditionalInformationResponse> getResponseClass() {
      return UeBizOrderJxfwJsfServiceGetAdditionalInformationResponse.class;
   }
}

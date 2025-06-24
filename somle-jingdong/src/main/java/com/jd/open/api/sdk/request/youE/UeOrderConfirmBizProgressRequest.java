package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderConfirmBizProgressResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderConfirmBizProgressRequest extends AbstractRequest implements JdRequest<UeOrderConfirmBizProgressResponse> {
   private String appId;
   private String orderNos;
   private String type;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setOrderNos(String orderNos) {
      this.orderNos = orderNos;
   }

   public String getOrderNos() {
      return this.orderNos;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.confirmBizProgress";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("orderNos", this.orderNos);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderConfirmBizProgressResponse> getResponseClass() {
      return UeOrderConfirmBizProgressResponse.class;
   }
}

package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderIvcActualQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderIvcActualQueryRequest extends AbstractRequest implements JdRequest<UeOrderIvcActualQueryResponse> {
   private String appid;
   private String orderId;
   private String venderCode;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.ivcActualQuery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("orderId", this.orderId);
      pmap.put("venderCode", this.venderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderIvcActualQueryResponse> getResponseClass() {
      return UeOrderIvcActualQueryResponse.class;
   }
}

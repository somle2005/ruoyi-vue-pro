package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskPushHandleStatResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskPushHandleStatRequest extends AbstractRequest implements JdRequest<HomefwTaskPushHandleStatResponse> {
   private String venderCode;
   private String orderNos;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNos(String orderNos) {
      this.orderNos = orderNos;
   }

   public String getOrderNos() {
      return this.orderNos;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.pushHandleStat";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNos", this.orderNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskPushHandleStatResponse> getResponseClass() {
      return HomefwTaskPushHandleStatResponse.class;
   }
}

package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskIdentifyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskIdentifyRequest extends AbstractRequest implements JdRequest<HomefwTaskIdentifyResponse> {
   private String venderCode;
   private String orderNo;
   private String indentifyCode;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setIndentifyCode(String indentifyCode) {
      this.indentifyCode = indentifyCode;
   }

   public String getIndentifyCode() {
      return this.indentifyCode;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.identify";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("indentifyCode", this.indentifyCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskIdentifyResponse> getResponseClass() {
      return HomefwTaskIdentifyResponse.class;
   }
}

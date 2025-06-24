package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewGoDoorResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewGoDoorRequest extends AbstractRequest implements JdRequest<UeOrderNewGoDoorResponse> {
   private String appid;
   private String orderNo;
   private String firstCallDate;
   private String callDate;
   private String venderCode;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setFirstCallDate(String firstCallDate) {
      this.firstCallDate = firstCallDate;
   }

   public String getFirstCallDate() {
      return this.firstCallDate;
   }

   public void setCallDate(String callDate) {
      this.callDate = callDate;
   }

   public String getCallDate() {
      return this.callDate;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.goDoor";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("orderNo", this.orderNo);
      pmap.put("firstCallDate", this.firstCallDate);
      pmap.put("callDate", this.callDate);
      pmap.put("venderCode", this.venderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewGoDoorResponse> getResponseClass() {
      return UeOrderNewGoDoorResponse.class;
   }
}

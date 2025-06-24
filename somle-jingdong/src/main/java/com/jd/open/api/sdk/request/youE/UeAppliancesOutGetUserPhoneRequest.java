package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeAppliancesOutGetUserPhoneResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeAppliancesOutGetUserPhoneRequest extends AbstractRequest implements JdRequest<UeAppliancesOutGetUserPhoneResponse> {
   private String orderNo;
   private String venderCode;
   private String appid;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public String getApiMethod() {
      return "jingdong.ue.appliances.out.getUserPhone";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeAppliancesOutGetUserPhoneResponse> getResponseClass() {
      return UeAppliancesOutGetUserPhoneResponse.class;
   }
}

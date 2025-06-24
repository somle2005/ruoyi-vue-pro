package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOutQueryOrderArriveTimeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOutQueryOrderArriveTimeRequest extends AbstractRequest implements JdRequest<UeRecoveryOutQueryOrderArriveTimeResponse> {
   private String code;
   private String appid;
   private String orderNo;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

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

   public String getApiMethod() {
      return "jingdong.ue.recovery.out.queryOrderArriveTime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("appid", this.appid);
      pmap.put("orderNo", this.orderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOutQueryOrderArriveTimeResponse> getResponseClass() {
      return UeRecoveryOutQueryOrderArriveTimeResponse.class;
   }
}

package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderTakeOutResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderTakeOutRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderTakeOutResponse> {
   private String appid;
   private String data;
   private String code;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String getData() {
      return this.data;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.takeOut";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("data", this.data);
      pmap.put("code", this.code);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderTakeOutResponse> getResponseClass() {
      return UeRecoveryOrderTakeOutResponse.class;
   }
}

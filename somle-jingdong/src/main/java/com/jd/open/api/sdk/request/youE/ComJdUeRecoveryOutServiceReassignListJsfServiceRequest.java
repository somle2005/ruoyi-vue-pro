package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.ComJdUeRecoveryOutServiceReassignListJsfServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdUeRecoveryOutServiceReassignListJsfServiceRequest extends AbstractRequest implements JdRequest<ComJdUeRecoveryOutServiceReassignListJsfServiceResponse> {
   private String appid;
   private String code;
   private String data;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setData(String data) {
      this.data = data;
   }

   public String getData() {
      return this.data;
   }

   public String getApiMethod() {
      return "jingdong.com.jd.ue.recovery.out.service.ReassignListJsfService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("code", this.code);
      pmap.put("data", this.data);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdUeRecoveryOutServiceReassignListJsfServiceResponse> getResponseClass() {
      return ComJdUeRecoveryOutServiceReassignListJsfServiceResponse.class;
   }
}

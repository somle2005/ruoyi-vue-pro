package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOutServiceRecyclerAckServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOutServiceRecyclerAckServiceRequest extends AbstractRequest implements JdRequest<UeRecoveryOutServiceRecyclerAckServiceResponse> {
   private String code;
   private String appid;
   private String data;

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

   public void setData(String data) {
      this.data = data;
   }

   public String getData() {
      return this.data;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.out.service.RecyclerAckService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("appid", this.appid);
      pmap.put("data", this.data);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOutServiceRecyclerAckServiceResponse> getResponseClass() {
      return UeRecoveryOutServiceRecyclerAckServiceResponse.class;
   }
}

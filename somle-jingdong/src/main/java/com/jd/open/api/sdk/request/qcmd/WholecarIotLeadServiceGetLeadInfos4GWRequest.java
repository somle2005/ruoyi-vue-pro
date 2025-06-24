package com.jd.open.api.sdk.request.qcmd;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qcmd.WholecarIotLeadServiceGetLeadInfos4GWResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WholecarIotLeadServiceGetLeadInfos4GWRequest extends AbstractRequest implements JdRequest<WholecarIotLeadServiceGetLeadInfos4GWResponse> {
   private Long venderId;
   private String bizToken;

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setBizToken(String bizToken) {
      this.bizToken = bizToken;
   }

   public String getBizToken() {
      return this.bizToken;
   }

   public String getApiMethod() {
      return "jingdong.wholecar.iot.leadService.getLeadInfos4GW";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("bizToken", this.bizToken);
      return JsonUtil.toJson(pmap);
   }

   public Class<WholecarIotLeadServiceGetLeadInfos4GWResponse> getResponseClass() {
      return WholecarIotLeadServiceGetLeadInfos4GWResponse.class;
   }
}

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsPoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsPoGetRequest extends AbstractRequest implements JdRequest<LogisticsPoGetResponse> {
   private String inboundNo;

   public void setInboundNo(String inboundNo) {
      this.inboundNo = inboundNo;
   }

   public String getInboundNo() {
      return this.inboundNo;
   }

   public String getApiMethod() {
      return "jingdong.logistics.po.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("inbound_no", this.inboundNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsPoGetResponse> getResponseClass() {
      return LogisticsPoGetResponse.class;
   }
}

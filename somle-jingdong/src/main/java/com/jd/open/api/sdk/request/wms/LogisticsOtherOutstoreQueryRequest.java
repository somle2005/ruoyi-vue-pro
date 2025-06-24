package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsOtherOutstoreQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsOtherOutstoreQueryRequest extends AbstractRequest implements JdRequest<LogisticsOtherOutstoreQueryResponse> {
   private String joslOutboundNo;

   public void setJoslOutboundNo(String joslOutboundNo) {
      this.joslOutboundNo = joslOutboundNo;
   }

   public String getJoslOutboundNo() {
      return this.joslOutboundNo;
   }

   public String getApiMethod() {
      return "jingdong.logistics.otherOutstore.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("josl_outbound_no", this.joslOutboundNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsOtherOutstoreQueryResponse> getResponseClass() {
      return LogisticsOtherOutstoreQueryResponse.class;
   }
}

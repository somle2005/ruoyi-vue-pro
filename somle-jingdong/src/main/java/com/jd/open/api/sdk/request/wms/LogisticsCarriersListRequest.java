package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsCarriersListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsCarriersListRequest extends AbstractRequest implements JdRequest<LogisticsCarriersListResponse> {
   public String getApiMethod() {
      return "jingdong.logistics.carriers.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsCarriersListResponse> getResponseClass() {
      return LogisticsCarriersListResponse.class;
   }
}

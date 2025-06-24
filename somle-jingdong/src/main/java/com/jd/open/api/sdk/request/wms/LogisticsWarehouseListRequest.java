package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsWarehouseListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsWarehouseListRequest extends AbstractRequest implements JdRequest<LogisticsWarehouseListResponse> {
   public String getApiMethod() {
      return "jingdong.logistics.warehouse.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsWarehouseListResponse> getResponseClass() {
      return LogisticsWarehouseListResponse.class;
   }
}

package com.jd.open.api.sdk.request.c2mdzkfpt;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.c2mdzkfpt.ContainerCustomInfoOpenService.request.getOrderCustomInfo.ContainerCustomInfoQuery;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.c2mdzkfpt.YipProductionWarehouseContainerGetOrderCustomInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class YipProductionWarehouseContainerGetOrderCustomInfoRequest extends AbstractRequest implements JdRequest<YipProductionWarehouseContainerGetOrderCustomInfoResponse> {
   private ContainerCustomInfoQuery containerCustomInfoQuery;

   public String getApiMethod() {
      return "jingdong.yip.production.warehouseContainer.getOrderCustomInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("containerCustomInfoQuery", this.containerCustomInfoQuery);
      return JsonUtil.toJson(pmap);
   }

   public Class<YipProductionWarehouseContainerGetOrderCustomInfoResponse> getResponseClass() {
      return YipProductionWarehouseContainerGetOrderCustomInfoResponse.class;
   }

   @JsonProperty("containerCustomInfoQuery")
   public void setContainerCustomInfoQuery(ContainerCustomInfoQuery containerCustomInfoQuery) {
      this.containerCustomInfoQuery = containerCustomInfoQuery;
   }

   @JsonProperty("containerCustomInfoQuery")
   public ContainerCustomInfoQuery getContainerCustomInfoQuery() {
      return this.containerCustomInfoQuery;
   }
}

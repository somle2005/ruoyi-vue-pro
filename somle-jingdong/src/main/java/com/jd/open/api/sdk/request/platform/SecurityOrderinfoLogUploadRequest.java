package com.jd.open.api.sdk.request.platform;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.platform.IsvLogService.request.upload.OrderInfoLog;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.platform.SecurityOrderinfoLogUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SecurityOrderinfoLogUploadRequest extends AbstractRequest implements JdRequest<SecurityOrderinfoLogUploadResponse> {
   private OrderInfoLog orderInfoLog;

   public String getApiMethod() {
      return "jingdong.security.orderinfo.log.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderInfoLog", this.orderInfoLog);
      return JsonUtil.toJson(pmap);
   }

   public Class<SecurityOrderinfoLogUploadResponse> getResponseClass() {
      return SecurityOrderinfoLogUploadResponse.class;
   }

   @JsonProperty("orderInfoLog")
   public void setOrderInfoLog(OrderInfoLog orderInfoLog) {
      this.orderInfoLog = orderInfoLog;
   }

   @JsonProperty("orderInfoLog")
   public OrderInfoLog getOrderInfoLog() {
      return this.orderInfoLog;
   }
}

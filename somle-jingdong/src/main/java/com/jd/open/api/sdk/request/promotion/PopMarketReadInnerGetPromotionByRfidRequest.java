package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PopMarketReadInnerGetPromotionByRfidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketReadInnerGetPromotionByRfidRequest extends AbstractRequest implements JdRequest<PopMarketReadInnerGetPromotionByRfidResponse> {
   private String ip;
   private String requestId;
   private String port;
   private Long rfId;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setRfId(Long rfId) {
      this.rfId = rfId;
   }

   public Long getRfId() {
      return this.rfId;
   }

   public String getApiMethod() {
      return "jingdong.pop.market.read.inner.getPromotionByRfid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("requestId", this.requestId);
      pmap.put("port", this.port);
      pmap.put("rfId", this.rfId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketReadInnerGetPromotionByRfidResponse> getResponseClass() {
      return PopMarketReadInnerGetPromotionByRfidResponse.class;
   }
}

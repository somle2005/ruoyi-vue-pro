package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PopMarketWritePromotionGiftApproveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketWritePromotionGiftApproveRequest extends AbstractRequest implements JdRequest<PopMarketWritePromotionGiftApproveResponse> {
   private String ip;
   private String port;
   private String requestId;
   private Long promoId;

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setPort(String port) {
      this.port = port;
   }

   public String getPort() {
      return this.port;
   }

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setPromoId(Long promoId) {
      this.promoId = promoId;
   }

   public Long getPromoId() {
      return this.promoId;
   }

   public String getApiMethod() {
      return "jingdong.pop.market.write.promotion.gift.approve";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ip", this.ip);
      pmap.put("port", this.port);
      pmap.put("request_id", this.requestId);
      pmap.put("promoId", this.promoId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketWritePromotionGiftApproveResponse> getResponseClass() {
      return PopMarketWritePromotionGiftApproveResponse.class;
   }
}

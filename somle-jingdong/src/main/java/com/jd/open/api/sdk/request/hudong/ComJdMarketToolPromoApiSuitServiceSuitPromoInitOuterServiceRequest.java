package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.request.SuitPromoInitOuterService.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.SuitPromoInitOuterService.request.SuitPromoInitOuterService.SuitPromoInitQueryVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceRequest extends AbstractRequest implements JdRequest<ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceResponse> {
   private SuitPromoInitQueryVO suitPromoInitQueryVO;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.com.jd.market.tool.promo.api.suit.service.SuitPromoInitOuterService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("suitPromoInitQueryVO", this.suitPromoInitQueryVO);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceResponse> getResponseClass() {
      return ComJdMarketToolPromoApiSuitServiceSuitPromoInitOuterServiceResponse.class;
   }

   @JsonProperty("suitPromoInitQueryVO")
   public void setSuitPromoInitQueryVO(SuitPromoInitQueryVO suitPromoInitQueryVO) {
      this.suitPromoInitQueryVO = suitPromoInitQueryVO;
   }

   @JsonProperty("suitPromoInitQueryVO")
   public SuitPromoInitQueryVO getSuitPromoInitQueryVO() {
      return this.suitPromoInitQueryVO;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }
}

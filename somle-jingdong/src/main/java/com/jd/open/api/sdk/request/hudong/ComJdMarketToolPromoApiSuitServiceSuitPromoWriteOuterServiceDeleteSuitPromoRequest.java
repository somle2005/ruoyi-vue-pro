package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.deleteSuitPromo.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.deleteSuitPromo.SuitPromoDeleteVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.ComJdMarketToolPromoApiSuitServiceSuitPromoWriteOuterServiceDeleteSuitPromoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdMarketToolPromoApiSuitServiceSuitPromoWriteOuterServiceDeleteSuitPromoRequest extends AbstractRequest implements JdRequest<ComJdMarketToolPromoApiSuitServiceSuitPromoWriteOuterServiceDeleteSuitPromoResponse> {
   private SuitPromoDeleteVO suitPromoDeleteVO;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.com.jd.market.tool.promo.api.suit.service.SuitPromoWriteOuterService.deleteSuitPromo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("suitPromoDeleteVO", this.suitPromoDeleteVO);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdMarketToolPromoApiSuitServiceSuitPromoWriteOuterServiceDeleteSuitPromoResponse> getResponseClass() {
      return ComJdMarketToolPromoApiSuitServiceSuitPromoWriteOuterServiceDeleteSuitPromoResponse.class;
   }

   @JsonProperty("suitPromoDeleteVO")
   public void setSuitPromoDeleteVO(SuitPromoDeleteVO suitPromoDeleteVO) {
      this.suitPromoDeleteVO = suitPromoDeleteVO;
   }

   @JsonProperty("suitPromoDeleteVO")
   public SuitPromoDeleteVO getSuitPromoDeleteVO() {
      return this.suitPromoDeleteVO;
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

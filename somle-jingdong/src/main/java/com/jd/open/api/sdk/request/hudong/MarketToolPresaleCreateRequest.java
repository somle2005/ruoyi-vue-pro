package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.PresaleWriteService.request.create.PresaleInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPresaleCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPresaleCreateRequest extends AbstractRequest implements JdRequest<MarketToolPresaleCreateResponse> {
   private PresaleInfo presaleInfo;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.market.tool.presale.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("presaleInfo", this.presaleInfo);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPresaleCreateResponse> getResponseClass() {
      return MarketToolPresaleCreateResponse.class;
   }

   @JsonProperty("presaleInfo")
   public void setPresaleInfo(PresaleInfo presaleInfo) {
      this.presaleInfo = presaleInfo;
   }

   @JsonProperty("presaleInfo")
   public PresaleInfo getPresaleInfo() {
      return this.presaleInfo;
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

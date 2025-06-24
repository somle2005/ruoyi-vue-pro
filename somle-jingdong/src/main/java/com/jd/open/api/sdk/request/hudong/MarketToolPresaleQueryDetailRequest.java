package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPresaleQueryDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPresaleQueryDetailRequest extends AbstractRequest implements JdRequest<MarketToolPresaleQueryDetailResponse> {
   private Long presaleId;

   public void setPresaleId(Long presaleId) {
      this.presaleId = presaleId;
   }

   public Long getPresaleId() {
      return this.presaleId;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.presale.query.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("presaleId", this.presaleId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPresaleQueryDetailResponse> getResponseClass() {
      return MarketToolPresaleQueryDetailResponse.class;
   }
}

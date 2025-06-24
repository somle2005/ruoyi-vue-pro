package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPreasleQueryGetControlTimeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPreasleQueryGetControlTimeRequest extends AbstractRequest implements JdRequest<MarketToolPreasleQueryGetControlTimeResponse> {
   public String getApiMethod() {
      return "jingdong.market.tool.preasle.query.getControlTime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPreasleQueryGetControlTimeResponse> getResponseClass() {
      return MarketToolPreasleQueryGetControlTimeResponse.class;
   }
}

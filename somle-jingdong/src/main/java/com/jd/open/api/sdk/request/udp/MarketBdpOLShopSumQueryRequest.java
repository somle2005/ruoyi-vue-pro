package com.jd.open.api.sdk.request.udp;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.udp.MarketBdpOLShopSumQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketBdpOLShopSumQueryRequest extends AbstractRequest implements JdRequest<MarketBdpOLShopSumQueryResponse> {
   private String tp;
   private String dt;
   private String field;

   public void setTp(String tp) {
      this.tp = tp;
   }

   public String getTp() {
      return this.tp;
   }

   public void setDt(String dt) {
      this.dt = dt;
   }

   public String getDt() {
      return this.dt;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.market.bdp.OLShopSum.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("tp", this.tp);
      pmap.put("dt", this.dt);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketBdpOLShopSumQueryResponse> getResponseClass() {
      return MarketBdpOLShopSumQueryResponse.class;
   }
}

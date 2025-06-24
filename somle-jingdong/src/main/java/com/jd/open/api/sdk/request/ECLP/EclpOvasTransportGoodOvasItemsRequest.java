package com.jd.open.api.sdk.request.ECLP;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.request.transportGoodOvasItems.JosGoodsOvasRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOvasTransportGoodOvasItemsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOvasTransportGoodOvasItemsRequest extends AbstractRequest implements JdRequest<EclpOvasTransportGoodOvasItemsResponse> {
   private JosGoodsOvasRequest request;

   public String getApiMethod() {
      return "jingdong.eclp.ovas.transportGoodOvasItems";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOvasTransportGoodOvasItemsResponse> getResponseClass() {
      return EclpOvasTransportGoodOvasItemsResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(JosGoodsOvasRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public JosGoodsOvasRequest getRequest() {
      return this.request;
   }
}

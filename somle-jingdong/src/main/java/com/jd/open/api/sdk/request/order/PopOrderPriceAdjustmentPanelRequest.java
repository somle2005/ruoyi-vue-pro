package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.PriceAdjustmentService.request.panel.PriceAdjustmentPanelQuery;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderPriceAdjustmentPanelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderPriceAdjustmentPanelRequest extends AbstractRequest implements JdRequest<PopOrderPriceAdjustmentPanelResponse> {
   private PriceAdjustmentPanelQuery request;

   public String getApiMethod() {
      return "jingdong.pop.order.priceAdjustment.panel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderPriceAdjustmentPanelResponse> getResponseClass() {
      return PopOrderPriceAdjustmentPanelResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(PriceAdjustmentPanelQuery request) {
      this.request = request;
   }

   @JsonProperty("request")
   public PriceAdjustmentPanelQuery getRequest() {
      return this.request;
   }
}

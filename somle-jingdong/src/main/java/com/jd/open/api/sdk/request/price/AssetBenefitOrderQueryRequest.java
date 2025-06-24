package com.jd.open.api.sdk.request.price;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.price.AssetBenefitOrderQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AssetBenefitOrderQueryRequest extends AbstractRequest implements JdRequest<AssetBenefitOrderQueryResponse> {
   private String requestId;

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public String getApiMethod() {
      return "jingdong.asset.benefit.order.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request_id", this.requestId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AssetBenefitOrderQueryResponse> getResponseClass() {
      return AssetBenefitOrderQueryResponse.class;
   }
}

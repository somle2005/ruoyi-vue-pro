package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderOrderSplitCommitXmlApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderOrderSplitCommitXmlApiRequest extends AbstractRequest implements JdRequest<PopOrderOrderSplitCommitXmlApiResponse> {
   private String param;

   public void setParam(String param) {
      this.param = param;
   }

   public String getParam() {
      return this.param;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.orderSplitCommitXmlApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderOrderSplitCommitXmlApiResponse> getResponseClass() {
      return PopOrderOrderSplitCommitXmlApiResponse.class;
   }
}

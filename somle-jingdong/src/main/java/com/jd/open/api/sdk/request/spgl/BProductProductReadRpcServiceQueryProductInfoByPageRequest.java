package com.jd.open.api.sdk.request.spgl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.spgl.ProductReadRpcService.request.queryProductInfoByPage.ProductPageQueryRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.spgl.BProductProductReadRpcServiceQueryProductInfoByPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class BProductProductReadRpcServiceQueryProductInfoByPageRequest extends AbstractRequest implements JdRequest<BProductProductReadRpcServiceQueryProductInfoByPageResponse> {
   private ProductPageQueryRequest param1;

   public String getApiMethod() {
      return "shangling.b.product.ProductReadRpcService.queryProductInfoByPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<BProductProductReadRpcServiceQueryProductInfoByPageResponse> getResponseClass() {
      return BProductProductReadRpcServiceQueryProductInfoByPageResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(ProductPageQueryRequest param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public ProductPageQueryRequest getParam1() {
      return this.param1;
   }
}

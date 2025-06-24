package com.jd.open.api.sdk.request.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ProductConfigSdkService.request.setProductConfig.ProductConfigReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.ProductConfigSdkServiceSetProductConfigResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProductConfigSdkServiceSetProductConfigRequest extends AbstractRequest implements JdRequest<ProductConfigSdkServiceSetProductConfigResponse> {
   private ProductConfigReq productConfigReq;

   public String getApiMethod() {
      return "jingdong.productConfigSdkService.setProductConfig";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productConfigReq", this.productConfigReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<ProductConfigSdkServiceSetProductConfigResponse> getResponseClass() {
      return ProductConfigSdkServiceSetProductConfigResponse.class;
   }

   @JsonProperty("productConfigReq")
   public void setProductConfigReq(ProductConfigReq productConfigReq) {
      this.productConfigReq = productConfigReq;
   }

   @JsonProperty("productConfigReq")
   public ProductConfigReq getProductConfigReq() {
      return this.productConfigReq;
   }
}

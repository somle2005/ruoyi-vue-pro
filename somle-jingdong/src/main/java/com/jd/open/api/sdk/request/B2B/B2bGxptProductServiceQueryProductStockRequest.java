package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bGxptProductServiceQueryProductStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bGxptProductServiceQueryProductStockRequest extends AbstractRequest implements JdRequest<B2bGxptProductServiceQueryProductStockResponse> {
   private Long venderId;
   private String skuSet;

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setSkuSet(String skuSet) {
      this.skuSet = skuSet;
   }

   public String getSkuSet() {
      return this.skuSet;
   }

   public String getApiMethod() {
      return "jingdong.b2b.gxpt.ProductService.queryProductStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("skuSet", this.skuSet);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bGxptProductServiceQueryProductStockResponse> getResponseClass() {
      return B2bGxptProductServiceQueryProductStockResponse.class;
   }
}

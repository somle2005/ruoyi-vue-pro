package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.WareProductsortGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductsortGetRequest extends AbstractRequest implements JdRequest<WareProductsortGetResponse> {
   private String productSortIds;

   public void setProductSortIds(String productSortIds) {
      this.productSortIds = productSortIds;
   }

   public String getProductSortIds() {
      return this.productSortIds;
   }

   public String getApiMethod() {
      return "jingdong.ware.productsort.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("product_sort_ids", this.productSortIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareProductsortGetResponse> getResponseClass() {
      return WareProductsortGetResponse.class;
   }
}

package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoSkuRelativeBySkuIdsQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoSkuRelativeBySkuIdsQueryRequest extends AbstractRequest implements JdRequest<PopVideoSkuRelativeBySkuIdsQueryResponse> {
   private long productId;
   private String skuIds;

   public void setProductId(long productId) {
      this.productId = productId;
   }

   public long getProductId() {
      return this.productId;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.sku.relative.by.sku.ids.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productId", this.productId);
      pmap.put("sku_ids", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoSkuRelativeBySkuIdsQueryResponse> getResponseClass() {
      return PopVideoSkuRelativeBySkuIdsQueryResponse.class;
   }
}

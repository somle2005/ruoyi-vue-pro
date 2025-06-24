package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuWriteDeleteSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuWriteDeleteSkuRequest extends AbstractRequest implements JdRequest<SkuWriteDeleteSkuResponse> {
   private Long skuId;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.sku.write.deleteSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuWriteDeleteSkuResponse> getResponseClass() {
      return SkuWriteDeleteSkuResponse.class;
   }
}

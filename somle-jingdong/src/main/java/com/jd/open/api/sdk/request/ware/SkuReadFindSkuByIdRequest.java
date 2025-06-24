package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuReadFindSkuByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SkuReadFindSkuByIdRequest extends AbstractRequest implements JdRequest<SkuReadFindSkuByIdResponse> {
   private Long skuId;
   private String field;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.sku.read.findSkuById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuReadFindSkuByIdResponse> getResponseClass() {
      return SkuReadFindSkuByIdResponse.class;
   }
}

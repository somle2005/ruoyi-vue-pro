package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bProductGetBigFieldResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bProductGetBigFieldRequest extends AbstractRequest implements JdRequest<B2bProductGetBigFieldResponse> {
   private Long skuId;
   private String fieldKeys;

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setFieldKeys(String fieldKeys) {
      this.fieldKeys = fieldKeys;
   }

   public String getFieldKeys() {
      return this.fieldKeys;
   }

   public String getApiMethod() {
      return "jingdong.b2b.product.getBigField";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      pmap.put("fieldKeys", this.fieldKeys);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bProductGetBigFieldResponse> getResponseClass() {
      return B2bProductGetBigFieldResponse.class;
   }
}

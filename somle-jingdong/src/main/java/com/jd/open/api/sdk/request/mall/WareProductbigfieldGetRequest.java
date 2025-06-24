package com.jd.open.api.sdk.request.mall;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.mall.WareProductbigfieldGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareProductbigfieldGetRequest extends AbstractRequest implements JdRequest<WareProductbigfieldGetResponse> {
   private String skuId;
   private String field;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.ware.productbigfield.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sku_id", this.skuId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareProductbigfieldGetResponse> getResponseClass() {
      return WareProductbigfieldGetResponse.class;
   }
}

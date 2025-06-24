package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bProductStockGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bProductStockGetRequest extends AbstractRequest implements JdRequest<B2bProductStockGetResponse> {
   private String skuNums;
   private String area;

   public void setSkuNums(String skuNums) {
      this.skuNums = skuNums;
   }

   public String getSkuNums() {
      return this.skuNums;
   }

   public void setArea(String area) {
      this.area = area;
   }

   public String getArea() {
      return this.area;
   }

   public String getApiMethod() {
      return "jingdong.b2b.product.stock.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuNums", this.skuNums);
      pmap.put("area", this.area);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bProductStockGetResponse> getResponseClass() {
      return B2bProductStockGetResponse.class;
   }
}

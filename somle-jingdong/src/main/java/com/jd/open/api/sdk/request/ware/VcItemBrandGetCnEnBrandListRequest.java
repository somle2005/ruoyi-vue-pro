package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.VcItemBrandGetCnEnBrandListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemBrandGetCnEnBrandListRequest extends AbstractRequest implements JdRequest<VcItemBrandGetCnEnBrandListResponse> {
   private String brandId;

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.brand.getCnEnBrandList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandId", this.brandId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemBrandGetCnEnBrandListResponse> getResponseClass() {
      return VcItemBrandGetCnEnBrandListResponse.class;
   }
}

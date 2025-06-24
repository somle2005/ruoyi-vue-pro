package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemModelFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemModelFindRequest extends AbstractRequest implements JdRequest<VcItemModelFindResponse> {
   private int cid3;
   private int brandId;

   public void setCid3(int cid3) {
      this.cid3 = cid3;
   }

   public int getCid3() {
      return this.cid3;
   }

   public void setBrandId(int brandId) {
      this.brandId = brandId;
   }

   public int getBrandId() {
      return this.brandId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.model.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid3", this.cid3);
      pmap.put("brand_id", this.brandId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemModelFindResponse> getResponseClass() {
      return VcItemModelFindResponse.class;
   }
}

package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.VcItemQueryMarkByCatIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemQueryMarkByCatIdRequest extends AbstractRequest implements JdRequest<VcItemQueryMarkByCatIdResponse> {
   private Integer catId;

   public void setCatId(Integer catId) {
      this.catId = catId;
   }

   public Integer getCatId() {
      return this.catId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.queryMarkByCatId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("catId", this.catId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemQueryMarkByCatIdResponse> getResponseClass() {
      return VcItemQueryMarkByCatIdResponse.class;
   }
}

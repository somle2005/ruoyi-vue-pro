package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemProductApplyGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemProductApplyGetRequest extends AbstractRequest implements JdRequest<VcItemProductApplyGetResponse> {
   private String applyId;

   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   public String getApplyId() {
      return this.applyId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.product.apply.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("applyId", this.applyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemProductApplyGetResponse> getResponseClass() {
      return VcItemProductApplyGetResponse.class;
   }
}

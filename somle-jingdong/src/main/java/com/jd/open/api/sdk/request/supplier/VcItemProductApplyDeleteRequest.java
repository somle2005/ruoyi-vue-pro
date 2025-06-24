package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemProductApplyDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemProductApplyDeleteRequest extends AbstractRequest implements JdRequest<VcItemProductApplyDeleteResponse> {
   private String applyId;

   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   public String getApplyId() {
      return this.applyId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.product.apply.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("apply_id", this.applyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemProductApplyDeleteResponse> getResponseClass() {
      return VcItemProductApplyDeleteResponse.class;
   }
}

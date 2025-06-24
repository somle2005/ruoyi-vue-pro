package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemPrimaryPicApplyGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemPrimaryPicApplyGetRequest extends AbstractRequest implements JdRequest<VcItemPrimaryPicApplyGetResponse> {
   private String applyId;

   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   public String getApplyId() {
      return this.applyId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.primaryPic.apply.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("apply_id", this.applyId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemPrimaryPicApplyGetResponse> getResponseClass() {
      return VcItemPrimaryPicApplyGetResponse.class;
   }
}

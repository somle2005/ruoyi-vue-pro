package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemFeatureFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemFeatureFindRequest extends AbstractRequest implements JdRequest<VcItemFeatureFindResponse> {
   private int cid3;
   private String wareId;

   public void setCid3(int cid3) {
      this.cid3 = cid3;
   }

   public int getCid3() {
      return this.cid3;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.feature.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cid3", this.cid3);
      pmap.put("ware_id", this.wareId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemFeatureFindResponse> getResponseClass() {
      return VcItemFeatureFindResponse.class;
   }
}

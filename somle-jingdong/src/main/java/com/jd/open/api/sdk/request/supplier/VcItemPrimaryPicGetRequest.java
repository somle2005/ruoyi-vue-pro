package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemPrimaryPicGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemPrimaryPicGetRequest extends AbstractRequest implements JdRequest<VcItemPrimaryPicGetResponse> {
   private String wareId;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public String getApiMethod() {
      return "jingdong.vc.item.primaryPic.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemPrimaryPicGetResponse> getResponseClass() {
      return VcItemPrimaryPicGetResponse.class;
   }
}

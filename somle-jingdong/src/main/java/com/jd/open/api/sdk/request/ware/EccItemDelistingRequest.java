package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccItemDelistingResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemDelistingRequest extends AbstractRequest implements JdRequest<EccItemDelistingResponse> {
   private Long itemId;

   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   public Long getItemId() {
      return this.itemId;
   }

   public String getApiMethod() {
      return "jingdong.ecc.item.delisting";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("item_id", this.itemId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccItemDelistingResponse> getResponseClass() {
      return EccItemDelistingResponse.class;
   }
}

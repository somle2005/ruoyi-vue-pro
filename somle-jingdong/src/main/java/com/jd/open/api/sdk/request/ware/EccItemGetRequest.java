package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.EccItemGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EccItemGetRequest extends AbstractRequest implements JdRequest<EccItemGetResponse> {
   private Long itemId;
   private String ip;

   public void setItemId(Long itemId) {
      this.itemId = itemId;
   }

   public Long getItemId() {
      return this.itemId;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public String getApiMethod() {
      return "jingdong.ecc.item.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("item_id", this.itemId);
      pmap.put("ip", this.ip);
      return JsonUtil.toJson(pmap);
   }

   public Class<EccItemGetResponse> getResponseClass() {
      return EccItemGetResponse.class;
   }
}

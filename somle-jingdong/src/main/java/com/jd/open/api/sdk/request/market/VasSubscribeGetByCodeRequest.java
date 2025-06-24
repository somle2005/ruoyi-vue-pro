package com.jd.open.api.sdk.request.market;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.market.VasSubscribeGetByCodeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VasSubscribeGetByCodeRequest extends AbstractRequest implements JdRequest<VasSubscribeGetByCodeResponse> {
   private String itemCode;

   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   public String getItemCode() {
      return this.itemCode;
   }

   public String getApiMethod() {
      return "jingdong.vas.subscribe.getByCode";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("item_code", this.itemCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<VasSubscribeGetByCodeResponse> getResponseClass() {
      return VasSubscribeGetByCodeResponse.class;
   }
}

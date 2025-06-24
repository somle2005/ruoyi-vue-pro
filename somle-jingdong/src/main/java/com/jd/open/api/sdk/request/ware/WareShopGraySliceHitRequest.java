package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareShopGraySliceHitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareShopGraySliceHitRequest extends AbstractRequest implements JdRequest<WareShopGraySliceHitResponse> {
   private String grayKey;

   public void setGrayKey(String grayKey) {
      this.grayKey = grayKey;
   }

   public String getGrayKey() {
      return this.grayKey;
   }

   public String getApiMethod() {
      return "jingdong.ware.shop.gray.slice.hit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("grayKey", this.grayKey);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareShopGraySliceHitResponse> getResponseClass() {
      return WareShopGraySliceHitResponse.class;
   }
}

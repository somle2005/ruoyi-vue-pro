package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReserveDataListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareReserveDataListRequest extends AbstractRequest implements JdRequest<WareReserveDataListResponse> {
   private String skuId;

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.ware.reserve.data.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuId", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReserveDataListResponse> getResponseClass() {
      return WareReserveDataListResponse.class;
   }
}

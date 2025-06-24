package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcItemSaleunitsFindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcItemSaleunitsFindRequest extends AbstractRequest implements JdRequest<VcItemSaleunitsFindResponse> {
   public String getApiMethod() {
      return "jingdong.vc.item.saleunits.find";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VcItemSaleunitsFindResponse> getResponseClass() {
      return VcItemSaleunitsFindResponse.class;
   }
}

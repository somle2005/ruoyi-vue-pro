package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderShipaddressQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderShipaddressQueryRequest extends AbstractRequest implements JdRequest<VenderShipaddressQueryResponse> {
   public String getApiMethod() {
      return "jingdong.vender.shipaddress.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderShipaddressQueryResponse> getResponseClass() {
      return VenderShipaddressQueryResponse.class;
   }
}

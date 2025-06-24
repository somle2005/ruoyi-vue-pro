package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReserveDataGrayGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareReserveDataGrayGetRequest extends AbstractRequest implements JdRequest<WareReserveDataGrayGetResponse> {
   public String getApiMethod() {
      return "jingdong.ware.reserve.data.gray.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReserveDataGrayGetResponse> getResponseClass() {
      return WareReserveDataGrayGetResponse.class;
   }
}

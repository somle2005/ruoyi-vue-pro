package com.jd.open.api.sdk.request.address;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.address.AreaProvinceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreaProvinceGetRequest extends AbstractRequest implements JdRequest<AreaProvinceGetResponse> {
   public String getApiMethod() {
      return "jingdong.area.province.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<AreaProvinceGetResponse> getResponseClass() {
      return AreaProvinceGetResponse.class;
   }
}

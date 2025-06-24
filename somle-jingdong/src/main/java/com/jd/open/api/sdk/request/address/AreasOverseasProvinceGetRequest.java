package com.jd.open.api.sdk.request.address;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.address.AreasOverseasProvinceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreasOverseasProvinceGetRequest extends AbstractRequest implements JdRequest<AreasOverseasProvinceGetResponse> {
   public String getApiMethod() {
      return "jingdong.areas.overseasProvince.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<AreasOverseasProvinceGetResponse> getResponseClass() {
      return AreasOverseasProvinceGetResponse.class;
   }
}

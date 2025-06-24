package com.jd.open.api.sdk.request.jddzk;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jddzk.AreasProvinceGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreasProvinceGetRequest extends AbstractRequest implements JdRequest<AreasProvinceGetResponse> {
   public String getApiMethod() {
      return "jingdong.areas.province.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<AreasProvinceGetResponse> getResponseClass() {
      return AreasProvinceGetResponse.class;
   }
}

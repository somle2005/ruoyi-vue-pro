package com.jd.open.api.sdk.request.website.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.website.ware.RegionInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RegionInfoGetRequest extends AbstractRequest implements JdRequest<RegionInfoGetResponse> {
   public String getApiMethod() {
      return "jingdong.regioninfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<RegionInfoGetResponse> getResponseClass() {
      return RegionInfoGetResponse.class;
   }
}

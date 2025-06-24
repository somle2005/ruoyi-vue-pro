package com.jd.open.api.sdk.request.address;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.address.AreasOverseasCityGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreasOverseasCityGetRequest extends AbstractRequest implements JdRequest<AreasOverseasCityGetResponse> {
   private int parentId;

   public void setParentId(int parentId) {
      this.parentId = parentId;
   }

   public int getParentId() {
      return this.parentId;
   }

   public String getApiMethod() {
      return "jingdong.areas.overseasCity.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parentId", this.parentId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AreasOverseasCityGetResponse> getResponseClass() {
      return AreasOverseasCityGetResponse.class;
   }
}

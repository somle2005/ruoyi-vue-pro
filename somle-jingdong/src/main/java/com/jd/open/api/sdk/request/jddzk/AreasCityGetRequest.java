package com.jd.open.api.sdk.request.jddzk;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jddzk.AreasCityGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreasCityGetRequest extends AbstractRequest implements JdRequest<AreasCityGetResponse> {
   private Integer parentId;

   public void setParentId(Integer parentId) {
      this.parentId = parentId;
   }

   public Integer getParentId() {
      return this.parentId;
   }

   public String getApiMethod() {
      return "jingdong.areas.city.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parent_id", this.parentId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AreasCityGetResponse> getResponseClass() {
      return AreasCityGetResponse.class;
   }
}

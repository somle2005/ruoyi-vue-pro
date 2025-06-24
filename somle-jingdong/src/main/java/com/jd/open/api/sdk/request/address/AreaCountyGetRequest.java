package com.jd.open.api.sdk.request.address;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.address.AreaCountyGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AreaCountyGetRequest extends AbstractRequest implements JdRequest<AreaCountyGetResponse> {
   private Long parentId;

   public void setParentId(Long parentId) {
      this.parentId = parentId;
   }

   public Long getParentId() {
      return this.parentId;
   }

   public String getApiMethod() {
      return "jingdong.area.county.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("parent_id", this.parentId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AreaCountyGetResponse> getResponseClass() {
      return AreaCountyGetResponse.class;
   }
}

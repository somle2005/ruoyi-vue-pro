package com.jd.open.api.sdk.request.iopdz;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.iopdz.QueryJdAreaIdListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryJdAreaIdListRequest extends AbstractRequest implements JdRequest<QueryJdAreaIdListResponse> {
   private Integer areaLevel;
   private Long jdAreaId;

   public void setAreaLevel(Integer areaLevel) {
      this.areaLevel = areaLevel;
   }

   public Integer getAreaLevel() {
      return this.areaLevel;
   }

   public void setJdAreaId(Long jdAreaId) {
      this.jdAreaId = jdAreaId;
   }

   public Long getJdAreaId() {
      return this.jdAreaId;
   }

   public String getApiMethod() {
      return "jingdong.queryJdAreaIdList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("areaLevel", this.areaLevel);
      pmap.put("jdAreaId", this.jdAreaId);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryJdAreaIdListResponse> getResponseClass() {
      return QueryJdAreaIdListResponse.class;
   }
}

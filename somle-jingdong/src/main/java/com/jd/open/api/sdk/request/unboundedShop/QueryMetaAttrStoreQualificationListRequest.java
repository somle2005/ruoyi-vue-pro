package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.QueryMetaAttrStoreQualificationListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryMetaAttrStoreQualificationListRequest extends AbstractRequest implements JdRequest<QueryMetaAttrStoreQualificationListResponse> {
   private Long param;

   public void setParam(Long param) {
      this.param = param;
   }

   public Long getParam() {
      return this.param;
   }

   public String getApiMethod() {
      return "jingdong.queryMetaAttrStoreQualificationList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryMetaAttrStoreQualificationListResponse> getResponseClass() {
      return QueryMetaAttrStoreQualificationListResponse.class;
   }
}

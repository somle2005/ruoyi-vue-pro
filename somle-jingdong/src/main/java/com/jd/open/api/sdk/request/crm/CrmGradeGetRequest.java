package com.jd.open.api.sdk.request.crm;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.crm.CrmGradeGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CrmGradeGetRequest extends AbstractRequest implements JdRequest<CrmGradeGetResponse> {
   public String getApiMethod() {
      return "jingdong.crm.grade.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<CrmGradeGetResponse> getResponseClass() {
      return CrmGradeGetResponse.class;
   }
}

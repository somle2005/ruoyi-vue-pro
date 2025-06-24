package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQuerySpSourceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQuerySpSourceRequest extends AbstractRequest implements JdRequest<EclpMasterQuerySpSourceResponse> {
   public String getApiMethod() {
      return "jingdong.eclp.master.querySpSource";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQuerySpSourceResponse> getResponseClass() {
      return EclpMasterQuerySpSourceResponse.class;
   }
}

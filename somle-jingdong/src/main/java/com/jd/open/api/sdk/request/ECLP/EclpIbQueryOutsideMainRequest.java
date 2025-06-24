package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpIbQueryOutsideMainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpIbQueryOutsideMainRequest extends AbstractRequest implements JdRequest<EclpIbQueryOutsideMainResponse> {
   private String outsideMainNo;

   public void setOutsideMainNo(String outsideMainNo) {
      this.outsideMainNo = outsideMainNo;
   }

   public String getOutsideMainNo() {
      return this.outsideMainNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.ib.queryOutsideMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("outsideMainNo", this.outsideMainNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpIbQueryOutsideMainResponse> getResponseClass() {
      return EclpIbQueryOutsideMainResponse.class;
   }
}

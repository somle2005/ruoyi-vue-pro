package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpAfsQueryServiceItemInfoByServiceNoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpAfsQueryServiceItemInfoByServiceNoRequest extends AbstractRequest implements JdRequest<EclpAfsQueryServiceItemInfoByServiceNoResponse> {
   private String servicesNo;

   public void setServicesNo(String servicesNo) {
      this.servicesNo = servicesNo;
   }

   public String getServicesNo() {
      return this.servicesNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.afs.queryServiceItemInfoByServiceNo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("servicesNo", this.servicesNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpAfsQueryServiceItemInfoByServiceNoResponse> getResponseClass() {
      return EclpAfsQueryServiceItemInfoByServiceNoResponse.class;
   }
}

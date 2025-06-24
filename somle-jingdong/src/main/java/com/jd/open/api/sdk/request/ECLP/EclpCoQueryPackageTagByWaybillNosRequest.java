package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoQueryPackageTagByWaybillNosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoQueryPackageTagByWaybillNosRequest extends AbstractRequest implements JdRequest<EclpCoQueryPackageTagByWaybillNosResponse> {
   private String lwbNos;

   public void setLwbNos(String lwbNos) {
      this.lwbNos = lwbNos;
   }

   public String getLwbNos() {
      return this.lwbNos;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.queryPackageTagByWaybillNos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("lwbNos", this.lwbNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoQueryPackageTagByWaybillNosResponse> getResponseClass() {
      return EclpCoQueryPackageTagByWaybillNosResponse.class;
   }
}

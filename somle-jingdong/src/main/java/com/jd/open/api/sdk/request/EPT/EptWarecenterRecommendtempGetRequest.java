package com.jd.open.api.sdk.request.EPT;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.EPT.EptWarecenterRecommendtempGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EptWarecenterRecommendtempGetRequest extends AbstractRequest implements JdRequest<EptWarecenterRecommendtempGetResponse> {
   private Integer pageSize;
   private Integer currentPage;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public String getApiMethod() {
      return "jingdong.ept.warecenter.recommendtemp.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("currentPage", this.currentPage);
      return JsonUtil.toJson(pmap);
   }

   public Class<EptWarecenterRecommendtempGetResponse> getResponseClass() {
      return EptWarecenterRecommendtempGetResponse.class;
   }
}

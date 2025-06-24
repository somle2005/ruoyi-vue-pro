package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwRejectorderinfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwRejectorderinfoRequest extends AbstractRequest implements JdRequest<EclpRtwRejectorderinfoResponse> {
   private String startDate;
   private String endDate;
   private String pageStart;
   private String pageSize;

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setPageStart(String pageStart) {
      this.pageStart = pageStart;
   }

   public String getPageStart() {
      return this.pageStart;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.rejectorderinfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("pageStart", this.pageStart);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwRejectorderinfoResponse> getResponseClass() {
      return EclpRtwRejectorderinfoResponse.class;
   }
}

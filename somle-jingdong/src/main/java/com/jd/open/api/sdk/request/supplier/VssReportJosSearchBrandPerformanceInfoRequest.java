package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VssReportJosSearchBrandPerformanceInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VssReportJosSearchBrandPerformanceInfoRequest extends AbstractRequest implements JdRequest<VssReportJosSearchBrandPerformanceInfoResponse> {
   private Integer searchType;
   private Integer year;
   private Integer month;
   private String daysCode;
   private Integer pageIndex;
   private Integer pageSize;

   public void setSearchType(Integer searchType) {
      this.searchType = searchType;
   }

   public Integer getSearchType() {
      return this.searchType;
   }

   public void setYear(Integer year) {
      this.year = year;
   }

   public Integer getYear() {
      return this.year;
   }

   public void setMonth(Integer month) {
      this.month = month;
   }

   public Integer getMonth() {
      return this.month;
   }

   public void setDaysCode(String daysCode) {
      this.daysCode = daysCode;
   }

   public String getDaysCode() {
      return this.daysCode;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.vss.report.jos.searchBrandPerformanceInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("searchType", this.searchType);
      pmap.put("year", this.year);
      pmap.put("month", this.month);
      pmap.put("daysCode", this.daysCode);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<VssReportJosSearchBrandPerformanceInfoResponse> getResponseClass() {
      return VssReportJosSearchBrandPerformanceInfoResponse.class;
   }
}

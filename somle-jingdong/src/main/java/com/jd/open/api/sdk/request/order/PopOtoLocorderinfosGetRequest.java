package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOtoLocorderinfosGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOtoLocorderinfosGetRequest extends AbstractRequest implements JdRequest<PopOtoLocorderinfosGetResponse> {
   private Integer timeType;
   private String startDate;
   private String endDate;
   private Integer codeStatus;
   private Integer codeType;
   private Integer pageIndex;
   private Integer pageSize;

   public void setTimeType(Integer timeType) {
      this.timeType = timeType;
   }

   public Integer getTimeType() {
      return this.timeType;
   }

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

   public void setCodeStatus(Integer codeStatus) {
      this.codeStatus = codeStatus;
   }

   public Integer getCodeStatus() {
      return this.codeStatus;
   }

   public void setCodeType(Integer codeType) {
      this.codeType = codeType;
   }

   public Integer getCodeType() {
      return this.codeType;
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
      return "jingdong.pop.oto.locorderinfos.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("time_type", this.timeType);
      pmap.put("start_date", this.startDate);
      pmap.put("end_date", this.endDate);
      pmap.put("code_status", this.codeStatus);
      pmap.put("code_type", this.codeType);
      pmap.put("page_index", this.pageIndex);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOtoLocorderinfosGetResponse> getResponseClass() {
      return PopOtoLocorderinfosGetResponse.class;
   }
}

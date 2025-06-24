package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSerialQueryRtwNosResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpSerialQueryRtwNosRequest extends AbstractRequest implements JdRequest<EclpSerialQueryRtwNosResponse> {
   private String deptNo;
   private String status;
   private String startDate;
   private String endDate;
   private String pageStart;
   private String pageSize;
   private String source;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
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

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.eclp.serial.queryRtwNos";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("status", this.status);
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("pageStart", this.pageStart);
      pmap.put("pageSize", this.pageSize);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSerialQueryRtwNosResponse> getResponseClass() {
      return EclpSerialQueryRtwNosResponse.class;
   }
}

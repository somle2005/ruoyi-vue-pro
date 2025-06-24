package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvWarePerformancedataGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvWarePerformancedataGetRequest extends AbstractRequest implements JdRequest<EdiSdvWarePerformancedataGetResponse> {
   private Date queryStartTime;
   private Date queryEndTime;
   private Integer pageNum;
   private Integer pageSize;

   public void setQueryStartTime(Date queryStartTime) {
      this.queryStartTime = queryStartTime;
   }

   public Date getQueryStartTime() {
      return this.queryStartTime;
   }

   public void setQueryEndTime(Date queryEndTime) {
      this.queryEndTime = queryEndTime;
   }

   public Date getQueryEndTime() {
      return this.queryEndTime;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.edi.sdv.ware.performancedata.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.queryStartTime != null) {
            pmap.put("queryStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.queryStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.queryEndTime != null) {
            pmap.put("queryEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.queryEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvWarePerformancedataGetResponse> getResponseClass() {
      return EdiSdvWarePerformancedataGetResponse.class;
   }
}

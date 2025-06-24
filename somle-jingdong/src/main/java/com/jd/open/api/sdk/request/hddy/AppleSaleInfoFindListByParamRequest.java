package com.jd.open.api.sdk.request.hddy;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hddy.AppleSaleInfoFindListByParamResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AppleSaleInfoFindListByParamRequest extends AbstractRequest implements JdRequest<AppleSaleInfoFindListByParamResponse> {
   private Date startDate;
   private Date endDate;
   private Integer page;
   private Integer pageSize;

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.appleSaleInfo.findListByParam";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<AppleSaleInfoFindListByParamResponse> getResponseClass() {
      return AppleSaleInfoFindListByParamResponse.class;
   }
}

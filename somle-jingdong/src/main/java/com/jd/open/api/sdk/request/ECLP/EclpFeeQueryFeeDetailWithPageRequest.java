package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpFeeQueryFeeDetailWithPageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpFeeQueryFeeDetailWithPageRequest extends AbstractRequest implements JdRequest<EclpFeeQueryFeeDetailWithPageResponse> {
   private String deptNo;
   private Date billDay;
   private Integer currentPage;
   private Integer pageSize;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setBillDay(Date billDay) {
      this.billDay = billDay;
   }

   public Date getBillDay() {
      return this.billDay;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.eclp.fee.queryFeeDetailWithPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);

      try {
         if (this.billDay != null) {
            pmap.put("billDay", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.billDay));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpFeeQueryFeeDetailWithPageResponse> getResponseClass() {
      return EclpFeeQueryFeeDetailWithPageResponse.class;
   }
}

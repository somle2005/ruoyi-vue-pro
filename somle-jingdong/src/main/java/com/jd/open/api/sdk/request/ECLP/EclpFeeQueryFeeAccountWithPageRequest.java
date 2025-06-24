package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpFeeQueryFeeAccountWithPageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpFeeQueryFeeAccountWithPageRequest extends AbstractRequest implements JdRequest<EclpFeeQueryFeeAccountWithPageResponse> {
   private String deptNo;
   private String accountNo;
   private Date accountDayStart;
   private Date accountDayEnd;
   private Integer status;
   private Integer currentPage;
   private Integer pageSize;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setAccountNo(String accountNo) {
      this.accountNo = accountNo;
   }

   public String getAccountNo() {
      return this.accountNo;
   }

   public void setAccountDayStart(Date accountDayStart) {
      this.accountDayStart = accountDayStart;
   }

   public Date getAccountDayStart() {
      return this.accountDayStart;
   }

   public void setAccountDayEnd(Date accountDayEnd) {
      this.accountDayEnd = accountDayEnd;
   }

   public Date getAccountDayEnd() {
      return this.accountDayEnd;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
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
      return "jingdong.eclp.fee.queryFeeAccountWithPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("accountNo", this.accountNo);

      try {
         if (this.accountDayStart != null) {
            pmap.put("accountDayStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.accountDayStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.accountDayEnd != null) {
            pmap.put("accountDayEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.accountDayEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("status", this.status);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpFeeQueryFeeAccountWithPageResponse> getResponseClass() {
      return EclpFeeQueryFeeAccountWithPageResponse.class;
   }
}

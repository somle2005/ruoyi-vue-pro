package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpFeeQueryFeeAccountDetailWithPageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpFeeQueryFeeAccountDetailWithPageRequest extends AbstractRequest implements JdRequest<EclpFeeQueryFeeAccountDetailWithPageResponse> {
   private String accountNo;
   private Date billDayStart;
   private Date billDayEnd;
   private Integer currentPage;
   private Integer pageSize;

   public void setAccountNo(String accountNo) {
      this.accountNo = accountNo;
   }

   public String getAccountNo() {
      return this.accountNo;
   }

   public void setBillDayStart(Date billDayStart) {
      this.billDayStart = billDayStart;
   }

   public Date getBillDayStart() {
      return this.billDayStart;
   }

   public void setBillDayEnd(Date billDayEnd) {
      this.billDayEnd = billDayEnd;
   }

   public Date getBillDayEnd() {
      return this.billDayEnd;
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
      return "jingdong.eclp.fee.queryFeeAccountDetailWithPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("accountNo", this.accountNo);

      try {
         if (this.billDayStart != null) {
            pmap.put("billDayStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.billDayStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.billDayEnd != null) {
            pmap.put("billDayEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.billDayEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpFeeQueryFeeAccountDetailWithPageResponse> getResponseClass() {
      return EclpFeeQueryFeeAccountDetailWithPageResponse.class;
   }
}

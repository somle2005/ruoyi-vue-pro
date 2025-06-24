package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderListByStatusResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderQueryOrderListByStatusRequest extends AbstractRequest implements JdRequest<EclpOrderQueryOrderListByStatusResponse> {
   private String deptNo;
   private Integer soStatus;
   private int pageNo;
   private int pageSize;
   private Date startDate;
   private Date endDate;
   private String billType;
   private String soNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSoStatus(Integer soStatus) {
      this.soStatus = soStatus;
   }

   public Integer getSoStatus() {
      return this.soStatus;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

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

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
   }

   public void setSoNo(String soNo) {
      this.soNo = soNo;
   }

   public String getSoNo() {
      return this.soNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.queryOrderListByStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("soStatus", this.soStatus);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);

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

      pmap.put("billType", this.billType);
      pmap.put("soNo", this.soNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderQueryOrderListByStatusResponse> getResponseClass() {
      return EclpOrderQueryOrderListByStatusResponse.class;
   }
}

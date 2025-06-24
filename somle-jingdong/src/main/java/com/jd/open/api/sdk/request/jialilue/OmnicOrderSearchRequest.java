package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.OmnicOrderSearchResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderSearchRequest extends AbstractRequest implements JdRequest<OmnicOrderSearchResponse> {
   private Long orderId;
   private Integer status;
   private Integer currentPage;
   private Integer pageSize;
   private Date startDate;
   private Date endDate;
   private Integer dateType;
   private String fieldList;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
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

   public void setDateType(Integer dateType) {
      this.dateType = dateType;
   }

   public Integer getDateType() {
      return this.dateType;
   }

   public void setFieldList(String fieldList) {
      this.fieldList = fieldList;
   }

   public String getFieldList() {
      return this.fieldList;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("status", this.status);
      pmap.put("currentPage", this.currentPage);
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

      pmap.put("dateType", this.dateType);
      pmap.put("fieldList", this.fieldList);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderSearchResponse> getResponseClass() {
      return OmnicOrderSearchResponse.class;
   }
}

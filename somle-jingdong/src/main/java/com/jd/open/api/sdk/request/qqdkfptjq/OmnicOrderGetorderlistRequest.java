package com.jd.open.api.sdk.request.qqdkfptjq;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qqdkfptjq.OmnicOrderGetorderlistResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class OmnicOrderGetorderlistRequest extends AbstractRequest implements JdRequest<OmnicOrderGetorderlistResponse> {
   private String authKey;
   private Integer dateType;
   private Long orderId;
   private Date endDate;
   private Integer pageSize;
   private Integer currentPage;
   private String fieldList;
   private Date startDate;
   private Integer status;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setDateType(Integer dateType) {
      this.dateType = dateType;
   }

   public Integer getDateType() {
      return this.dateType;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public void setFieldList(String fieldList) {
      this.fieldList = fieldList;
   }

   public String getFieldList() {
      return this.fieldList;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.omnic.order.getorderlist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("dateType", this.dateType);
      pmap.put("orderId", this.orderId);

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageSize", this.pageSize);
      pmap.put("currentPage", this.currentPage);
      pmap.put("fieldList", this.fieldList);

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicOrderGetorderlistResponse> getResponseClass() {
      return OmnicOrderGetorderlistResponse.class;
   }
}

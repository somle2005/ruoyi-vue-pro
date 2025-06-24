package com.jd.open.api.sdk.request.jiyunshang;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jiyunshang.TwoorderqueryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TwoorderqueryRequest extends AbstractRequest implements JdRequest<TwoorderqueryResponse> {
   private Date startDate;
   private Date endDate;
   private Integer orderStatus;
   private Integer page;
   private Integer pageSize;
   private Integer sortType;
   private Integer dateType;
   private Integer operationType;
   private String extStr;

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

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
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

   public void setSortType(Integer sortType) {
      this.sortType = sortType;
   }

   public Integer getSortType() {
      return this.sortType;
   }

   public void setDateType(Integer dateType) {
      this.dateType = dateType;
   }

   public Integer getDateType() {
      return this.dateType;
   }

   public void setOperationType(Integer operationType) {
      this.operationType = operationType;
   }

   public Integer getOperationType() {
      return this.operationType;
   }

   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   public String getExtStr() {
      return this.extStr;
   }

   public String getApiMethod() {
      return "jingdong.twoorderquery";
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

      pmap.put("orderStatus", this.orderStatus);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("sortType", this.sortType);
      pmap.put("dateType", this.dateType);
      pmap.put("operationType", this.operationType);
      pmap.put("extStr", this.extStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<TwoorderqueryResponse> getResponseClass() {
      return TwoorderqueryResponse.class;
   }
}

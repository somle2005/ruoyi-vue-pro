package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceRequest extends AbstractRequest implements JdRequest<ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceResponse> {
   private Date orderCreateStartTime;
   private Date orderCreateEndTime;
   private Long orderId;
   private Date modifiedStartTime;
   private Integer pageSize;
   private String eventType;
   private Integer page;
   private Date modifiedEndTime;

   public void setOrderCreateStartTime(Date orderCreateStartTime) {
      this.orderCreateStartTime = orderCreateStartTime;
   }

   public Date getOrderCreateStartTime() {
      return this.orderCreateStartTime;
   }

   public void setOrderCreateEndTime(Date orderCreateEndTime) {
      this.orderCreateEndTime = orderCreateEndTime;
   }

   public Date getOrderCreateEndTime() {
      return this.orderCreateEndTime;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setModifiedStartTime(Date modifiedStartTime) {
      this.modifiedStartTime = modifiedStartTime;
   }

   public Date getModifiedStartTime() {
      return this.modifiedStartTime;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setEventType(String eventType) {
      this.eventType = eventType;
   }

   public String getEventType() {
      return this.eventType;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setModifiedEndTime(Date modifiedEndTime) {
      this.modifiedEndTime = modifiedEndTime;
   }

   public Date getModifiedEndTime() {
      return this.modifiedEndTime;
   }

   public String getApiMethod() {
      return "jingdong.com.jd.pop.rdman.base.externalservice.ExternalWarningEventService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.orderCreateStartTime != null) {
            pmap.put("orderCreateStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.orderCreateStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.orderCreateEndTime != null) {
            pmap.put("orderCreateEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.orderCreateEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderId", this.orderId);

      try {
         if (this.modifiedStartTime != null) {
            pmap.put("modifiedStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifiedStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageSize", this.pageSize);
      pmap.put("eventType", this.eventType);
      pmap.put("page", this.page);

      try {
         if (this.modifiedEndTime != null) {
            pmap.put("modifiedEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifiedEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceResponse> getResponseClass() {
      return ComJdPopRdmanBaseExternalserviceExternalWarningEventServiceResponse.class;
   }
}

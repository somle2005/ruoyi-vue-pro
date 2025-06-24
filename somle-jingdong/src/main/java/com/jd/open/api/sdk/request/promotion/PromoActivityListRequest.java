package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityListRequest extends AbstractRequest implements JdRequest<PromoActivityListResponse> {
   private Long activityId;
   private String name;
   private Integer type;
   private Integer extType;
   private Integer activityStatus;
   private Date minBeginTime;
   private Date maxBeginTime;
   private Date minEndTime;
   private Date maxEndTime;
   private String creator;
   private Long startId;
   private Integer page;
   private Integer pageSize;
   private String orderField;
   private String orderType;

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setExtType(Integer extType) {
      this.extType = extType;
   }

   public Integer getExtType() {
      return this.extType;
   }

   public void setActivityStatus(Integer activityStatus) {
      this.activityStatus = activityStatus;
   }

   public Integer getActivityStatus() {
      return this.activityStatus;
   }

   public void setMinBeginTime(Date minBeginTime) {
      this.minBeginTime = minBeginTime;
   }

   public Date getMinBeginTime() {
      return this.minBeginTime;
   }

   public void setMaxBeginTime(Date maxBeginTime) {
      this.maxBeginTime = maxBeginTime;
   }

   public Date getMaxBeginTime() {
      return this.maxBeginTime;
   }

   public void setMinEndTime(Date minEndTime) {
      this.minEndTime = minEndTime;
   }

   public Date getMinEndTime() {
      return this.minEndTime;
   }

   public void setMaxEndTime(Date maxEndTime) {
      this.maxEndTime = maxEndTime;
   }

   public Date getMaxEndTime() {
      return this.maxEndTime;
   }

   public void setCreator(String creator) {
      this.creator = creator;
   }

   public String getCreator() {
      return this.creator;
   }

   public void setStartId(Long startId) {
      this.startId = startId;
   }

   public Long getStartId() {
      return this.startId;
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

   public void setOrderField(String orderField) {
      this.orderField = orderField;
   }

   public String getOrderField() {
      return this.orderField;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("name", this.name);
      pmap.put("type", this.type);
      pmap.put("extType", this.extType);
      pmap.put("activityStatus", this.activityStatus);

      try {
         if (this.minBeginTime != null) {
            pmap.put("minBeginTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.minBeginTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.maxBeginTime != null) {
            pmap.put("maxBeginTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.maxBeginTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.minEndTime != null) {
            pmap.put("minEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.minEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.maxEndTime != null) {
            pmap.put("maxEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.maxEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("creator", this.creator);
      pmap.put("startId", this.startId);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("orderField", this.orderField);
      pmap.put("orderType", this.orderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityListResponse> getResponseClass() {
      return PromoActivityListResponse.class;
   }
}

package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.SamOrderInfoQuerynewResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SamOrderInfoQuerynewRequest extends AbstractRequest implements JdRequest<SamOrderInfoQuerynewResponse> {
   private Integer orderStatus;
   private Date payStartTime;
   private Date payEndTime;
   private Date startTime;
   private Date endTime;
   private Integer pageNum;
   private Integer pageSize;

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public void setPayStartTime(Date payStartTime) {
      this.payStartTime = payStartTime;
   }

   public Date getPayStartTime() {
      return this.payStartTime;
   }

   public void setPayEndTime(Date payEndTime) {
      this.payEndTime = payEndTime;
   }

   public Date getPayEndTime() {
      return this.payEndTime;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.sam.order.info.querynew";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderStatus", this.orderStatus);

      try {
         if (this.payStartTime != null) {
            pmap.put("payStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.payStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.payEndTime != null) {
            pmap.put("payEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.payEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<SamOrderInfoQuerynewResponse> getResponseClass() {
      return SamOrderInfoQuerynewResponse.class;
   }
}

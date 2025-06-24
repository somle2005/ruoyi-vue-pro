package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscSyncListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AscSyncListRequest extends AbstractRequest implements JdRequest<AscSyncListResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private Integer serviceStatus;
   private Integer orderType;
   private Date updateTimeBegin;
   private Date updateTimeEnd;
   private Date freightUpdateDateBegin;
   private Date freightUpdateDateEnd;
   private int pageNumber;
   private int pageSize;
   private String extJsonStr;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setUpdateTimeBegin(Date updateTimeBegin) {
      this.updateTimeBegin = updateTimeBegin;
   }

   public Date getUpdateTimeBegin() {
      return this.updateTimeBegin;
   }

   public void setUpdateTimeEnd(Date updateTimeEnd) {
      this.updateTimeEnd = updateTimeEnd;
   }

   public Date getUpdateTimeEnd() {
      return this.updateTimeEnd;
   }

   public void setFreightUpdateDateBegin(Date freightUpdateDateBegin) {
      this.freightUpdateDateBegin = freightUpdateDateBegin;
   }

   public Date getFreightUpdateDateBegin() {
      return this.freightUpdateDateBegin;
   }

   public void setFreightUpdateDateEnd(Date freightUpdateDateEnd) {
      this.freightUpdateDateEnd = freightUpdateDateEnd;
   }

   public Date getFreightUpdateDateEnd() {
      return this.freightUpdateDateEnd;
   }

   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   public int getPageNumber() {
      return this.pageNumber;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.sync.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("serviceStatus", this.serviceStatus);
      pmap.put("orderType", this.orderType);

      try {
         if (this.updateTimeBegin != null) {
            pmap.put("updateTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.updateTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.updateTimeEnd != null) {
            pmap.put("updateTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.updateTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.freightUpdateDateBegin != null) {
            pmap.put("freightUpdateDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.freightUpdateDateBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.freightUpdateDateEnd != null) {
            pmap.put("freightUpdateDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.freightUpdateDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscSyncListResponse> getResponseClass() {
      return AscSyncListResponse.class;
   }
}

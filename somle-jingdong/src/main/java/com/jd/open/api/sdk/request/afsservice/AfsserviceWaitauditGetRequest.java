package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsserviceWaitauditGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceWaitauditGetRequest extends AbstractRequest implements JdRequest<AfsserviceWaitauditGetResponse> {
   private Long afsServiceId;
   private String fetchPin;
   private int pageNumber;
   private int pageSize;
   private String customerPin;
   private Long orderId;
   private Date afsApplyTimeBegin;
   private Date afsApplyTimeEnd;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setFetchPin(String fetchPin) {
      this.fetchPin = fetchPin;
   }

   public String getFetchPin() {
      return this.fetchPin;
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

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setAfsApplyTimeBegin(Date afsApplyTimeBegin) {
      this.afsApplyTimeBegin = afsApplyTimeBegin;
   }

   public Date getAfsApplyTimeBegin() {
      return this.afsApplyTimeBegin;
   }

   public void setAfsApplyTimeEnd(Date afsApplyTimeEnd) {
      this.afsApplyTimeEnd = afsApplyTimeEnd;
   }

   public Date getAfsApplyTimeEnd() {
      return this.afsApplyTimeEnd;
   }

   public String getApiMethod() {
      return "jingdong.afsservice.waitaudit.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("fetchPin", this.fetchPin);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("customerPin", this.customerPin);
      pmap.put("orderId", this.orderId);

      try {
         if (this.afsApplyTimeBegin != null) {
            pmap.put("afsApplyTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.afsApplyTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.afsApplyTimeEnd != null) {
            pmap.put("afsApplyTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.afsApplyTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<AfsserviceWaitauditGetResponse> getResponseClass() {
      return AfsserviceWaitauditGetResponse.class;
   }
}

package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsserviceAlltaskGetResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceAlltaskGetRequest extends AbstractRequest implements JdRequest<AfsserviceAlltaskGetResponse> {
   private Long afsServiceId;
   private int pageNumber;
   private int pageSize;
   private String customerPin;
   private Long orderId;
   private Date afsApplyTimeBegin;
   private Date afsApplyTimeEnd;
   private Date approvedDateBegin;
   private Date approvedDateEnd;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
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

   public void setApprovedDateBegin(Date approvedDateBegin) {
      this.approvedDateBegin = approvedDateBegin;
   }

   public Date getApprovedDateBegin() {
      return this.approvedDateBegin;
   }

   public void setApprovedDateEnd(Date approvedDateEnd) {
      this.approvedDateEnd = approvedDateEnd;
   }

   public Date getApprovedDateEnd() {
      return this.approvedDateEnd;
   }

   public String getApiMethod() {
      return "jingdong.afsservice.alltask.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
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

      try {
         if (this.approvedDateBegin != null) {
            pmap.put("approvedDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approvedDateBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.approvedDateEnd != null) {
            pmap.put("approvedDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approvedDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<AfsserviceAlltaskGetResponse> getResponseClass() {
      return AfsserviceAlltaskGetResponse.class;
   }
}

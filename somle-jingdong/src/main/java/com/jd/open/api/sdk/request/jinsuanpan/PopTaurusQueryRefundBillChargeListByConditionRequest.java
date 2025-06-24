package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.PopTaurusQueryRefundBillChargeListByConditionResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PopTaurusQueryRefundBillChargeListByConditionRequest extends AbstractRequest implements JdRequest<PopTaurusQueryRefundBillChargeListByConditionResponse> {
   private Date businessBeginTime;
   private Integer dateType;
   private Date endDate;
   private String settlementStatus;
   private String orderId;
   private Date businessEndTime;
   private Date startDate;

   public void setBusinessBeginTime(Date businessBeginTime) {
      this.businessBeginTime = businessBeginTime;
   }

   public Date getBusinessBeginTime() {
      return this.businessBeginTime;
   }

   public void setDateType(Integer dateType) {
      this.dateType = dateType;
   }

   public Integer getDateType() {
      return this.dateType;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setSettlementStatus(String settlementStatus) {
      this.settlementStatus = settlementStatus;
   }

   public String getSettlementStatus() {
      return this.settlementStatus;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setBusinessEndTime(Date businessEndTime) {
      this.businessEndTime = businessEndTime;
   }

   public Date getBusinessEndTime() {
      return this.businessEndTime;
   }

   public void setStartDate(Date startDate) {
      this.startDate = startDate;
   }

   public Date getStartDate() {
      return this.startDate;
   }

   public String getApiMethod() {
      return "jingdong.pop.taurus.queryRefundBillChargeListByCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();

      try {
         if (this.businessBeginTime != null) {
            pmap.put("businessBeginTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.businessBeginTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("dateType", this.dateType);

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("settlementStatus", this.settlementStatus);
      pmap.put("orderId", this.orderId);

      try {
         if (this.businessEndTime != null) {
            pmap.put("businessEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.businessEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.startDate != null) {
            pmap.put("startDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<PopTaurusQueryRefundBillChargeListByConditionResponse> getResponseClass() {
      return PopTaurusQueryRefundBillChargeListByConditionResponse.class;
   }
}

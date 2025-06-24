package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.WaitAuditApplysProviderFindWaitAuditApplysResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WaitAuditApplysProviderFindWaitAuditApplysRequest extends AbstractRequest implements JdRequest<WaitAuditApplysProviderFindWaitAuditApplysResponse> {
   private Long afsServiceId;
   private Long orderId;
   private String customerPin;
   private String customerName;
   private String customerTel;
   private Integer orderType;
   private Date afsApplyTimeBegin;
   private Date afsApplyTimeEnd;
   private Integer customerExpect;
   private Integer afsServiceStatus;
   private String buId;
   private int pageSize;
   private int pageIndex;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private int platformSrc;
   private String verificationCode;
   private String queryTabName;
   private Integer afsServiceState;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   public String getCustomerTel() {
      return this.customerTel;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
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

   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   public void setAfsServiceStatus(Integer afsServiceStatus) {
      this.afsServiceStatus = afsServiceStatus;
   }

   public Integer getAfsServiceStatus() {
      return this.afsServiceStatus;
   }

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public void setOperatorPin(String operatorPin) {
      this.operatorPin = operatorPin;
   }

   public String getOperatorPin() {
      return this.operatorPin;
   }

   public void setOperatorNick(String operatorNick) {
      this.operatorNick = operatorNick;
   }

   public String getOperatorNick() {
      return this.operatorNick;
   }

   public void setOperatorRemark(String operatorRemark) {
      this.operatorRemark = operatorRemark;
   }

   public String getOperatorRemark() {
      return this.operatorRemark;
   }

   public void setOperatorDate(Date operatorDate) {
      this.operatorDate = operatorDate;
   }

   public Date getOperatorDate() {
      return this.operatorDate;
   }

   public void setPlatformSrc(int platformSrc) {
      this.platformSrc = platformSrc;
   }

   public int getPlatformSrc() {
      return this.platformSrc;
   }

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public void setQueryTabName(String queryTabName) {
      this.queryTabName = queryTabName;
   }

   public String getQueryTabName() {
      return this.queryTabName;
   }

   public void setAfsServiceState(Integer afsServiceState) {
      this.afsServiceState = afsServiceState;
   }

   public Integer getAfsServiceState() {
      return this.afsServiceState;
   }

   public String getApiMethod() {
      return "jingdong.WaitAuditApplysProvider.findWaitAuditApplys";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("orderId", this.orderId);
      pmap.put("customerPin", this.customerPin);
      pmap.put("customerName", this.customerName);
      pmap.put("customerTel", this.customerTel);
      pmap.put("orderType", this.orderType);

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

      pmap.put("customerExpect", this.customerExpect);
      pmap.put("afsServiceStatus", this.afsServiceStatus);
      pmap.put("buId", this.buId);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("operatorPin", this.operatorPin);
      pmap.put("operatorNick", this.operatorNick);
      pmap.put("operatorRemark", this.operatorRemark);

      try {
         if (this.operatorDate != null) {
            pmap.put("operatorDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.operatorDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("platformSrc", this.platformSrc);
      pmap.put("verificationCode", this.verificationCode);
      pmap.put("queryTabName", this.queryTabName);
      pmap.put("afsServiceState", this.afsServiceState);
      return JsonUtil.toJson(pmap);
   }

   public Class<WaitAuditApplysProviderFindWaitAuditApplysResponse> getResponseClass() {
      return WaitAuditApplysProviderFindWaitAuditApplysResponse.class;
   }
}

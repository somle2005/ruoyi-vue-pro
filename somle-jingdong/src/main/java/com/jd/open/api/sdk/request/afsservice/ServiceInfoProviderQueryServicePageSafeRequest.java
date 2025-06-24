package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.ServiceInfoProviderQueryServicePageSafeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ServiceInfoProviderQueryServicePageSafeRequest extends AbstractRequest implements JdRequest<ServiceInfoProviderQueryServicePageSafeResponse> {
   private Integer orderType;
   private Date approvedDateEnd;
   private Long orderId;
   private Date afsApplyTimeBegin;
   private Integer afsServiceStep;
   private Date afsApplyTimeEnd;
   private Integer afsServiceProcessResult;
   private String expressCode;
   private String buId;
   private Long wareId;
   private Long afsServiceId;
   private Date approvedDateBegin;
   private String customerName;
   private String verificationCode;
   private Long newOrderId;
   private String customerPin;
   private String customerTel;
   private Integer pageSize;
   private Integer pageIndex;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private Integer platformSrc;
   private String openIdBuyer;
   private String xidBuyer;

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setApprovedDateEnd(Date approvedDateEnd) {
      this.approvedDateEnd = approvedDateEnd;
   }

   public Date getApprovedDateEnd() {
      return this.approvedDateEnd;
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

   public void setAfsServiceStep(Integer afsServiceStep) {
      this.afsServiceStep = afsServiceStep;
   }

   public Integer getAfsServiceStep() {
      return this.afsServiceStep;
   }

   public void setAfsApplyTimeEnd(Date afsApplyTimeEnd) {
      this.afsApplyTimeEnd = afsApplyTimeEnd;
   }

   public Date getAfsApplyTimeEnd() {
      return this.afsApplyTimeEnd;
   }

   public void setAfsServiceProcessResult(Integer afsServiceProcessResult) {
      this.afsServiceProcessResult = afsServiceProcessResult;
   }

   public Integer getAfsServiceProcessResult() {
      return this.afsServiceProcessResult;
   }

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setApprovedDateBegin(Date approvedDateBegin) {
      this.approvedDateBegin = approvedDateBegin;
   }

   public Date getApprovedDateBegin() {
      return this.approvedDateBegin;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public void setNewOrderId(Long newOrderId) {
      this.newOrderId = newOrderId;
   }

   public Long getNewOrderId() {
      return this.newOrderId;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   public String getCustomerTel() {
      return this.customerTel;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
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

   public void setPlatformSrc(Integer platformSrc) {
      this.platformSrc = platformSrc;
   }

   public Integer getPlatformSrc() {
      return this.platformSrc;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.ServiceInfoProvider.queryServicePageSafe";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderType", this.orderType);

      try {
         if (this.approvedDateEnd != null) {
            pmap.put("approvedDateEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approvedDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("orderId", this.orderId);

      try {
         if (this.afsApplyTimeBegin != null) {
            pmap.put("afsApplyTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.afsApplyTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("afsServiceStep", this.afsServiceStep);

      try {
         if (this.afsApplyTimeEnd != null) {
            pmap.put("afsApplyTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.afsApplyTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("afsServiceProcessResult", this.afsServiceProcessResult);
      pmap.put("expressCode", this.expressCode);
      pmap.put("buId", this.buId);
      pmap.put("wareId", this.wareId);
      pmap.put("afsServiceId", this.afsServiceId);

      try {
         if (this.approvedDateBegin != null) {
            pmap.put("approvedDateBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approvedDateBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("customerName", this.customerName);
      pmap.put("verificationCode", this.verificationCode);
      pmap.put("newOrderId", this.newOrderId);
      pmap.put("customerPin", this.customerPin);
      pmap.put("customerTel", this.customerTel);
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
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<ServiceInfoProviderQueryServicePageSafeResponse> getResponseClass() {
      return ServiceInfoProviderQueryServicePageSafeResponse.class;
   }
}

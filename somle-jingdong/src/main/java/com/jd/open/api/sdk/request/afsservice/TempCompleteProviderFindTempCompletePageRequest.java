package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.TempCompleteProviderFindTempCompletePageResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TempCompleteProviderFindTempCompletePageRequest extends AbstractRequest implements JdRequest<TempCompleteProviderFindTempCompletePageResponse> {
   private Long afsServiceId;
   private String buId;
   private Long orderId;
   private Date afsApplyTimeBegin;
   private Date afsApplyTimeEnd;
   private Integer afsServiceProcessResult;
   private String waybill;
   private String customerPin;
   private Integer orderType;
   private Integer messageStatus;
   private Integer searchType;
   private String operatorPin;
   private String operatorNick;
   private String operatorRemark;
   private Date operatorDate;
   private int platformSrc;
   private Integer afsCategoryIdPop;
   private String verificationCode;
   private int pageSize;
   private int pageIndex;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
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

   public void setAfsServiceProcessResult(Integer afsServiceProcessResult) {
      this.afsServiceProcessResult = afsServiceProcessResult;
   }

   public Integer getAfsServiceProcessResult() {
      return this.afsServiceProcessResult;
   }

   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }

   public String getWaybill() {
      return this.waybill;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setMessageStatus(Integer messageStatus) {
      this.messageStatus = messageStatus;
   }

   public Integer getMessageStatus() {
      return this.messageStatus;
   }

   public void setSearchType(Integer searchType) {
      this.searchType = searchType;
   }

   public Integer getSearchType() {
      return this.searchType;
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

   public void setAfsCategoryIdPop(Integer afsCategoryIdPop) {
      this.afsCategoryIdPop = afsCategoryIdPop;
   }

   public Integer getAfsCategoryIdPop() {
      return this.afsCategoryIdPop;
   }

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
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

   public String getApiMethod() {
      return "jingdong.TempCompleteProvider.findTempCompletePage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      pmap.put("buId", this.buId);
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

      pmap.put("afsServiceProcessResult", this.afsServiceProcessResult);
      pmap.put("waybill", this.waybill);
      pmap.put("customerPin", this.customerPin);
      pmap.put("orderType", this.orderType);
      pmap.put("messageStatus", this.messageStatus);
      pmap.put("searchType", this.searchType);
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
      pmap.put("afsCategoryIdPop", this.afsCategoryIdPop);
      pmap.put("verificationCode", this.verificationCode);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      return JsonUtil.toJson(pmap);
   }

   public Class<TempCompleteProviderFindTempCompletePageResponse> getResponseClass() {
      return TempCompleteProviderFindTempCompletePageResponse.class;
   }
}

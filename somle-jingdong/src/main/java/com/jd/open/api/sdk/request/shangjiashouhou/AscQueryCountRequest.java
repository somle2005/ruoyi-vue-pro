package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscQueryCountResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AscQueryCountRequest extends AbstractRequest implements JdRequest<AscQueryCountResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private Date applyTimeBegin;
   private Date applyTimeEnd;
   private Date finishTimeBegin;
   private Date finishTimeEnd;
   private String verificationCode;
   private String expressCode;
   private Integer orderType;
   private Integer processResult;
   private String customerPin;
   private String customerName;
   private String customerTel;
   private Date approveTimeBegin;
   private Date approveTimeEnd;
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

   public void setApplyTimeBegin(Date applyTimeBegin) {
      this.applyTimeBegin = applyTimeBegin;
   }

   public Date getApplyTimeBegin() {
      return this.applyTimeBegin;
   }

   public void setApplyTimeEnd(Date applyTimeEnd) {
      this.applyTimeEnd = applyTimeEnd;
   }

   public Date getApplyTimeEnd() {
      return this.applyTimeEnd;
   }

   public void setFinishTimeBegin(Date finishTimeBegin) {
      this.finishTimeBegin = finishTimeBegin;
   }

   public Date getFinishTimeBegin() {
      return this.finishTimeBegin;
   }

   public void setFinishTimeEnd(Date finishTimeEnd) {
      this.finishTimeEnd = finishTimeEnd;
   }

   public Date getFinishTimeEnd() {
      return this.finishTimeEnd;
   }

   public void setVerificationCode(String verificationCode) {
      this.verificationCode = verificationCode;
   }

   public String getVerificationCode() {
      return this.verificationCode;
   }

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setProcessResult(Integer processResult) {
      this.processResult = processResult;
   }

   public Integer getProcessResult() {
      return this.processResult;
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

   public void setApproveTimeBegin(Date approveTimeBegin) {
      this.approveTimeBegin = approveTimeBegin;
   }

   public Date getApproveTimeBegin() {
      return this.approveTimeBegin;
   }

   public void setApproveTimeEnd(Date approveTimeEnd) {
      this.approveTimeEnd = approveTimeEnd;
   }

   public Date getApproveTimeEnd() {
      return this.approveTimeEnd;
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
      return "jingdong.asc.query.count";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);

      try {
         if (this.applyTimeBegin != null) {
            pmap.put("applyTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.applyTimeEnd != null) {
            pmap.put("applyTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.applyTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.finishTimeBegin != null) {
            pmap.put("finishTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.finishTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.finishTimeEnd != null) {
            pmap.put("finishTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.finishTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("verificationCode", this.verificationCode);
      pmap.put("expressCode", this.expressCode);
      pmap.put("orderType", this.orderType);
      pmap.put("processResult", this.processResult);
      pmap.put("customerPin", this.customerPin);
      pmap.put("customerName", this.customerName);
      pmap.put("customerTel", this.customerTel);

      try {
         if (this.approveTimeBegin != null) {
            pmap.put("approveTimeBegin", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approveTimeBegin));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.approveTimeEnd != null) {
            pmap.put("approveTimeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.approveTimeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscQueryCountResponse> getResponseClass() {
      return AscQueryCountResponse.class;
   }
}

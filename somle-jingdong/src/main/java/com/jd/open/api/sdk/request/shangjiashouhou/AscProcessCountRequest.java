package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscProcessCountResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AscProcessCountRequest extends AbstractRequest implements JdRequest<AscProcessCountResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String expressCode;
   private Date applyTimeBegin;
   private Date applyTimeEnd;
   private Integer serviceStatus;
   private Integer customerExpect;
   private Date approveTimeBegin;
   private Date approveTimeEnd;
   private Boolean jdInterveneFlag;
   private String customerPin;
   private Boolean timeoutFlag;
   private Long skuId;
   private String extJsonStr;
   private String openIdBuyer;
   private String xidBuyer;

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

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
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

   public void setServiceStatus(Integer serviceStatus) {
      this.serviceStatus = serviceStatus;
   }

   public Integer getServiceStatus() {
      return this.serviceStatus;
   }

   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   public Integer getCustomerExpect() {
      return this.customerExpect;
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

   public void setJdInterveneFlag(Boolean jdInterveneFlag) {
      this.jdInterveneFlag = jdInterveneFlag;
   }

   public Boolean getJdInterveneFlag() {
      return this.jdInterveneFlag;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setTimeoutFlag(Boolean timeoutFlag) {
      this.timeoutFlag = timeoutFlag;
   }

   public Boolean getTimeoutFlag() {
      return this.timeoutFlag;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
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
      return "jingdong.asc.process.count";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("expressCode", this.expressCode);

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

      pmap.put("serviceStatus", this.serviceStatus);
      pmap.put("customerExpect", this.customerExpect);

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

      pmap.put("jdInterveneFlag", this.jdInterveneFlag);
      pmap.put("customerPin", this.customerPin);
      pmap.put("timeoutFlag", this.timeoutFlag);
      pmap.put("skuId", this.skuId);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscProcessCountResponse> getResponseClass() {
      return AscProcessCountResponse.class;
   }
}

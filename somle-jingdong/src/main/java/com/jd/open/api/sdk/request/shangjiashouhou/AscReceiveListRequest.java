package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscReceiveListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class AscReceiveListRequest extends AbstractRequest implements JdRequest<AscReceiveListResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private Long skuId;
   private Date applyTimeBegin;
   private Date applyTimeEnd;
   private String expressCode;
   private Boolean timeoutFlag;
   private String customerPin;
   private String customerName;
   private String customerTel;
   private Integer dealType;
   private Integer customerExpect;
   private Boolean jdInterveneFlag;
   private Integer approveResult;
   private Integer approveReasonCid1;
   private String orderShopId;
   private String returnShopId;
   private int pageNumber;
   private int pageSize;
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

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
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

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setTimeoutFlag(Boolean timeoutFlag) {
      this.timeoutFlag = timeoutFlag;
   }

   public Boolean getTimeoutFlag() {
      return this.timeoutFlag;
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

   public void setDealType(Integer dealType) {
      this.dealType = dealType;
   }

   public Integer getDealType() {
      return this.dealType;
   }

   public void setCustomerExpect(Integer customerExpect) {
      this.customerExpect = customerExpect;
   }

   public Integer getCustomerExpect() {
      return this.customerExpect;
   }

   public void setJdInterveneFlag(Boolean jdInterveneFlag) {
      this.jdInterveneFlag = jdInterveneFlag;
   }

   public Boolean getJdInterveneFlag() {
      return this.jdInterveneFlag;
   }

   public void setApproveResult(Integer approveResult) {
      this.approveResult = approveResult;
   }

   public Integer getApproveResult() {
      return this.approveResult;
   }

   public void setApproveReasonCid1(Integer approveReasonCid1) {
      this.approveReasonCid1 = approveReasonCid1;
   }

   public Integer getApproveReasonCid1() {
      return this.approveReasonCid1;
   }

   public void setOrderShopId(String orderShopId) {
      this.orderShopId = orderShopId;
   }

   public String getOrderShopId() {
      return this.orderShopId;
   }

   public void setReturnShopId(String returnShopId) {
      this.returnShopId = returnShopId;
   }

   public String getReturnShopId() {
      return this.returnShopId;
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
      return "jingdong.asc.receive.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("skuId", this.skuId);

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

      pmap.put("expressCode", this.expressCode);
      pmap.put("timeoutFlag", this.timeoutFlag);
      pmap.put("customerPin", this.customerPin);
      pmap.put("customerName", this.customerName);
      pmap.put("customerTel", this.customerTel);
      pmap.put("dealType", this.dealType);
      pmap.put("customerExpect", this.customerExpect);
      pmap.put("jdInterveneFlag", this.jdInterveneFlag);
      pmap.put("approveResult", this.approveResult);
      pmap.put("approveReasonCid1", this.approveReasonCid1);
      pmap.put("orderShopId", this.orderShopId);
      pmap.put("returnShopId", this.returnShopId);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscReceiveListResponse> getResponseClass() {
      return AscReceiveListResponse.class;
   }
}

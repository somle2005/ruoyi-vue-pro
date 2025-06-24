package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewGetSettleBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewGetSettleBillRequest extends AbstractRequest implements JdRequest<UeOrderNewGetSettleBillResponse> {
   private String orderNo;
   private String endDate;
   private int pageSize;
   private int dealType;
   private String settleNo;
   private int deliverType;
   private String beginDate;
   private String createBy;
   private String venderCode;
   private String appid;
   private int page;
   private String invoiceNo;
   private String dealRemark;
   private String settleType;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setDealType(int dealType) {
      this.dealType = dealType;
   }

   public int getDealType() {
      return this.dealType;
   }

   public void setSettleNo(String settleNo) {
      this.settleNo = settleNo;
   }

   public String getSettleNo() {
      return this.settleNo;
   }

   public void setDeliverType(int deliverType) {
      this.deliverType = deliverType;
   }

   public int getDeliverType() {
      return this.deliverType;
   }

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setInvoiceNo(String invoiceNo) {
      this.invoiceNo = invoiceNo;
   }

   public String getInvoiceNo() {
      return this.invoiceNo;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setSettleType(String settleType) {
      this.settleType = settleType;
   }

   public String getSettleType() {
      return this.settleType;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.getSettleBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("endDate", this.endDate);
      pmap.put("pageSize", this.pageSize);
      pmap.put("dealType", this.dealType);
      pmap.put("settleNo", this.settleNo);
      pmap.put("deliverType", this.deliverType);
      pmap.put("beginDate", this.beginDate);
      pmap.put("createBy", this.createBy);
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      pmap.put("page", this.page);
      pmap.put("invoiceNo", this.invoiceNo);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("settleType", this.settleType);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewGetSettleBillResponse> getResponseClass() {
      return UeOrderNewGetSettleBillResponse.class;
   }
}

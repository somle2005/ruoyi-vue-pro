package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.JpassJournalQueryOrderBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JpassJournalQueryOrderBillRequest extends AbstractRequest implements JdRequest<JpassJournalQueryOrderBillResponse> {
   private String bid;
   private String orderId;
   private String refOrderId;
   private String storeId;
   private String sId;
   private String refStoreId;
   private String orderCompleteTime;
   private String orderCompleteTimeBegin;
   private String orderCompleteTimeEnd;
   private String settleStatus;
   private int pageIndex;
   private Integer pageSize;

   public void setBid(String bid) {
      this.bid = bid;
   }

   public String getBid() {
      return this.bid;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setRefOrderId(String refOrderId) {
      this.refOrderId = refOrderId;
   }

   public String getRefOrderId() {
      return this.refOrderId;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setSId(String sId) {
      this.sId = sId;
   }

   public String getSId() {
      return this.sId;
   }

   public void setRefStoreId(String refStoreId) {
      this.refStoreId = refStoreId;
   }

   public String getRefStoreId() {
      return this.refStoreId;
   }

   public void setOrderCompleteTime(String orderCompleteTime) {
      this.orderCompleteTime = orderCompleteTime;
   }

   public String getOrderCompleteTime() {
      return this.orderCompleteTime;
   }

   public void setOrderCompleteTimeBegin(String orderCompleteTimeBegin) {
      this.orderCompleteTimeBegin = orderCompleteTimeBegin;
   }

   public String getOrderCompleteTimeBegin() {
      return this.orderCompleteTimeBegin;
   }

   public void setOrderCompleteTimeEnd(String orderCompleteTimeEnd) {
      this.orderCompleteTimeEnd = orderCompleteTimeEnd;
   }

   public String getOrderCompleteTimeEnd() {
      return this.orderCompleteTimeEnd;
   }

   public void setSettleStatus(String settleStatus) {
      this.settleStatus = settleStatus;
   }

   public String getSettleStatus() {
      return this.settleStatus;
   }

   public void setPageIndex(int pageIndex) {
      this.pageIndex = pageIndex;
   }

   public int getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.jpass.journal.queryOrderBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bid", this.bid);
      pmap.put("orderId", this.orderId);
      pmap.put("refOrderId", this.refOrderId);
      pmap.put("storeId", this.storeId);
      pmap.put("sId", this.sId);
      pmap.put("refStoreId", this.refStoreId);
      pmap.put("orderCompleteTime", this.orderCompleteTime);
      pmap.put("orderCompleteTimeBegin", this.orderCompleteTimeBegin);
      pmap.put("orderCompleteTimeEnd", this.orderCompleteTimeEnd);
      pmap.put("settleStatus", this.settleStatus);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<JpassJournalQueryOrderBillResponse> getResponseClass() {
      return JpassJournalQueryOrderBillResponse.class;
   }
}

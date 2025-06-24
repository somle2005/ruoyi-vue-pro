package com.jd.open.api.sdk.request.jinsuanpan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jinsuanpan.JpassJournalQueryRefundBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JpassJournalQueryRefundBillRequest extends AbstractRequest implements JdRequest<JpassJournalQueryRefundBillResponse> {
   private String bid;
   private String businessBillId;
   private String orderId;
   private String refOrderId;
   private String storeId;
   private String refStoreId;
   private String sId;
   private String happenTime;
   private String happenTimeBegin;
   private String happenTimeEnd;
   private String settleStatus;
   private int pageIndex;
   private Integer pageSize;

   public void setBid(String bid) {
      this.bid = bid;
   }

   public String getBid() {
      return this.bid;
   }

   public void setBusinessBillId(String businessBillId) {
      this.businessBillId = businessBillId;
   }

   public String getBusinessBillId() {
      return this.businessBillId;
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

   public void setRefStoreId(String refStoreId) {
      this.refStoreId = refStoreId;
   }

   public String getRefStoreId() {
      return this.refStoreId;
   }

   public void setSId(String sId) {
      this.sId = sId;
   }

   public String getSId() {
      return this.sId;
   }

   public void setHappenTime(String happenTime) {
      this.happenTime = happenTime;
   }

   public String getHappenTime() {
      return this.happenTime;
   }

   public void setHappenTimeBegin(String happenTimeBegin) {
      this.happenTimeBegin = happenTimeBegin;
   }

   public String getHappenTimeBegin() {
      return this.happenTimeBegin;
   }

   public void setHappenTimeEnd(String happenTimeEnd) {
      this.happenTimeEnd = happenTimeEnd;
   }

   public String getHappenTimeEnd() {
      return this.happenTimeEnd;
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
      return "jingdong.jpass.journal.queryRefundBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bid", this.bid);
      pmap.put("businessBillId", this.businessBillId);
      pmap.put("orderId", this.orderId);
      pmap.put("refOrderId", this.refOrderId);
      pmap.put("storeId", this.storeId);
      pmap.put("refStoreId", this.refStoreId);
      pmap.put("sId", this.sId);
      pmap.put("happenTime", this.happenTime);
      pmap.put("happenTimeBegin", this.happenTimeBegin);
      pmap.put("happenTimeEnd", this.happenTimeEnd);
      pmap.put("settleStatus", this.settleStatus);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<JpassJournalQueryRefundBillResponse> getResponseClass() {
      return JpassJournalQueryRefundBillResponse.class;
   }
}

package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsRefundapplyQuerylistResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsRefundapplyQuerylistRequest extends AbstractRequest implements JdRequest<PopAfsRefundapplyQuerylistResponse> {
   private String status;
   private String id;
   private String orderId;
   private String buyerId;
   private String buyerName;
   private String applyTimeStart;
   private String applyTimeEnd;
   private String checkTimeStart;
   private String checkTimeEnd;
   private Integer pageIndex;
   private Integer pageSize;

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return this.id;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setBuyerId(String buyerId) {
      this.buyerId = buyerId;
   }

   public String getBuyerId() {
      return this.buyerId;
   }

   public void setBuyerName(String buyerName) {
      this.buyerName = buyerName;
   }

   public String getBuyerName() {
      return this.buyerName;
   }

   public void setApplyTimeStart(String applyTimeStart) {
      this.applyTimeStart = applyTimeStart;
   }

   public String getApplyTimeStart() {
      return this.applyTimeStart;
   }

   public void setApplyTimeEnd(String applyTimeEnd) {
      this.applyTimeEnd = applyTimeEnd;
   }

   public String getApplyTimeEnd() {
      return this.applyTimeEnd;
   }

   public void setCheckTimeStart(String checkTimeStart) {
      this.checkTimeStart = checkTimeStart;
   }

   public String getCheckTimeStart() {
      return this.checkTimeStart;
   }

   public void setCheckTimeEnd(String checkTimeEnd) {
      this.checkTimeEnd = checkTimeEnd;
   }

   public String getCheckTimeEnd() {
      return this.checkTimeEnd;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.refundapply.querylist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("status", this.status);
      pmap.put("id", this.id);
      pmap.put("order_id", this.orderId);
      pmap.put("buyer_id", this.buyerId);
      pmap.put("buyer_name", this.buyerName);
      pmap.put("apply_time_start", this.applyTimeStart);
      pmap.put("apply_time_end", this.applyTimeEnd);
      pmap.put("check_time_start", this.checkTimeStart);
      pmap.put("check_time_end", this.checkTimeEnd);
      pmap.put("page_index", this.pageIndex);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsRefundapplyQuerylistResponse> getResponseClass() {
      return PopAfsRefundapplyQuerylistResponse.class;
   }
}

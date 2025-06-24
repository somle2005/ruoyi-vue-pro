package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaRefundapplyQueryPageListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaRefundapplyQueryPageListRequest extends AbstractRequest implements JdRequest<PopAfsSoaRefundapplyQueryPageListResponse> {
   private String ids;
   private Long status;
   private String orderId;
   private String buyerId;
   private String buyerName;
   private String applyTimeStart;
   private String applyTimeEnd;
   private String checkTimeStart;
   private String checkTimeEnd;
   private Integer pageIndex;
   private Integer pageSize;
   private Long storeId;
   private Boolean showSku;
   private String modifiedStart;
   private String modifiedEnd;
   private String openIdBuyer;
   private String xidBuyer;

   public void setIds(String ids) {
      this.ids = ids;
   }

   public String getIds() {
      return this.ids;
   }

   public void setStatus(Long status) {
      this.status = status;
   }

   public Long getStatus() {
      return this.status;
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

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setShowSku(Boolean showSku) {
      this.showSku = showSku;
   }

   public Boolean getShowSku() {
      return this.showSku;
   }

   public void setModifiedStart(String modifiedStart) {
      this.modifiedStart = modifiedStart;
   }

   public String getModifiedStart() {
      return this.modifiedStart;
   }

   public void setModifiedEnd(String modifiedEnd) {
      this.modifiedEnd = modifiedEnd;
   }

   public String getModifiedEnd() {
      return this.modifiedEnd;
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
      return "jingdong.pop.afs.soa.refundapply.queryPageList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ids", this.ids);
      pmap.put("status", this.status);
      pmap.put("orderId", this.orderId);
      pmap.put("buyerId", this.buyerId);
      pmap.put("buyerName", this.buyerName);
      pmap.put("applyTimeStart", this.applyTimeStart);
      pmap.put("applyTimeEnd", this.applyTimeEnd);
      pmap.put("checkTimeStart", this.checkTimeStart);
      pmap.put("checkTimeEnd", this.checkTimeEnd);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      pmap.put("storeId", this.storeId);
      pmap.put("showSku", this.showSku);
      pmap.put("modifiedStart", this.modifiedStart);
      pmap.put("modifiedEnd", this.modifiedEnd);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaRefundapplyQueryPageListResponse> getResponseClass() {
      return PopAfsSoaRefundapplyQueryPageListResponse.class;
   }
}

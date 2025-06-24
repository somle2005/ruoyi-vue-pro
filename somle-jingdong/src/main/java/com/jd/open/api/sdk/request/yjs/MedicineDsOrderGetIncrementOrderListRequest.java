package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderGetIncrementOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderGetIncrementOrderListRequest extends AbstractRequest implements JdRequest<MedicineDsOrderGetIncrementOrderListResponse> {
   private String endDate;
   private String orderId;
   private String clientIp;
   private Integer pageSize;
   private Integer orderStatus;
   private Integer page;
   private Long storeId;
   private String startDate;
   private Integer agingType;

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setClientIp(String clientIp) {
      this.clientIp = clientIp;
   }

   public String getClientIp() {
      return this.clientIp;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setAgingType(Integer agingType) {
      this.agingType = agingType;
   }

   public Integer getAgingType() {
      return this.agingType;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.getIncrementOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("endDate", this.endDate);
      pmap.put("orderId", this.orderId);
      pmap.put("clientIp", this.clientIp);
      pmap.put("pageSize", this.pageSize);
      pmap.put("orderStatus", this.orderStatus);
      pmap.put("page", this.page);
      pmap.put("storeId", this.storeId);
      pmap.put("startDate", this.startDate);
      pmap.put("agingType", this.agingType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderGetIncrementOrderListResponse> getResponseClass() {
      return MedicineDsOrderGetIncrementOrderListResponse.class;
   }
}

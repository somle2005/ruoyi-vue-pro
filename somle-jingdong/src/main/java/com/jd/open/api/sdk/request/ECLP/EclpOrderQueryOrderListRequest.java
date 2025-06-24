package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderQueryOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderQueryOrderListRequest extends AbstractRequest implements JdRequest<EclpOrderQueryOrderListResponse> {
   private String deptNo;
   private String startDate;
   private String endDate;
   private String shopNo;
   private String warehouseNo;
   private int pageNo;
   private int pageSize;
   private String salePlatformOrderNo;
   private Integer orderStatus;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   public String getShopNo() {
      return this.shopNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setSalePlatformOrderNo(String salePlatformOrderNo) {
      this.salePlatformOrderNo = salePlatformOrderNo;
   }

   public String getSalePlatformOrderNo() {
      return this.salePlatformOrderNo;
   }

   public void setOrderStatus(Integer orderStatus) {
      this.orderStatus = orderStatus;
   }

   public Integer getOrderStatus() {
      return this.orderStatus;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.queryOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("shopNo", this.shopNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("salePlatformOrderNo", this.salePlatformOrderNo);
      pmap.put("orderStatus", this.orderStatus);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderQueryOrderListResponse> getResponseClass() {
      return EclpOrderQueryOrderListResponse.class;
   }
}

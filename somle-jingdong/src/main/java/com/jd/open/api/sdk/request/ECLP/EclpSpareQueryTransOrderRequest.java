package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSpareQueryTransOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpSpareQueryTransOrderRequest extends AbstractRequest implements JdRequest<EclpSpareQueryTransOrderResponse> {
   private String deptName;
   private Integer orderType;
   private String destWarehouseNo;
   private String sellerName;
   private String sellerNo;
   private Integer pageSize;
   private String startTime;
   private String startWarehouseNo;
   private String endTime;
   private Integer type;
   private Integer pageNum;
   private String deptNo;

   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   public String getDeptName() {
      return this.deptName;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public void setDestWarehouseNo(String destWarehouseNo) {
      this.destWarehouseNo = destWarehouseNo;
   }

   public String getDestWarehouseNo() {
      return this.destWarehouseNo;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setStartWarehouseNo(String startWarehouseNo) {
      this.startWarehouseNo = startWarehouseNo;
   }

   public String getStartWarehouseNo() {
      return this.startWarehouseNo;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setPageNum(Integer pageNum) {
      this.pageNum = pageNum;
   }

   public Integer getPageNum() {
      return this.pageNum;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.spare.queryTransOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptName", this.deptName);
      pmap.put("orderType", this.orderType);
      pmap.put("destWarehouseNo", this.destWarehouseNo);
      pmap.put("sellerName", this.sellerName);
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("startTime", this.startTime);
      pmap.put("startWarehouseNo", this.startWarehouseNo);
      pmap.put("endTime", this.endTime);
      pmap.put("type", this.type);
      pmap.put("pageNum", this.pageNum);
      pmap.put("deptNo", this.deptNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSpareQueryTransOrderResponse> getResponseClass() {
      return EclpSpareQueryTransOrderResponse.class;
   }
}

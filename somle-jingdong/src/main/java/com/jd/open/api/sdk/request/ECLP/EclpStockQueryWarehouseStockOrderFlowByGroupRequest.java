package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryWarehouseStockOrderFlowByGroupResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryWarehouseStockOrderFlowByGroupRequest extends AbstractRequest implements JdRequest<EclpStockQueryWarehouseStockOrderFlowByGroupResponse> {
   private String startDate;
   private String endDate;
   private String deptNo;
   private String warehouseNo;
   private String goodsNo;
   private String isvGoodsNo;
   private String orderType;
   private int bizType;

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

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
   }

   public void setBizType(int bizType) {
      this.bizType = bizType;
   }

   public int getBizType() {
      return this.bizType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryWarehouseStockOrderFlowByGroup";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("orderType", this.orderType);
      pmap.put("bizType", this.bizType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryWarehouseStockOrderFlowByGroupResponse> getResponseClass() {
      return EclpStockQueryWarehouseStockOrderFlowByGroupResponse.class;
   }
}

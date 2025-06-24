package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockSearchShopStockFlowResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockSearchShopStockFlowRequest extends AbstractRequest implements JdRequest<EclpStockSearchShopStockFlowResponse> {
   private String requestId;
   private String deptNo;
   private String shopNo;
   private String warehouseNo;
   private String goodsNo;
   private String startDate;
   private String endDate;
   private int pageNumber;
   private int pageSize;

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
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

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
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

   public String getApiMethod() {
      return "jingdong.eclp.stock.searchShopStockFlow";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestId", this.requestId);
      pmap.put("deptNo", this.deptNo);
      pmap.put("shopNo", this.shopNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("startDate", this.startDate);
      pmap.put("endDate", this.endDate);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockSearchShopStockFlowResponse> getResponseClass() {
      return EclpStockSearchShopStockFlowResponse.class;
   }
}

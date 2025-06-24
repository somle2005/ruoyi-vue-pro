package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockSearchShopStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockSearchShopStockRequest extends AbstractRequest implements JdRequest<EclpStockSearchShopStockResponse> {
   private String requestId;
   private String deptNo;
   private String shopNo;
   private String warehouseNo;
   private String goodsNo;
   private int pageSize;
   private int pageNumber;

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

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   public int getPageNumber() {
      return this.pageNumber;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.searchShopStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestId", this.requestId);
      pmap.put("deptNo", this.deptNo);
      pmap.put("shopNo", this.shopNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("pageNumber", this.pageNumber);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockSearchShopStockResponse> getResponseClass() {
      return EclpStockSearchShopStockResponse.class;
   }
}

package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryStockRequest extends AbstractRequest implements JdRequest<EclpStockQueryStockResponse> {
   private String deptNo;
   private String warehouseNo;
   private String stockStatus;
   private String stockType;
   private String goodsNo;
   private int currentPage;
   private int pageSize;
   private int returnZeroStock;
   private int returnIsvLotattrs;
   private String goodsLevel;
   private String isvSku;
   private String sellerGoodsSign;

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

   public void setStockStatus(String stockStatus) {
      this.stockStatus = stockStatus;
   }

   public String getStockStatus() {
      return this.stockStatus;
   }

   public void setStockType(String stockType) {
      this.stockType = stockType;
   }

   public String getStockType() {
      return this.stockType;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public int getCurrentPage() {
      return this.currentPage;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setReturnZeroStock(int returnZeroStock) {
      this.returnZeroStock = returnZeroStock;
   }

   public int getReturnZeroStock() {
      return this.returnZeroStock;
   }

   public void setReturnIsvLotattrs(int returnIsvLotattrs) {
      this.returnIsvLotattrs = returnIsvLotattrs;
   }

   public int getReturnIsvLotattrs() {
      return this.returnIsvLotattrs;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   public void setIsvSku(String isvSku) {
      this.isvSku = isvSku;
   }

   public String getIsvSku() {
      return this.isvSku;
   }

   public void setSellerGoodsSign(String sellerGoodsSign) {
      this.sellerGoodsSign = sellerGoodsSign;
   }

   public String getSellerGoodsSign() {
      return this.sellerGoodsSign;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("stockStatus", this.stockStatus);
      pmap.put("stockType", this.stockType);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      pmap.put("returnZeroStock", this.returnZeroStock);
      pmap.put("returnIsvLotattrs", this.returnIsvLotattrs);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("isvSku", this.isvSku);
      pmap.put("sellerGoodsSign", this.sellerGoodsSign);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryStockResponse> getResponseClass() {
      return EclpStockQueryStockResponse.class;
   }
}

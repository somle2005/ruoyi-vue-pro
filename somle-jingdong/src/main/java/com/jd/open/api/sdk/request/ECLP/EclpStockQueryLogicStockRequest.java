package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryLogicStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryLogicStockRequest extends AbstractRequest implements JdRequest<EclpStockQueryLogicStockResponse> {
   private String deptNo;
   private String warehouseNo;
   private String factors;
   private String isvGoodsNo;
   private String goodsNo;
   private int currentPage;
   private int pageSize;

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

   public void setFactors(String factors) {
      this.factors = factors;
   }

   public String getFactors() {
      return this.factors;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
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

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryLogicStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("factors", this.factors);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryLogicStockResponse> getResponseClass() {
      return EclpStockQueryLogicStockResponse.class;
   }
}

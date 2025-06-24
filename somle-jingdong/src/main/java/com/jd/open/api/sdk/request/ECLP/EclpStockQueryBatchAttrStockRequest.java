package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryBatchAttrStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryBatchAttrStockRequest extends AbstractRequest implements JdRequest<EclpStockQueryBatchAttrStockResponse> {
   private String cursor;
   private Integer stockType;
   private String goodsLevel;
   private Integer pageSize;
   private String startTime;
   private Integer page;
   private String endTime;
   private String sku;
   private String deptNo;
   private String warehouseNo;
   private String isvGoodsNos;

   public void setCursor(String cursor) {
      this.cursor = cursor;
   }

   public String getCursor() {
      return this.cursor;
   }

   public void setStockType(Integer stockType) {
      this.stockType = stockType;
   }

   public Integer getStockType() {
      return this.stockType;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
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

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
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

   public void setIsvGoodsNos(String isvGoodsNos) {
      this.isvGoodsNos = isvGoodsNos;
   }

   public String getIsvGoodsNos() {
      return this.isvGoodsNos;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryBatchAttrStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cursor", this.cursor);
      pmap.put("stockType", this.stockType);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("pageSize", this.pageSize);
      pmap.put("startTime", this.startTime);
      pmap.put("page", this.page);
      pmap.put("endTime", this.endTime);
      pmap.put("sku", this.sku);
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("isvGoodsNos", this.isvGoodsNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryBatchAttrStockResponse> getResponseClass() {
      return EclpStockQueryBatchAttrStockResponse.class;
   }
}

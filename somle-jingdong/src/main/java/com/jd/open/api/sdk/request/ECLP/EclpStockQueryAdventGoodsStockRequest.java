package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryAdventGoodsStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryAdventGoodsStockRequest extends AbstractRequest implements JdRequest<EclpStockQueryAdventGoodsStockResponse> {
   private String deptNo;
   private String warehouseNos;
   private String goodsNos;
   private int currentPage;
   private int pageSize;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWarehouseNos(String warehouseNos) {
      this.warehouseNos = warehouseNos;
   }

   public String getWarehouseNos() {
      return this.warehouseNos;
   }

   public void setGoodsNos(String goodsNos) {
      this.goodsNos = goodsNos;
   }

   public String getGoodsNos() {
      return this.goodsNos;
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
      return "jingdong.eclp.stock.queryAdventGoodsStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNos", this.warehouseNos);
      pmap.put("goodsNos", this.goodsNos);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryAdventGoodsStockResponse> getResponseClass() {
      return EclpStockQueryAdventGoodsStockResponse.class;
   }
}

package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryVmiShopStockResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryVmiShopStockRequest extends AbstractRequest implements JdRequest<EclpStockQueryVmiShopStockResponse> {
   private String goodsNos;
   private String shopNos;
   private int currentPage;
   private int pageSize;
   private String deptNo;
   private String warehouseNo;

   public void setGoodsNos(String goodsNos) {
      this.goodsNos = goodsNos;
   }

   public String getGoodsNos() {
      return this.goodsNos;
   }

   public void setShopNos(String shopNos) {
      this.shopNos = shopNos;
   }

   public String getShopNos() {
      return this.shopNos;
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

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryVmiShopStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsNos", this.goodsNos);
      pmap.put("shopNos", this.shopNos);
      pmap.put("currentPage", this.currentPage);
      pmap.put("pageSize", this.pageSize);
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryVmiShopStockResponse> getResponseClass() {
      return EclpStockQueryVmiShopStockResponse.class;
   }
}

package com.jd.open.api.sdk.request.wms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wms.LogisticsStockSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LogisticsStockSearchRequest extends AbstractRequest implements JdRequest<LogisticsStockSearchResponse> {
   private String warehouseNo;
   private String goodsNo;
   private int currentPage;

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

   public void setCurrentPage(int currentPage) {
      this.currentPage = currentPage;
   }

   public int getCurrentPage() {
      return this.currentPage;
   }

   public String getApiMethod() {
      return "jingdong.logistics.stock.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("warehouse_no", this.warehouseNo);
      pmap.put("goods_no", this.goodsNo);
      pmap.put("current_page", this.currentPage);
      return JsonUtil.toJson(pmap);
   }

   public Class<LogisticsStockSearchResponse> getResponseClass() {
      return LogisticsStockSearchResponse.class;
   }
}

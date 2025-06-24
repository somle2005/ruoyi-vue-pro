package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQuerySumStockResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQuerySumStockRequest extends AbstractRequest implements JdRequest<EclpStockQuerySumStockResponse> {
   private String deptNo;
   private String warehouseNo;
   private String goodsNo;
   private Date date;
   private String isvGoodsNo;

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

   public void setDate(Date date) {
      this.date = date;
   }

   public Date getDate() {
      return this.date;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.querySumStock";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("goodsNo", this.goodsNo);

      try {
         if (this.date != null) {
            pmap.put("date", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.date));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("isvGoodsNo", this.isvGoodsNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQuerySumStockResponse> getResponseClass() {
      return EclpStockQuerySumStockResponse.class;
   }
}

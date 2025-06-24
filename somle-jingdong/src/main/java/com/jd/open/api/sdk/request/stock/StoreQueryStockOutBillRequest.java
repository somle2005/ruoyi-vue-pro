package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.stock.StoreQueryStockOutBillResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class StoreQueryStockOutBillRequest extends AbstractRequest implements JdRequest<StoreQueryStockOutBillResponse> {
   private Integer stockOutStatus;
   private Long id;
   private Long stockOutBillId;
   private Long comId;
   private Long orgId;
   private Long whId;
   private Long skuId;
   private Date beginTime;
   private Date endTime;
   private Integer page;
   private Integer pageSize;

   public void setStockOutStatus(Integer stockOutStatus) {
      this.stockOutStatus = stockOutStatus;
   }

   public Integer getStockOutStatus() {
      return this.stockOutStatus;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public void setStockOutBillId(Long stockOutBillId) {
      this.stockOutBillId = stockOutBillId;
   }

   public Long getStockOutBillId() {
      return this.stockOutBillId;
   }

   public void setComId(Long comId) {
      this.comId = comId;
   }

   public Long getComId() {
      return this.comId;
   }

   public void setOrgId(Long orgId) {
      this.orgId = orgId;
   }

   public Long getOrgId() {
      return this.orgId;
   }

   public void setWhId(Long whId) {
      this.whId = whId;
   }

   public Long getWhId() {
      return this.whId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setBeginTime(Date beginTime) {
      this.beginTime = beginTime;
   }

   public Date getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.store.queryStockOutBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("stock_out_status", this.stockOutStatus);
      pmap.put("id", this.id);
      pmap.put("stock_out_bill_id", this.stockOutBillId);
      pmap.put("com_id", this.comId);
      pmap.put("org_id", this.orgId);
      pmap.put("wh_id", this.whId);
      pmap.put("sku_id", this.skuId);

      try {
         if (this.beginTime != null) {
            pmap.put("begin_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("end_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("page", this.page);
      pmap.put("page_size", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreQueryStockOutBillResponse> getResponseClass() {
      return StoreQueryStockOutBillResponse.class;
   }
}
